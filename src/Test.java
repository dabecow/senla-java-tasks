import com.senla.task.first.NumberAnalyzer;
import com.senla.task.fourth.WordCounter;
import com.senla.task.third.SentenceHandling;

public class Test {
    public static void main(String[] args) {
        System.out.println(NumberAnalyzer.isComposite(1));
        System.out.println(NumberAnalyzer.isEven(1));
        System.out.println(SentenceHandling.capitalizeFirstLetters("My Mom anna likes Banana"));
        System.out.println(SentenceHandling.sortWords("My Mom anna likes Banana"));
        System.out.println(WordCounter.getWordInsertions("one two three three one", "two"));
    }
}
