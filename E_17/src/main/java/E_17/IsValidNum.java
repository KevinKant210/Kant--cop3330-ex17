package E_17;

public class IsValidNum {





    public boolean checkValid(String Value) {

        try {
            Float.parseFloat(Value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
