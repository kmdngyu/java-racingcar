package util;

public class Race {
    public static void startGame(){

    }

    private static void printResult(){

    }

    /**
     * 0 ~ 9 사이 난수 출력
     * @return
     */
    private int randomNum(){
        // 랜덤 함수를 이용해 0 ~ 1 사이의 난수를 출력 후 정수화 하고 0 ~ 9 로 변환
        double randomNumber = Math.random();
        int intNumber = (int)Math.floor(randomNumber * 10);

        return intNumber;
    }
}
