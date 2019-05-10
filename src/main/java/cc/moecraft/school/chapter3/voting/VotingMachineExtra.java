package cc.moecraft.school.chapter3.voting;

import java.util.Calendar;
import java.util.Date;

/**
 * P3.11 Extra
 *
 * @author Ticrizon 
 */
public class VotingMachineExtra
{
    private long countDemocratVote = 0;
    private long countRepublicanVote = 0;

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

    public long getCountDemocratVote()
    {
        return countDemocratVote;
    }

    public long getCountRepublicanVote()
    {
        // Conditional operators aren't if statements ;)
        return isElectionDay() ?
                (countRepublicanVote > countDemocratVote ?
                        countRepublicanVote
                        : countDemocratVote + 1)
                : countRepublicanVote;
    }

    /**
     * Detect if it's election day.
     *
     * @return True -> Is election day.
     *         False -> Not election day.
     */
    private boolean isElectionDay()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        return month == Calendar.NOVEMBER && day == Calendar.TUESDAY && dayOfMonth < 7;
    }
}
