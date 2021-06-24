public class Schule
{
    private String school_name;
    private String school_adress;
    private Schüler[] school_students;//GESAMTSCHÜLER ANZEIGEN KÖNNEN
    
    public Schule()
    {
        school_name = " ";
        school_adress = " ";
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
}
