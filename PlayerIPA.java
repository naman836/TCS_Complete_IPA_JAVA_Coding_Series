
// findPlayerWithLowestRuns method:

// This method will take an array of Player objects and a String value as input parameters.
// This method will return the least runs of the Player from the array of Player objects for the given playerType
// (String parameter passed). If no player with the above conditions are present in the array of Player objects
// then the method should return 0.

// findPlayerByMatchType method:

// This method will take an array of Player objects and a String value as input parameters.
// This method will return the array of Player objects belonging to the match type passed as input parameter in
// Descending order of playerId. If no player with the above conditions are present in the array of Player objects
// then the method should return null.

// for findPlayerWithLowestRuns method:
// The main method should print the returned runs as it is if the returned value is greater than 0 or it should
// print "No such player".

// for findPlayerByMatchType method:
// The main method should print the playerId from the returned Player array for each Player if the returned
// value is not null. If null, then it should print "No Player with given matchType".

// Input:
//        11
//        Sachin
//        100
//        International
//        One day
//        12
//        Sehwag
//        133
//        International
//        Test
//        13
//        Varun
//        78
//        State
//        Test
//        14
//        Ashwin
//        67
//        State
//        One day
//        State
//        One day
// Output:
//        67
//        14
//        11

package TCS_IPA;
import java.util.*;
class Player{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class PlayerIPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Player(a,b,c,d,e);
        }
        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int result1 = findPlayerWithLowestRuns(arr,playerType);
        if(result1 > 0){
            System.out.println(result1);
        }
        else{
            System.out.println("No such player");
        }

        Player[] result2 = findPlayerByMatchType(arr, matchType);
        if(result2 != null){
           for(int i = 0; i < result2.length; i++){
               System.out.println(result2[i].getPlayerId());
           }
        }
        else{
            System.out.println("No Player with given matchType");
        }

    }

    public static int findPlayerWithLowestRuns(Player[] arr, String playerType){
        int[] runs = new int[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getPlayerType().equalsIgnoreCase(playerType)){
                runs = Arrays.copyOf(runs,runs.length+1);
                runs[runs.length-1] = arr[i].getRuns();
            }
        }
        if(runs.length > 0){
            Arrays.sort(runs);
            return runs[0];
        }
        else {
            return 0;
        }
    }

    public static Player[] findPlayerByMatchType(Player[] arr, String matchType){
        Player[] arr2 = new Player[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getMatchType().equalsIgnoreCase(matchType)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        // sorting of arr2 array of Player objects in descending order based on their playerId attribute.
        for(int i = 0; i < arr2.length; i++){
            for(int j = i + 1; j < arr2.length; j++){
                if(arr2[i].getPlayerId() < arr2[j].getPlayerId()){
                    Player temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr2.length > 0){
            return arr2;
        }
        else{
            return null;
        }
    }
}

