package Interface;
          
          
  class Execute{
 public static void main(String[] args){
                    IBank bank=new MumbaiOffice();  
                    Customer customer = new Customer();
                    customer.setCustomerId("cust1001");
                    customer.setName("Ajay");
                    String accountNumber = bank.createAccount(customer);
                    System.out.println("Account number is..." +accountNumber);
                    double gloan = bank.issueGoldLoan(customer);
                    System.out.println("Gold loan amount is..." +gloan);
                    double hloan = bank.issueHouseLoan(customer);
                    System.out.println("House loan amount is..." +hloan);
                    double vloan = bank.issueVehicleLoan("bike",customer);
                    System.out.println("Vehicle loan amount is..." +vloan);
                    System.out.println("Caution money is..." +IBank.CAUTION_MONEY);
                }
            }
                                           
          
           
           
