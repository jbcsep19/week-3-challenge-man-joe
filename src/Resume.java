public class Resume {
    private Education edu;
    private Work wrk;
    private Skills skills; // change to arrayList of 3
    private String name, email;

    public Resume(){

    }

    public Resume(Education edu, Work wrk, Skills skills, String name, String email) {
        this.edu = edu;
        this.wrk = wrk;
        this.skills = skills;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Education getEdu() {
        return edu;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
    }

    public Work getWrk() {
        return wrk;
    }

    public void setWrk(Work wrk) {
        this.wrk = wrk;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public String toString() {
        String msg = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        msg += name + "\n" + email + "\n\n";
        msg += "Education\n";
        msg += edu.toString();
        msg += "\n\n";
        msg += "Experience\n";
        msg += wrk.toString();
        msg += "\n\n";
        msg += "Skills\n";
        msg += skills.toString();

        return msg;
    }
}
