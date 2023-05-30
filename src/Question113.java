public class Question113 {
    public static void main(String[] args) {
        int bitmap[]=new int[128];
        String first="arc";
        String second="car";
        int count=0;
        if (first.length()==second.length()){
            for (int i=0;i<first.length();i++){
                bitmap[first.charAt(i)]++;
            }
            for (int i=0;i<first.length();i++){
                bitmap[second.charAt(i)]++;
            }
            for (int i=0;i<bitmap.length;i++){
                if (bitmap[i]>1){
                    count++;
                }
            }
            System.out.println(count==first.length()?"True":"False");
        }
        else
            System.out.println("FalsE");
    }
}
