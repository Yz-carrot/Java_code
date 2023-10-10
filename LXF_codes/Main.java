public class Main {
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.write(Integer.valueOf(520));
        Integer n = (Integer)m.read();
        int nn = n.intValue();
        System.out.println(nn);

    }

    Comparable findMax(Comparable a[]){
        Comparable MaxValue=a[0];
        for(Comparable num:a){
            if(MaxValue.compareTo(num)<0) MaxValue=num;
        }
        return MaxValue;
    }
}



