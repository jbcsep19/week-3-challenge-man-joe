import java.text.SimpleDateFormat;
import java.util.Date;

public class Work {
    private String companyName, jobTitle, jobDescription;
    private Date startDate, endDate;
    private SimpleDateFormat fmt;
    public Work(){
        fmt = new SimpleDateFormat("MMMM dd yyyy");
    }

    public Work(String companyName, String jobTitle, String jobDescription, Date startDate, Date endDate) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
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

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        return jobTitle + "\n" +
                companyName + ", " + fmt.format(startDate) + " - " + fmt.format(endDate) +
                "- " + jobDescription;
    }
}
