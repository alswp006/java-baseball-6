package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    public List<Integer> createComputerNumber(){
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public int[] match_Strike_Ball(List<Integer> player_Number, List<Integer> computer_Number){
        int matchNumber = player_Number.stream()
                .filter(computer_Number::contains)
                .toList()
                .size();
        int strike = (int) IntStream.range(0, player_Number.size())
                .filter(i -> player_Number.get(i).equals(computer_Number.get(i)))
                .count();
        int ball = matchNumber - strike;

        return new int[]{strike, ball};
    }
}
