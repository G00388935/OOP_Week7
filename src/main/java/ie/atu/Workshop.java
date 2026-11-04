package ie.atu;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class Workshop {
    Scanner input = new Scanner(System.in);
    private final String workshopName;
    private final int capacity;

    Set<String> studentIds = new HashSet<>();

    public Workshop(String workshopName, int capacity) {
        this.workshopName = workshopName;
        this.capacity = capacity;
        this.studentIds = new HashSet<>();
    }


    public void addStudent(String studentId){
        studentIds.add(input.nextLine());
    }



}
