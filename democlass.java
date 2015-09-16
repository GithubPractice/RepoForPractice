package com.eScan.cherry;

import com.eScan.common.commonGlobalVariables;
import com.eScan.main.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * Preference Manager for eScan
 * 
 * @author <b>Ravi</b>
 */
public class eScanPreferenceManager {

	private static eScanPreferenceManager eScanPreference = null;
	private static SharedPreferences pref;

	private eScanPreferenceManager() {
	}

	public static eScanPreferenceManager getInstance(Context context) {
		pref = PreferenceManager.getDefaultSharedPreferences(context);
		if (eScanPreference == null) {
			eScanPreference = new eScanPreferenceManager();
		}
		return eScanPreference;
	}

	public void putStringPreferanceValue(String prefernceName, String value) {
		Editor edit = pref.edit();
		edit.putString(prefernceName, value);
		edit.commit();
	}

	public void putBooleanPreferenceValue(String prefernceName, boolean value) {
		Editor edit = pref.edit();
		edit.putBoolean(prefernceName, value);
		edit.commit();
	}

	public void putIntPreferanceValue(String prefernceName, int value) {
		Editor edit = pref.edit();
		edit.putInt(prefernceName, value);
		edit.commit();
	}

	public void putLongPreferanceValue(String prefernceName, long value) {
		Editor edit = pref.edit();
		edit.putLong(prefernceName, value);
		edit.commit();
	}

	public void putFloatPreferanceValue(String prefernceName, float value) {
		Editor edit = pref.edit();
		edit.putFloat(prefernceName, value);
		edit.commit();
	}

	public String getStringPreferanceValue(String prefernceName,
			String defaultvalue) {
		String value = pref.getString(prefernceName, defaultvalue);
		return value;
	}

	public boolean getBooleanPreferanceValue(String prefernceName,
			boolean defaultvalue) {
		boolean value = pref.getBoolean(prefernceName, defaultvalue);
		return value;
	}

	public int getIntPreferanceValue(String prefernceName, int defaultvalue) {
		int value = pref.getInt(prefernceName, defaultvalue);
		return value;
	}

	public long getLongPreferanceValue(String prefernceName, long defaultvalue) {
		long value = pref.getLong(prefernceName, defaultvalue);
		return value;
	}

	public float getFloatPreferanceValue(String prefernceName,
			float defaultvalue) {
		float value = pref.getFloat(prefernceName, defaultvalue);
		return value;
	}
}