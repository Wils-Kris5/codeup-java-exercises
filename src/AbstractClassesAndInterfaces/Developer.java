package AbstractClassesAndInterfaces;

 class Developer extends Employee {
      public String work() {
          return "writting code...";
      }

     @Override
     protected String doWork() {
         return null;
     }

     public void quit() {
          System.out.println("Here is my two weeks notice.");
      }
}
