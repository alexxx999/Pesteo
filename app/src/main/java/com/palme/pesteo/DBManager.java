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
			while ((line = dbReader.readLine()) != null){
				String[] rwData = line.split("|");
				mngProd.setIdProd(rwData[0]);
				mngProd.setIdEmp(Integer.valueOf(rwData[1]));
				mngProd.setDescAlm(rwData[2]);
				mngProd.setUnidad(rwData[3]);
				mngProd.setFrccEnt1(Integer.valueOf(rwData[4]));
				mngProd.setFrccNum1(Integer.valueOf(rwData[5]));
				mngProd.setFrccDen1(Integer.valueOf(rwData[6]));
				mngProd.setFrccEnt2(Integer.valueOf(rwData[7]));
				mngProd.setFrccNum2(Integer.valueOf(rwData[8]));
				mngProd.setFrccDen2(Integer.valueOf(rwData[9]));
				mngProd.setPerfil(rwData[10]);
				mngProd.setCmMed1(Double.valueOf(rwData[11]));
				mngProd.setCmMed2(Double.valueOf(rwData[12]));
				mngProd.setMedPulg(rwData[13]);



			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

}
