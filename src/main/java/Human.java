import java.util.Random;

public class Human {

    String name;
    String surname;
    int year;                   //date of birth
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet=" + pet +
                '}';
    }

    public void greetPet(){
        System.out.printf("Hello, %s!\n", pet.nickname);
    }
    public void describePet(){
        String message;
        if(pet.age > 50) message = "very sly";
        else message = "almost not sly";
        System.out.printf("I have a %s, he is %d years old, he is %s.\n",pet.species,pet.age,message);
    }
    public boolean feedPet(boolean isItTimeForFeeding){
        Random random =new Random();
        int randomNumber = random.nextInt(1,101);
        if (isItTimeForFeeding) {
            System.out.printf("Hm... I will feed %s's %s.%n",this.name,this.pet.species);
            return true;
        }
        else {
            if(this.pet.trickLevel > randomNumber){
                System.out.printf("Hm... I will feed %s's %s.%n",this.name,this.pet.species);
                return true;
            }
            else {
                System.out.printf("I think %s's %s is not hungry.%n",this.name,this.pet.species);
                return false;
            }
        }
    }
}
