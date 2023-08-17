public class assignment1 {
    public static void main(String[] args) {
        String sentence = "Welcome to I.T MASTAR";
        String word = sentence.substring(15,21);
        System.out.println(word);
        char letter = sentence.charAt(16);
        System.out.println(letter);
        String aLetter = String.valueOf(Character.toLowerCase(letter));
        System.out.println(aLetter);
        String output = aLetter+word;
        System.out.println(output);
        System.out.println(word.toLowerCase());
        char letter1 = sentence.charAt(18);
        System.out.println("letter1");
        String tletter1 = String.valueOf(Character.toLowerCase(letter1));
        System.out.println(tletter1);
        String output1 =tletter1+word;
        System.out.println(output);
        System.out.println(word.toLowerCase());
        char letter2 = sentence.charAt(19);
        System.out.println("letter2");
        String aletter2 =String.valueOf(Character.toLowerCase(letter2));
        System.out.println(aletter2);
        String output2 =aletter2+word;
        System.out.println(output2);
        System.out.println(word.toLowerCase());
        char letter3 =sentence.charAt(20);
        System.out.println("letter3");
        String rletter3 =String.valueOf(Character.toLowerCase(letter3));
        System.out.println(rletter3);
        String output3 =rletter3+word;
        System.out.println(output3);
        System.out.println(word.toLowerCase());


    }

}






