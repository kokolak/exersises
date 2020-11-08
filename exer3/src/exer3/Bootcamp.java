package exer3;

import java.time.LocalDate;
import java.util.Date;

public class Bootcamp {

    private String name;
    private Date startingDate;
    private Date endingDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "Bootcamp{" + "name=" + name + ", startingDate=" + startingDate + ", endingDate=" + endingDate + '}';
    }

}
