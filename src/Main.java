public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <=20; i++){
            if (i > 15) {
                break;
            }
            if(i % 5 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}