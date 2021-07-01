public class Lehrer
{
    private String teacher_name;
    private int teacher_id;
    private Fach[] teacher_subjects;//WARTEN BIS LISTEN ERLAUBT SIND
    
    public Lehrer()
    {
       teacher_name = " ";
       teacher_id = 0;
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
}