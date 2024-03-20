public class Dog {
    String name;

    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart ";
        //name 필드를 초기화 하지 않아서 null로 출력됨

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred ";
        myDogs[1].name = "Marge ";

        System.out.print("Last dogs name: ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark(){
        System.out.println(name + "say bow");
    }
    public void eat(){

    }
    public void chaseCat(){

    }
}
