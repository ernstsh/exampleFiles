public static int addition(int a, int b){
	int add;
	add = a+b;
	return add;
}
public static int subrtract(int a, int b){
	int sub;
	sub = a-b;
	return sub;
}
public static void main(String[] args){
	int a = 7;
	int b = 5;
	int add;
	int sub;
	addition(a,b);
	subtract(a,b);
	System.out.println(add);
	System.out.println(sub);
}
