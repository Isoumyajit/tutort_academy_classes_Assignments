package week_5.Assignments;

import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0 ;
        int start = 0 ;
        int coockie = 0 ;
        Arrays.sort(g);
        Arrays.sort(s);
        while(coockie < g.length && start < s.length){
            if(g[coockie] <= s[start]){
                count++;
                coockie++;
                start++;
            }else start++;
            
        }
        return count;
    }
}
