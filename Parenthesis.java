class Parenthesis {
    public static void isValid(String s) {
        int i;
        s=s+" ";
        int x=0;
        String a[]=new String[s.length()-1];
        for(i=0; i<s.length()-1; i+=2)
        {
            a[x++]=s.substring(i, i+2);
        }
        for(i=0; i<a.length; i++)
        System.out.print(a[i]+ " ");
        System.out.println();
        for(i=0; i<a.length; i++)
        {
            if(a[i]!=null){
            if(a[i].charAt(0)!=a[i].charAt(1))
             System.out.println("false");
            }
        }
        System.out.println("true");
    }
}