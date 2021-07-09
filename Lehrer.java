public class Lehrer
{
    private String teacher_name;
    private int teacher_id;
    private Fach[] teacher_subjects;
    private String teacher_all_subjects;
    private Klasse[] teacher_classe;
    private String teacher_all_classes;
    private Schueler[] teacher_tutor_student;
    private String teacher_all_tutor_student;
    private Schueler[] teacher_tutor_classe;
    private String teacher_all_tutor_classes;
    
    public Lehrer()
    {
       teacher_name = " ";
       teacher_id = 0;
       teacher_subjects = new Fach[5];
       teacher_classe = new Klasse[10];
       teacher_tutor_student = new Schueler[2];
       teacher_tutor_classe = new Schueler[1];
    }
    
    public void setName(String new_teacher_name){
        teacher_name = new_teacher_name;
    }
    
    public String getName(){
        return teacher_name;
    }
    
    public void setId(int new_teacher_id){
        teacher_id = new_teacher_id;
    }
    
    public int getId(){
        return teacher_id;
    }
    
    public String getAllSubjects(){
        int i = 0;
        teacher_all_subjects = "";
        while(i < teacher_subjects.length){
            if (teacher_subjects[i] != null){
                teacher_all_subjects = teacher_all_subjects + teacher_subjects[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(teacher_all_subjects);
        return teacher_all_subjects;
    }

    public boolean addStudent(Fach new_teacher_subject){
        int i = 0;
        while(i < teacher_subjects.length){
            if(teacher_subjects[i] == null){
                teacher_subjects[i] = new_teacher_subject;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
    
    public String getAllClasses(){
        int i = 0;
        teacher_all_classes = "";
        while(i < teacher_classe.length){
            if (teacher_classe[i] != null){
                teacher_all_classes = teacher_all_classes + teacher_classe[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(teacher_all_classes);
        return teacher_all_classes;
    }

    public boolean addClasse(Klasse new_teacher_classe){
        int i = 0;
        while(i < teacher_classe.length){
            if(teacher_classe[i] == null){
                teacher_classe[i] = new_teacher_classe;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
    
    public String getAllTutorStudents(){
        int i = 0;
        teacher_all_tutor_student = "";
        while(i < teacher_tutor_student.length){
            if (teacher_tutor_student[i] != null){
                teacher_all_tutor_student = teacher_all_tutor_student + teacher_tutor_student[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(teacher_all_tutor_student);
        return teacher_all_tutor_student;
    }

    public boolean addTutorStudent(Schueler new_tutor_student){
        int i = 0;
        while(i < teacher_tutor_student.length){
            if(teacher_tutor_student[i] == null){
                teacher_tutor_student[i] = new_tutor_student;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
    
    public String getAllTutorClasses(){
        int i = 0;
        teacher_all_tutor_classes = "";
        while(i < teacher_tutor_classe.length){
            if (teacher_tutor_classe[i] != null){
                teacher_all_tutor_classes = teacher_all_tutor_classes + teacher_tutor_classe[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(teacher_all_tutor_classes);
        return teacher_all_tutor_classes;
    }

    public boolean addTutorClasse(Schueler new_tutor_classe){
        int i = 0;
        while(i < teacher_tutor_classe.length){
            if(teacher_tutor_classe[i] == null){
                teacher_tutor_classe[i] = new_tutor_classe;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}