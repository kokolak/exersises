package exer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer2 {
//    private String name;
//    private int age;
//    private List<Pet> pets;

    public static void main(String[] args) {
        boolean flag = true;
        List<Person> listofPerson = new ArrayList();
        
        while (flag) {
            System.out.println("give a family member");
            System.out.println("if you want to add a family member press 1,if you "
                    + "want to exit press 0");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1) {
                Person person = new Person();
                System.out.println("dwse onoma");
                person.setName(sc.next());
                System.out.println("dwse ilikia");
                person.setAge(sc.next());
                List<Pet> listofpets = new ArrayList();
                boolean flagpet = true;
                while (flagpet) {
                    System.out.println("press 1 to enter pet or 0 to exit");
                    if (sc.nextInt() == 1) {
                        Pet pet = new Pet();
                        System.out.println("give nickname");
                        pet.setNickname(sc.next());
                        System.out.println("give type");
                        pet.setType(sc.next());
                        listofpets.add(pet);
                        person.setPet(listofpets);
                    } else {
                        flagpet = false;
                    }

                }
                listofPerson.add(person);
            } else if (choice == 0) {
                if (!listofPerson.isEmpty()) {
                    for (int i = 0; i < listofPerson.size(); i++) {
                        System.out.println(listofPerson.get(i));
                    }
                    flag = false;
                }
                System.out.println("EXITING");
                flag = false;
            } else {
                System.out.println("you gave wrong  number choise ");
            }
        }
    }
}
