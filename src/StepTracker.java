public class StepTracker {
    private int minSteps = 0;
    private int activeDays = 0 ;
    private int totalSteps = 0;
    private int totalDays = 0;
    public StepTracker (int steps) {
        minSteps = steps ;
    }
    public void addDailySteps (int steps) {
        totalSteps+=steps;
        if(steps>=minSteps) activeDays++;
        totalDays++;
    }
    public int getDays () {
        return totalDays ;
    }
    public int getStepsForActiveDay() {
        return minSteps;
    }
    public int getTotalSteps() {
        return totalSteps;
    }
    public double averageSteps(){
        double avg = 0.0;
        try{
            avg = totalSteps/totalDays;
        } catch(Exception e){}
        return avg;
    }
    public int activeDays () {
        return activeDays;
    }
    public int getActiveDays () {
        return activeDays;
    }

}
