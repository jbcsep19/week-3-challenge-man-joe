/*
Write a program that will allow a user to enter in:
a name,
an email address,
at least 1 educational achievement:
degree type (Associate's, Bachelor's, Master's, PhD, etc.),
major,
university name,
graduation year,
at least 1 work experience:
company,
job title,
start date,
end date,
at least 1 job description
at least 3 skills:
skill name
rating/proficiency (Fundamental, Novice, Intermediate, Advanced, Expert)
 */
import java.util.Date;
import java.util.Scanner;

public class ResumeBuilderApp {

    static String userInput;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            System.out.println("Welcome to Resume Builder and DB!!! Enter any key to start or q to quit");
            userInput = sc.nextLine();

            if(userInput.equalsIgnoreCase("q"))
                break;

            Resume res = new Resume();
            getBasic(res);

            Education edu = new Education();
            getEducation(edu);

            Work wk = new Work();
            getWork(wk);

            Skills sk = new Skills();
            getSkills(sk);

            res.setEdu(edu);
            res.setWrk(wk);
            res.setSkills(sk);

            System.out.println(res.toString());
            break;
        }
    }

    public static void getBasic(Resume res) {
        System.out.print("Enter name of person: ");
        userInput = sc.nextLine();
        res.setName(userInput);
        System.out.print("Enter email address: ");
        userInput = sc.nextLine();
        res.setEmail(userInput);
    }

    public static void getEducation(Education edu) {
        System.out.print("Enter degree type: ");
        userInput = sc.nextLine();
        edu.setDegreeType(userInput);
        System.out.print("Enter major: ");
        userInput = sc.nextLine();
        edu.setMajor(userInput);
        System.out.print("Enter university name: ");
        userInput = sc.nextLine();
        edu.setUniName(userInput);
        System.out.print("Enter graduation year: ");
        userInput = sc.nextLine();
        edu.setGradYear(Integer.valueOf(userInput));
    }

    public static void getWork(Work wk) {
        int year,month,day;
        Date date;
        System.out.print("Enter company name: ");
        userInput = sc.nextLine();
        wk.setCompanyName(userInput);
        System.out.print("Enter job title: ");
        userInput = sc.nextLine();
        wk.setJobTitle(userInput);
        System.out.print("Enter start date separated by spaces in year_month_date: ");
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
        date = new Date(year,month,day);
        wk.setStartDate(date);
        System.out.print("Enter end date separated by spaces in year_month_date: ");
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
        date = new Date(year,month,day);
        wk.setEndDate(date);
        sc.nextLine();
        System.out.print("Enter your job description: ");
        userInput = sc.nextLine();
        wk.setJobTitle(userInput);
    }

    public static void getSkills(Skills sk) {
        System.out.print("Enter skill name: ");
        userInput = sc.nextLine();
        sk.setSkillName(userInput);
        System.out.print("Enter skill level from 0 - 5 (Fundamental, Novice, Intermediate, Advanced, Expert): ");
        userInput = sc.nextLine();
        sk.setSkillLevel(Skills.skillLevels.get(Integer.valueOf(userInput)));
    }
}
