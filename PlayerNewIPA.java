package TCS_IPA;
import java.util.*;


class Player1{
    int playerId;
    String skill;
    String level;
    int points;
    public Player1(int playerId, String skill, String level, int points){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
    public int getPlayerId(){
        return playerId;
    }
    public String getSkill(){
        return skill;
    }
    public String getLevel(){
        return level;
    }
    public int getPoints(){
        return points;
    }
}



public class PlayerNewIPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player1[] arr = new Player1[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c  = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Player1(a,b,c,d);
        }
        String skill = sc.nextLine();
        String level = sc.nextLine();

        int result1 = findPointsForGivenSkill(arr,skill);
        if(result1 > 0){
            System.out.println(result1);
        } else{
            System.out.println("The given Skill is not available");
        }

        Player1 result2 = getPlayerBasedOnLevel(arr,level,skill);
        if(result2 != null){
            System.out.println(result2.getPlayerId());
        } else{
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }

    public static int findPointsForGivenSkill(Player1[] arr, String skill){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getSkill().equalsIgnoreCase(skill)){
                sum += arr[i].getPoints();
            }
        }
        return sum;
    }

    public static Player1 getPlayerBasedOnLevel(Player1[] arr, String level, String skill){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getLevel().equalsIgnoreCase(level) && arr[i].getSkill().equalsIgnoreCase(skill)
            && arr[i].getPoints() >= 20){
                return arr[i];
            }
        }
        return null;
    }
}

// Input:
//
//        101
//        Cricket
//        Basic
//        20
//        102
//        Cricket
//        Intermediate
//        25
//        111
//        Football
//        Intermediate
//        50
//        113
//        BaseBall
//        Advanced
//        100
//        Cricket
//        Intermediate

// Output:
//        45
//        102