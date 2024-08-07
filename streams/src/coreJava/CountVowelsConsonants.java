package coreJava;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        String s = "safdsiousdooi514 +s dsd + d dsf dsf";
        String lowerCase = s.toLowerCase();
        int vowels=0,consonants=0;
        char[] charArray = lowerCase.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] != ' ' && charArray[i]>='a' && charArray[i]<='z'){
                if (charArray[i] == 'a'||charArray[i] == 'e'||charArray[i] == 'i'||charArray[i] == 'o'
                ||charArray[i] == 'u') {
                    vowels++;
                }else {
                    consonants++;
                }

            }
        }

        System.out.println("Vowels : "+vowels  +" Consonanats : "+consonants);
    }
}
