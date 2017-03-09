package Calculator;

public class Calculator {
public static void main(String[] args) {
	Model model=new Model();
	View view=new View();
	Control control=new Control(model, view);
	
}
}
