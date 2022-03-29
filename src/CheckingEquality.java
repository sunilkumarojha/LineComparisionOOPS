public class CheckingEquality {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 4;
        Integer length1 = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
        System.out.println("Length of First line is : " + length1);
        int p1 = 3;
        int q1 = 4;
        int p2 = 7;
        int q2 = 1;
        Integer length2 = (int) Math.sqrt((p2 - p1) * 2 + (q2 - q1) * 2);
        System.out.println("Length of second line is : " + length2);
        boolean result = length1.equals(length2);
        if (result == false)
            System.out.println("Both Lines are not Same");
        else
            System.out.println("Both lines are same");
    }
}
