package com.aiden.andstt;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LogUtil {
	private final static String TAG = LogUtil.class.getName();

	public final static boolean DEBUG = true;//마켓올릴때 반드시 DEBUG는 false한다.

	public static void w(String msg) {
		w(TAG, msg);
	}

	public static void w(String tag, String msg) {
		if ( DEBUG ) {
			Log.w(tag, msg);
		}
	}

	public static void e(String msg) {
		e(TAG, msg, null);
	}

	public static void e(String tag, String msg) {
		if ( DEBUG ) {
			Log.e(tag, msg);
		}
	}

	public static void e(String msg, Throwable e) {
		e(TAG, msg, e);
	}

	public static void e(String tag, String msg, Throwable e) {
		if ( DEBUG ) {
			if ( null == e ) {
				Log.e(tag, msg);
			} else {
				Log.e(tag, String.format("%s[%s,cause=%s]", msg, e.toString(), e.getCause()));
			}
		}
	}

	public static void d(String msg) {
		d(TAG, msg);
	}
	
	public static void d(Collection<?> values) {
		for ( Object value : values ) {
			d(value.toString());
		}
	}
	
	public static void d(Iterable<?> values) {
		for ( Object value : values ) {
			d(value.toString());
		}
	}

	public static void d(String tag, String msg) {
		if ( DEBUG ) {
			Log.d(tag, msg);
		}
	}

	public static void i(String msg) {
		i(TAG, msg);
	}

	public static void i(String tag, String msg) {
		if ( DEBUG ) {
			Log.i(tag, msg);
		}
	}
	
	public static void DebugingTest(ArrayList arr){
		System.out.println("============ Debugging Parse Data =============");
		if(DEBUG){
			Iterator iter = arr.iterator();
			while(iter.hasNext()){
				System.out.println(iter.hashCode() + " : " + iter.next().toString());
			}
		}
	}}
