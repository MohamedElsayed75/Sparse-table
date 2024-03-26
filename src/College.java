public class College {
    private final int noOfDep;
    private int counter;
    private final Department[] departments;
    public College(int noOfDep) {
        if (noOfDep > 10 || noOfDep < 4) throw new IllegalArgumentException("Number of departments should be between 4 - 10");
        this.noOfDep = noOfDep;
        departments = new Department[noOfDep];
        counter = 0;
    }
    public void addDepartment(int students , int courses , String name){
        if ((counter) >= noOfDep){
            System.out.println("All departments already added...");
            return;
        }
        departments[counter] = new Department(students,courses,name);
        counter++;
    }

    public Department accessDepartment(int depNo){
        return departments[depNo];
    }
    public void printDepartments(){
        for (int i = 0 ; i<counter ; i++){
            System.out.println("Department " + i + "| Name: "+departments[i].getName()+", students: "+departments[i].getNoOfStudents()+", courses: "+departments[i].getNoOfCourses());
        }
    }

    public int getNoOfDep() {
        return noOfDep;
    }
}
