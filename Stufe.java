public class Stufe
{
    private String level_name;
    private Klasse[] level_classe;
    private String level_all_classes;

    public Stufe()
    {
        level_name = " ";
        level_classe = new Klasse[5];
    }

    public void setName(String new_level_name){
        level_name = new_level_name;
    }

    public String getName(){
        return level_name;
    }
    
    public String getAllClasses(){
        int i = 0;
        level_all_classes = "";
        while(i < level_classe.length){
            if (level_classe[i] != null){
                level_all_classes = level_all_classes + level_classe[i].getName() + '\n';
            }
            i++;
        }
        System.out.print(level_all_classes);
        return level_all_classes;
    }

    public boolean addClasse(Klasse new_level_classe){
        int i = 0;
        while(i < level_classe.length){
            if(level_classe[i] == null){
                level_classe[i] = new_level_classe;
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}