//Import HashMap = Dictionary in C#
import java.util.HashMap;
//Import Scanner utility to allow user input.
import java.util.Scanner;

public class Wk10Ex1 
{
    //Global HashMap (Key, Value Dictionary) to store candidate names and votes.
    static HashMap<String, Integer> Votes = new HashMap<>();
    //Method to cast a vote for a candidate.
    public static void CastVote(String candidateName)
    {
        //Check if candidate already exists in the HashMap.
        if (Votes.containsKey(candidateName))
        {
            //Get current vote count.
            int currentVotes = Votes.get(candidateName);
            //Increment vote count by 1.
            Votes.put(candidateName, currentVotes + 1);
            //Display voting confirmation.
            System.out.println("==================");
            System.out.println("You casted a vote for " + candidateName);
        }
        else 
        {
            //If candidate does not exist, initialize vote count to 1.
            Votes.put(candidateName, 1);
            //Styling
            System.out.println("==================");
            //Display confirmation message.
            System.out.println("You casted a vote for " + candidateName);
        }
    }

    //Method to display vote results.
    public static void DisplayResults()
    {
        //Check if HashMap is empty.
        if (Votes.isEmpty())
        {
            //Styling.
            System.out.println("==================");
            //Display no votes message.
            System.out.println("NO VOTES IN DATABASE!");
        }
        //Styling.
        System.out.println("==================");
        //Loop through each candidate and print vote count.
        for (String candidate : Votes.keySet())
        {
            System.out.println(candidate + " has " + Votes.get(candidate) + " votes.");
        }  
    }
    //Method to reset all votes.
    public static void ResetVotes()
    {
        //Clear the HashMap.
        Votes.clear();
        //Styling
        System.out.println("==================");
        //Display confirmation message.
        System.out.println("VOTES HAVE BEEN RESET!");
    }
    public static void main(String[] args)
    {
        //Initialize scanner to read user input.
        Scanner userInput = new Scanner(System.in);
        //Variable to store the user's selected menu option.
        int menuOption;
        //Program Title.
        System.out.println("==================");
        System.out.println("VOTING SYSTEM APP");
        //Do-while loop for menu navigation. Keep asking for user input.
        do {
            //Voting section of the menu.
            System.out.println("==================");
            System.out.println("CAST A VOTE:");
            System.out.println("==================");
            System.out.println("* Enter 1 to vote for Candiate 1");
            System.out.println("* Enter 2 to vote for Candiate 2");
            System.out.println("* Enter 3 to vote for Candiate 3");
            //Options section of the menu.
            System.out.println("=================="); 
            System.out.println("OPTIONS MENU:");
            System.out.println("==================");
            System.out.println("* Enter 4 to Display Results");
            System.out.println("* Enter 5 to Reset Votes");
            System.out.println("* Enter 6 to Exit");
            //Prompt the user to select an option.
            System.out.println("==================");
            System.out.print("SELECT AN OPTION: ");
            //Stores the user selection.
            menuOption = userInput.nextInt();
            //Switch statement to handle menu options.
            switch (menuOption)
            {
                //Case for Candidate 1.
                case 1:
                    CastVote("Candidate 1");
                break;
                //Case for Candidate 2.
                case 2:
                    CastVote("Candidate 2");
                break;
                //Case for Candidate 3.
                case 3:
                    CastVote("Candidate 3");
                break;
                //Case to display current voting results.
                case 4:
                    DisplayResults();
                break;
                //Case to reset all stored votes.
                case 5:
                    ResetVotes();
                break;
                //Case to exit the program.
                case 6:
                    System.out.println("\nExiting Voting System...\n");
                break;
                //Case to handle any invalid input.
                default:
                    System.out.println("Invalid Option, Try Again!");
                break;
            }
        //Loop continues until user selects option 6 to exit.
        } while (menuOption != 6);
        //Close the scanner.
        userInput.close();

        //Pushed to WK10Ex1 GitHub Repo.
    }
}
