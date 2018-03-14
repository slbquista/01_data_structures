package LinkedList;

/**
 *
 * @author kevin.mcdonald
 * @date 24th November 2016
 */
public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Integer List
        IntegerList numbers = new IntegerList();
        System.out.println(numbers.isEmpty());
        numbers.insertAtFront(15);
        numbers.insertAtFront(23);
        numbers.insertAtFront(78);
        System.out.println(numbers.isEmpty());
        
        //  String List
        StringList names = new StringList();
        System.out.println(names.isEmpty());
        names.insertAtFront("Kevin");
        names.insertAtFront("Peter");
        names.insertAtFront("John");
        System.out.println(names.isEmpty());
        
        //  Student List
        StudentList students = new StudentList();
        System.out.println(students.isEmpty());
        students.insertAtFront(new Student("1562001", 18));
        students.insertAtFront(new Student("1612435", 22));
        students.insertAtFront(new Student("1409823", 23));
        System.out.println(students.isEmpty());
        
        //  Outputs
        numbers.traverse();
		names.traverse();
        students.traverse();
    }
    
}
