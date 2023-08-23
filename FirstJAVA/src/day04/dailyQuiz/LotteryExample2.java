import java.util.Random;

public class NumberFrequencyCounter {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();

        // 1에서 100까지의 숫자를 천개의 배열 안에서 랜덤 생성
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // 각 숫자가 몇 번씩 쓰였는지 체크
        int[] frequency = new int[101]; // 0은 사용하지 않으므로 101 크기로 설정
        for (int num : array) {
            frequency[num]++;
        }

        // 결과 출력
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "가 " + frequency[i] + "번 사용되었습니다.");
        }
    }
}
