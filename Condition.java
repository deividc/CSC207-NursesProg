
public class Condition
{
    private String symptons;
    private float temperature;
    private int bloodPressureDiastolic;
    private int bloodPressureSystolic;
    private int heartRate;
    private String arrivalDate;
    private boolean seenByDoctor;
    private long time;
    
    public Condition(boolean seenByDoctor){
        this.seenByDoctor = seenByDoctor;
    }
    
    public Condition(String symptoms, float temperature, int bloodPressureDiastolic,
    int bloodPressureSystolic, int heartRate, String arrivalDate, boolean seenByDoctor, long time){
        this.symptons = symptoms;
        this.temperature = temperature;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.heartRate = heartRate;
        this.arrivalDate = arrivalDate;
        this.seenByDoctor = seenByDoctor;
        this.time = time;
    }
    
    public void symptons(String symptons){
        this.symptons = symptons;
    }
    
    public void arrivalDate(String arrivalDate){
        this.arrivalDate = arrivalDate;
    }
    
    public void seenByDoctor(boolean seenByDoctor){
        this.seenByDoctor = seenByDoctor;
    }
    
    public void time(long time){
        this.time = time;
    }
}
