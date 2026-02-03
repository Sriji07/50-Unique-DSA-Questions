import java.util.*;

class Main {

    public String fibonacciIndexedString(String s) {

        StringBuilder result = new StringBuilder();

        int n = s.length();

        // Fibonacci start
        int f0 = 0;
        int f1 = 1;

        // Always include F0 if valid
        if (f0 < n) {
            result.append(s.charAt(f0));
        }

        // Always include F1 if valid
        if (f1 < n) {
            result.append(s.charAt(f1));
        }

        // Generate remaining Fibonacci indices
        while (true) {
            int f2 = f0 + f1;

            if (f2 >= n)
                break;

            result.append(s.charAt(f2));

            f0 = f1;
            f1 = f2;
        }

        return result.toString();
    }

    // For testing (optional)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Main sol = new Main();
        System.out.println(sol.fibonacciIndexedString(s));
    }
}
