import java.util.List;
import java.util.Collections;

class MinMax {
    static int[] getMinMax(List<Integer> list) {
        // your code here...
        int[] reOrder = new int[2];

        if(list.size() == 1){
            reOrder[0] = list.get(0);
            reOrder[1] = list.get(0);
        }else{
            Collections.sort(list);
            reOrder[0] = list.get(0);
            reOrder[1] = list.get(list.size()-1);
        }

        return reOrder;
    }

}