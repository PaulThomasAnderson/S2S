import java.util.LinkedList;

public class Lista {
	public LinkedList<Student1> studenti = new LinkedList<>();
	public void napraviListu(Student1 s){
		if(s==null){
			System.out.println("greska");
			return;
		}
		studenti.add(s);
	}
}
