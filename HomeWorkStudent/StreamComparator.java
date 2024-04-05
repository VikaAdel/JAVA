package HomeWorkStudent;

import java.util.Comparator;

class StreamComparator implements Comparator<StudyGroup> {
    @Override
    public int compare(StudyGroup group1, StudyGroup group2) {

        return Integer.compare(group1.getStudentCount(), group2.getStudentCount());

    }
}