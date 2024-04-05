package HomeWorkStudent;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Создаем учебные группы, взято с семинара 
        StudyGroup group1 = new StudyGroup();
        group1.addStudent(new Student("Adel", 100));
        group1.addStudent(new Student("Vika", 101));
        group1.addStudent(new Student("Evgenii", 102));

        StudyGroup group2 = new StudyGroup();
        group2.addStudent(new Student("John", 103));
        group2.addStudent(new Student("Alice", 104));
        group2.addStudent(new Student("Ron", 105));
        group2.addStudent(new Student("Mary", 106));
        group2.addStudent(new Student("Dan", 107));

        // Создаем поток учебных групп
        Flow flow = new Flow();
        //Добавление учебной группы group1 и group2  в поток flow
        flow.addStudyGroup(group1);
        flow.addStudyGroup(group2);

        
        System.out.println("Информация о потоке учебных групп:");
        System.out.println(flow);

        
        System.out.println("Обход учебных групп:");
        Iterator<StudyGroup> iterator = flow.iterator();
        while (iterator.hasNext()) {
            StudyGroup group = iterator.next();
            System.out.println(group);
        }

       
        StreamComparator comparator = new StreamComparator();
        StudyGroup maxGroup = null;
        for (StudyGroup group : flow) {
            if (maxGroup == null || comparator.compare(group, maxGroup) > 0) {
                maxGroup = group;
            }
        }
        System.out.println("Самая большая учебная группа:");
        System.out.println(maxGroup);
    }
}