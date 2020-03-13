
public class MethodsDemo {
	float add(float a,float b) {
		return a+b;
	}
	float subtract(float a,float b) {
		return a-b;
	}
	float multiply(float a,float b) {
		return a*b;
	}
	float divide(float a,float b) {
		return a/b;
	}
//	void showResult() {
//		System.out.println("Result="+result);
//	}

	public static void main(String[] args) {
		MethodsDemo md=new MethodsDemo();
		float result=md.add(5,6);
		System.out.println("Result="+result);
	}
	}


