public class PatternMatchingAlg {

    public static void main(String[] args) {

        String text = "abcefabcwdabcd";
        String pattern = "abcd";

        int sizeOfText = text.length();
        int sizeOfPattern = pattern.length();

        int indexOfText = 0;
        int indexOfPattern = 0;
        boolean patternFound = false;

        int steps = 0;

        while(indexOfText < sizeOfText && !patternFound) {

            steps++;

            if(text.charAt(indexOfText) == pattern.charAt(indexOfPattern)) {

                indexOfPattern++;
                indexOfText++;

                while (text.charAt(indexOfText) == pattern.charAt(indexOfPattern)) {

                    steps++;

                    indexOfPattern++;
                    indexOfText++;

                    if(indexOfPattern == sizeOfPattern) {
                        patternFound = true;
                        break;
                    }

                }

                indexOfPattern = 0;
            }
            else {
                indexOfText++;
                steps++;
            }

        }

        if (patternFound) {
            System.out.println("Pattern found at index " + (indexOfText - sizeOfPattern));
        } else {
            System.out.println("Pattern not found");
        }

        System.out.println("Total steps: " + steps);
    }
}
