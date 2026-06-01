import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        String[] words = {"One","Two","Three","Four","Five"};

        String p = words[0];
        words[0] = words[1];
        words[1] = p;
        
        for(int i = 0; i < words.length; i++){
            String t = words[i];
            int newIndex = (int)Math.floor(Math.random()*(words.length-1));
            words[i] = words[newIndex];
            words[newIndex] = t;
        }
        System.out.println(Arrays.toString(words));
    }
}