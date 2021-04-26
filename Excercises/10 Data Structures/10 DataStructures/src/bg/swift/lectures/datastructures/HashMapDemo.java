package bg.swift.lectures.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anatoli.
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map studentsMarks = new HashMap();

        studentsMarks.put("Toni", 6.1);
        studentsMarks.put("Mimi", 6.2);
        studentsMarks.put("Neli", 6.3);
        studentsMarks.put("Tsvetan", 6.4);
        studentsMarks.put("Rosen", 6.5);
        studentsMarks.put("Rosen", 6.66);
        studentsMarks.put("Doni", 6.6);

        System.out.println(studentsMarks.get("Rosen"));
        System.out.println(studentsMarks.remove("Rosen"));
        System.out.println(studentsMarks.get("Rosen"));

    }
}
