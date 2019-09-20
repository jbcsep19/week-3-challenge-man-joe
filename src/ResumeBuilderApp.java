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
import java.util.*;

public class ResumeBuilderApp {

    static String userInput;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Resume res = new Resume();
        while(true){
            System.out.print("Welcome to Resume Builder and DB!!! Enter any key to start or q to quit: ");
            userInput = sc.nextLine();

            if(userInput.equalsIgnoreCase("q"))
                break;

            getBasic(res);

            ArrayList<Education> edus = new ArrayList<>();
            int eduMin = 0;
            while(true) {
                System.out.print("Enter any key to start inputting education info or q to quit(min=1): ");
                userInput = sc.nextLine();
                if(userInput.equalsIgnoreCase("q")) {
                    if(eduMin < 1)
                        continue;
                    break;
                }
                Education edu = new Education();
                getEducation(edu);
                edus.add(edu);
                eduMin++;
            }

            ArrayList<Work> wks = new ArrayList<>();
            int wkMin = 0;
            while(true) {
                System.out.print("Enter any key to start inputting work exp. info or q to quit(min=1): ");
                userInput = sc.nextLine();
                if(userInput.equalsIgnoreCase("q")) {
                    if(wkMin < 1)
                        continue;
                    break;
                }
                Work wk = new Work();
                getWork(wk);
                wks.add(wk);
                wkMin++;
            }

            ArrayList<Skills> sks = new ArrayList<>();
            int skMin = 0; //Min skills must be 3
            while(true) {
                System.out.print("Enter any key to start inputting skills or q to quit(min=3): ");
                userInput = sc.nextLine();
                if(userInput.equalsIgnoreCase("q")) {
                    if (skMin < 3)
                        continue;
                    break;
                }
                Skills sk = new Skills();
                getSkills(sk);
                sks.add(sk);
                skMin++;
            }

            res.setEdus(edus);
            res.setWrks(wks);
            res.setSkills(sks);

            System.out.println(res.toString());
            break;
        }

        sc.close();
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
        Calendar cal;
        System.out.print("Enter company name: ");
        userInput = sc.nextLine();
        wk.setCompanyName(userInput);
        System.out.print("Enter job title: ");
        userInput = sc.nextLine();
        wk.setJobTitle(userInput);
        System.out.print("Enter start date separated by spaces in year_month_date: ");
        year = sc.nextInt();
        month = sc.nextInt()-1; // months start from 0 to 11
        day = sc.nextInt();
        cal = new GregorianCalendar(year,month,day);
        wk.setStartDate(cal);
        System.out.print("Enter end date separated by spaces in year_month_date: ");
        year = sc.nextInt();
        month = sc.nextInt()-1; // Months start from 0 to 11
        day = sc.nextInt();
        cal = new GregorianCalendar(year,month,day);
        wk.setEndDate(cal);
        sc.nextLine();

        ArrayList<String> jobDes = new ArrayList<>();
        int jobDesCount = 0;
        do {
            if(jobDesCount == 0 || !userInput.equalsIgnoreCase("q")) {
                System.out.print("Enter a job description(min=1) q to quit: ");
                userInput = sc.nextLine();
                if(userInput.equalsIgnoreCase("q"))
                    continue;
                jobDes.add(userInput);
                jobDesCount++;
            }
            else
                break;
            //wk.setJobDescription(jobDes);
        }while (true);
        wk.setJobDescription(jobDes);
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
