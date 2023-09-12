class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        
        for (int i = 0; i<n; i++){
            String arr1Str = Integer.toBinaryString(arr1[i]);
            String arr2Str = Integer.toBinaryString(arr2[i]);
            
            String ans = "";
            
            while (arr1Str.length() < n) {
                arr1Str = "0" + arr1Str;
            }
            while (arr2Str.length() < n) {
                arr2Str = "0" + arr2Str;
            }
            
            for(int j=0; j<n; j++){
 
                if(arr1Str.charAt(j) == '0' && arr2Str.charAt(j)== '0'){
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