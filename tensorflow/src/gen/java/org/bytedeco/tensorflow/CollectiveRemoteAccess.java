// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface of a helper object that provides a CollectiveExecutor with
// all of the remote access it needs.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveRemoteAccess extends PeerAccessInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveRemoteAccess(Pointer p) { super(p); }
    public DeviceResolverInterface asDeviceResolverInterface() { return asDeviceResolverInterface(this); }
    @Namespace public static native @Name("static_cast<tensorflow::DeviceResolverInterface*>") DeviceResolverInterface asDeviceResolverInterface(CollectiveRemoteAccess pointer);


  public native BufRendezvous buf_rendezvous();
}
