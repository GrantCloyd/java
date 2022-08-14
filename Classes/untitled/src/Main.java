public class Main {

    public static void  main(String[] args){
//        Car firstCar = new Car();
//        Car secondCar = new Car();
//
//        firstCar.setModel("Porsche");
//        System.out.println("Model for first car is " + firstCar.getModel());
//        secondCar.setModel("Ford");
//        System.out.println("Model for second car is " + secondCar.getModel());
//
//

        BankAccount bankAccountOne = new BankAccount();
        bankAccountOne.setBalance(2000.00);
        System.out.println(bankAccountOne.setPhoneNumber("222-234-3030"));
        System.out.println(bankAccountOne.setPhoneNumber("22-23-3030"));
        System.out.println(bankAccountOne.setPhoneNumber("2222343030"));
        System.out.println(bankAccountOne.withdrawFunds(250.00));
        System.out.println(bankAccountOne.depositFunds(565.55));
        bankAccountOne.setCustomerName("James B");
        System.out.println(bankAccountOne.setEmail("james"));
        System.out.println(bankAccountOne.setEmail("jamesb@gmail.com"));
        System.out.println(bankAccountOne.setAccountNumber("1234567891111"));
        System.out.println(bankAccountOne.getBalance());
        System.out.println(bankAccountOne.withdrawFunds(501.00));
        System.out.println(bankAccountOne.withdrawFunds(.24));
        System.out.println(bankAccountOne.setAccountNumber("123456789111"));
        System.out.println(bankAccountOne.withdrawFunds(5001.00));
        System.out.println(bankAccountOne.withdrawFunds(501.00));
        System.out.println(bankAccountOne.withDrawFundsFromAtm(222222));
        System.out.println(bankAccountOne.withDrawFundsFromAtm(20.00));
    }
}
