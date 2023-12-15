import java.util.Scanner;
 class EventRegistration {
    String Name;
    String EventName;
    double registrationFee;
    public String getEventName() {
        return EventName;
    }
    public String getName() {
        return Name;
    }
    public double getRegistrationFee() {
        return registrationFee;
    }
    public void setEventName(String eventName) {
        EventName = eventName;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
    EventRegistration(String Name , String EventName){
        this.Name = Name;
        this.EventName=EventName;
    }
    public void registerEvent(){
        System.out.println("SELECT THE EVENT");
        System.out.println("********************");
        System.out.println("1.ShakeALeg | Base Fee:100");
        System.out.println("2.Sing&Win  | Base Fee:150");
        System.out.println("3.Actathon  | Base Fee:70");
        System.out.println("4.PlayAway  | Base Fee:130");

    }
    
}

class ShowyourTalent {
    public static void main(String[] args) {
        
    }
}
