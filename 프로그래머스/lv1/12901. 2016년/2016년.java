class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String [] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int [] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        int count = 0;
        if (a==1){
            count = b-1;
            answer = week[count%7];
        }
        else if (a==2){
            count = b+ days[0] -1;
            answer = week[count%7];
        }
        else{
            for (int i =0; i<a-1; i++){
                count += days[i];
            }
            count+= b -1;
            answer = week[count%7];
        }

        return answer;
    }
}