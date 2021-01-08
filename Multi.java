class Multi extends Thread{  
  public void run(){  
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     Multi obj=new Multi();   
     obj.start();
     obj.setPriority(1);
     System.out.println(obj.getPriority());
     System.out.println(obj.getName());
  } 
}