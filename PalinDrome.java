import java.util.Scanner;
public class PalinDrome{
    static class Entry{
        String word;
        boolean isPalinDrome;
        Entry(String w){
            word=w;
            isPalinDrome=isPalinDrome(w);
            
        }
    }
    public static boolean isPalinDrome(String word){
        String w=word.toLowerCase();
        int left=0;
        int right=w.length() -1;
        while(left<right){
            if (w.charAt(left) != w.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int countPD(String[]words){
        int count=0;
        for (int i =0;i<words.length; i++){
            if(isPalinDrome(words[i])){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many words woll be entered");
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] words=new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter word"+(i+1)+": ");
            words[i]=scanner.nextLine();
        }
        Entry[]entries=new Entry[n];
        for (int i=0;i<n;i++){
            entries[i]=new Entry(words[i]);
            if(entries[i].isPalinDrome){
                System.out.println(entries[i].word+" is a palindrome");

            }else{
                System.out.println(entries[i].word+" is not a palindrome");
            }
        }
        int total=countPD(words);
        System.out.println("Total palindromes: "+total);
        scanner.close();
    }
}