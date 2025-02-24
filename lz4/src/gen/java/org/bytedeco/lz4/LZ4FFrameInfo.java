// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.lz4;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.lz4.global.lz4.*;


// #ifdef LZ4F_ENABLE_OBSOLETE_ENUMS
// #endif

/** LZ4F_frameInfo_t :
 *  makes it possible to set or read frame parameters.
 *  Structure must be first init to 0, using memset() or LZ4F_INIT_FRAMEINFO,
 *  setting all parameters to default.
 *  It's then possible to update selectively some parameters */
@Name("LZ4F_frameInfo_t") @Properties(inherit = org.bytedeco.lz4.presets.lz4.class)
public class LZ4FFrameInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LZ4FFrameInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LZ4FFrameInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LZ4FFrameInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LZ4FFrameInfo position(long position) {
        return (LZ4FFrameInfo)super.position(position);
    }
    @Override public LZ4FFrameInfo getPointer(long i) {
        return new LZ4FFrameInfo((Pointer)this).offsetAddress(i);
    }

  public native @Cast("LZ4F_blockSizeID_t") int blockSizeID(); public native LZ4FFrameInfo blockSizeID(int setter);         /* max64KB, max256KB, max1MB, max4MB; 0 == default */
  public native @Cast("LZ4F_blockMode_t") int blockMode(); public native LZ4FFrameInfo blockMode(int setter);           /* LZ4F_blockLinked, LZ4F_blockIndependent; 0 == default */
  public native @Cast("LZ4F_contentChecksum_t") int contentChecksumFlag(); public native LZ4FFrameInfo contentChecksumFlag(int setter); /* 1: frame terminated with 32-bit checksum of decompressed data; 0: disabled (default) */
  public native @Cast("LZ4F_frameType_t") int frameType(); public native LZ4FFrameInfo frameType(int setter);           /* read-only field : LZ4F_frame or LZ4F_skippableFrame */
  public native @Cast("unsigned long long") long contentSize(); public native LZ4FFrameInfo contentSize(long setter);         /* Size of uncompressed content ; 0 == unknown */
  public native @Cast("unsigned") int dictID(); public native LZ4FFrameInfo dictID(int setter);              /* Dictionary ID, sent by compressor to help decoder select correct dictionary; 0 == no dictID provided */
  public native @Cast("LZ4F_blockChecksum_t") int blockChecksumFlag(); public native LZ4FFrameInfo blockChecksumFlag(int setter);   /* 1: each block followed by a checksum of block's compressed data; 0: disabled (default) */
}
