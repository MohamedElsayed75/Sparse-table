public class Node {
    private final int stdID;
    private final int courseID;
    Node nextCourse;
    Node nextStudent;

    public Node() {
        stdID = -1;
        courseID = -1;
    }

    public Node(int stdID, int courseID) {
        this.stdID = stdID;
        this.courseID = courseID;
    }

    public int getStdID() {return stdID;}

    public int getCourseID() {
        return courseID;
    }
}
