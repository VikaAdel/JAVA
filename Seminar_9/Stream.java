package Seminar_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}
