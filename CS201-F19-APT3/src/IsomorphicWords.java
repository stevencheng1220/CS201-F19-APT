import java.util.*;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        List<String> canon = new ArrayList<String>();
        for(String s : words) canon.add(canonical(s));
        int result = 0;
        for(int k=0; k < canon.size(); k += 1){
            for(int j=k+1; j < canon.size(); j += 1){
                if (canon.get(j).equals(canon.get(k))){
                    result += 1;
                }
            }
        }
        return result;
    }

    private String canonical(String s){
        char[] map = new char[256];
        String ret = "";
        char current = 'a';
        for(char ch : s.toCharArray()){
            if (map[ch] == 0){
                map[ch] = current;
                current += 1;
            }
            ret += map[ch];
        }
        return ret;
    }
}

// Two words are called isomorphic if the letters in one word can be remapped to get the second word.
// Iterate through the given String[] and call the helper method canonical on it.
// Helper method canonical converts the given String into a remapped word. This means that we convert a word like
// "peep" into "abba" and "otto" into "abba".
// This remapped word is simply taking unique characters and assigning chars starting from a.
// After building remapped versions of all parameter words, check the number of identical remapped words and return
// a total for them.