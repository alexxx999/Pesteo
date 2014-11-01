package com.palme.pesteo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by ErnestoOrozco on 30/10/2014.
 */
public class DBHelper extends OrmLiteSqliteOpenHelper {

	private final String TAG = DBHelper.class.getSimpleName();

	private final static String DBNAME = "palmeDB.sqlite";
	private final static int DBVERSION = 1;

	private Dao<producto, Integer> productoDao = null;
	private RuntimeExceptionDao<producto, Integer> rteProductoDao = null;

	public DBHelper(Context cntx) {
		super(cntx, DBNAME, null, DBVERSION,R.raw.ormlite_config);
	}

	@Override
	public void onCreate(SQLiteDatabase dbName, ConnectionSource srcCnx) {
		try {
			TableUtils.createTableIfNotExists(srcCnx,producto.class);
		} catch (SQLException e) {
			Log.e(TAG,"No fue posible crear las tablas",e);
		}
	} /*onCreate*/

	@Override
	public void onUpgrade(SQLiteDatabase dbName, ConnectionSource srcCnx, int actVer, int oldVer) {
		try {
			TableUtils.dropTable(srcCnx,producto.class,false);
			onCreate(dbName,srcCnx);
		} catch (SQLException e) {
			Log.e(TAG,"No fue posible actualizar las tablas",e);
		}
	} /*onUpgrade*/

	public Dao<producto, Integer> getProductoDao() throws SQLException{
		if (productoDao == null) productoDao = getDao(producto.class);

		return productoDao;
	}

	public RuntimeExceptionDao<producto, Integer> getRteProductoDao() {
		if(rteProductoDao == null){
			rteProductoDao = getRuntimeExceptionDao(producto.class);
		}
		return rteProductoDao;
	}

	@Override
	public void close() {
		super.close();
		productoDao = null;
		rteProductoDao = null;
	}
}
