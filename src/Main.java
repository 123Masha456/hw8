public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        System.out.println(massive[0]);
        System.out.println(massive[1]);
        System.out.println(massive[2]);
        double[] massive1 = {1.57, 7.654, 9.986};
        System.out.println(massive1[0]);
        System.out.println(massive1[1]);
        System.out.println(massive1[2]);
        int[] abc = new int[4];
        abc[0] = 15;
        abc[1] = 21;
        abc[2] = (abc[0] / 3);
        abc[3] = abc[1];
        System.out.println(abc[0]);
        System.out.println(abc[1]);
        System.out.println(abc[2]);
        System.out.println(abc[3]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        System.out.println(massive[0] + " , " + massive[1] + " , " + massive[2]);
        double[] massive1 = {1.57, 7.654, 9.986};
        System.out.println(massive1[0] + " , " + massive1[1] + " , " + massive1[2]);
        int[] abc = new int[4];
        abc[0] = 15;
        abc[1] = 21;
        abc[2] = (abc[0] / 3);
        abc[3] = abc[1];
        System.out.println(abc[0] + " , " + abc[1] + " , " + abc[2] + " , " + abc[3]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        System.out.println(massive[2] + " , " + massive[1] + " , " + massive[0]);
        double[] massive1 = {1.57, 7.654, 9.986};
        System.out.println(massive1[2] + " , " + massive1[1] + " , " + massive1[0]);
        int[] abc = new int[4];
        abc[0] = 15;
        abc[1] = 21;
        abc[2] = (abc[0] / 3);
        abc[3] = abc[1];
        System.out.println(abc[3] + " , " + abc[2] + " , " + abc[1] + " , " + abc[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                System.out.println(massive[i]);
            } else {
                System.out.println(massive[i] + 1);
            }
        }
    }
}



