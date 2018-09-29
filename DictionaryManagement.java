import java.util.Scanner;

public class DictionaryManagement {

    Dictionary myDic = new Dictionary();

    public void insertFromCommandline() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.print("Input english word: ");
            String english = sc.nextLine();

            System.out.print("Input vietnamese meaning: ");
            String vietnamese = sc.nextLine();
            System.out.println();
            Word word = new Word(english, vietnamese);
            myDic.addWord(word);
        }
        sc.close();
    }
}
