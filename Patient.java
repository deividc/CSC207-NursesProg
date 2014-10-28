import java.util.ArrayList;

public class Patient
{
    private String healthCardNumber;
    private String name;
    private int birthdate;
    private ArrayList listOfCondition;
    
    public Patient(){
        this.healthCardNumber = "";
        this.name = "";
        this.birthdate = 0;
        listOfCondition = new ArrayList();
    }
    
    public Patient(String healthCardNumber, String name, int birthdate){
        this.healthCardNumber = healthCardNumber;
        this.name = name;
        this.birthdate = birthdate;
        listOfCondition = new ArrayList();
    }
    
    public void newCondition(Condition cond){
        listOfCondition.add(cond);
    }
    
    public String getHealthCardNumber(){
        return this.healthCardNumber;
    }
    
    public void setHealthCardNumber(String healthCardNumber){
        this.healthCardNumber = healthCardNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBirthdate(int birthdate){
        this.birthdate = birthdate;
    }
    
    public int urgency(){
        int urgency = 0;
        return urgency;
    }
    
    public String toString(){
        String str = healthCardNumber + "," + name + "," + birthdate + "\n";
        return str;
    }
}
