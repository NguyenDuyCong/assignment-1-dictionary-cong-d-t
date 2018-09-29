public class DictionaryCommandline {

    public void showAllWords(){
        System.out.println("No  |English                |Vietnamese");
        int no = 0;
        for (Word word : Dictionary.listWord) {
            no = no + 1;
            System.out.println(no + "  |" + word.getWord_target() + "               |" + word.getWord_explain());
        }
    }
}
