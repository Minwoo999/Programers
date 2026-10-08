import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length + 1;
        int[] answer = Arrays.copyOf(num_list, n);
        
        if(answer[n - 2] > answer[n - 3]){
            answer[n - 1] = answer[n - 2] - answer[n - 3];
        }
        else{
            answer[n - 1] = answer[n - 2] * 2;
        }
            
        return answer;
    }
}