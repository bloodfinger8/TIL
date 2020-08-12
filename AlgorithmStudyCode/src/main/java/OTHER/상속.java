package OTHER;


class Person{
    void eat(String food){
        System.out.println("먹다");
    }
    void eatAll(String[] foods){
        for (String a: foods) {
            eat(a);
        }
    }
}

class Grandfather extends Person {
    private int count = 0;

    @Override
    void eat(String food) {
        count++;
        super.eat(food);
    }

    @Override
    void eatAll(String[] foods) {
        count = count  + foods.length;
        super.eatAll(foods);
    }

    public int getCount() {
        return count;
    }
}

class ModifyGrandfather extends Person{
    private Person person;

    ModifyGrandfather(Person person){
        this.person = person;
    }

    @Override
    void eat(String food) {
        person.eat(food);
    }

    @Override
    void eatAll(String[] foods) {
        person.eatAll(foods);
    }
}

class UltraGrandfather extends ModifyGrandfather{

    private int count = 0;

    UltraGrandfather(Person person) {
        super(person);
    }

    @Override
    void eat(String food) {
        count++;
        super.eat(food);
    }

    @Override
    void eatAll(String[] foods) {
        count = count + foods.length;
        super.eatAll(foods);
    }

    public int getCount() {
        return count;
    }
}



public class 상속 {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        g.eat("헴벅");
        System.out.println(g.getCount());

        Grandfather gg = new Grandfather();
        gg.eatAll(new String[]{"햄벅" , "피자" , "파스타"});
        System.out.println(gg.getCount());


        UltraGrandfather m = new UltraGrandfather(new Person());
        m.eatAll(new String[]{"햄벅" , "파스타" , "맥주"});
        System.out.println(m.getCount());
    }
}
