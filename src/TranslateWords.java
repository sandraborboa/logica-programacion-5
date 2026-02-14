import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TranslateWords {
    private Dictionary dictionary;
    private Scanner scanner;

    public TranslateWords(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = new Scanner(System.in);
    }

    public void startQuiz(){
        List<Map.Entry<String, String>> quizWords = dictionary.selectRandomWords();

        int wrong = 0;
        int correct = 0;

        System.out.println("Test your english skills. Translate the following words: ");

        for ( Map.Entry<String,String> word : quizWords) {
            String spanish = word.getKey();
            String correctEnglish = word.getValue();

            System.out.print(spanish + ": ");
            String userAnswer = scanner.nextLine();

            if(userAnswer.equalsIgnoreCase(correctEnglish)){
                System.out.println("Well done!");
                correct++;
            } else {
                System.out.println("Wrong answer. The correct answer is: " + correctEnglish);
                wrong++;
            }
        }
        System.out.println("Results:");
        System.out.println("Correct answers: " + correct);
        System.out.println("Incorrect answers: " + wrong);
    }

}
