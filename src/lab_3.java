import java.lang.StringBuilder;


public class lab_3 {
    public static void main(String[] args) {
        String string = new String("Наша планета, без сомнения, - уникальна." +
                " Благодаря своему удачному размеру, подходящему расстоянию до Солнца," +
                " которое дает умеренное количество тепла," +
                " наличию других планет в Солнечной системе на Земле стало возможно зарождение и развитие жизни." +
                " Среди всех перечисленных факторов, пожалуй," +
                " только последний вызывает некоторое недоумение – как могли повлиять на земную жизнь другие планеты?" +
                " Но вспомним про существование таких тяжелых газовых гигантов, как Юпитер и Сатурн. Они сыграли роль «защитников» Земли. ");
        String[] sentences = string.split("\\. |\\? ");
        String[][] words = new String[sentences.length][];

        String firstWord, lastWord;
        for(int i = 0; i < sentences.length; i++) {
                words[i] = sentences[i].split("\\s");
                firstWord = MakeItLower(words[i][0]);
             //   System.out.println(firstWord);
                lastWord = MakeFirstLetterHigher(words[i][words[i].length-1]);
               // System.out.println(lastWord);
                words[i][words[i].length-1] = firstWord;
                words[i][0] = lastWord;
        }

        StringBuilder final_ed = new StringBuilder();
        for (String[]s : words){
            for(String s1: s) {
                String line = s1+" ";
                final_ed.append(line);
            }
            final_ed.append("\b. ");
        }
        System.out.print(final_ed.toString());
      //  System.out.println(string.replaceAll("([^.!?, ]!?]+?)([^.!?,+)([^. ]+)([.!?])", "$3$2$1$4"));
    }
    private static String MakeItLower(String firstOne){
        String[]letters = firstOne.split("");
        StringBuilder getBack = new StringBuilder();

        for (int i =0; i<letters.length; i++){
            letters[i] = letters[i].toLowerCase();
            getBack.append(letters[i]);
        }
        return getBack.toString();
    }
    private static String MakeFirstLetterHigher(String lastOne){
        String[]letters = lastOne.split("");
        StringBuilder getBack = new StringBuilder();
        letters[0] = letters[0].toUpperCase();
        for (int i =0; i<letters.length; i++){
            getBack.append(letters[i]);
        }
        return getBack.toString();
    }
   /* private static String wordProccess(String firstOne, String lastOne){
        if (boolean(firstOne) != 0){
            String[]letters = firstOne.split("");
            StringBuilder getBack = new StringBuilder();

            for (int i =0; i<letters.length; i++){
                letters[i] = letters[i].toLowerCase();
                getBack.append(letters[i]);
            }
            return getBack.toString();
        } else{
            String[]letters = lastOne.split("");
            StringBuilder getBack = new StringBuilder();
            letters[0] = letters[0].toUpperCase();
            for (int i =0; i<letters.length; i++){
                letters[i] = letters[i].toLowerCase();
                getBack.append(letters[i]);
            }
            return getBack.toString();
        }*/
}

