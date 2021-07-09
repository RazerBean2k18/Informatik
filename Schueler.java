public class Schueler
{
    private int student_id;
    private int student_age;
    private String student_name;
    private Klasse[] students_classe;
    private String student_all_classe;
    private Lehrer[] student_tutor;
    private String student_all_tutors;

    public Schueler()
    {
        student_id = 0;
        student_name = " ";
        student_all_classe = " ";
        student_age = 0;
        students_classe = new Klasse[5];
        student_tutor = new Lehrer[2];
    }

    public void setName(String new_student_name){
        student_name = new_student_name;
    }

    public String getName(){
        return student_name;
    }

    public void setId(int new_student_id){
        student_id = new_student_id;
    }

    public int getId(){
        return student_id;
    }

    public void setAge(int new_student_age){
        student_age = new_student_age;
    }

    public int getAge(){
        return student_age;
    }

    public String printSchueler(){
        String tmp = " ";
        tmp = "Name: " + student_name + "; " + '\n' + "Alter: " + student_age + "; " + '\n'  + "SchülerID: " + student_id + "; " + '\n' + "Klasse: " + student_all_classe + "; ";
        System.out.print(tmp);
        return tmp;
    }
    
    public String getALlClasses(){
        int i = 0;
        student_all_classe = "";
        while(i < students_classe.length){
            if (students_classe[i] != null){
                student_all_classe = student_all_classe + students_classe[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(student_all_classe);
        return student_all_classe;
    }

    public boolean addClasse(Klasse new_student_classe){
        int i = 0;
        while(i < students_classe.length){
            if(students_classe[i] == null){
                students_classe[i] = new_student_classe;
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
        student_all_tutors = "";
        while(i < student_tutor.length){
            if (student_tutor[i] != null){
                student_all_tutors = student_all_tutors + student_tutor[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(student_all_tutors);
        return student_all_tutors;
    }

    public boolean addTutor(Lehrer new_student_tutor){
        int i = 0;
        while(i < student_tutor.length){
            if(student_tutor[i] == null){
                student_tutor[i] = new_student_tutor;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}