class Solution {
    public String solution(String s) {
        String [] word = s.split(" ", -1);
        StringBuffer sb = new StringBuffer();
        for (int i =0; i<word.length;i++){
            String [] latter = word[i].split("");
            for (int j =0; j<latter.length;j++){
                if (j%2==0){
                    latter[j]= latter[j].toUpperCase();
                }
                else{
                    latter[j]= latter[j].toLowerCase();
                }
                sb.append(latter[j]);
            }
            if(word[i].isEmpty()){
                sb.append(word[i]);
            }
            if (i<word.length-1){
                sb.append(" ");
            }
        }
      
        
        String answer = sb.toString();
        
        return answer;
    }
}