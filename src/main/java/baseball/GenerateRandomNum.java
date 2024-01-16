package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import net.bytebuddy.utility.RandomString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNum {
    public int randomMake(){
        int random = Randoms.pickNumberInRange(1,9);
        return random;
    }

    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();
        while(computerNumber.size()<3){
            int randomNumber = randomMake();
            if(!computerNumber.contains(randomNumber)){
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }
}
