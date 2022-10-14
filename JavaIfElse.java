public class JavaIfElse {
    public static void main(String[] args) {
        // exercicio 1
        int x = 50;
        int y = 10;
        if (x > y) {
            System.out.println("Hello World");
        }

        // exercicio 2
        int xx = 50;
        int yy = 50;
        if (xx == yy) {
            System.out.println("Hello World");
        }

        // exercicio 3
        int x1 = 50;
        int y1 = 50;
        if (x1 == y1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // exercicio 4
        int x2 = 50;
        int y2 = 50;
        if (x2 == y2) {
            System.out.println("1");
        } else if (x2 > y2) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        // exercicio 5
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
