// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Thread compatible but not thread safe.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Graph extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Graph(Pointer p) { super(p); }

  // Constructs a graph with a single SOURCE (always id kSourceId) and a
  // single SINK (always id kSinkId) node, and an edge from SOURCE->SINK.
  //
  // The graph can hold ops found in the registry. `ops`s lifetime must be at
  // least that of the constructed graph's.
  public Graph(@Const OpRegistryInterface ops) { super((Pointer)null); allocate(ops); }
  private native void allocate(@Const OpRegistryInterface ops);

  // Constructs a graph with a single SOURCE (always id kSourceId) and a
  // single SINK (always id kSinkId) node, and an edge from SOURCE->SINK.
  //
  // The graph can hold ops found in `flib_def`. Unlike the constructor taking
  // an OpRegistryInterface, this constructor copies the function definitions in
  // `flib_def` so its lifetime may be shorter than that of the graph's. The
  // OpRegistryInterface backing `flib_def` must still have the lifetime of the
  // graph though.
  public Graph(@Const @ByRef FunctionLibraryDefinition flib_def) { super((Pointer)null); allocate(flib_def); }
  private native void allocate(@Const @ByRef FunctionLibraryDefinition flib_def);

  @MemberGetter public static native int kControlSlot();
  public static final int kControlSlot = kControlSlot();

  // The GraphDef version range of this graph (see graph.proto).
  public native @Const @ByRef VersionDef versions();
  public native void set_versions(@Const @ByRef VersionDef versions);

  // Adds a new node to this graph, and returns it. Infers the Op and
  // input/output types for the node. *this owns the returned instance.
  // Returns nullptr and sets *status on error.
  public native Node AddNode(@ByVal NodeDef node_def, Status status);

  // Copies *node, which may belong to another graph, to a new node,
  // which is returned.  Does not copy any edges.  *this owns the
  // returned instance.
  public native Node CopyNode(@Const Node node);

  // Removes a node from this graph, including all edges from or to it.
  // *node should not be accessed after calling this function.
  // REQUIRES: node->IsOp()
  public native void RemoveNode(Node node);

  // Adds an edge that connects the xth output of `source` to the yth input of
  // `dest` and returns it. Does not update dest's NodeDef.
  public native @Const Edge AddEdge(Node source, int x, Node dest, int y);

  // Adds a control edge (no data flows along this edge) that connects `source`
  // to `dest`. If `dest`s NodeDef is missing the corresponding control input,
  // adds the control input.
  //
  // If such a control edge already exists and `allow_duplicates` is false, no
  // edge is added and the function returns nullptr. Otherwise the edge is
  // unconditionally created and returned. The NodeDef is not updated if
  // `allow_duplicates` is true.
  // TODO(skyewm): // TODO(skyewm): allow_duplicates is needed only by
  // graph_partition.cc. Figure out if we can do away with it.
  public native @Const Edge AddControlEdge(Node source, Node dest,
                               @Cast("bool") boolean allow_duplicates/*=false*/);
  public native @Const Edge AddControlEdge(Node source, Node dest);

  // Removes edge from the graph. Does not update the destination node's
  // NodeDef.
  // REQUIRES: The edge must exist.
  public native void RemoveEdge(@Const Edge edge);

  // Removes control edge `edge` from the graph. Note that this also updates
  // the corresponding NodeDef to reflect the change.
  // REQUIRES: The control edge must exist.
  public native void RemoveControlEdge(@Const Edge e);

  // Updates the input to a node.  The existing edge to `dst` is removed and an
  // edge from `new_src` to `dst` is created. The NodeDef associated with `dst`
  // is also updated.
  public native @ByVal Status UpdateEdge(Node new_src, int new_src_index, Node dst, int dst_index);

  // Like AddEdge but updates dst's NodeDef. Used to add an input edge to a
  // "While" op during gradient construction, see AddInputWhileHack in
  // python_api.h for more details.
  public native @ByVal Status AddWhileInputHack(Node new_src, int new_src_index, Node dst);

  // Adds the function and gradient definitions in `fdef_lib` to this graph's op
  // registry. Ignores duplicate functions, and returns a bad status if an
  // imported function differs from an existing function or op with the same
  // name.
  public native @ByVal Status AddFunctionLibrary(@Const @ByRef FunctionDefLibrary fdef_lib);

  // The number of live nodes in the graph.
  //
  // Because nodes can be removed from the graph, num_nodes() is often
  // smaller than num_node_ids(). If one needs to create an array of
  // nodes indexed by node ids, num_node_ids() should be used as the
  // array's size.
  public native int num_nodes();

  // The number of live nodes in the graph, excluding the Source and Sink nodes.
  public native int num_op_nodes();

  // The number of live edges in the graph.
  //
  // Because edges can be removed from the graph, num_edges() is often
  // smaller than num_edge_ids(). If one needs to create an array of
  // edges indexed by edge ids, num_edge_ids() should be used as the
  // array's size.
  public native int num_edges();

  // Serialize the nodes starting at `from_node_id` to a GraphDef.
  public native void ToGraphDefSubRange(GraphDef graph_def, int from_node_id);

  // Serialize to a GraphDef.
  public native void ToGraphDef(GraphDef graph_def);

  // This version can be called from debugger to inspect the graph content.
  // Use the previous version outside debug context for efficiency reasons.
  //
  // Note: We do not expose a DebugString() API, since GraphDef.DebugString() is
  // not defined in some TensorFlow builds.
  public native @ByVal GraphDef ToGraphDefDebug();

  // Generate new node name with the specified prefix that is unique
  // across this graph.
  public native @StdString BytePointer NewName(@StringPiece BytePointer prefix);
  public native @StdString String NewName(@StringPiece String prefix);

  // Access to the list of all nodes.  Example usage:
  //   for (Node* node : graph.nodes()) { ... }
  public native @ByVal NodeIterRange nodes();

  // Access to the list of all nodes, excluding the Source and Sink nodes.
  public native @ByVal NodeIterRange op_nodes();

  // Returns one more than the maximum id assigned to any node.
  public native int num_node_ids();

  // Returns the node associated with an id, or nullptr if no node
  // with that id (the node with that id was removed and the id has
  // not yet been re-used). *this owns the returned instance.
  // REQUIRES: 0 <= id < num_node_ids().
  public native Node FindNodeId(int id);

  // Returns one more than the maximum id assigned to any edge.
  public native int num_edge_ids();

  // Returns the Edge associated with an id, or nullptr if no edge
  // with that id (the node with that id was removed and the id has
  // not yet been re-used). *this owns the returned instance.
  // REQUIRES: 0 <= id < num_node_ids().
  public native @Const Edge FindEdgeId(int id);

  // Access to the set of all edges.  Example usage:
  //   for (const Edge* e : graph.edges()) { ... }
  public native @ByVal GraphEdgesIterable edges();

  // The pre-defined nodes.
  /** enum tensorflow::Graph:: */
  public static final int kSourceId = 0, kSinkId = 1;
  public native Node source_node();
  public native Node sink_node();

  public native @Const OpRegistryInterface op_registry();
  public native @Const @ByRef FunctionLibraryDefinition flib_def();

  public native void CheckDeviceNameIndex(int index);

  public native int InternDeviceName(@StdString BytePointer device_name);
  public native int InternDeviceName(@StdString String device_name);

  public native @StdString BytePointer get_assigned_device_name(@Const @ByRef Node node);

  public native void set_assigned_device_name_index(Node node, int device_name_index);

  public native void set_assigned_device_name(Node node, @StdString BytePointer device_name);
  public native void set_assigned_device_name(Node node, @StdString String device_name);

  // Returns OK if `node` is non-null and belongs to this graph
  public native @ByVal Status IsValidNode(@Const Node node);

  // Returns OK if IsValidNode(`node`) and `idx` is a valid output.  Does not
  // accept control outputs.
  public native @ByVal Status IsValidOutputTensor(@Const Node node, int idx);

  // Returns OK if IsValidNode(`node`) and `idx` a valid input.  Does not accept
  // control inputs.
  public native @ByVal Status IsValidInputTensor(@Const Node node, int idx);

  // Create and return a new WhileContext owned by this graph. This is called
  // when a new while loop is created. `frame_name` must be unique among
  // WhileContexts in this graph.
  public native @ByVal Status AddWhileContext(@StringPiece BytePointer frame_name, @ByVal NodeVector enter_nodes,
                           @ByVal NodeVector exit_nodes,
                           @ByVal OutputTensor cond_output,
                           @StdVector OutputTensor body_inputs,
                           @StdVector OutputTensor body_outputs,
                           @Cast("tensorflow::WhileContext**") PointerPointer result);
  public native @ByVal Status AddWhileContext(@StringPiece BytePointer frame_name, @ByVal NodeVector enter_nodes,
                           @ByVal NodeVector exit_nodes,
                           @ByVal OutputTensor cond_output,
                           @StdVector OutputTensor body_inputs,
                           @StdVector OutputTensor body_outputs,
                           @ByPtrPtr WhileContext result);
  public native @ByVal Status AddWhileContext(@StringPiece String frame_name, @ByVal NodeVector enter_nodes,
                           @ByVal NodeVector exit_nodes,
                           @ByVal OutputTensor cond_output,
                           @StdVector OutputTensor body_inputs,
                           @StdVector OutputTensor body_outputs,
                           @ByPtrPtr WhileContext result);

  // Builds a node name to node pointer index for all nodes in the graph.
  public native @ByVal StringNodeMap BuildNodeNameIndex();
}
