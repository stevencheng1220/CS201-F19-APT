import java.util.*;

public class Encryption {
    public String encrypt(String message) {
        char[] map = new char[256];
        String ret = "";
        char current = 'a';
        for(char ch : message.toCharArray()){
            if (map[ch] == 0){
                map[ch] = current;
                current += 1;
            }
            ret += map[ch];
        }
        return ret;
    }
}

// Converts the given String into a remapped word. This means that we convert a word like "peep" into "abba".
// This remapped word is simply taking unique characters and assigning chars starting from a.