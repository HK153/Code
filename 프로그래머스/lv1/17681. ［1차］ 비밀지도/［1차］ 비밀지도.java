class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        
        for (int i = 0; i<n; i++){
            String arr1Str = Integer.toBinaryString(arr1[i]);
            String arr2Str = Integer.toBinaryString(arr2[i]);
            
            String ans = "";

            arr1Str = String.format("%"+n+"s",arr1Str).replace(' ','0');
            arr2Str = String.format("%"+n+"s",arr2Str).replace(' ','0');
            
            
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