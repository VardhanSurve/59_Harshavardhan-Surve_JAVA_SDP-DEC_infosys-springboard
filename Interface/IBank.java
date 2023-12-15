package Interface;

 public interface IBank {
                  int CAUTION_MONEY = 2000;
                  String createAccount(Customer customer);
                  double issueVehicleLoan(String vehicletype, Customer customer);
                  double issueHouseLoan(Customer customer);
                  double issueGoldLoan(Customer customer);
                }
                class MumbaiOffice implements IBank {
                            public String createAccount(Customer customer){
                            return "Acc12345";
                            }
                            public double issueVehicleLoan(String vehicleType,Customer customer) {
                              if(vehicleType.equals("bike")) {
                                return 100000;
                              }
                              else {
                                return 500000;
                              }
                            }
                            public double issueHouseLoan(Customer customer){
                              return 200000;
                            }
                          public double issueGoldLoan(Customer customer){
                            return 500000;
                          }
                        }
                        