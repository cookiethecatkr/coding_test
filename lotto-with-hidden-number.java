import java.util.*;

class Solution {
    
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> tmpA = new ArrayList<Integer>();
    for (int i : lottos) {
        tmpA.add(i);
    }
    System.out.println(tmpA);

    List<Integer> tmpB = new ArrayList<Integer>();
    for (int i : win_nums){
        tmpB.add(i);
    }
    System.out.println(tmpB);

    int zero = 0;

    int winNumber = 0;

    for(int i=0; i <6; i++) {

       if(0 == tmpA.get(i)){
        zero++;
       }

       if(tmpA.contains(tmpB.get(i))) {
           winNumber++;
       }
    }

    int max = (winNumber + zero == 6) ? 1 :(winNumber + zero == 5)? 2 :
                (winNumber + zero ==4) ? 3 : (winNumber + zero ==3) ? 4 : 
                (winNumber + zero == 2) ? 5 : 6;
    int min = (winNumber == 6) ? 1 : (winNumber == 5)? 2 :
         (winNumber ==4) ? 3 : (winNumber ==3) ? 4 : (winNumber == 2) ? 5 : 6;

    int[] answer = {max, min}; 
        return answer;
        
    }
}
