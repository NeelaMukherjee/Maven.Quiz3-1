package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labList;

    public Student() {
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
        lab1.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        setLabStatus(lab.getName(), LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab1 = getLab(labName);

        return lab1.getStatus();
    }

    @Override
    public String toString() {
        return "Student{" +
                "labList=" + labList +
                '}';
    }
}
