// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Stage values similar to a lightweight Enqueue.
 * 
 *  The basic functionality of this Op is similar to a queue with many
 *  fewer capabilities and options.  This Op is optimized for performance.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * values: a list of tensors
 *  dtypes A list of data types that inserted values should adhere to.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * capacity: Maximum number of elements in the Staging Area. If > 0, inserts
 *  on the container will block when the capacity is reached.
 *  * memory_limit: The maximum number of bytes allowed for Tensors in the Staging Area.
 *  If > 0, inserts will block until sufficient space is available.
 *  * container: If non-empty, this queue is placed in the given container. Otherwise,
 *  a default container is used.
 *  * shared_name: It is necessary to match this name to the matching Unstage Op.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Stage extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stage(Pointer p) { super(p); }

  /** Optional attribute setters for Stage */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Maximum number of elements in the Staging Area. If > 0, inserts
     *  on the container will block when the capacity is reached.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Capacity(@Cast("tensorflow::int64") long x);

    /** The maximum number of bytes allowed for Tensors in the Staging Area.
     *  If > 0, inserts will block until sufficient space is available.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs MemoryLimit(@Cast("tensorflow::int64") long x);

    /** If non-empty, this queue is placed in the given container. Otherwise,
     *  a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** It is necessary to match this name to the matching Unstage Op.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @Cast("tensorflow::int64") long capacity_(); public native Attrs capacity_(long setter);
    public native @Cast("tensorflow::int64") long memory_limit_(); public native Attrs memory_limit_(long setter);
    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public Stage(@Const @ByRef Scope scope, @ByVal InputList values) { super((Pointer)null); allocate(scope, values); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList values);
  public Stage(@Const @ByRef Scope scope, @ByVal InputList values, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, values, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList values, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs Capacity(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs MemoryLimit(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native Stage operation(Operation setter);
}
