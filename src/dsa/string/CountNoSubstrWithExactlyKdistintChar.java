package dsa.string;

import java.util.HashMap;
public class CountNoSubstrWithExactlyKdistintChar {

    // the number of subarrays with at most K distinct
// elements
    static int most_k_chars(String s, int k)
    {
        System.out.println("K = "+k);
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0, left = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),
                    map.getOrDefault(s.charAt(i), 0) + 1);
            while (map.size() > k) {
                System.out.println(map.keySet() + " "+left +" " +s.charAt(left));
                map.keySet().stream().map(x-> x+"->"+map.get(x) +" | ").forEach(System.out::print);
                System.out.println();
                map.put(s.charAt(left),
                        map.getOrDefault(s.charAt(left), 0)
                                - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            num += i - left + 1;
        System.out.println(" num "+num);
        }
        return num;
    }
    static int exact_k_chars(String s, int k)
    {
        return most_k_chars(s, k) - most_k_chars(s, k - 1);
    }
    public static void main(String[] args)
    {
        String s1 = "pqpqs";
        int k = 2;
        System.out.println("Total substrings with exactly "
                + k + " distinct characters : "
                + exact_k_chars(s1, k));

    }
}
