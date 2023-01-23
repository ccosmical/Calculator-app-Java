import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Font;

public class calculator {

    class gui{

        private JFrame frame;
        private JButton sum;
        private JButton sub;
        private JButton mul;
        private JButton div;
        private JButton equal;
        private JButton comma;
        private JButton back;
        private JButton c;
        private JButton powerOf;
        private JButton zero;
        private JTextField t;
        private String[] nums={"1","2","3","4","5","6","7","8","9"};
        private JButton[] buttons= new JButton[9];
        public float num1=0;
        public float num2=0;
        public float result=0;
        public String sign="";
        public int temp=0;
        public boolean cleaning;

        
        public void switchCase(){
            switch(sign){
                case "+":
                    result= num1+num2;
                    break;
                case "-":
                    result= num1-num2;
                    break;
                case "/":
                    result= num1/num2;
                    break;
                case "x":
                    result= num1*num2;
                    break;
                case "^":
                    result = num1;
                    if (num2==0) {  result=1;}
                    else{
                        for (int x=0 ;x<(num2-1); x++){                                   
                            result = result*num1;
                        }
                        break;
                    }   
            }
        }




        public void buttons(){
            sum = new JButton("+");
            sum.setBounds(190,135,60,40);
            sum.setFocusPainted(false);
            sum.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    
                    if(adc.size()==1){
                        num1=Float.valueOf(adc.get(0));
                        t.setText(t.getText().substring(0, t.getText() .length() )+" + ");
                    }

                    else if(adc.size()==3){
                        
                        num1=Float.valueOf(adc.get(0));
                        sign=adc.get(1);
                        num2=Float.valueOf(adc.get(2));
                        
                        switchCase();

                        t.setText(String.valueOf(result + " + "));
                        cleaning=true; // For cleaning the textfield if a numberbutton is pressed just after any calculation is done. It is used under actionlistener of number buttons.
                        
                    }                                                                                                         
                }
            });


            sub = new JButton("-");
            sub.setBounds(190,175,60,40);
            sub.setFocusPainted(false);
            sub.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    
                    if(adc.size()==1){
                        num1=Float.valueOf(adc.get(0));
                        t.setText(t.getText().substring(0, t.getText() .length() )+" - ");
                    }

                    else if(adc.size()==3){
                        
                        num1=Float.valueOf(adc.get(0));
                        sign=adc.get(1);
                        num2=Float.valueOf(adc.get(2));
                        
                        switchCase();

                        t.setText(String.valueOf(result+ " - "));
                        cleaning=true; // For cleaning the textfield if a numberbutton is pressed just after any calculation is done. It is used under actionlistener of number buttons.
                    }
                                                                        
                               
                }
            });


            mul = new JButton("x");
            mul.setBounds(190,215,60,40);
            mul.setFocusPainted(false);
            mul.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    
                    if(adc.size()==1){
                        num1=Float.valueOf(adc.get(0));
                        t.setText(t.getText().substring(0, t.getText() .length() )+" x ");
                    }

                    else if(adc.size()==3){
                        
                        num1=Float.valueOf(adc.get(0));
                        sign=adc.get(1);
                        num2=Float.valueOf(adc.get(2));
                        
                        switchCase();

                        t.setText(String.valueOf(result + " x "));
                        cleaning=true; // For cleaning the textfield if a numberbutton is pressed just after any calculation is done. It is used under actionlistener of number buttons.
                    }                                                                                  
                }
            });


            div = new JButton("/");
            div.setBounds(190,255,60,40);
            div.setFocusPainted(false); 
            div.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    
                    if(adc.size()==1){
                        num1=Float.valueOf(adc.get(0));
                        t.setText(t.getText().substring(0, t.getText() .length() )+" / ");
                    }

                    else if(adc.size()==3){
                        
                        num1=Float.valueOf(adc.get(0));
                        sign=adc.get(1);
                        num2=Float.valueOf(adc.get(2));
                        
                        switchCase();

                        t.setText(String.valueOf(result + " / "));
                        cleaning=true; // For cleaning the textfield if a numberbutton is pressed just after any calculation is done. It is used under actionlistener of number buttons.
                    }                                                              
                }
            });
            
            
            powerOf = new JButton("^");
            powerOf.setBounds(5,90,60,40);
            powerOf.setFocusPainted(false);
            powerOf.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    
                    if(adc.size()==1){
                        num1=Float.valueOf(adc.get(0));
                        t.setText(t.getText().substring(0, t.getText() .length() )+" ^ ");
                    }

                    else if(adc.size()==3){
                        
                        num1=Float.valueOf(adc.get(0));
                        sign=adc.get(1);
                        num2=Float.valueOf(adc.get(2));
                        
                        switchCase();

                        t.setText(String.valueOf(result + " ^ "));
                        cleaning=true; // For cleaning the textfield if a numberbutton is pressed just after any calculation is done. It is used under actionlistener of number buttons.
                    }
                }
            });


            equal = new JButton("=");
            equal.setBounds(125,255,60,40);
            equal.setFocusPainted(false);           
            equal.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    if(adc.size()==3){
                        num1=Float.valueOf(adc.get(0));
                        sign=adc.get(1);
                        num2=Float.valueOf(adc.get(2));
                        switchCase();
                        cleaning=true; // For cleaning the textfield if a numberbutton is pressed just after any calculation is done. It is used under actionlistener of number buttons.
                    }    
                    t.setText(String.valueOf(result));
                    
                }
            });


            back = new JButton("←");
            back.setBounds(125,90,60,40);
            back.setFocusPainted(false);           
            back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)

                    if(adc.size()==3 && adc.get(2).length()==1){
                        t.setText(""+t.getText().substring(0, t.getText() .length() - 2)); }
                    
                    else if(adc.size()==2 ){
                        t.setText(""+t.getText().substring(0, t.getText() .length() - 2)); }           

                    else{
                        t.setText(""+t.getText().substring(0, t.getText() .length() - 1)); }
                    
                }
            });


            c = new JButton("C");
            c.setBounds(65,90,60,40);
            c.setFocusPainted(false);
            c.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    t.setText("");
                }
            });


            
            comma = new JButton(".");
            comma.setBounds(5,255,60,40);
            comma.setFocusPainted(false);
            comma.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    String str=t.getText();  // Text field into a string called str
                    String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                    ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)
                    
                    if(adc.size()==1 && adc.get(0).contains(".")==false){            
                        t.setText(t.getText().substring(0, t.getText() .length() )+"."); }                    
                           
                    else if(adc.size()==3 && adc.get(2).contains(".")==false){
                        
                        t.setText(t.getText().substring(0, t.getText() .length() )+".");
                    }                 
                }
            });

            
            zero = new JButton("0");
            zero.setBounds(65,255,60,40);
            zero.setFocusPainted(false);
            zero.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    t.setText(t.getText().substring(0, t.getText() .length() )+"0");
                }
            });                                         


            for(int x = 0 ; x<nums.length  ; x++ ){
                int y=x;
                buttons[x] = new JButton(nums[x]);
                buttons[x].setSize(50,50);
                buttons[x].setFocusPainted(false);
                buttons[x].addActionListener(new ActionListener(){
                    
                    public void actionPerformed(ActionEvent e){
                        String str=t.getText();  // Text field into a string called str
                        String []ListOfStr = str.split(" "); // Split str then put it into an array called ListOfStr

                        ArrayList<String> adc= new ArrayList<String>(Arrays.asList(ListOfStr)); // ListOfStr(the array above) into an arraylist(adc)

                        if (adc.size()==1 && cleaning){
                            t.setText(String.valueOf(y+1));
                            cleaning=false;
                        }
                        else if (adc.size()==2 && t.getText().endsWith("+") ||  t.getText().endsWith("-") || t.getText().endsWith("x") || t.getText().endsWith("/") || t.getText().endsWith("^") ){
                            t.setText(t.getText().substring(0, t.getText() .length() )+String.valueOf(" "+(y+1)));
                        }
                        else {
                            t.setText(t.getText().substring(0, t.getText() .length() )+String.valueOf(y+1)); }
                    }
                });
            }
            
            buttons[0].setBounds(5,215,60,40);
            buttons[1].setBounds(65,215,60,40);
            buttons[2].setBounds(125,215,60,40); 
            buttons[3].setBounds(5,175,60,40);
            buttons[4].setBounds(65,175,60,40);
            buttons[5].setBounds(125,175,60,40); 
            buttons[6].setBounds(5,135,60,40);
            buttons[7].setBounds(65,135,60,40);
            buttons[8].setBounds(125,135,60,40);

            t = new JTextField();
            t.setBounds(5,5,245,70);
            Font font = new Font("Dialog",4 ,15);
            t.setFont(font);
            t.addKeyListener(new KeyAdapter(){
                public void keyTyped(KeyEvent e){
                    
                    char c = e.getKeyChar();

                    if (Character.isDigit(c)){
                        t.setEditable(true);
                    }
                    else{
                        t.setEditable(false);
                    }
                }

            });
        }  
        
        
        public void window(){
            frame = new JFrame();
            frame.setSize(270, 338); 

            frame.add(sum);
            frame.add(sub);
            frame.add(mul);
            frame.add(div);
            frame.add(equal);
            frame.add(comma);
            frame.add(back);
            frame.add(c);
            frame.add(powerOf);
            frame.add(zero);
            frame.add(t);

            for(int x = 0 ; x<nums.length  ; x++ ){
                frame.add(buttons[x]);  
            }
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setLayout(null);
            frame.setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        calculator t = new calculator();
        calculator.gui t1 = t.new gui();
        
        t1.buttons();
       
        t1.window();  
         
    }
}