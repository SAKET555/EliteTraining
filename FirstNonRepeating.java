import java.util.*;

class FirstNonRepeating
{
    public static void main(String[] args) {
        // int[] arr = {1,2,2,3,3,3,3,5,9};
        String s = "SSwwaastthik";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}