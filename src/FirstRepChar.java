import java.util.HashMap;

public class FirstRepChar {
    public static void main(String[] args) {

        String str = "hello";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println("First repeating character: " + ch);
                break;
            }
        }
    }
}
