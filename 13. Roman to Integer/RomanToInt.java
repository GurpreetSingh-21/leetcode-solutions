public class RomanToInt {

    private int romanCharToInt(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) { 
        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanCharToInt(s.charAt(i));
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
            prevValue = currentValue;
        }

        return sum;
    }

    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
        String roman = "MCMXCIV"; 
        int result = converter.romanToInt(roman); 
        System.out.println("The integer value of " + roman + " is: " + result);
    }
}
