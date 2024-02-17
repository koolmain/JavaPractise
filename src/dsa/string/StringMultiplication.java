package dsa.string;

public class StringMultiplication {
    public static void main(String[] args)
    {
        String a = "1234";
        String b = "5678";
        if (a.equals("0") || b.equals("0")) {
            System.out.println("0");
            return;
        }
        int m = a.length() - 1, n = b.length() - 1,
                carry = 0;
        String product = "";
        for (int i = 0; i <= m + n || carry != 0; ++i) {
            for (int j = Math.max(0, i - n);
                 j <= Math.min(i, m); ++j) {
                System.out.println("j = "+ Math.max(0, i - n) + " end cond "+Math.min(i, m)) ;
                System.out.println(" Charaters " +  (a.charAt(m - j) - '0')+ "  "+ (b.charAt(n - i + j) - '0'));

                carry += (a.charAt(m - j) - '0')
                        * (b.charAt(n - i + j) - '0');
                System.out.println("carry "+ carry);
            }
            product += (char)(carry % 10 + '0');
            carry /= 10;
        }
        product = new StringBuilder(product)
                .reverse()
                .toString();
        System.out.println("The Product is: " + product);
    }

}
