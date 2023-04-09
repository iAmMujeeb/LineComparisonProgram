public class LineComparisonProblem {
    public static void main(String[] args) {
        int x1=11;
        int x2=6;
        int y1=7;
        int y2=31;
        double l=0;
        double l1=0;
        double l2=0;
        for(int i=1; i<=2; i++) {
            l = (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
            System.out.println(l);
            if(i==1)
                l1=l;
            else
                l2=l;
        }
        String s1= String.valueOf(l1);
        String s2= String.valueOf(l2);
        Integer l3=(int)l1;
        Integer l4=(int)l2;
        boolean Result = l3.equals(l4);
        if(Result==true)
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
        if((s1.compareTo(s2))==0)
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");


    }
}
