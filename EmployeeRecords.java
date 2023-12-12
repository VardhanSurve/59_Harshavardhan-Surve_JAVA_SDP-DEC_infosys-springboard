class EmployeeInheritence {
    int empId;
    String Name;
    double salary;

    public double getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return Name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        Name = name;
    }
}

/**
 * PermanentEmployee
 * 
 */
class PermanentEmployee extends EmployeeInheritence {
    double basicPay;
    double hra;
    int experience;
    double VariableComponent;

    public double getBasicPay() {
        return basicPay;
    }

    public double getHra() {
        return hra;
    }

    public int getExperience() {
        return experience;
    }

    public double getVariableComponent() {
        return VariableComponent;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public void setExperience(int experience) {
        this.experience = experience;

    }

    public void setVariableComponent() {
        if (experience < 3) {
            VariableComponent = 0;
        }
        if (experience >= 3 && experience < 5) {
            VariableComponent = 5;
        }
        if (experience < 10 && experience >= 5) {
            VariableComponent = 7;
        }
        if (experience >= 10) {
            VariableComponent = 12;
        }
    }

    double calculateSalary() {
        salary = ((VariableComponent / 100) * basicPay) + basicPay + hra;
        return salary;
    }
}

/**
 * InnerEmployeeInheritence
 */
class ContractEmployee extends EmployeeInheritence {
    double wages;
    int hours;

    public double getWages() {
        return wages;
    }

    public int getHours() {
        return hours;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double calculateSalary() {
        salary = wages * hours;
        return salary;
    }

}

class EmployeeRecords {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee();
        ContractEmployee c1 = new ContractEmployee();
        p1.setName("Anil");
        p1.setEmpId(101);
        p1.setBasicPay(10000);
        p1.setHra(1500);
        p1.setExperience(3);
        p1.setVariableComponent();
        String pName = p1.getName();
        int pEid = p1.getEmpId();
        double pbasicPay = p1.getBasicPay();
        double pHra = p1.getHra();
        int pExperiance = p1.getExperience();
        double variableComponent = p1.getVariableComponent();
        double pSalary = p1.calculateSalary();
        System.out.println(variableComponent);
        System.out.println("The Salary for " + pName + " is: " + pSalary);
        System.out.println("********************************************");
        c1.setName("Ankit");
        c1.setEmpId(102);
        c1.setWages(500);
        c1.setHours(10);
        String cName = c1.getName();
        double cSalary = c1.calculateSalary();
        System.out.println("The Salary for " + cName + " is: " + cSalary);
    }
}