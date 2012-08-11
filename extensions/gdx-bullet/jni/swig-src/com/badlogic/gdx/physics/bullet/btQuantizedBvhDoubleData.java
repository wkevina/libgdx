/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btQuantizedBvhDoubleData {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btQuantizedBvhDoubleData (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btQuantizedBvhDoubleData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btQuantizedBvhDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_bvhAabbMin (btVector3DoubleData value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_bvhAabbMin_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getM_bvhAabbMin () {
		long cPtr = gdxBulletJNI.btQuantizedBvhDoubleData_m_bvhAabbMin_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setM_bvhAabbMax (btVector3DoubleData value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_bvhAabbMax_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getM_bvhAabbMax () {
		long cPtr = gdxBulletJNI.btQuantizedBvhDoubleData_m_bvhAabbMax_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setM_bvhQuantization (btVector3DoubleData value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_bvhQuantization_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getM_bvhQuantization () {
		long cPtr = gdxBulletJNI.btQuantizedBvhDoubleData_m_bvhQuantization_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setM_curNodeIndex (int value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_curNodeIndex_set(swigCPtr, this, value);
	}

	public int getM_curNodeIndex () {
		return gdxBulletJNI.btQuantizedBvhDoubleData_m_curNodeIndex_get(swigCPtr, this);
	}

	public void setM_useQuantization (int value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_useQuantization_set(swigCPtr, this, value);
	}

	public int getM_useQuantization () {
		return gdxBulletJNI.btQuantizedBvhDoubleData_m_useQuantization_get(swigCPtr, this);
	}

	public void setM_numContiguousLeafNodes (int value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_numContiguousLeafNodes_set(swigCPtr, this, value);
	}

	public int getM_numContiguousLeafNodes () {
		return gdxBulletJNI.btQuantizedBvhDoubleData_m_numContiguousLeafNodes_get(swigCPtr, this);
	}

	public void setM_numQuantizedContiguousNodes (int value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_numQuantizedContiguousNodes_set(swigCPtr, this, value);
	}

	public int getM_numQuantizedContiguousNodes () {
		return gdxBulletJNI.btQuantizedBvhDoubleData_m_numQuantizedContiguousNodes_get(swigCPtr, this);
	}

	public void setM_contiguousNodesPtr (btOptimizedBvhNodeDoubleData value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_contiguousNodesPtr_set(swigCPtr, this, btOptimizedBvhNodeDoubleData.getCPtr(value),
			value);
	}

	public btOptimizedBvhNodeDoubleData getM_contiguousNodesPtr () {
		long cPtr = gdxBulletJNI.btQuantizedBvhDoubleData_m_contiguousNodesPtr_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btOptimizedBvhNodeDoubleData(cPtr, false);
	}

	public void setM_quantizedContiguousNodesPtr (btQuantizedBvhNodeData value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_quantizedContiguousNodesPtr_set(swigCPtr, this,
			btQuantizedBvhNodeData.getCPtr(value), value);
	}

	public btQuantizedBvhNodeData getM_quantizedContiguousNodesPtr () {
		long cPtr = gdxBulletJNI.btQuantizedBvhDoubleData_m_quantizedContiguousNodesPtr_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btQuantizedBvhNodeData(cPtr, false);
	}

	public void setM_traversalMode (int value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_traversalMode_set(swigCPtr, this, value);
	}

	public int getM_traversalMode () {
		return gdxBulletJNI.btQuantizedBvhDoubleData_m_traversalMode_get(swigCPtr, this);
	}

	public void setM_numSubtreeHeaders (int value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_numSubtreeHeaders_set(swigCPtr, this, value);
	}

	public int getM_numSubtreeHeaders () {
		return gdxBulletJNI.btQuantizedBvhDoubleData_m_numSubtreeHeaders_get(swigCPtr, this);
	}

	public void setM_subTreeInfoPtr (btBvhSubtreeInfoData value) {
		gdxBulletJNI.btQuantizedBvhDoubleData_m_subTreeInfoPtr_set(swigCPtr, this, btBvhSubtreeInfoData.getCPtr(value), value);
	}

	public btBvhSubtreeInfoData getM_subTreeInfoPtr () {
		long cPtr = gdxBulletJNI.btQuantizedBvhDoubleData_m_subTreeInfoPtr_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btBvhSubtreeInfoData(cPtr, false);
	}

	public btQuantizedBvhDoubleData () {
		this(gdxBulletJNI.new_btQuantizedBvhDoubleData(), true);
	}

}
