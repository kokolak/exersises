package exer3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) throws ParseException {
        List<Bootcamp> listofbootcamps = new ArrayList();
        System.out.println("create three bootcamp");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("give a bootcamp");
            Bootcamp bootcamp = new Bootcamp();
            
            System.out.println("give a name");
            bootcamp.setName(sc.nextLine());

            System.out.println("give startdate");
            String date = sc.nextLine();
            Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            bootcamp.setStartingDate(date1);

            System.out.println("give endingDate");
            String dateEnd = sc.nextLine();
            Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(dateEnd);
            bootcamp.setEndingDate(date2);

            listofbootcamps.add(bootcamp);
            System.out.println(bootcamp);
        }
        System.out.println("dwse imerominia");
        String imerominia = sc.nextLine();
        Date dateForBootcamp = new SimpleDateFormat("dd-MM-yyyy").parse(imerominia);
            if (listofbootcamps.get(0).getStartingDate().compareTo(dateForBootcamp) * dateForBootcamp.compareTo(listofbootcamps.get(0).getEndingDate()) > 0) {
            System.out.println("Bootcamp SQL will be available bootcamp1");

        } else if (listofbootcamps.get(1).getStartingDate().compareTo(dateForBootcamp) * dateForBootcamp.compareTo(listofbootcamps.get(1).getEndingDate()) > 0) {
            System.out.println("Bootcamp SQL will be available bootcamp2");
        } else if (listofbootcamps.get(2).getStartingDate().compareTo(dateForBootcamp) * dateForBootcamp.compareTo(listofbootcamps.get(2).getEndingDate()) > 0) {
            System.out.println("Bootcamp SQL will be available bootcamp2");
        } else {
            System.out.println("Sorry no bootcamp available in X date.");
//        }
        }
    }
}