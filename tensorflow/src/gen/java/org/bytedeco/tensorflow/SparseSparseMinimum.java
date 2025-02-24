// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the element-wise min of two SparseTensors.
 * 
 *  Assumes the two SparseTensors have the same shape, i.e., no broadcasting.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * a_indices: 2-D.  {@code N x R} matrix with the indices of non-empty values in a
 *  SparseTensor, in the canonical lexicographic ordering.
 *  * a_values: 1-D.  {@code N} non-empty values corresponding to {@code a_indices}.
 *  * a_shape: 1-D.  Shape of the input SparseTensor.
 *  * b_indices: counterpart to {@code a_indices} for the other operand.
 *  * b_values: counterpart to {@code a_values} for the other operand; must be of the same dtype.
 *  * b_shape: counterpart to {@code a_shape} for the other operand; the two shapes must be equal.
 * 
 *  Returns:
 *  * {@code Output} output_indices: 2-D.  The indices of the output SparseTensor.
 *  * {@code Output} output_values: 1-D.  The values of the output SparseTensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSparseMinimum extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSparseMinimum(Pointer p) { super(p); }

  public SparseSparseMinimum(@Const @ByRef Scope scope, @ByVal Input a_indices, @ByVal Input a_values,
                      @ByVal Input a_shape, @ByVal Input b_indices,
                      @ByVal Input b_values, @ByVal Input b_shape) { super((Pointer)null); allocate(scope, a_indices, a_values, a_shape, b_indices, b_values, b_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a_indices, @ByVal Input a_values,
                      @ByVal Input a_shape, @ByVal Input b_indices,
                      @ByVal Input b_values, @ByVal Input b_shape);

  public native @ByRef Operation operation(); public native SparseSparseMinimum operation(Operation setter);
  public native @ByRef Output output_indices(); public native SparseSparseMinimum output_indices(Output setter);
  public native @ByRef Output output_values(); public native SparseSparseMinimum output_values(Output setter);
}
