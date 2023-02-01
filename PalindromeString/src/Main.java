public class Main {
    static  boolean isPalindrome(String str)
    {

        char[] newStr = str.trim().toCharArray();
        String reverseString = "";
        System.out.println(newStr.length);

        for (int i = newStr.length -1 ; i >= 0; i--)
        {
            reverseString += newStr[i];
        }
        return reverseString.equals(str.trim());

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("aşk"));
    }
}