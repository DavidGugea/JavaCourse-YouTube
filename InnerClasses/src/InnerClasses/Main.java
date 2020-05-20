package InnerClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		
		in.display();
		*/
		
		OuterClass out = new OuterClass();
		out.inner();
		
		System.out.println();
	}

}
