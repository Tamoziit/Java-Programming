import java.util.*;

public class Leetcode_349
{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]); //Making a hashset of elements of nums1[]
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]); //adding the intersection of the arrays in hashset 'intersect'
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num; //Returning only the number in the hashset(not freq.)
        }
        return result;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengths");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x[] = new int[a];
        int y[] = new int[b];
        int i;
        System.out.println("Enter elements of 1st array:");
        for(i = 0; i<a; i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd array:");
        for(i = 0; i<b; i++)
        {
            y[i]=sc.nextInt();
        }
        Leetcode_349 ob = new Leetcode_349();
        int r[] = ob.intersection(x, y);
        if(r.length != 0)
        {
            for(i=0; i<r.length; i++)
                System.out.print(r[i] + " ");
            System.out.println();
        }
        else 
            System.out.println("No common elements");
    }
}
