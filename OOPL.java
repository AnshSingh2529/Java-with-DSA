public class OOPL {
    // public static void main(String args[]){
    //     // Pen p1 = new Pen();
    //     // p1.setcolor("blue");
    //     // System.out.println(p1.Getcolor());
    //     // p1.settip(5);
    //     // System.out.println(p1.Gettip());
    //      Student s1 = new Student();  //non-parameterized 
    //      s1.name  = "ansh singh";
    //      s1.password = "anshu";
    //      s1.marks[0] = 100;
    //      s1.marks[1] = 60;
    //      s1.marks[2] = 50;
         
    //     // Student s2 = new Student("Ansh singh");  //parameterized 
    //     // System.out.println(s2.name);
    //     Student s2 = new Student(s1);  // copy constructor
    //     s1.marks[2] = 54;
    //     for(int i = 0 ; i<3; i++){
    //         System.out.println(s2.marks[i]);
    //     }
    //     // System.out.println(s2.password);
        


        

    // }
//     public static void main(String args[]){
//         // Fish shark = new Fish();
//         // dogs germanshepherd = new dogs();
//         // germanshepherd.name = "ronny";
//         // System.out.println(germanshepherd.name);

//         // shark.eat();
//         // shark.fins = 2;
//         // System.out.println(shark.fins);
//         Horse h = new Horse();
//         h.eat();
//         h.walk();
//         h.run();
//         System.out.println(h.color);
        
    //INTERFACES....

    




    
// }
// class Pen{
//     ///use of access modifiers
//      private String color;
//      private int tip;
//      String Getcolor(){
//         return this.color;
//     }
//      int Gettip(){
//         return this.tip;
//     }
//      void setcolor( String color){
//         this.color = color;
//     }
//      void settip(int tip){
//         this.tip = tip;
//     }
// }

// base class
// class Animals{
//     String color;
//     void eat(){
//         System.out.println(" It eats");
//     }
//     void run(){
//         System.out.println("It runs");
//     }
// }
// class fish extends Animals{
//     int fins;
//     String category;
//    void Swim(){
//     System.out.println("swim");
//    }
// }
// class shark extends fish{
//     void maneater(){
//         System.out.println("maneater shark are dnagerous,it eats humanflesh");
//     }
// }
// class dogs extends Animals{
//     String breed;
//     String name;
//     int legs;
    
// }
// class Germanshepherd extends dogs{
//     void danger(){
//         System.out.println("Are very dangerous");
//     }
// }

// //derived class
// class Fish extends Animals{
//     int fins;
//     void swim(){
//         System.out.println(" It swims");
//     }
// }
// class Student{
//     String name ;
//     int rollno ;
//     String password;
//     int marks[];

//     Student(Student s1){
//         this.name = s1.name ;
//         this.rollno = s1.rollno;
//         this.password =s1.password;
//         marks = new int[3];
//         this.marks = s1.marks;
// }
    // Student(Student s1){            //deep copy contructor
    //     this.name = s1.name ;
    //     this.rollno = s1.rollno;
    //     this.password =s1.password;
    //     marks = new int[3];
    //     for(int i = 0; i<marks.length; i++){
    //         this.marks[i]=s1.marks[i];
    //     }
    // }
    // non-parametrized constructor
    //  Student(){
    //     marks = new int[3];

    //  }
    // // parameterized constructor
    // Student(String name ){
    //     marks = new int[3];
    //     this.name = name;
    // }

// abstract class Animals{
//     String color;
//     Animals (){
//         color = "BROWN";
//     }
//      void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();

//     }
// class Horse extends Animals{
//     void changecolor(){
//         color = "dark BROWN";
//     }
//     void walk(){
//         System.out.println("Walk in 4 legs");
//     }
//     void run(){
//         System.out.println("Run very fast");
//     }
// }  
}

    
    


