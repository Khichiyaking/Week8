package JavaQ_8_9_10;
//Display right angle triangle of @ using nested for loops
public class RightAngletriangle8 {
    public static void main(String[] args) {
    int rows = 8;
    printRightAngleTriangle(rows);
}
    public static void printRightAngleTriangle(int rows) {
        for (int a = 1; a <= rows; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
