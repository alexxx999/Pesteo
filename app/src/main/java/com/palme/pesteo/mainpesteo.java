package com.palme.pesteo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class mainpesteo extends Activity {
	private FragmentManager frgMng;
	private FragmentTransaction frgTrx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_am_pesteo);

		frgMng = getFragmentManager();
		frgTrx = frgMng.beginTransaction();
        fgPesteo lints_pesteo = new fgPesteo();

		frgTrx.add(R.id.mainHolder,lints_pesteo);
		frgTrx.addToBackStack("lints_pesteo");
		frgTrx.commit();






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_pesteo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	public void initDB(Context cntx){
		DBManager.init(cntx);
	}
}
