public class ChocolateTester {
    int barCode;
    String Name;
    int weight;
    int cost;

    public int getBarCode() {
        return barCode;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return Name;
    }

    public int getWeight() {
        return weight;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    ChocolateTester(int _barCode, String _Name, int _weight, int _cost) {
        barCode = _barCode;
        Name = _Name;
        weight = _weight;
        cost = _cost;
    }

    public static void main(String[] args) {
        ChocolateTester test = new ChocolateTester(1234, "Dairymilk", 25, 10);
        String _Name=test.getName();
        int _barCode=test.getBarCode();
        int _weight=test.getWeight();
        int _cost=test.getCost();
        System.out.println("Bar Code:"+ _barCode);
        System.out.println("Name:"+ _Name);
        System.out.println("Weight:"+ _weight);
        System.out.println("Cost:"+ _cost);
        System.out.println("*******************************************");
        test.setBarCode(69);
        test.setName("kitkat");
        test.setCost(22);
        test.setWeight(55);
         _Name=test.getName();
         _barCode=test.getBarCode();
         _weight=test.getWeight();
         _cost=test.getCost();
        System.out.println("Bar Code:"+ _barCode);
        System.out.println("Name:"+ _Name);
        System.out.println("Weight:"+ _weight);
        System.out.println("Cost:"+ _cost);
        System.out.println("*******************************************");    
                


    }
}
