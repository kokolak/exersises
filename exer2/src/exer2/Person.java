package exer2;

import java.util.List;

public class Person {
    private String name;
    private String age;
    private List<Pet> pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", pet=" + pet + '}';
    }

 
    
}
