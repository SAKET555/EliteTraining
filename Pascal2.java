import java.util.*;

public class Pascal2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<=rowIndex;i++)
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
        return list.get(rowIndex);
    }
}
