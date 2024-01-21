import java.util.LinkedList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int count = 0;

        LinkedList <Integer> pro = new LinkedList<>();
        LinkedList <Integer> sp = new LinkedList<>();
        LinkedList <Integer> ans = new LinkedList<>();
        for (int p : progresses){
            pro.add(p);
        }
        for (int s : speeds){
            sp.add(s);
        }
        while(!pro.isEmpty()){
            for (int i = 0; i<pro.size(); i++){
                pro.set(i, pro.get(i) + sp.get(i));
            }
            while(true){
               if (!pro.isEmpty() && pro.get(0) >= 100){
                    pro.remove(0);
                    sp.remove(0);
                    count++;
                } 
                else{
                    break;
                }
            }
            if(count> 0){
                ans.add(count);
                count =0;
            }
        }

        int [] answer = new int[ans.size()];
        for (int j =0; j<ans.size(); j++){
            answer[j] = ans.get(j);
        }
        
        return answer;
    }
}