// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief An object representing a closure. This object is used by both the
 * Relay VM and interpreter.
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ClosureObj extends TVMObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public ClosureObj() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ClosureObj(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClosureObj(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ClosureObj position(long position) {
        return (ClosureObj)super.position(position);
    }
    @Override public ClosureObj getPointer(long i) {
        return new ClosureObj((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();
  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();
  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
}
