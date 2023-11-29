package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    InputValidation inputValidation = new InputValidation();
    public List<Integer> inputNumber(){
        System.out.print("숫자를 입력해주세요 : ");

        String input = read();
        inputValidation.inputNumberCheck(input);

        return input.chars()
                .mapToObj(c -> c - 48)
                .toList();
    }

    public String check_restart(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        String input = read();
        inputValidation.restartNumberCheck(input);

        return input;
    }

    private String read(){
        return Console.readLine();
    }
}
