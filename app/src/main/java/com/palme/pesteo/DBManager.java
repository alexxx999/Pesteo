package com.palme.pesteo;

import android.content.Context;
import android.database.Cursor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ErnestoOrozco on 30/10/2014.
 */
public class DBManager {

	private static DBManager DBMinst;





	public static void init(Context cntx){
		if(DBMinst == null) DBMinst = new DBManager(cntx);
	}

	public static DBManager getDBMinst() {
		return DBMinst;
	}

	private DBHelper dbhlp;
	private DBManager(Context cntx) {
		dbhlp = new DBHelper(cntx);
	}

	public DBHelper getDbhlp() {
		return dbhlp;
	}

	public void addProd(producto regProd){
		getDbhlp().getRteProductoDao().create(regProd);
	}

	public producto getFndProd(String ipstIdProd){
		producto retProd = new producto();
		retProd = (producto) getDbhlp().getRteProductoDao().queryForEq("idProd", ipstIdProd);
		return retProd;
	}

	public void setCrgProds(Context cntx){
		Cursor crsProds;
		InputStream istrm = null;
		String line = "";
		producto mngProd = new producto();
		try {
			istrm = cntx.getAssets().open("producto.csv");
			BufferedReader dbReader = new BufferedReader(new InputStreamReader(istrm));



		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

}
