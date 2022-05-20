package collegeplan;

public class CollegePlan {

    private String programEnrolled;
    private String targetLocation;

    public CollegePlan(String programEnrolled, String targetLocation) {

    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }


    public String getProgramEnrolled() {
        return programEnrolled;
    }

    public void setProgramEnrolled(String programEnrolled) {
        this.programEnrolled = programEnrolled;
    }

    @Override
    public String toString() {
        return "CollegePlan{" +
                "programEnrolled= " + programEnrolled + "\n" +
                "targetLocation= " + targetLocation + "\n" +
                '}';
    }
}
