public class task6 {
    public static void main(String[] args) {
        universalMethod(11);
        universalMethod(1.1f);
        universalMethod("hello");
        universalMethod(new int[]{1, 2, 3});
        universalMethod(new int[][]{{1, 2}, {3, 4}});
        universalMethod(true);
        universalMethod('A');
        universalMethod(3.14159);
        universalMethod(new int[][][] {{{1}, {2}}, {{3}, {4}}});
    }
    public static void universalMethod(int number) {
        System.out.println("Integer: " + number);
    }
    public static void universalMethod(float number) {
        System.out.println("Float: " + number);
    }
    public static void universalMethod(String hello) {
        System.out.println("String: " + hello);
    }
    public static void universalMethod(int[] array) {
        System.out.print("1D Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void universalMethod(int[][] array) {
        System.out.println("2D Array:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void universalMethod(boolean bool) {
        System.out.println("Boolean: " + bool);
    }
    public static void universalMethod(char b) {
        System.out.println("Char: " + b);
    }
    public static void universalMethod(double d) {
        System.out.println("Double: " + d);
    }
    public static void universalMethod(int[][][] array) {
        System.out.println("3D Array:");
        for (int[][] twoD : array) {
            for (int[] row : twoD) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
