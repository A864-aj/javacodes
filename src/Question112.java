//Take a sentence and check whether it has all words beginning with a capital letter or not.
public class Question112 {
    public static void main(String[] args) {
        String sent="Hello bhai Kaise Ho";
        String[] words=sent.split(" ");
        int count=0;
        for (int i=0;i< words.length;i++){
            char c=words[i].charAt(0);
            if (c>=65 && c<=90){
                count++;
            }else {
                count=0;
                break;
            }
        }
        System.out.println(count>0?"True":"False");
    }
}
