class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        int idx = 0;
        
        for (int k = 0; k < arr.length; k++){
            count += arr[k];
        }
        
        int[] answer = new int[count];
        
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}