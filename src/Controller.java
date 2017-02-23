import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
Menu view;
Model data;
Controller(Menu view, Model data){
	this.view=view;
	this.data=data;
	setup();
}
void setup(){
	String item1=data.getitem1();
	view.setlable1(item1);
	String item2=data.getitem2();
	view.setlable2(item2);
	String item3=data.getitem3();
	view.setlable3(item3);
	String item4=data.getitem4();
	view.setlable4(item4);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	view.addListener(this);
}
}