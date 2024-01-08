public class FitnessTracker {
    boolean isOn;
    int stepCount;
    double distance;
    boolean isSleepTrackingEnabled;
    int caloriesBurned;
    boolean isHeartRateMonitorOn;
	
	public FitnessTracker(boolean isOn,int stepCount,double distance,boolean isSleepTrackingEnabled,int caloriesBurned,boolean isHeartRateMonitorOn) {
        this.isOn=isOn;
        this.stepCount=stepCount;
        this.distance=distance;
        this.caloriesBurned=caloriesBurned;
		this.isHeartRateMonitorOn=isHeartRateMonitorOn;
    }


    public void startTracking() {
        System.out.println("Fitness tracker started.");
    }

    public void stopTracking() {
        
        System.out.println("Fitness tracker stopped.");
    }

    public void recordStep() {
        
            System.out.println(" steps recorded");
        
    }

     public static void main(String[] args) {
       FitnessTracker tracker = new FitnessTracker(true,2005,4563.757d,true,567,true);
        tracker.startTracking();
		tracker.stopTracking();
		tracker.recordStep();
        
       
}
}

