// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_Profiler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_Profiler(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TFE_Profiler(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TFE_Profiler position(long position) {
        return (TFE_Profiler)super.position(position);
    }
    @Override public TFE_Profiler getPointer(long i) {
        return new TFE_Profiler((Pointer)this).offsetAddress(i);
    }

  public TFE_Profiler() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @MoveUniquePtr ProfilerSession profiler(); public native TFE_Profiler profiler(ProfilerSession setter);
}
