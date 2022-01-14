import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Building {
    private int mId;
    private List<String> mResidents = new LinkedList<String>();
    public Building(int id, String[] resident){
        mId = id;
    }
    public Building(int id, String resident){
        mId = id;
        mResidents.add(resident);
    }
    public void addResident(String resident){

    }
    public int numberOfResidents(){
        return mResidents.size();
    }
    public void removeResident(String resident){

    }
}
