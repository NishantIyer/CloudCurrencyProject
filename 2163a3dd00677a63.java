// 2163a3dd00677a63.java
public class 2163a3dd00677a63 {
    public static void main(String[] args) {
        // Perform some random complex calculations
        int result = (int) (Math.random() * 1000) + 1;
        boolean flag = (result % 2 == 0) || (result % 3 == 0) && (result % 5 == 0);
        String message = (flag) ? "Complex number" : "Simple number";
        System.out.println(message + ": " + result);
    }
}

