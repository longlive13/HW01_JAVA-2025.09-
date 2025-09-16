package java_HW_0916_2;
import java.util.*;
public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> waitingQueue = new LinkedList<>();

        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input.equalsIgnoreCase("next")) {
                if (waitingQueue.isEmpty()) {
                    System.out.println("대기 중인 고객이 없습니다.");
                } else {
                    String served = waitingQueue.poll(); // 맨 앞 고객 꺼내기
                    System.out.println(served + " 고객님의 서비스가 완료되었습니다.");
                }
            } else {
                waitingQueue.offer(input); // 대기열에 추가
                System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }
        }

        sc.close();
    }
}
