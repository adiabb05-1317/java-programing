
 import java.awt.*; 
 import java.awt.event.*; 
 
 //An AWT program inherits from the top-level container java.awt.Frame 
 public class ButtonEvent extends Frame implements ActionListener{ 
     
  // Label 
  Label l; 
 
  // Constructor 
  ButtonEvent(){ 
      // Create components 
      l = new Label("Welcome"); 
      Button b = new Button("Click Here"); 
 
      // Add components 
      add(l); 
      add(b); 
      
      // Register listener 
      b.addActionListener(this); 
 
      // Set Layout 
      setLayout(new FlowLayout()); 
 
      // Set the size of frame 
      setSize(400, 400); 
 
      setVisible(true); 
  } 
 
  // Listener Method 
  public void actionPerformed(ActionEvent e) 
  { 
      l.setText("Button is clicked!"); 
  }
    
 
  // Main method 
  public static void main(String args[]) 
  { 
      ButtonEvent b = new ButtonEvent(); 
  } 
 }