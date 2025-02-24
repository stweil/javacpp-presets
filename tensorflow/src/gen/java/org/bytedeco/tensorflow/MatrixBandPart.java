// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Copy a tensor setting everything outside a central band in each innermost matrix
 * 
 *  to zero.
 * 
 *  The {@code band} part is computed as follows:
 *  Assume {@code input} has {@code k} dimensions {@code [I, J, K, ..., M, N]}, then the output is a
 *  tensor with the same shape where
 * 
 *  {@code band[i, j, k, ..., m, n] = in_band(m, n) * input[i, j, k, ..., m, n]}.
 * 
 *  The indicator function
 * 
 *  {@code in_band(m, n) = (num_lower < 0 || (m-n) <= num_lower)) &&
 *                   (num_upper < 0 || (n-m) <= num_upper)}.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # if 'input' is [[ 0,  1,  2, 3]
 *                   [-1,  0,  1, 2]
 *                   [-2, -1,  0, 1]
 *                   [-3, -2, -1, 0]],
 * 
 *  tf.matrix_band_part(input, 1, -1) ==> [[ 0,  1,  2, 3]
 *                                         [-1,  0,  1, 2]
 *                                         [ 0, -1,  0, 1]
 *                                         [ 0,  0, -1, 0]],
 * 
 *  tf.matrix_band_part(input, 2, 1) ==> [[ 0,  1,  0, 0]
 *                                        [-1,  0,  1, 0]
 *                                        [-2, -1,  0, 1]
 *                                        [ 0, -2, -1, 0]]
 *  }</pre>
 * 
 *  Useful special cases:
 * 
 *  <pre>{@code
 *   tf.matrix_band_part(input, 0, -1) ==> Upper triangular part.
 *   tf.matrix_band_part(input, -1, 0) ==> Lower triangular part.
 *   tf.matrix_band_part(input, 0, 0) ==> Diagonal.
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Rank {@code k} tensor.
 *  * num_lower: 0-D tensor. Number of subdiagonals to keep. If negative, keep entire
 *  lower triangle.
 *  * num_upper: 0-D tensor. Number of superdiagonals to keep. If negative, keep
 *  entire upper triangle.
 * 
 *  Returns:
 *  * {@code Output}: Rank {@code k} tensor of the same shape as input. The extracted banded tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixBandPart extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixBandPart(Pointer p) { super(p); }

  public MatrixBandPart(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input num_lower, @ByVal Input num_upper) { super((Pointer)null); allocate(scope, input, num_lower, num_upper); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input num_lower, @ByVal Input num_upper);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MatrixBandPart operation(Operation setter);
  public native @ByRef Output band(); public native MatrixBandPart band(Output setter);
}
