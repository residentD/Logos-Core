import java.io.File;
import java.io.IOException;

import java.util.ArrayList;

import Base.Employee;
import Base.Method;


public class Aplication {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee em = new Employee("Caplin", 1, 3500);
		
		System.out.println(em);
		
		File emFile = new File("Employee.obj");
		
		Method.serialize(em, emFile);
		
		System.out.println();
		System.out.println(Method.deserealize(emFile));
		
		ArrayList<Employee> employes = new ArrayList<Employee>();
		employes.add(em);
		employes.add(new Employee("Chipotlya", 2, 5025));
		employes.add(new Employee("Kepka", 3, 1580));
		employes.add(new Employee("Tomat", 4, 3000));
		employes.add(new Employee("Vinia", 5, 1900));
		employes.add(new Employee("Gordy", 6, 8100));
		employes.add(new Employee("Gogri", 7, 4750));
		
		System.out.println("-----------------");
		System.out.println("List");
		System.out.println(employes);
		
		File arrFile = new File("Employee.obj");
		
		Method.serialize(employes, arrFile);
		
		
		System.out.println("-------------");
		System.out.println(Method.deserealize(arrFile));
		
	}
	
	
}
