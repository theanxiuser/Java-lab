public class Compare{
    public static void main(String[] args){
	int a = 2, b = 4, c = 3;
	int result = (a>b && a>c)?a:((b>c && b>a)?b : c);
	System.out.println(result);
    }
}
