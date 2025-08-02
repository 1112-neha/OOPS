package basic_concepts;

public class OneDArrays 
{

    public static void main(String[] args) 
    {
        int[] marks = {100, 97, 72, 85, 12};

        for (int i = 0; i < marks.length; i++) 
        {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }
}
