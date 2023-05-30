import java.util.*;
public class Question114{
    public static void main(String[] args) {
        String sent="This is a sentence car";
        String[] word=sent.split(" ");
        System.out.println(Arrays.toString(Question114.sortSent(word)));
    }
    public static String[] sortSent(String[] word){
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length-i-1; j++) {
                if (word[j+1].length()<word[j].length()){
                    String temp=word[j+1];
                    word[j+1]=word[j];
                    word[j]=temp;
                }
            }
        }
        return word;
    }
}