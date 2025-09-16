package java_HW_0916_2;
import java.util.*;
public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> recentUrls = new ArrayDeque<>();

        while(true) {
            System.out.print("방문 URL을 입력하시오. (단, exit를 입력하면 종료 ): ");
            String url = sc.nextLine();

            if(url.equalsIgnoreCase("exit")) {
                break;
            }

            recentUrls.addFirst(url);

            if (recentUrls.size() > 5) {
                recentUrls.removeLast();
            }
            System.out.println("최근 방문 URL : " + recentUrls);
        }
        sc.close();
    }
}
