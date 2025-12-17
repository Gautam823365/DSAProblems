package Algorithms;

public class NaiveApprochAlgo {


    // time complexity for this algo in O(n*m)

    static void naiveFindPatrn(String mainString, String pattern, int[] array) {
        int patLen = pattern.length();
        int strLen = mainString.length();
        int index = 0;
        // outer for loop
        for(int i = 0; i <= (strLen - patLen); i++) {
            int j;
            // to check for each character of pattern
            for(j = 0; j < patLen; j++) {
                if(mainString.charAt(i+j) != pattern.charAt(j))
                    break;
            }
            // to print the index of the pattern is found
            if(j == patLen) {
                array[index] = i;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        String mainString = "ABAAABCDBBABCDDEBCABC";
        // pattern to be found
        String pattern = "ABC";
        int[] locArray = new int[mainString.length()];
        naiveFindPatrn(mainString, pattern, locArray);
        // to print the indices
        for(int i = 0; i < locArray.length && locArray[i] != 0; i++) {
            System.out.println("Pattern found at position: " + locArray[i]);
        }
    }
}
