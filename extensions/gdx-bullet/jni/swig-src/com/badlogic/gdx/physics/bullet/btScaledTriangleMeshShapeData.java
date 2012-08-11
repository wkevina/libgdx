/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btScaledTriangleMeshShapeData {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btScaledTriangleMeshShapeData (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btScaledTriangleMeshShapeData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btScaledTriangleMeshShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_trimeshShapeData (btTriangleMeshShapeData value) {
		gdxBulletJNI.btScaledTriangleMeshShapeData_m_trimeshShapeData_set(swigCPtr, this, btTriangleMeshShapeData.getCPtr(value),
			value);
	}

	public btTriangleMeshShapeData getM_trimeshShapeData () {
		long cPtr = gdxBulletJNI.btScaledTriangleMeshShapeData_m_trimeshShapeData_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTriangleMeshShapeData(cPtr, false);
	}

	public void setM_localScaling (btVector3FloatData value) {
		gdxBulletJNI.btScaledTriangleMeshShapeData_m_localScaling_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
	}

	public btVector3FloatData getM_localScaling () {
		long cPtr = gdxBulletJNI.btScaledTriangleMeshShapeData_m_localScaling_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
	}

	public btScaledTriangleMeshShapeData () {
		this(gdxBulletJNI.new_btScaledTriangleMeshShapeData(), true);
	}

}
