/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    //1.Can you identify keywords to which your chatbot responds?
        //It responds to no, mother father, mother,brother, and sister
    //2.Think of several keywords and the responses they might cause.
        //
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        statement = statement.trim();
        int length = statement.length();
        if (statement.indexOf("no") >= 0)
        {
            response = "Don't say no";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if(statement.indexOf("brother") >= 0)
        {
            response = "Lets talk more about him.";
        }
        else
        {
            response = getRandomResponse();
        }
        {
        if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0
                || statement.indexOf("turtle") >= 0)
        {
            response = "Tell me more about your pets.";
        
        }
        
        else if(statement.indexOf("Mr. Wiebe") >= 0)
        {
            response = "I heard he is a good teacher!";
        }
        else if(statement.indexOf("fish") >= 0)
        {
            response = "Fish is good to eat";
        }
        {
        if (length == 0)
        {
            response = "Say something, please.";
        }
        }
        return response;
        }
    }   
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Wait what!";
        }
        else if (whichResponse == 5)
        {
            response = "No way!";
        }    

        return response;
    }
    //I'm pretty sure it goes based on the last word they can match.
    //Well since the code is if it sees the word no matter how it is
    //written it will give you that response.
}
