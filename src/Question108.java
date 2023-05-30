public class Question108 {
    public static void main(String[] args) {
        String s="Hello bhai kaise ho a";
        String[] words=s.split(" ");
        for (int i=0;i< words.length;i++){
            char ch=words[i].charAt(0);
            char cH=words[i].charAt(words[i].length()-1);
            String first=Character.toString(ch).toUpperCase();
            String second=words[i].substring(1,words[i].length()-1);
            String third=Character.toString(cH).toUpperCase();
            System.out.print(first+second+third+" ");
        }
    }
}
