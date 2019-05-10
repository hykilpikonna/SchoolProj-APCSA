package cc.moecraft.school.chapter3.voting;

/**
 * P3.11
 *
 * @author Ticrizon
 */
public class VotingMachine
{
    private int countDemocratVote = 0;
    private int countRepublicanVote = 0;

    // Default constructor does the thing.

    /**
     * Add a vote for democrat.
     */
    public void voteForDemocrat()
    {
        countDemocratVote ++;
    }

    /**
     * Add a vote for republican.
     */
    public void voteForRepublican()
    {
        countRepublicanVote ++;
    }

    public int getCountDemocratVote()
    {
        return this.countDemocratVote;
    }

    public int getCountRepublicanVote()
    {
        return this.countRepublicanVote;
    }
}
