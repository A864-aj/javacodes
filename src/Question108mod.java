public class Question108mod {
    public static String toCapital(String str) {
        if (str.length()<=2){
            return str.toUpperCase();
        }
        String first=Character.toString(str.charAt(0)).toUpperCase();
        String second=str.substring(1,str.length()-1);
        String third=Character.toString(str.charAt(str.length()-1)).toUpperCase();
        return first+second+third;
    }
    public static void main(String[] args) {
        String sen="Heelo bhai apki gand h";
        String words[]=sen.split(" ");
        String res="";
        for (String word:words){
            res=res+toCapital(sen)+" ";
        }
        System.out.println(res.trim());
    }
}
