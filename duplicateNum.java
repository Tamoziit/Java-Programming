class duplicateNum {
    public int removeDuplicates(int[] nums) {
        int i, j;
        int r[]=new int[10];
        for(i=0; i<10; i++)
        {
            r[i]=-1;
        }
        int x=0;
        for(i=0; i<10; i++)
        {
            int c=0;
            for(j=0; j<nums.length; j++)
            {
                if(nums[j]==i)
                c++;
            }
            if(c>0)
            r[x++]=i;
        }
        int f=0;
        for(i=0; i<r.length; i++)
        {
            if(r[i]!=-1)
            f++;
        }
        return f;
    }
    public static void main()
    {
        int n[]={1,1,2};
        duplicateNum ob=new duplicateNum();
        int x=ob.removeDuplicates(n);
        System.out.println(x);
        }
}
