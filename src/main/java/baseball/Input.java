package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Input {
    public List<Integer> playerNumber(){
        System.out.println("숫자를 입력해주세요");
        List<Integer> playerNum = new ArrayList<>();
        String input = Console.readLine();

        for(String number: input.split("")){
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}
