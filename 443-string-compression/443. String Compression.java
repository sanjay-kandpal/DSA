import java.util.HashMap;
import java.util.Map;

class Solution {
   public int compress(char[] chars) {
    if (chars == null || chars.length == 0)
        return 0;

    int index = 0; // Index to track the position in the modified array
    char p1 = chars[0];
    int p2 = 1;
    if (chars.length == 1)
        return 1;

    int count = 1;
    for (int i = 1; i < chars.length; i++) {
        if (p1 == chars[i]) {
            count++;
        } else {
            chars[index++] = p1; // Store the character
            if (count > 1) {
                // If count is greater than 1, convert count to char and store it
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
            p1 = chars[i]; // Update p1 to the new character
            count = 1;
        }
    }
    chars[index++] = p1; // Store the last character
    if (count > 1) {
        String countStr = String.valueOf(count);
        for (char c : countStr.toCharArray()) {
            chars[index++] = c;
        }
    }
    return index; // Return the new length of the modified array
}

}
