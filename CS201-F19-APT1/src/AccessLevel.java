import java.util.*;

public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String total = "";
        for(int num : rights){
            if(num >= minPermission) total += "A";
            else total += "D";
        }
        return total;
    }
}

// initialize empty string
// for loop to iterate through rights array
// if statement within for loop that compares
// if rights[i] >= minPermission, add to empty string "A"
// else add "D"