import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String longString = "This is a long string to tokenize into individual tokens";
        
        StringTokenizer tokenizer = new StringTokenizer(longString);
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}

