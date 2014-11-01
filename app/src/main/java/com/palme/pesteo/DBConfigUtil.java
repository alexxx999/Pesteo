package com.palme.pesteo;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by ErnestoOrozco on 31/10/2014.
 */
public class DBConfigUtil extends OrmLiteConfigUtil {

	private static final Class<?>[] classes = new Class[]{producto.class};

	public static void main(String[] args) throws IOException, SQLException {

		String currDir = "user.dir";
		String configPath = "/app/src/main/res/raw/ormlite_config.txt";
		String projectRoot = System.getProperty(currDir);
		String fullConfigPath = projectRoot + configPath;
		File configFile = new File(fullConfigPath);
		if (configFile.exists()){
			configFile.delete();
			configFile = new File(fullConfigPath);
		}
		writeConfigFile(configFile,classes);
	}
}
