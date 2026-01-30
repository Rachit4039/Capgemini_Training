
public class findSentences {

   
    static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String w : words) {
                if (w.equals(word)) {
                    return sentence;
                }
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "I love programming",
            "Java is fun",
            "Linear search is easy",
            "Data structures are important"
        };

        String word = "Java";

        String result = findSentence(sentences, word);
        System.out.println(result); 
    }
}
