public class University {
    private final int noOfColleges = 20;
    private final College[] colleges = new College[noOfColleges];
    private int counter;

    public University() {
        counter=0;
    }

    public void addCollege(int noOfDepartments){
        colleges[counter] = new College(noOfDepartments);
        counter++;
    }
    public College accessCollege(int collegeNo){
        return colleges[collegeNo];
    }
    public void printColleges(){
        for (int i = 0 ; i<counter ; i++){
            System.out.println("College " + i + "| Number of departments: "+colleges[i].getNoOfDep());
        }
    }
}
