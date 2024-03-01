import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import tdd.CircularList;

public class SimpleCircularList implements CircularList{

    private List<Integer> storage = new ArrayList<>();

    public SimpleCircularList() {
    }

    @Override
    public void add(int element) {
        this.storage.add(element);
    }

    @Override
    public int size() {
        return this.storage.size();
    }

    @Override
    public boolean isEmpty() {
        return this.size()==0;
    }

    @Override
    public Optional<Integer> next() {
        return null;
    }

    @Override
    public Optional<Integer> previous() {
        return null;
    }

    @Override
    public void reset() {
       
    }

}
