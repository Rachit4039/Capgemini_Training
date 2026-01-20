interface Worker{
    public void performDuties();
}
public class RestaurantManagement {
    static class Person{
        String name;
        int id;
        Person(String name,int id){
            this.name=name;
            this.id = id;
        }
    }
    static class Chef extends Person implements Worker{
        Chef(String name,int id){
            super(name,id);
        }
        public void performDuties(){
            System.out.println("cook food");
        }
    }
    static class Waiter extends Person implements Worker{
        Waiter(String name,int id){
            super(name,id);
        }
        public void performDuties(){
            System.out.println("serve food");
        }
    }

    public static void main(String[] args) {
        Chef c = new Chef("afe", 223);
        c.performDuties();

        Waiter w = new Waiter("wa", 543);
        w.performDuties();
    }
}
