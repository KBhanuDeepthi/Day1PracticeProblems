
class StaticVariablesMethodsandBlock {
	static int firstinput=10;
	static int secondinput;
	static void func(int thirdinput) {
		System.out.println("firstinput="  +firstinput);
		System.out.println("secondinput="  +secondinput);
		System.out.println("thirdinput="  +thirdinput);
	}
	static {
		System.out.println("Running static variable");
		secondinput=firstinput+5;
	}
	public static void main(String[] args) {
		func(8);
	}

}
