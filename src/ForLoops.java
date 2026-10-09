public class ForLoops
{
    static void main()
    {
        for(int x = 0; x <= 30; x++)
        {
            IO.println("X is " + x);
        }
        IO.println();

        for(int y = 30; y >= 0; y--)
        {
            IO.println("Y is " + y);
        }
        IO.println();

        for(int a = 0; a <= 18; a += 3)
        {
            IO.println("A is " + a);
        }
        IO.println();

        for(int b = 10; b >= 0; b -= 2)
        {
            IO.println("B is " + b);
        }
    }
}