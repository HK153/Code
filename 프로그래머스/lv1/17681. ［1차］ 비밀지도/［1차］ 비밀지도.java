class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String [] arr1Str = new String [n];
        String [] arr2Str = new String [n];
        
        for (int i = 0; i<n; i++){
            arr1Str[i] = Integer.toBinaryString(arr1[i]);
            arr2Str[i] = Integer.toBinaryString(arr2[i]);
            
            String ans = "";
            
            while (arr1Str[i].length() < n) {
                arr1Str[i] = "0" + arr1Str[i];
            }
            while (arr2Str[i].length() < n) {
                arr2Str[i] = "0" + arr2Str[i];
            }
            
            for(int j=0; j<n; j++){
 
                if(arr1Str[i].charAt(j) == '0' && arr2Str[i].charAt(j)== '0'){
                    ans += " ";
                }
                else {
                    ans += "#";
                }
            }
            answer[i] = ans;
        }
        
        return answer;
    }
}