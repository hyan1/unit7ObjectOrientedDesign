

/**
 * Write a description of class ChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question
{
    
    private int numberOfChoices;
    
    /**
     * Default constructor for objects of class ChoiceQuestion
     */
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;        
    }

    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;
        this.addText("\n" + numberOfChoices + ")" + choice);
        if(correct)
        {
            String choiceString = "" + numberOfChoices;
            this.setAnswer( choiceString);
        }
    }
    
    public String toString()
    {
        return super.toString();
    }
}
