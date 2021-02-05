package student;

/**
 * This class +++Insert Description Here++
 * @author Domenic
 */
public class PartTimeStudent extends Student {
    private int numCourses;

    public PartTimeStudent( int numofC){
        numCourses =numofC;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
