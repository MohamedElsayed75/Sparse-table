public class Test {
    public static void main(String[] args) {
        University university = new University();

        university.addCollege(6);
        university.addCollege(4);

        university.accessCollege(0).addDepartment(100,10,"Department 1");
        university.accessCollege(0).addDepartment(80,12,"Department 2");
        university.accessCollege(0).addDepartment(60,8,"Department 3");
        university.accessCollege(0).addDepartment(50,6,"Department 4");
        university.accessCollege(0).addDepartment(55,4,"Department 5");
        university.accessCollege(0).addDepartment(60,2,"Department 6");

        university.accessCollege(0).addDepartment(120,10,"Department 7");


        university.accessCollege(1).addDepartment(140 , 17 , "Department 1");
        university.accessCollege(1).addDepartment(130 , 10 , "Department 2");
        university.accessCollege(1).addDepartment(130 , 10 , "Department 3");
        university.accessCollege(1).addDepartment(130 , 10 , "Department 4");


        university.accessCollege(0).accessDepartment(0).add(0,0);
        university.accessCollege(0).accessDepartment(0).add(0,1);
        university.accessCollege(0).accessDepartment(0).add(0,2);


        university.printColleges();

        university.accessCollege(0).printDepartments();

        university.accessCollege(0).accessDepartment(0).printEnrolledCourses(0);


    }
}
