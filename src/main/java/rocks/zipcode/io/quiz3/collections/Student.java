package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    LabStatus labStatus;
    List<Lab> labList;

    public Student() {
        //this(null);
        this.labList = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labList = labs;
    }

    public Lab getLab(String labName) {

        Lab lab2 = null;

        for (Lab lab1 : labList) {
            if (lab1.getName().equals(labName)) {
                lab2 = lab1;
            }
        }
        return lab2;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
Lab lab1 = getLab(labName);

//labList.

    }

    public void forkLab(Lab lab) {
        setLabStatus(lab.getName(), LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
