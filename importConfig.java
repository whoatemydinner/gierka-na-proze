/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Piotr
 */
public class importConfig {
    public static int[] importConfig() {
        // korzystamy z Java Approved(TM) sposobu, na robienie configa
        // czyli pliku *.properties, w którym wszystko jest ładnie uporządkowane
        // na zasadzie coś=toś
	Properties prop = new Properties();
	InputStream input = null;
        int[] x = new int[8];

	try {

		input = new FileInputStream("resources\\config.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
                x[0] = Integer.parseInt(prop.getProperty("difficulty"));
		x[1] = Integer.parseInt(prop.getProperty("lives"));
		x[2] = Integer.parseInt(prop.getProperty("gamelength"));
                x[3] = Integer.parseInt(prop.getProperty("numberofdeaths"));
                x[4] = Integer.parseInt(prop.getProperty("bonus"));
                x[5] = Integer.parseInt(prop.getProperty("penaltyfordeath"));
                x[6] = Integer.parseInt(prop.getProperty("points"));
                x[7] = Integer.parseInt(prop.getProperty("levels"));

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

                return x;
  }
}
