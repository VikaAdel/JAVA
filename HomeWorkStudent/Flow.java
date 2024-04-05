package HomeWorkStudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Flow implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Flow() {
        this.groups = new ArrayList<>();
    }

    public void addStudyGroup(StudyGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Flow of Study Groups:\n");
        for (StudyGroup group : groups) {
            sb.append(group.toString()).append("\n");
        }
        return sb.toString();
    }
}
