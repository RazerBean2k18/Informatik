public class Schueler
{
    private int student_id;
    private String student_name;
    private String student_classe;//WARTEN BIS LISTEN ERLAUBT SIND
    private int student_age;

    public Schueler()
    {
        student_id = 0;
        student_name = " ";
        student_classe = " ";
        student_age = 0;
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

    public void setClasse(String new_student_classe){
        student_classe = new_student_classe;
    }

    public String getClasse(){
        return student_classe;
    }

    public void setAge(int new_student_age){
        student_age = new_student_age;
    }

    public int getAge(){
        return student_age;
    }

    public String printSchueler(){
        String tmp = " ";
        tmp = "Name: " + student_name + "; " + "Alter: " + student_age + "; " + "SchülerID: " + student_id + "; " + "Klasse: " + student_classe + "; ";
        return tmp;
    }
}