// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;




////// specialized implementations of DefaultDeleter::operator() for classic OpenCV types //////

@Name("cv::DefaultDeleter<CvMat>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvMatDefaultDeleter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMatDefaultDeleter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMatDefaultDeleter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMatDefaultDeleter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvMatDefaultDeleter position(long position) {
        return (CvMatDefaultDeleter)super.position(position);
    }
    @Override public CvMatDefaultDeleter getPointer(long i) {
        return new CvMatDefaultDeleter((Pointer)this).offsetAddress(i);
    }
 public native @Name("operator ()") void apply(CvMat obj); }
