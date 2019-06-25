package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName;
    private LabStatus labStatus;
    private Boolean fork;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {

        return labStatus;
    }

    public Boolean getFork(){
        return fork;
    }

    public void setFork(Boolean fork){
        this.fork = fork;
    }
}
