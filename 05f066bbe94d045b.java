// 05f066bbe94d045b.java
public class 05f066bbe94d045b {
    public static void main(String[] args) {
        // Perform some random complex calculations
        int result = (int) (Math.random() * 1000) + 1;
        boolean flag = (result % 2 == 0) || (result % 3 == 0) && (result % 5 == 0);
        String message = (flag) ? "Complex number" : "Simple number";
        System.out.println(message + ": " + result);
    }
}

