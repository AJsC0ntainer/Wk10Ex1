import java.util.HashMap;
import java.util.Scanner;

public class Wk10Ex1 
{
    static HashMap<String, Integer> Votes = new HashMap<>();

    public static void CastVote(String candidateName)
    {
        if  (Votes.containsKey(candidateName))
        {
            int currentVotes = Votes.get(candidateName);
            Votes.put(candidateName, currentVotes + 1);
            System.out.println("==================");
            System.out.println("You casted a vote for " + candidateName);
        }
        else 
        {
            Votes.put(candidateName, 1);
            System.out.println("==================");
            System.out.println("You casted a vote for " + candidateName);
        }
    }
    public static void DisplayResults()
    {
        if (Votes.isEmpty())
        {
            System.out.println("==================");
            System.out.println("NO VOTES IN DATABASE!");
        }
        System.out.println("==================");
        for (String candidate : Votes.keySet())
        {
            System.out.println(candidate + " has " + Votes.get(candidate) + " votes.");
        }  
    }
    public static void ResetVotes()
    {
        Votes.clear();
        System.out.println("==================");
        System.out.println("VOTES HAVE BEEN RESET!");
        //System.out.println("==================");
    }
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int menuOption;
        System.out.println("==================");
        System.out.println("VOTING SYSTEM APP");
        do {
        System.out.println("==================");
        System.out.println("CAST A VOTE:");
        System.out.println("==================");
        System.out.println("* Enter 1 to vote for Candiate 1");
        System.out.println("* Enter 2 to vote for Candiate 2");
        System.out.println("* Enter 3 to vote for Candiate 3");
        System.out.println("=================="); 
        System.out.println("OPTIONS MENU:");
        System.out.println("==================");
        System.out.println("* Enter 4 to Display Results");
        System.out.println("* Enter 5 to Reset Votes");
        System.out.println("* Enter 6 to Exit");
        System.out.println("==================");
        System.out.print("SELECT AN OPTION: ");
        menuOption = userInput.nextInt();
        
        switch (menuOption)
        {
            case 1:
                CastVote("Candidate 1");
            break;
            case 2:
                CastVote("Candidate 2");
            break;
            case 3:
                CastVote("Candidate 3");
            break;
            case 4:
                DisplayResults();
            break;
            case 5:
                ResetVotes();
            break;
            case 6:
                System.out.println("\nExiting Voting System...\n");
            break;
            default:
                System.out.println("Invalid Option, Try Again!");
            break;
        }

        } while (menuOption != 6);

        userInput.close();
    }
}
