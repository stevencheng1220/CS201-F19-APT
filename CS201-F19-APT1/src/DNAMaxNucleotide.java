import java.util.*;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int maxNum = 0;
        int numOfNuc = 0;
        String longest = "";

        for(String string : strands){
            int current = 0;
            for(char c : string.toCharArray()){
                if(c == nuc.charAt(0)){
                    current+=1;
                }
            }
            if(current > numOfNuc){
                longest = string;
                maxNum = string.length();
                numOfNuc = current;
            }
            else if(current == numOfNuc && current != 0){
                if(string.length() > maxNum){
                    longest = string;
                    maxNum = string.length();
                    numOfNuc = current;
                }
            }
        }
        return longest;
    }
}

// initialize int maxLength, String longest, int numOfNuc
// double for loop
// first for loop iterates through strands
// second for loop iterates through .toCharArray
// double if statement
// first if statement is if numOfNuc is reached
// double if statement if maxLength is greater, then change longest
// also else numOfNuc is exceeded, then automatically replace longest