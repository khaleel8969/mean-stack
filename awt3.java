import java.awt.*;    
  class AWTExample1 
 {        
   AWTExample1()
   {  
      Frame f1=new Frame();
      f1.setSize(900,900); 
      f1.setTitle("label"); 
      f1.setLayout(new FlowLayout());    
      Label l = new Label("Employee id:");
       l.setBounds(20, 80, 80, 30); 
      f1.add(l);  
      f1.setVisible(true); 
   }     
  public static void main(String args[]) 
  {     
   AWTExample1 f = new AWTExample1();     
  }  
  
 }    