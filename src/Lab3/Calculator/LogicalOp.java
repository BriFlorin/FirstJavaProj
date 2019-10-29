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

    public void printNumber(int n) {
        switch (n) {
            case 1:
                System.out.println("The number is:  1 !");
                break;
            case 2:
                System.out.println("The number is:  2 !");
                break;
            case 3:
                System.out.println("The number is:  3 !");
                break;
            case 4:
                System.out.println("The number is:  4 !");
                break;
            case 5:
                System.out.println("The number is:  5 !");
                break;
            case 6:
                System.out.println("The number is:  6 !");
                break;
            case 7:
                System.out.println("The number is:  7 !");
                break;
            case 8:
                System.out.println("The number is:  8 !");
                break;
            case 9:
                System.out.println("The number is:  9 !");
                break;
            default:
                System.out.println("wrongNumber");
                break;

        }
    }

    public boolean isNumberEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int n) {
        if (n > 18) {
            return true;
        } else {
            return false;
        }


    }

    public int returnBiggerNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        }else if (n2> n1 && n2> n3){
            return n2;
        }else if (n3 > n2 && n3 > n1){
            return n3;
        }
        return 0;
    }


}

