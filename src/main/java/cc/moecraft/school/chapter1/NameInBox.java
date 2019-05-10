package cc.moecraft.school.chapter1;

public class NameInBox
{
    public static void main(String[] args)
    {
        StringBuilder text = new StringBuilder()
           .append("╭───────╮\n")
           .append("│ Jack │\n")
           .append("╰━━━━━━━╯");

        System.out.println(text);
    }
}
