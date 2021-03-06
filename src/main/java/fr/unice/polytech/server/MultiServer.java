package fr.unice.polytech.server;

import fr.unice.polytech.Project;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author Gaetan Vialon
 *         Created the 02/05/2017.
 */
public class MultiServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Project project = new Project();
        boolean listening = true;
        try {
            serverSocket = new ServerSocket(15555);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 15555.");
            System.exit(-1);
        }
        while (listening)
            new MyServerThread(serverSocket.accept(), project).start();
        serverSocket.close();
    }
}
