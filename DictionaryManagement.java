import java.util.Scanner;

public class DictionaryManagement {

    Dictionary myDic = new Dictionary();

    public void insertFromCommandline() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Input english word: ");
            String english = sc.nextLine();

            System.out.println("Input vietnamese meaning: ");
            String vietnamese = sc.nextLine();

            Word word = new Word(english, vietnamese);
            myDic.addWord(word);
        }
    }
}
