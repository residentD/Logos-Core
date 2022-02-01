package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Method {

	public static void serialize(Serializable obj, File file) throws IOException {

		FileOutputStream fileOS = new FileOutputStream(file);
		ObjectOutputStream objOS = new ObjectOutputStream(fileOS);

		objOS.writeObject(obj);
		objOS.close();
		fileOS.close();
	}

	public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {

		FileInputStream fileIS = new FileInputStream(file);
		ObjectInputStream objIS = new ObjectInputStream(fileIS);
		Serializable object = (Serializable) objIS.readObject();
		objIS.close();
		fileIS.close();

		return object;

	}

}
