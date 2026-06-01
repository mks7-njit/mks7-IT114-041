public class EvaluationOrder {
    public static void main(String[] args) {
        int score  = 50;
        boolean cleanRecord = true;
        if (score > 90 || !cleanRecord) {
            System.out.println("Path A Evaluated");
        }   else if (score >= 80 && cleanRecord) {
            System.out.println("Path B Evaluated");
        }   else if (score > 30) {
            System.out.println("Path C Evaluated");
        }   else if (score > 40) {
            System.out.println("Path D Evaluated");
        }   else {
            System.out.println("Path E Evaulated");
        }
    }
}
