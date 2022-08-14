import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccount {

    private String accountNumber;
    private long balanceInCents;
    private String customerName;
    private String email;
    private String phoneNumber;

      public String setAccountNumber(String accountNumber) {
          if (accountNumber.length() == 12) {
              this.accountNumber = accountNumber;
              return "Account number set";
          }
          return "Account number not valid.";
      }

      private void setBalanceInCents(long balanceInCents){
          this.balanceInCents = balanceInCents;
      }

      public void setBalance(double balance){
          long balanceInCents = convertFromDecimal(balance);
          setBalanceInCents(balanceInCents);
      }

      public void setCustomerName(String customerName){
          this.customerName = customerName;
      }

      public String setEmail(String email){
          boolean validEmail = validateEmail(email);
          if (validEmail){
              this.email = email;
              return "Updated " + email;
          }
          return "Invalid email";
      }

      public String setPhoneNumber(String phoneNumber){
          if (phoneNumber.length() != 10 || phoneNumber.matches("(.*)-(.*)")){
              return "Invalid phone number. Check length and remove dashes";
          }
          this.phoneNumber = phoneNumber;
          return "Updated to " + phoneNumber;
      }

      public String depositFunds(double funds){
          long convertedFunds = convertFromDecimal(funds);
          balanceInCents += convertedFunds;
          return "Funds deposited. Current amount: " + getBalance();
      }

      public String withdrawFunds(double requestAmount){
          if (accountNotValid()){
              return "Request can not be fulfilled. Please update your email, name, or account number.";
          }
          long convertedRequest = convertFromDecimal(requestAmount);
          if (convertedRequest > balanceInCents){
              return "Request denied. Insufficient funds";
          } else {
              balanceInCents = balanceInCents - convertedRequest;
              return "Funds withdrawn: " + convertToDecimalFormat(requestAmount) + ". Funds remaining: " + getBalance() + ".";
          }
      }

      public String withDrawFundsFromAtm(double requestAmount){
          String resultMessage = withdrawFunds(requestAmount);
          if (resultMessage.startsWith("Request denied")){
              return resultMessage;
          } else {
              balanceInCents -= 300;
              return "Funds withdrawn: " + convertToDecimalFormat(requestAmount) + ". Service fee of $3.00 taken. Funds remaining: " + getBalance() + ".";
          }
      }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z/D._%+-]+@[A-Z/D.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private boolean validateEmail(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    private long convertFromDecimal(double amount){
         return (Math.round(amount * 100.00));
    }

    private double convertToDecimal(long amount){
        return amount / 100.00;
    }

    private String convertToDecimalFormat(double decimal){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        return decimalFormat.format(decimal);
    }

    private boolean accountNotValid(){
      return  customerName == null || customerName.isEmpty()||
              email == null || email.isEmpty() ||
              accountNumber == null || accountNumber.isEmpty();

    }

      public String getAccountNumber(){
        if (this.accountNumber.isBlank() ){
            return "Account number not set";
        }
          return this.accountNumber;
      }

    public String getBalance(){
       double decimalBalance = convertToDecimal(balanceInCents);
       return convertToDecimalFormat(decimalBalance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
