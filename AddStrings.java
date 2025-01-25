public class AddStrings {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int len1 = num1.length();
        int len2 = num2.length();
        int len = Math.max(len1, len2);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < len) {
            int a = (len1 - i - 1 < 0) ? 0 : chars1[len1 - i - 1] - '0';
            int b = (len2 - i - 1 < 0) ? 0 : chars2[len2 - i - 1] - '0';
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
            i++;
        }
        if (carry > 0) sb.insert(0, Integer.toString(carry)); 
        return sb.toString();
    }

}
