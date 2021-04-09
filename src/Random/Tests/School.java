package Random.Tests;

public class School {
 public static void main(String[] args) {
 System.out.println(Classroom.globalKey);
 Classroom room = new Classroom(101, "Mrs. Anderson");
 System.out.println(room.getRoomNumber());
 System.out.println(Classroom.floor);
System.out.println(Classroom.teacherName); } }

