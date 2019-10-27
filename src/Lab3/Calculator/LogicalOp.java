package Lab3.Calculator;

public class LogicalOp {


    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String compare(String text) {
        if (text.equals("FastTrackIt")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String compareTextandNumber(String text, int n) {
        if (text.equals("FastTrackIt") && n <= 3) {
            return text + n;
        } else if (!text.equals("FastTrackIt") && n >= 4) {
            return n + text;
        }
        return "";
    }

    public String checkAmountOfSnow(int n) {
        if (n > 8 || n == 6) {
            return "The amount of snow this winter was(cm)" + n;
        } else {
            return "The forecast snow is(cm)" + n;
        }
    }

    public String comparNumber(int n) {
        if (n > 3 && n != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (n == 4) {
            return "The number is equal to 4";
        } else if (n < 3) {
            return "The number is lower than";
        }
        return "";
    }


}

