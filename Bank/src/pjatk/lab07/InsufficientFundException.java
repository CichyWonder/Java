package pjatk.lab07;

public class InsufficientFundException extends Exception {
        private static String errorMessage = "You can't withdraw that much, you dontwant to end up in debt, no funds were withdrawn";
        public InsufficientFundException() {
            super(errorMessage);
        }
}
