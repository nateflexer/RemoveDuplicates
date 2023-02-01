import java.util.*;

public class RemoveDuplicates {

   static String removeDups(char s[], int n){
      int index = 0;
      int j;
      for (int i = 0; i < n; i++)
      {
         for (j = 0; j < i; j++)
         {
            if (s[i] == s[j])
            {
               break;
            }
         }
        
         if (i==j)
         {
            s[index++] = s[i];
         }
      }
      return String.valueOf(Arrays.copyOf(s, index));
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string of lowercase letters: ");
      char s[]=sc.next().toCharArray();
     
      int n = s.length;
      System.out.println(removeDups(s, n));
   }
}