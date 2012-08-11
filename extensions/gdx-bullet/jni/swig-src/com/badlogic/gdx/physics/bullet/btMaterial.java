/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btMaterial {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btMaterial (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btMaterial obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btMaterial(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_friction (float value) {
		gdxBulletJNI.btMaterial_m_friction_set(swigCPtr, this, value);
	}

	public float getM_friction () {
		return gdxBulletJNI.btMaterial_m_friction_get(swigCPtr, this);
	}

	public void setM_restitution (float value) {
		gdxBulletJNI.btMaterial_m_restitution_set(swigCPtr, this, value);
	}

	public float getM_restitution () {
		return gdxBulletJNI.btMaterial_m_restitution_get(swigCPtr, this);
	}

	public void setPad (int[] value) {
		gdxBulletJNI.btMaterial_pad_set(swigCPtr, this, value);
	}

	public int[] getPad () {
		return gdxBulletJNI.btMaterial_pad_get(swigCPtr, this);
	}

	public btMaterial () {
		this(gdxBulletJNI.new_btMaterial__SWIG_0(), true);
	}

	public btMaterial (float fric, float rest) {
		this(gdxBulletJNI.new_btMaterial__SWIG_1(fric, rest), true);
	}

}
