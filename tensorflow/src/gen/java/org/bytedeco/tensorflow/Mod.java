// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns element-wise remainder of division. This emulates C semantics in that
 * 
 *  the result here is consistent with a truncating divide. E.g.
 *  {@code tf.truncatediv(x, y) * y + truncate_mod(x, y) = x}.
 * 
 *  *NOTE*: {@code Mod} supports broadcasting. More about broadcasting
 *  [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Mod extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Mod(Pointer p) { super(p); }

  public Mod(@Const @ByRef Scope scope, @ByVal Input x,
      @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
      @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Mod operation(Operation setter);
  public native @ByRef Output z(); public native Mod z(Output setter);
}
