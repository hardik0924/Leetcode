import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    list.add(order[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}