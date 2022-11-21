package bridge.domain;

public enum Step {
    UPPER_STEP("U", 1),
    LOWER_STEP("D", 0);

    private String stepTxt;
    private int stepNumber;

    Step(String stepTxt, int stepNumber) {
        this.stepTxt = stepTxt;
        this.stepNumber = stepNumber;
    }

    public String getStepTxt() {
        return stepTxt;
    }

    public int getStepNumber() {
        return stepNumber;
    }


}
