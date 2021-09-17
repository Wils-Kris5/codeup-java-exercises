package AbstractClassesAndInterfaces;

 class Developer extends Employee {
     public String doWork() {
         return "writting code...";
     }

     public void quit() {

         System.out.println("Here is my two weeks notice.");
     }

     public void syncUp() {
         System.out.println("schedule Zoom meeting");
     }
     public void escalateQuestion(){
         System.out.println("Ping in Slack");
     }

 }
