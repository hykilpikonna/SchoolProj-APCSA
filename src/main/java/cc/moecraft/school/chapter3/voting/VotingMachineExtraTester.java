package cc.moecraft.school.chapter3.voting;

public class VotingMachineExtraTester
{
    public static void main(String[] args)
    {
        VotingMachineExtra votingMachine = new VotingMachineExtra();

        for (int i = 0; i < 96; i++)
            votingMachine.voteForDemocrat();

        for (int i = 0; i < 78; i++)
            votingMachine.voteForRepublican();

        System.out.println("Democrat: " + votingMachine.getCountDemocratVote());
        System.out.println("Republican: " + votingMachine.getCountRepublicanVote());
        System.out.println("Expected: 96, 78");
        System.out.println("Expected for Election Day: 96, 97");
    }
}
