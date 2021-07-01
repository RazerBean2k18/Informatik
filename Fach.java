public class Fach
{
    private String subject_name;
    private String subject_description;
    private Lehrer[] subject_teachers;//WARTEN BIS LISTEN ERLAUBT SIND
    
    public Fach()
    {
        subject_name = " ";
        subject_description = " ";
    }
    
    public void setName(String new_subject_name){
        subject_name = new_subject_name;
    }
    
    public String getName(){
        return subject_name;
    }
    
    public void setDescription(String new_subject_description){
        subject_description = new_subject_description;
    }
    
    public String getDescription(){
        return subject_description;
    }
}
