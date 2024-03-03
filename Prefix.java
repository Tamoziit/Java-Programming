class Prefix {
    public static void longestCommonPrefix() {
        String strs[]={"cir","car"};
        int i, j, f;
        int l=0;
        int min=strs[0].length();
        String r="", s="";
        for(i=0; i<strs.length; i++)
        {
            l=strs[i].length();
            if(l<=min)
            {
                min=l;
                s=strs[i];
            }
        }
        System.out.println(s);
        char ch='1';
        for(i=0; i<min; i++)
        {
            f=0;
            try{
               ch=s.charAt(i);
             }
            catch(Exception e)
            {
               System.out.println("");
            }
            for(j=0; j<strs.length; j++)
            {
                if(ch==strs[j].charAt(i))
                f++;
            }
            if(f==strs.length)
            r=r+ch;
            else
            break;
        }
        System.out.println(r);
    }
}