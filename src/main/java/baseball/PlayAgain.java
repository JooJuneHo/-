package baseball;

import camp.nextstep.edu.missionutils.Console;

public class PlayAgain {
    public boolean playAgain(){
        System.out.println("축하합니다! 경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
        char answer = Console.readLine().charAt(0);
        if(answer == '1'){
            return true;
        }
        return false;
    }
}
