package programCreek;

public class validPalindrome {

    public static boolean checkValidPalin(String str){

        if (str == null || str.length() ==1){
            return false;
        }

        str = str.replaceAll("[^a-bA-B0-9]","");

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() -i) ){
                return false;
            }

        }

        return true;

    }


    public static void main(String[] args){
        String s = "TT HH!Q TT";
        if(checkValidPalin(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("its Not");
        }
    }
}
