public class Fach
{
    private String subject_name;
    private Lehrer[] subject_teachers;
    private String subject_all_teachers;

    public Fach()
    {
        subject_name = " ";
        subject_teachers = new Lehrer[20];
    }

    public void setName(String new_subject_name){
        subject_name = new_subject_name;
    }

    public String getName(){
        return subject_name;
    }

    public String getAllTeachers(){
        int i = 0;
        subject_all_teachers = "";
        while(i < subject_teachers.length){
            if (subject_teachers[i] != null){
                subject_all_teachers = subject_all_teachers + subject_teachers[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(subject_all_teachers);
        return subject_all_teachers;
    }

    public boolean addTeacher(Lehrer new_subject_teacher){
        int i = 0;
        while(i < subject_teachers.length){
            if(subject_teachers[i] == null){
                subject_teachers[i] = new_subject_teacher;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
