import java.util.ArrayList;

public class Resume {
    private ArrayList<Education> edus;
    private ArrayList<Work> wrks;
    private ArrayList<Skills> skills; // change to arrayList of 3
    private String name, email;

    public Resume() {
        edus = new ArrayList<>();
        wrks = new ArrayList<>();
        skills = new ArrayList<>();
        name = "";
        email = "";
    }

    public Resume(ArrayList<Education> edus, ArrayList<Work> wrks, ArrayList<Skills> skills, String name, String email) {
        this.edus = edus;
        this.wrks = wrks;
        this.skills = skills;
        this.name = name;
        this.email = email;
    }

    public ArrayList<Education> getEdus() {
        return edus;
    }

    public void setEdus(ArrayList<Education> edus) {
        this.edus = edus;
    }

    public ArrayList<Work> getWrks() {
        return wrks;
    }

    public void setWrks(ArrayList<Work> wrks) {
        this.wrks = wrks;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
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

    public String toString() {
        String msg = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        msg += name + "\n" + email + "\n\n";
        msg += "Education\n";
        for(Education e : edus)
            msg += e.toString() + "\n";
        msg += "\n";
        msg += "Experience\n";
        for(Work w : wrks)
            msg += w.toString() + "\n";
        msg += "\n";
        msg += "Skills\n";
        for(Skills s : skills)
            msg += s.toString() + "\n";

        return msg;
    }
}
