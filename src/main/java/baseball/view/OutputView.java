package baseball.view;

public class OutputView {
    public void printGameStrat(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void printResult(int strike, int ball){
        StringBuilder sb = new StringBuilder();

        if (ball>0){
            sb.append(ball);
            sb.append("볼 ");
        }
        if (strike>0){
            sb.append(strike);
            sb.append("스트라이크");
        }
        if (sb.isEmpty()){
            sb.append("낫싱");
        }

        System.out.println(sb);
    }

    public void printGameFinish(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
