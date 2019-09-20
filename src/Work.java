import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Work {
    private String companyName, jobTitle;
    private ArrayList<String> jobDescriptions;
    private Calendar startDate, endDate;
    private SimpleDateFormat fmt;
    public Work(){
        fmt = new SimpleDateFormat("MMMM dd yyyy");
    }

    public Work(String companyName, String jobTitle, ArrayList<String> jobDescriptions, Calendar startDate, Calendar endDate) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDescriptions = jobDescriptions;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ArrayList<String> getJobDescription() {
        return jobDescriptions;
    }

    public void setJobDescription(ArrayList<String> jobDescriptions) {
        this.jobDescriptions = jobDescriptions;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        String msg = jobTitle + "\n" + companyName + ", " + fmt.format(startDate.getTime()) + " - "
                + fmt.format(endDate.getTime());
        for(String s : jobDescriptions)
            msg += "\n- " + s;
        return msg;
    }
}
