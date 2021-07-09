public class Klasse
{
    private String classe_name;
    private Lehrer[] classe_teachers;
    private Schueler[] classe_students;
    private String classe_all_students;
    private String classe_all_teachers;
    private Lehrer[] classe_tutor;
    private String classe_all_tutors;
    
    public Klasse()
    {
        classe_name = " ";
        classe_teachers = new Lehrer[10];
        classe_students = new Schueler[25];
        classe_tutor = new Lehrer[2];
    }
    
    public void setName(String new_classe_name){
        classe_name = new_classe_name;
    }
    
    public String getName(){
        return classe_name;
    }
    
    public String getAllStudents(){
        int i = 0;
        classe_all_students = "";
        while(i < classe_students.length){
            if (classe_students[i] != null){
                classe_all_students = classe_all_students + classe_students[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(classe_all_students);
        return classe_all_students;
    }

    public boolean addStudent(Schueler new_classe_student){
        int i = 0;
        while(i < classe_students.length){
            if(classe_students[i] == null){
                classe_students[i] = new_classe_student;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
    
    public String getAllTeachers(){
        int i = 0;
        classe_all_teachers = "";
        while(i < classe_teachers.length){
            if (classe_teachers[i] != null){
                classe_all_teachers = classe_all_teachers + classe_teachers[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(classe_all_teachers);
        return classe_all_teachers;
    }

    public boolean addTeacher(Lehrer new_classe_teacher){
        int i = 0;
        while(i < classe_teachers.length){
            if(classe_teachers[i] == null){
                classe_teachers[i] = new_classe_teacher;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
    
    public String getAllTutors(){
        int i = 0;
        classe_all_tutors = "";
        while(i < classe_tutor.length){
            if (classe_tutor[i] != null){
                classe_all_tutors = classe_all_tutors + classe_tutor[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(classe_all_tutors);
        return classe_all_tutors;
    }

    public boolean addTutor(Lehrer new_classe_tutor){
        int i = 0;
        while(i < classe_tutor.length){
            if(classe_tutor[i] == null){
                classe_tutor[i] = new_classe_tutor;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}