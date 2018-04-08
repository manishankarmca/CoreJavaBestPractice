package com.corejava.mani;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.applet.*;
/**
 * @author mani
 * First Applet Application.It is just for fun.
 * Happy Coding..
 */
public class AwtACalM extends Applet implements ActionListener{
	int v1,v2,result;
	TextField txtinput;
	Button b[]=new Button[10];
	Button operator[] = new Button[7];
	String[] names = {"+", "-", "*", "/", "<-","%","="};
	char OP;
	public void init(){
		txtinput=new TextField(22);
		Frame f = new Frame("Can't Do Better in AWT");
		f.setLayout(new FlowLayout());
		txtinput.addActionListener(this);
		add(txtinput);
		for(int i=0;i<b.length;i++){
			b[i]=new Button(""+i);
			add(b[i]);
			b[i].addActionListener(this);
		}
		for (int i = 0; i < names.length;i++) {
			operator[i] = new Button(""+names[i]);
			add(operator[i]);
			operator[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
			txtinput.setText(txtinput.getText()+str);
		else
			switch(str){
			case "+": v1=Integer.parseInt(txtinput.getText()); OP='+'; txtinput.setText("");
			break;
			case "-": v1=Integer.parseInt(txtinput.getText()); OP='-'; txtinput.setText("");
			break;
			case "*": v1=Integer.parseInt(txtinput.getText()); OP='*'; txtinput.setText("");
			break;
			case "/": v1=Integer.parseInt(txtinput.getText()); OP='/'; txtinput.setText("");
			break;
			case "%":  v1=Integer.parseInt(txtinput.getText()); OP='%'; txtinput.setText("");
			break;
			case "=": v2=Integer.parseInt(txtinput.getText());
			switch(OP){
			case '+': result=v1+v2;    break;
			case '-': result=v1-v2;    break;
			case '*': result=v1*v2;    break;
			case '/': result=v1/v2;    break;
			case '%': result=v1%v2;    break;
			}
			txtinput.setText(""+result);
			break;
			case "<-": txtinput.setText(""); break;
			}
	}
}