package com.palme.pesteo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ErnestoOrozco on 29/10/2014.
 */
public class fgPesteo extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View vfg = inflater.inflate(R.layout.ly_fg_pesteo,container,false);
		return vfg;
	}
}
