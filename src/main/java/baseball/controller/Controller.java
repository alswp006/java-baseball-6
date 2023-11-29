package baseball.controller;

import baseball.model.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Game game = new Game();

    public void play() {
        outputView.printGameStrat();

        boolean game_play = true;

        while (game_play){
            game();
            game_play = restart();
        }

        System.out.println("게임 종료");
    }

    private void game() {
        List<Integer> computer_Number = game.createComputerNumber();
        boolean all_strike = true;

        while (all_strike) {
            List<Integer> player_number = inputView.inputNumber();
            int[] strike_ball = game.match_Strike_Ball(player_number, computer_Number);
            outputView.printResult(strike_ball[0], strike_ball[1]);
            all_strike = strike_ball[0] != 3;
        }
        outputView.printGameFinish();
    }

    private boolean restart() {
        String restart = inputView.check_restart();

        return restart.equals("1");
    }
}
