/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btTypedObject {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btTypedObject (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btTypedObject obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTypedObject(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public btTypedObject (int objectType) {
		this(gdxBulletJNI.new_btTypedObject(objectType), true);
	}

	public void setM_objectType (int value) {
		gdxBulletJNI.btTypedObject_m_objectType_set(swigCPtr, this, value);
	}

	public int getM_objectType () {
		return gdxBulletJNI.btTypedObject_m_objectType_get(swigCPtr, this);
	}

	public int getObjectType () {
		return gdxBulletJNI.btTypedObject_getObjectType(swigCPtr, this);
	}

}
