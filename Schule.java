public class Schule
{
    private String school_name;
    private String school_adress;
    private Schueler[] school_students;
    private String school_all_students;

    public Schule()
    {
        school_name = " ";
        school_adress = " ";
        school_students = new Schueler[1000];
    }

    public void setName(String new_school_name){
        school_name = new_school_name;
    }

    public String getName(){
        return school_name;
    }

    public void setAdress(String new_school_adress){
        school_adress = new_school_adress;
    }

    public String getAdress(){
        return school_adress;
    }

    public String getAllStudents(){
        int i = 0;
        school_all_students = "";
        while(i < school_students.length){
            if (school_students[i] != null){
                school_all_students = school_all_students + school_students[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(school_all_students);
        return school_all_students;
    }

    public boolean addStudent(Schueler new_school_student){
        int i = 0;
        while(i < school_students.length){
            if(school_students[i] == null){
                school_students[i] = new_school_student;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
