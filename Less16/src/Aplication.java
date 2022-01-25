import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import Ceppelin.CeppelinTehn;

public class Aplication {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		CeppelinTehn ceppelinTehn = new CeppelinTehn();

		Class ceppClass = ceppelinTehn.getClass();
		System.out.println("Simple Name");
		System.out.println(ceppClass.getSimpleName());
		System.out.println("Package");
		System.out.println(ceppClass.getPackageName());
		System.out.println("-------------------------------");
		System.out.println("Methods: ");
		for (Method method : ceppClass.getMethods()) {
			System.out.println(method);
		}

		System.out.println("-------------------------------");
		System.out.println("Constructor");
		for (Constructor<CeppelinTehn> constructor : ceppClass.getConstructors()) {
			System.out.println(constructor);
		}

		System.out.println("-------------------------------");
		System.out.println("Field");
		for (Field field : ceppClass.getDeclaredFields()) {
			System.out.println(field);
		}

		System.out.println("-------------------------------");
		Field propellerField = ceppClass.getDeclaredField("propeller");
		propellerField.setAccessible(true);
		propellerField.set(ceppelinTehn, 8);
		System.out.println("New propeller = " + ceppelinTehn.getPropeller());

		System.out.println("-------------------------------");

		int[] ints = {20,45,10};

		Method method = ceppClass.getMethod("myMethod", String.class, int[].class);
		System.out.println(method);
		method.invoke(ceppelinTehn, "Create", ints);

		method = ceppClass.getMethod("myMethod", int[].class);
		System.out.println("-------------------------------");
		System.out.println(method);
		method.invoke(ceppelinTehn, ints);

	}

}
