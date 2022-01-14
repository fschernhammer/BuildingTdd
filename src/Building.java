import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Building {
    private int mId;
    private List<String> mResidents = new LinkedList<String>();
    public Building(int id, String[] resident){
        mId = id;
        for (int i = 0; i < resident.length; i++){
            if (!mResidents.contains(resident[i])){
                mResidents.add(resident[i]);
            }
        }
    }
    public Building(int id, String resident){
        mId = id;
        if (!mResidents.contains(resident)){
            mResidents.add(resident);
        }
    }
    public void addResident(String resident){
        if(!mResidents.contains(resident)){
            mResidents.add(resident);
        }
    }
    public int numberOfResidents(){
        return mResidents.size();
    }
    public void removeResident(String resident){
        mResidents.remove(resident);
    }
}
