public class Main {
    public static void main(String[] args) {

        System.out.println("For \"Michael Karleone\" part of the task:\n");
        Pet dog1 = new Pet("dog","Rock",5,75, new String[]{"eat", "drink", "sleep"});
        Human human3 = new Human("Jane","Karleone",1950);
        Human human2 = new Human("Vito","Karleone",1949);
        Human human1 = new Human("Michael","Karleone",1977,90,dog1,human3,human2,new String[7][7]);
        System.out.println(dog1);
        System.out.println(human1);

        System.out.println("\nFor \"the usage of all constructors\" part of the task:\n");
        Pet cat = new Pet("cat","Garfield");
        Pet hamster = new Pet("hamster","Alvis",4,67,new String[]{"run","eat","run again"});
        Pet monkey = new Pet();

        Human human8 = new Human("Alide","Mehdiyeva",1933);
        human8.mother = new Human();
        human8.father = new Human();

        Human human9 = new Human("Veli","Mehdiyev",1923);
        human9.mother = new Human();
        human9.father = new Human();

        Human human6 = new Human("Mehriban","Veliyeva",1966,human8,human9);
        Human human10 = new Human("Naile","Veliyeva",1923);
        human10.mother = new Human();
        human10.father = new Human();
        Human human11 = new Human();
        human11.mother = new Human();
        human11.father = new Human();

        Human human12 = new Human("Esmer","Mehdiyeva",1955,human8,human9);
        Human human7 = new Human("Eli","Veliyev",1967,92,monkey,human10,human11,new String[7][7]);
        Human human4 = new Human("Elvin","Veliyev",1999,91,cat,human6,human7,new String[7][7]);
        Human human5 = new Human("Emil","Veliyev",1997,90,hamster,human6,human7,new String[7][7]);

        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
        System.out.println(human10);
        System.out.println(human11);
        System.out.println(human12);

        System.out.println("\nFor \"mother, father, child and his pet\" part of the task:\n");
        Pet dog = new Pet("dog","Danny",6,55,new String[]{"eat","run","bite"});
        Human mother = new Human("Arzu","Ismayilova",1975);
        Human father = new Human("Senan","Ismayilov",1975);
        Human child = new Human("Elnur","Ismayilov",2000,94,dog,mother,father,new String[7][7]);

        System.out.println(child);
        System.out.println(dog);
        child.greetPet();
        child.describePet();

        dog.eat();
        dog.respond();
        dog.foul();

        System.out.println(child.feedPet(false));
    }
}
