public class Main {
    public static void main(String[] args) {
        int score = 61;

//        String  result = (score > 60) ? "통과" : "탈락";

        String result;
        if (score > 60){
            result = "통과";
        }
        else {
            result = "탈락";
        }

        System.out.println("결과:"+ result);
    }
}