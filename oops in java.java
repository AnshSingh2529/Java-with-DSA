package bank;
// class pen{
//     String type;
//     String color;//ball or gell
    
//     public void write(){
//         System.out.println("Write something");//funtion define
    
//     }
    
// }
//     public class OOPS{
//         public static void main(String args[]){
//             Pen pen1 = new Pen();
//             pen1.color = "blue";
//             pen1.type = "gel";
           

//             pen1.Write();

//         }

// }


class Animal{
    public void walk(){
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class chicken extends Animal{
    public void walk() {
        System.out.println(" walk on 2 legs ");     
    }
}