package java_HW_0916_2;
import java.util.*;
public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        while (true) {
            System.out.print("학생 성적: ");
            int score = sc.nextInt();
            score.add(score);
            System.out.print("추가 입력하려면 y : ");
            String choice = sc.next();
            if(!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
        int count = scores.size();
        double sum = 0;
        for(int s : scores) {
            sum += s;
        }
        double avg = (count >0) ? sum/count :0;
        System.out.println("학생인원: " + count);
        System.out.println("평균 점수: " + avg);

        sc.close();
    }
}
