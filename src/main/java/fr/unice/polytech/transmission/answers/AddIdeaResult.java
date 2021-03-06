package fr.unice.polytech.transmission.answers;

import fr.unice.polytech.transmission.Type;

/**
 * @author Alexandre Clement
 *         Created the 02/05/2017.
 */
public class AddIdeaResult implements Answer
{
    private final RespondingCode respondingCode;

    public AddIdeaResult()
    {
        this(new RespondingCode());
    }

    /**
     * Reponse à la requete d'ajout d'une idée
     * @param respondingCode 0 si tout va bien
     */
    public AddIdeaResult(RespondingCode respondingCode)
    {
        this.respondingCode = respondingCode;
    }

    public Type getType()
    {
        return Type.ADD;
    }

    @Override
    public RespondingCode getRespondingCode()
    {
        return respondingCode;
    }

    @Override
    public String toString()
    {
        return String.format("Add Idea code : %d", respondingCode.getCode());
    }
}
