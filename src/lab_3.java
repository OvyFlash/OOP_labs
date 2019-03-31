import java.lang.StringBuilder;


public class lab_3 {
    public static void main(String[] args) {
        String string = new String("Наша планета, без сомнения, - уникальна." +
                " Благодаря своему удачному размеру, подходящему расстоянию до Солнца," +
                " которое дает умеренное количество тепла," +
                " наличию других планет в Солнечной системе на Земле стало возможно зарождение и развитие жизни." +
                " Среди всех перечисленных факторов, пожалуй," +
                " только последний вызывает некоторое недоумение – как могли повлиять на земную жизнь другие планеты?" +
                " Но вспомним про существование таких тяжелых газовых гигантов, как Юпитер и Сатурн. Они сыграли роль «защитников» Земли.");
        String[] sentences = string.split("\\.|\\. |\\?");
        String[][] words = new String[sentences.length-1][];
        String firstWord, lastWord;
        for(int i = 0; i < sentences.length -1; i++) {
            //System.out.print("HI");

                words[i] = sentences[i].split("\\s");
                firstWord = words[i][0];
              //  System.out.print(firstWord);
                lastWord = words[i][words.length+1];
             //   System.out.print(lastWord);

                words[i][words.length+1] = firstWord;
                words[i][0] = lastWord;
        }
        StringBuilder final_ed = new StringBuilder();
        for (String[]s : words){

            for(String s1: s) {

                String line = s1+" ";
                final_ed.append(line);

            }
            final_ed.append(". ");
        }
        System.out.print(final_ed.toString());
      //  System.out.println(string.replaceAll("([^.!?, ]!?]+?)([^.!?,+)([^. ]+)([.!?])", "$3$2$1$4"));
    }
}
