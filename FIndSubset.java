// package Backtracking;

public class findSubset {
    public static void printSubset(String str, String ans, int i) {
        // Base condtn
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        char ch = str.charAt(i);
        // Recursive functn
        // choice : true
        printSubset(str, ans + ch, i + 1);

        // choice : false
        printSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubset(str, "", 0);
    }
}
