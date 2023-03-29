package Exam2;

public class StringKnowledge {
    public static boolean endOther(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        int indexB = a.indexOf(b);
        int indexA = b.indexOf(a);
        if ((indexB > 0 && indexB == (a.length()-b.length()))|| (indexA > 0 && indexA == (b.length()-a.length()))){
            return true;
        }
        return false;
    }

    public static String getSandwhich(String str){
        int breadLocation = str.indexOf("bread");
        int lastBreadLocation = str.lastIndexOf("bread");
        if (breadLocation == lastBreadLocation){
            return "";
        }
        String ingredients = str.substring((breadLocation+5), lastBreadLocation);
        System.out.println(ingredients);
        return ingredients;
    }
    public static void main(String[] args){
        System.out.println(endOther("Hiab","asdasdhiabd"));
    }
}