package jddJunit;

public class RemovingA {
    public String check(String str) {

        String res = " ";
        if (str.length() >= 2) {
            char FirstLetter = str.charAt(0);
            char SecondLetter = str.charAt(1);
            if (FirstLetter == 'A' || FirstLetter == 'a') {
                if (SecondLetter == 'A' || SecondLetter == 'a') {
                    res = str.substring(2, str.length());
                } else {
                    res = SecondLetter + str.substring(2, str.length());;
                }
            } else if (SecondLetter == 'a' || SecondLetter == 'A') {
                res = FirstLetter + str.substring(2, str.length());;
            }
           if(FirstLetter != 'A' && SecondLetter != 'A'){
                res = str.substring(0,2) + str.substring(2, str.length());;
            }
        }
        else{
            if(str.length() != 0) {
                if (str.charAt(0) == 'A' || str.charAt(0) == 'a') {
                    res = " ";
                } else {
                    res = "" + str.charAt(0);
                }
            }
            else{
                res = " ";
            }
        }
        return res;
    }
}
