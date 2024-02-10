package arrays;

public class EqualsHashcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Alessandra";
		u1.email = "santosaleip@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Alessandra";
		u2.email = "santosaleip@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1 == u1);
	}
}
