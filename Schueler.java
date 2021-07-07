public class Schueler
{
    private int student_id;
    private String student_name;
    private Klasse[] students_classe;
    private String student_all_classe;//WARTEN BIS LISTEN ERLAUBT SIND
    private int student_age;

    public Schueler()
    {
        student_id = 0;
        student_name = " ";
        student_all_classe = " ";
        student_age = 0;
        students_classe = new Klasse[1];
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

    public String getAllClasses(){
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

    public String getClasse(){
        return student_all_classe;
    }

    public void setAge(int new_student_age){
        student_age = new_student_age;
    }

    public int getAge(){
        return student_age;
    }

    public String printSchueler(){
        String tmp = " ";
        tmp = "Name: " + student_name + "; " + "Alter: " + student_age + "; " + "SchülerID: " + student_id + "; " + "Klasse: " + student_all_classe + "; ";
        return tmp;
    }
}