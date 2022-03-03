public class ForLoop {

    public static void main(String[] args)
    {
	for(int cnt = 0; cnt <= 30; cnt = cnt + 1)
        {
        System.out.println(cnt);

        }


    for(int down = 30; down >= 0; down = down - 1)
        {
            System.out.println(down);

        }


    for(int three = 0; three <= 18; three = three + 3)
        {
            System.out.println(three);

        }


    for(int two = 10; two >= 0; two = two - 2)
        {
            System.out.println(two);

        }




    final int ROW = 5;
    final int COL = 5;

    for(int row = 0; row <= ROW; row = row + 1)
        {
        for(int col = 0; col <= COL; col = col + 1)
            {
                System.out.printf("%5d", row * col);
            }
            System.out.println(" ");
        }


    int i;
    int j;

    for(i = 0; i < 5; i = i + 1)
        {
            for(j = 0; j <= i; j = j + 1)
            {
                System.out.printf("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int a;
        int b;

        for(a = 1; a <= 5; a = a + 1)
        {
            for(b = 5; b >= 1; b = b - 1)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println(" ");



        int c;
        int d;

        for(c = 0; c <= 5; c = c + 1)
            {
                for(d = 5; d >= c; d = d - 1)
                {
                    System.out.printf("* ");
                }
                System.out.println(" ");
            }
        System.out.print(" ");
    }
}
