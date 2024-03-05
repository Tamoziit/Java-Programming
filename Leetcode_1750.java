import java.util.*;

class Leetcode_1750 {
    //Approach 1
    public int minimumLength(String s) {
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i=0;
        int j=n-1;
        while(j>i){
            if(ch[i]!=ch[j]) break;
            char c = ch[i];
            while(j>=i && ch[i]==c)i++;
            while(j>=i && ch[j]==c)j--;
        }
        return j-i+1;
    }

    //Approach 2
    /*public int minimumLength(String s) {
            // sso now here we can see that as here we have to also the take care of the repating number also 
            // here so now 
            char[] str = s.toCharArray();
            // so now here we will start with the start and the end 
            int start = 0;
            int end = str.length-1;
            int len = str.length;
            // so now here 
            while(start < end && str[start] == str[end]){
                // so now here so we have to also skip the duplicate also 
                while(start < end && str[start] == str[start+1]){
                    start++;
                    len--;
                } 
                // similary for the end here also
                while(end > start && str[end] == str[end-1]){
                    end--;
                    len--;
                }
                // so now other wise we have to also do that 
                start++;
                end --;
                len-=2;
            }
            if(len < 0){
                return 0;
            }
            return len;
        }
    }*/
    public static void main()
    {
        Leetcode_1750 ob = new Leetcode_1750();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String c = sc.nextLine();
        int x = ob.minimumLength(c);
        System.out.println(x);
    }
}