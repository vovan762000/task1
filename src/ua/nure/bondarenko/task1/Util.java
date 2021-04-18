package ua.nure.bondarenko.task1;

public class Util {
    public static final String ERR_MASSAGE = "Input correct data";

    private Util() {
    }

    public static boolean checkInputLikeDigit(String[] args) {
        try {
            if (args.length == 0){
                System.out.println(ERR_MASSAGE);
                return false;
            }
            for (int i = 0; i < args.length; i++) {
                Integer.parseInt(args[i]);
            }
            return true;
        } catch (NumberFormatException  e) {
            System.out.println(ERR_MASSAGE);
            return false;
        }
    }
}
