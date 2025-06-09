class Customer {

    void purchaseList() {
        int cost = 40;
        String items = "Tomato"; 
    }
}

class Task33 extends Customer {
    protected String items = "Onions"; 
    protected int cost = 30;  

    void billing() {
        items = "Potatoes"; 
        cost = 50;  
    }

    public static void main(String[] args) {
        Task33 task = new Task33();
        task.billing();  
        System.out.println(task.items); 
        System.out.println(task.cost);   
    }
}
