public class StringProcessor {

    // Checks if the password is strong
    public boolean isStrongPassword(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false; 
        boolean hasSpecial = false; 
      
        // Check each character in the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true; // Found an uppercase letter
            } else if (Character.isLowerCase(c)) {
                hasLower = true; // Found a lowercase letter
            } else if (Character.isDigit(c)) {
                hasDigit = true; // Found a digit
            } else if (isSpecialChar(c)) {
                hasSpecial = true; // Found a special character
            }
        }
        // Password is strong if it has all four types of characters
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // Method to check if a character is a special character
    private boolean isSpecialChar(char c) {
        return !Character.isLetterOrDigit(c) && !Character.isWhitespace(c); // Not a letter, digit, or whitespace
    }

    // Counts the number of digits in a string
    public int calculateDigits(String sentence) {
        int digitCount = 0; // Initialize digit count
        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++; // Increment count for each digit found
            }
        }
        return digitCount; // Return total digit count
    }

    // Counts the number of words in a string
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if the sentence is null or empty
        }

        int wordCount = 0; // Initialize word count
        boolean isWord = false; // Flag to track if currently inside a word
        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            // If the current character is not a space
            if (c != ' ') {
                // If we are not currently in a word, increment the count
                if (!isWord) {
                    wordCount++;
                    isWord = true; // Inside a word
                }
            } else {
                // If it's a space, we are outside a word
                isWord = false;
            }
        }
        return wordCount; // Return total word count
    }

    // Evaluates the value of an arithmetic expression
    public double calculateExpression(String expression) {
        double result = 0; // Initialize result
        double currentNumber = 0; // To store the current number being processed
        String currentOp = "+"; // Start with addition

        // Iterate through each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // Ignore spaces
            if (c == ' ') {
                continue;
            }

            // If the current character is a digit or a decimal point
            if (Character.isDigit(c) || c == '.') {
                // Collect the number
                StringBuilder numberStr = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numberStr.append(expression.charAt(i)); // Build the number string
                    i++;
                }
                currentNumber = Double.parseDouble(numberStr.toString()); // Convert to double
                i--; // Decrement index to not skip the next character
            } else if (c == '+' || c == '-') {
                // Apply the previous operation
                if (currentOp.equals("+")) {
                    result += currentNumber; // Add current number
                } else if (currentOp.equals("-")) {
                    result -= currentNumber; // Subtract current number
                }
                currentOp = String.valueOf(c); // Save the current operator
                currentNumber = 0; // Reset the current number
            }
        }

        // At the end, apply the last operation
        if (currentOp.equals("+")) {
            result += currentNumber; // Add last number
        } else if (currentOp.equals("-")) {
            result -= currentNumber; // Subtract last number
        }
        return result; // Return the final result
    }

    // Checks if the string is an operator (not used in the current implementation)
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-"); // Return true for + or -
    }

    // Test cases
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();

        // Tests for strong password validation
        System.out.println(sp.isStrongPassword("MyP@ssw0rd!")); // true
        System.out.println(sp.isStrongPassword("kamilaspass")); // false

        // Tests for counting digits
        System.out.println(sp.calculateDigits("I have 2 apples and 3 oranges.")); // 2
        System.out.println(sp.calculateDigits("No numbers")); // 0

        // Tests for counting words
        System.out.println(sp.calculateWords("Hello there! How are you?")); // 6
        System.out.println(sp.calculateWords("    ")); // 0

        // Tests for evaluating expressions
        System.out.println(sp.calculateExpression("4 + 5 - 2")); // 7.0
        System.out.println(sp.calculateExpression("10 - 3 + 2")); // 9.0
    }
}
