// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STCensusRadius extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STCensusRadius() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STCensusRadius(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STCensusRadius(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STCensusRadius position(long position) {
        return (STCensusRadius)super.position(position);
    }
    @Override public STCensusRadius getPointer(long i) {
        return new STCensusRadius((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int uDiameter(); public native STCensusRadius uDiameter(int setter);
    public native @Cast("uint32_t") int vDiameter(); public native STCensusRadius vDiameter(int setter);
}
