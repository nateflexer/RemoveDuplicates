import java.util.*;

public class RemoveDuplicates {

   static String removeDups(char word[], int n){
      int index = 0;
      int j;
      for (int i = 0; i < n; i++)
      {
         for (j = 0; j < i; j++)
         {
            if (word[i] == word[j])
            {
               break;
            }
         }
        
         if (i==j)
         {
            word[index++] = word[i];
         }
      }
      return String.valueOf(Arrays.copyOf(word, index));
   }
   
   public static void main(String[] args) {
      char word[] = "xyyxzx".toCharArray();
      int n = word.length;
      System.out.println(removeDups(word, n));
   
   }
 
}