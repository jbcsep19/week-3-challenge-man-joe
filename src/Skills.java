import java.util.ArrayList;

public class Skills {
    String skillName, skillLevel;

    public static ArrayList<String> skillLevels = new ArrayList<String>() {
        {
            add("Fundamental");
            add("Novice");
            add("Intermediate");
            add("Advanced");
            add("Expert");
        }
    };

    public Skills (){

    }

    public Skills(String skillName, String skillLevel) {
        this.skillName = skillName;
        this.skillLevel = skillLevel;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String toString(){
        return skillName + ", " + skillLevel;
    }
}
