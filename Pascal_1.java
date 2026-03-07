import java.util.*;
public class Pascal_1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> m = new ArrayList<>();
            m.add(1);
            for(int j=1;j<i;j++)
            {
                m.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            if(i>0)  m.add(1);
            list.add(m);
        }
        
        return list;
    }
} 
