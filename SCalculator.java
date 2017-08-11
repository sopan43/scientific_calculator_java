import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

class JPanelFrame extends JFrame implements ActionListener
{ 
String equalOp = "=";
int total=0;
int count=1;
int op=0;
JPanel panel1,panel2,panel3,panel4; 
JTextField txtData;
JButton [] btnData=new JButton[12];
JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
JButton jb10,jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18; 
JPanelFrame()
{
panel1=new JPanel();
txtData=new JTextField(40);
panel1.add(txtData);
add(panel1,"North");

//txtData.setText("0");
panel2=new JPanel(new GridLayout(3,3,3,3));
for(int i=1;i<=9;i++)
{
btnData [i]=new JButton(""+i);
panel2.add(btnData[i]);
panel2.setBackground(Color.gray);
}

add(panel2,"West");

panel3=new JPanel(new GridLayout(3,6,3,3));
jb1=new JButton("+");
jb2=new JButton("0");
jb3=new JButton("-");
jb4=new JButton("*");
jb5=new JButton("/");
jb6=new JButton("=");
jb7=new JButton("1/x^2");
jb8=new JButton("e^x");
jb9=new JButton("e^x -1");
jb10=new JButton("sin");
jb11=new JButton("cos");
jb12=new JButton("tan");
jb13=new JButton("log10");
jb14=new JButton("log");
jb15=new JButton("x^2");
jb16=new JButton("x^3");
jb17=new JButton("1/x");
jb18=new JButton("C");

panel3.add(jb2);
panel3.add(jb1);
panel3.add(jb3);
panel3.add(jb4);
panel3.add(jb5);
panel3.add(jb6);    
panel3.add(jb7);
panel3.add(jb8);
panel3.add(jb9);
panel3.add(jb10);
panel3.add(jb11);
panel3.add(jb12);
panel3.add(jb13);
panel3.add(jb14);
panel3.add(jb15);
panel3.add(jb16);
panel3.add(jb17);
panel3.add(jb18);

panel3.setBackground(Color.gray);
add(panel3,"East");
for(int i=1;i<=9;i++)
{
btnData[i].addActionListener(this);
}


jb1.addActionListener(this);
jb2.addActionListener(this);
jb3.addActionListener(this);
jb4.addActionListener(this);
jb5.addActionListener(this);
jb6.addActionListener(this);
jb7.addActionListener(this);
jb8.addActionListener(this);
jb9.addActionListener(this);
jb10.addActionListener(this);
jb11.addActionListener(this);
jb12.addActionListener(this);
jb13.addActionListener(this);
jb14.addActionListener(this);
jb15.addActionListener(this);
jb16.addActionListener(this);
jb17.addActionListener(this);
jb18.addActionListener(this);

}


public void actionPerformed(ActionEvent ae){
//String n;

//int total=0;
String displayText = txtData.getText();
//String digit = ae.getActionCommand();
//int t=Integer.parseInt(digit);

if(ae.getActionCommand().equals("1"))
{
	  
	txtData.setText(txtData.getText() + "1");
}
if(ae.getActionCommand().equals("2"))
{
	txtData.setText(txtData.getText() + "2");
}
if(ae.getActionCommand().equals("3"))
{
	txtData.setText(txtData.getText() +"3");
}
if(ae.getActionCommand().equals("4"))
{
	txtData.setText(txtData.getText() +"4");
}
if(ae.getActionCommand().equals("5"))
{
	txtData.setText(txtData.getText() +"5");
}
if(ae.getActionCommand().equals("6"))
{
	txtData.setText(txtData.getText() +"6");
}
if(ae.getActionCommand().equals("7"))
{
	txtData.setText(txtData.getText() +"7");
}
if(ae.getActionCommand().equals("8"))
{
	txtData.setText(txtData.getText() +"8");
}
if(ae.getActionCommand().equals("9"))
{
	txtData.setText(txtData.getText() +"9");
}
if(ae.getActionCommand().equals("0"))
{
	txtData.setText(txtData.getText() +"0");
}


if(ae.getActionCommand().equals("+"))
{
	
	
	
	
count++;
check();
op=1;
txtData.setText("");




}
if(ae.getActionCommand().equals("-"))
{
		
	
	
count++;
check();
op=2;
txtData.setText("");
}
if(ae.getActionCommand().equals("*"))
{
		
	
	
count++;
check();
op=3;
txtData.setText("");
}
if(ae.getActionCommand().equals("/"))
{
		
	
	
count++;
check();
op=4;
txtData.setText("");
}

 if (ae.getActionCommand().equals("C"))
            {
                txtData.setText("");
				total=0;
				count=1;
            }
 
            

if(ae.getActionCommand().equals("="))
{
	//total=Integer.parseInt(displayText);
	if(op==1)
		total +=Integer.parseInt(displayText);
	
	if(op==2)
		total -=Integer.parseInt(displayText);
	
	if(op==3)
		total *=Integer.parseInt(displayText);
	if(op==4)
		total /=Integer.parseInt(displayText);
	
	txtData.setText(Integer.toString(total));
}

if(ae.getActionCommand().equals("log"))
{
	 txtData.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));
}
if(ae.getActionCommand().equals("sin"))
{
	txtData.setText("" + Math.sin(Double.valueOf(displayText).doubleValue()));
}
if(ae.getActionCommand().equals("cos"))
{
	 txtData.setText("" + Math.cos(Double.valueOf(displayText).doubleValue()));
}
if(ae.getActionCommand().equals("tan"))
{
	txtData.setText("" + Math.tan(Double.valueOf(displayText).doubleValue()));
}
if(ae.getActionCommand().equals("x^2"))
{
	double x=2.00;
	txtData.setText("" + Math.pow(Double.valueOf(displayText).doubleValue(),x));
}
if(ae.getActionCommand().equals("x^3"))
{
	double x=3.00;
	txtData.setText("" + Math.pow(Double.valueOf(displayText).doubleValue(),x));
}
if(ae.getActionCommand().equals("1/x"))
	
{

	txtData.setText("" +(1/Double.valueOf(displayText).doubleValue()));
}

if(ae.getActionCommand().equals("1/x^2"))
{
	txtData.setText("" +(1/((Double.valueOf(displayText).doubleValue())*Double.valueOf(displayText).doubleValue())));
}
if(ae.getActionCommand().equals("e^x"))
{
	txtData.setText("" + Math.exp(Double.valueOf(displayText).doubleValue()));

}
if(ae.getActionCommand().equals("e^x -1"))
{
	txtData.setText("" + Math.expm1(Double.valueOf(displayText).doubleValue()));

}

if(ae.getActionCommand().equals("log10"))
{
	txtData.setText("" + Math.log10(Double.valueOf(displayText).doubleValue()));

}




}

public void check(){
	if(count==2)
		total =Integer.parseInt(txtData.getText());
	else{
			if(op==1)
		total +=Integer.parseInt(txtData.getText());
	
	if(op==2)
		total -=Integer.parseInt(txtData.getText());
	
	if(op==3)
		total *=Integer.parseInt(txtData.getText());
	if(op==4)
		total /=Integer.parseInt(txtData.getText());
	
	txtData.setText(Integer.toString(total));
		}
}






}

class SCalculator
{
public static void main(String [] args)
{
JPanelFrame frame=new JPanelFrame();
frame.setBounds(400,500,520,500);
frame.setTitle("MyCalculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setResizable(false);
frame.setVisible(true);
}
}

