public class Question109 {
    public static void main(String[] args) {
        int bitmap[]=new int[128];
        String str="Hello Bhai Kaise ho aa";
        for (int i=0;i<str.length();i++){
            bitmap[str.charAt(i)]++;
        }
        for (int i=0;i<bitmap.length;i++){
            if (bitmap[i]>0){
                System.out.println((char)i+" = "+bitmap[i]);
            }
        }
    }
}
//110 to 119