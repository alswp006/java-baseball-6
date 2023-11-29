package baseball.view;

public class InputValidation {
    private static final int NUMBER_LENGTH = 3;

    public void inputNumberCheck(String input){
        typeCheck(input);
        duplicationCheck(input);
        inputLengthCheck(input);
        zeroCheck(input);
    }

    public void restartNumberCheck(String input){
        one_two_Check(input);
    }
    private void typeCheck(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private void duplicationCheck(String input) {
        int duplication = (int) input.chars().distinct().count();

        if (duplication != NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void inputLengthCheck(String input) {
        if (input.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void zeroCheck(String input){
        if (input.contains("0")){
            throw new IllegalArgumentException();
        }
    }

    private void one_two_Check(String input){
        if (!input.equals("1") && !input.equals("2")){
            throw new IllegalArgumentException();
        }
    }
}
