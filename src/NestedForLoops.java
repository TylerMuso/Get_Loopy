public class NestedForLoops
{
    static void main()
    {
        for(int x = 1; x <= 5; x++)
        {
            for(int y = 1; y <= x; y++)
            {
                IO.print("* ");
            }
            IO.println();
        }
        IO.println();

        for(int x = 5; x >= 1; x--)
        {
            for(int y = 1; y <= x; y++)
            {
                IO.print("* ");
            }
            IO.println();
        }
        IO.println();

        for(int x = 1; x <= 5; x++)
        {
            for(int y = 1; y <= 5; y++)
            {
                IO.print("* ");
            }
            IO.println();
        }
    }
}
