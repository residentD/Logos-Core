package Base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ClassDescript {

	public static void cFile(Class<?> inputClass) {

		File file = new File(inputClass.getSimpleName() + "ClassDicr.txt");
		Field[] fields = inputClass.getDeclaredFields();
		StringBuilder stringBuilder = new StringBuilder("");

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(MyAnotacia.class) instanceof MyAnotacia) {

				stringBuilder.append(field.getName() + " (" + field.getType() + ") " + " ----->  ");
				stringBuilder.append(field.getAnnotation(MyAnotacia.class).value() + "\n");

			}

		}

		FileWriter fileWriter;
		try {

			fileWriter = new FileWriter(file);
			fileWriter.write(stringBuilder.toString());
			fileWriter.close();
			System.out.println("File \"" + file.toString() + "\" create");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
