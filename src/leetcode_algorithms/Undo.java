package leetcode_algorithms;
import java.util.ArrayList;

public class Undo {
    ArrayList memory = new ArrayList<String>();

    public Undo (String data) {
        memory.add(data);
    }

    public void setData(String data) {
        memory.add(data);
    }

    public Object getData() {
        return memory.get(memory.size() - 1);
    }

    public Object undo() { 
       return  (memory.size() > 1) ? memory.remove(memory.size() - 1) : -1;
    }

}
