public class Department {

    private final Node[] students;
    private final Node[] courses;
    private final String name;
    private final int noOfStudents;
    private final int noOfCourses;

    public Department(int noOfStudents, int noOfCourses , String name) {

        if (noOfStudents > 200 || noOfStudents < 50) throw new IllegalArgumentException("Number of students should be between 50 - 200");
        else if (noOfCourses > 20) throw new IllegalArgumentException("Number of courses should not be more than 20");

        students = new Node[noOfStudents];
        courses = new Node[noOfCourses];
        this.name=name;
        this.noOfStudents=noOfStudents;
        this.noOfCourses=noOfCourses;
        for (int i = 0 ; i < students.length ; i++){
            students[i] = new Node();
        }
        for (int i = 0 ; i < courses.length ; i++){
            courses[i] = new Node();
        }
    }

    public void add(int studentNo, int courseNo) {

        if (checkIfAlreadyExists(studentNo,courseNo)){
            System.out.println("Student already enrolled...");
            return;
        }

        Node newNode = new Node(studentNo , courseNo);

        if (students[studentNo].nextCourse == null){
            students[studentNo].nextCourse = newNode;
        } else {
            Node i = students[studentNo];
            while (i.nextCourse != null){
                i = i.nextCourse;
            }
            i.nextCourse = newNode;
        }

        if (courses[courseNo].nextStudent == null){
            courses[courseNo].nextStudent = newNode;
        } else {
            Node j = courses[courseNo];
            while (j.nextStudent != null) {
                j = j.nextStudent;
            }
            j.nextStudent = newNode;
        }
    }

    public int noOfEnrolledCourses (int student){
        Node i = students[student];
        int count = 0;
        while (i.nextCourse != null){
            count++;
            i = i.nextCourse;
        }
        return count;
    }

    public int noOfEnrolledStudents (int course){
        Node i = courses[course];
        int count = 0;
        while (i.nextStudent != null){
            count++;
            i = i.nextStudent;
        }
        return count;
    }
    public void printEnrolledCourses(int student){
        Node i = students[student];
        System.out.print("Student "+student+"'s enrolled courses are: ");
        while (i.nextCourse != null){
            System.out.print(i.nextCourse.getCourseID() +" ");
            i=i.nextCourse;
        }
        System.out.print("\n");
    }

    public void printEnrolledStudents(int course){
        Node i = courses[course];
        System.out.print("Students enrolled in course " + course +" are: ");
        while (i.nextStudent != null){
            System.out.print(i.nextStudent.getStdID() + " ");
            i=i.nextStudent;
        }
        System.out.print("\n");

    }

    public boolean checkIfAlreadyExists (int studentNo , int courseNo){
        boolean flag = false;
        Node i = students[studentNo];
        while (i.nextCourse != null){
            if (i.nextCourse.getCourseID() == courseNo) {
                flag = true;
                break;
            }
            i = i.nextCourse;
        }
        return flag;
    }

    public String getName() {
        return name;
    }

    public int getNoOfStudents() { return noOfStudents; }

    public int getNoOfCourses() { return noOfCourses; }
}