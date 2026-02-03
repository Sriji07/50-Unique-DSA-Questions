import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(starkString(str1, str2));
    }

    public static String starkString(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int prevAIndex = 0;
        int lastBUsed = -1;

        for (int currAIndex = 0; currAIndex < str1.length(); currAIndex++) {

            // Add character from A
            result.append(str1.charAt(currAIndex));

            // Calculate B index
            int bIndex;
            if (currAIndex == 0) {
                bIndex = 0;
            } else {
                bIndex = currAIndex + prevAIndex;
            }

            // Add character from B if valid
            if (bIndex < str2.length()) {
                result.append(str2.charAt(bIndex));
                lastBUsed = Math.max(lastBUsed, bIndex);
            } else {
                // If B index exceeds, append remaining B and return
                if (lastBUsed + 1 < str2.length()) {
                    result.append(str2.substring(lastBUsed + 1));
                }
                return result.toString();
            }

            prevAIndex = currAIndex;
        }

        // Append remaining B after finishing A
        if (lastBUsed + 1 < str2.length()) {
            result.append(str2.substring(lastBUsed + 1));
        }

        return result.toString();
    }
}
