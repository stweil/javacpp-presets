// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.flandmark;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.flandmark.global.flandmark.*;


@Properties(inherit = org.bytedeco.flandmark.presets.flandmark.class)
public class FLANDMARK_PSIG extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FLANDMARK_PSIG() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FLANDMARK_PSIG(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FLANDMARK_PSIG(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FLANDMARK_PSIG position(long position) {
        return (FLANDMARK_PSIG)super.position(position);
    }
    @Override public FLANDMARK_PSIG getPointer(long i) {
        return new FLANDMARK_PSIG((Pointer)this).offsetAddress(i);
    }

    public native IntPointer disp(); public native FLANDMARK_PSIG disp(IntPointer setter);
    public native int ROWS(); public native FLANDMARK_PSIG ROWS(int setter);
    public native int COLS(); public native FLANDMARK_PSIG COLS(int setter);
}
