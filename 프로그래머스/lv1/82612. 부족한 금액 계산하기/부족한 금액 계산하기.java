class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total_price =0;
        for (int i =1 ; i<=count; i++){
            total_price += i*price;
        }
        if (total_price - money >0){
            answer = total_price - money;
        }
        

        return answer;
    }
}