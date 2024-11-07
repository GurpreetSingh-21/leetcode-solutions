class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int pali = 0;
        while(x > pali) {
            pali = pali * 10 + x % 10;
            x = x / 10;
        }
        return (x == pali || x == pali / 10);
    }

    public static void main(String[] args) {
        Palindrome sum = new Palindrome(); 
        int num = 121;
        System.out.println(sum.isPalindrome(num));
    }
}