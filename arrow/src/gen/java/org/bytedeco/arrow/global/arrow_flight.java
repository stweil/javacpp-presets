// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow.global;

import org.bytedeco.arrow_flight.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

public class arrow_flight extends org.bytedeco.arrow.presets.arrow_flight {
    static { Loader.load(); }

// Targeting ../../arrow_flight/ClientMiddlewareFactoryVector.java


// Targeting ../../arrow_flight/ServerMiddlewareFactoryStringPairVector.java


// Targeting ../../arrow_flight/ServerMiddlewareFactoryStringPair.java


// Parsed from arrow/result.h

//
// Copyright 2017 Asylo authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Adapted from Asylo

// #pragma once

// #include <cstddef>
// #include <new>
// #include <string>
// #include <type_traits>
// #include <utility>

// #include "arrow/status.h"
// #include "arrow/util/aligned_storage.h"
// #include "arrow/util/compare.h"
// Targeting ../../arrow_flight/EnsureResult.java



@Namespace("arrow::internal") public static native void DieWithMessage(@StdString String msg);
@Namespace("arrow::internal") public static native void DieWithMessage(@StdString BytePointer msg);

@Namespace("arrow::internal") public static native void InvalidValueOrDie(@Const @ByRef Status st);


// Targeting ../../arrow_flight/FlightInfoResult.java



// #define ARROW_ASSIGN_OR_RAISE_IMPL(result_name, lhs, rexpr)
//   auto&& result_name = (rexpr);
//   ARROW_RETURN_IF_(!(result_name).ok(), (result_name).status(), ARROW_STRINGIFY(rexpr));
//   lhs = std::move(result_name).ValueUnsafe();


///
///
///
///
///
// #define ARROW_ASSIGN_OR_RAISE_NAME(x, y) ARROW_CONCAT(x, y)

/** \brief Execute an expression that returns a Result, extracting its value
 *  into the variable defined by {@code lhs} (or returning a Status on error).
 * 
 *  Example: Assigning to a new value:
 *    ARROW_ASSIGN_OR_RAISE(auto value, MaybeGetValue(arg));
 * 
 *  Example: Assigning to an existing value:
 *    ValueType value;
 *    ARROW_ASSIGN_OR_RAISE(value, MaybeGetValue(arg));
 * 
 *  WARNING: ARROW_ASSIGN_OR_RAISE expands into multiple statements;
 *  it cannot be used in a single statement (e.g. as the body of an if
 *  statement without {})!
 * 
 *  WARNING: ARROW_ASSIGN_OR_RAISE {@code std::move}s its right operand. If you have
 *  an lvalue Result which you *don't* want to move out of cast appropriately.
 * 
 *  WARNING: ARROW_ASSIGN_OR_RAISE is not a single expression; it will not
 *  maintain lifetimes of all temporaries in {@code rexpr} (e.g.
 *  {@code ARROW_ASSIGN_OR_RAISE(auto x, MakeTemp().GetResultRef());}
 *  will most likely segfault)! */
// #define ARROW_ASSIGN_OR_RAISE(lhs, rexpr)
//   ARROW_ASSIGN_OR_RAISE_IMPL(ARROW_ASSIGN_OR_RAISE_NAME(_error_or_value, __COUNTER__),
//                              lhs, rexpr);

  // namespace internal

  // namespace arrow


// Parsed from arrow/flight/api.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include "arrow/flight/client.h"
// #include "arrow/flight/client_auth.h"
// #include "arrow/flight/client_middleware.h"
// #include "arrow/flight/middleware.h"
// #include "arrow/flight/server.h"
// #include "arrow/flight/server_auth.h"
// #include "arrow/flight/server_middleware.h"
// #include "arrow/flight/types.h"


// Parsed from arrow/flight/visibility.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #if defined(_WIN32) || defined(__CYGWIN__)
// #if defined(_MSC_VER)
// #pragma warning(push)
// #pragma warning(disable : 4251)
// #else
// #pragma GCC diagnostic ignored "-Wattributes"
// #endif

// #ifdef ARROW_FLIGHT_STATIC
// #define ARROW_FLIGHT_EXPORT
// #elif defined(ARROW_FLIGHT_EXPORTING)
// #define ARROW_FLIGHT_EXPORT __declspec(dllexport)
// #else
// #define ARROW_FLIGHT_EXPORT __declspec(dllimport)
// #endif

// #define ARROW_FLIGHT_NO_EXPORT
// #else  // Not Windows
// #ifndef ARROW_FLIGHT_EXPORT
// #define ARROW_FLIGHT_EXPORT __attribute__((visibility("default")))
// #endif
// #ifndef ARROW_FLIGHT_NO_EXPORT
// #define ARROW_FLIGHT_NO_EXPORT __attribute__((visibility("hidden")))
// #endif
// #endif  // Non-Windows

// #if defined(_MSC_VER)
// #pragma warning(pop)
// #endif


// Parsed from arrow/flight/types.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// Data structure for Flight RPC. API should be considered experimental for now

// #pragma once

// #include <cstddef>
// #include <cstdint>
// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/flight/visibility.h"
// #include "arrow/ipc/options.h"
// #include "arrow/ipc/writer.h"
// #include "arrow/result.h"


// Targeting ../../arrow_flight/Uri.java



  // namespace internal

/** \brief A Flight-specific status code. */
@Namespace("arrow::flight") public enum FlightStatusCode {
  /** An implementation error has occurred. */
  Internal((byte)(0)),
  /** A request timed out. */
  TimedOut((byte)(1)),
  /** A request was cancelled. */
  Cancelled((byte)(2)),
  /** We are not authenticated to the remote service. */
  Unauthenticated((byte)(3)),
  /** We do not have permission to make this request. */
  Unauthorized((byte)(4)),
  /** The remote service cannot handle this request at the moment. */
  Unavailable((byte)(5)),
  /** A request failed for some other reason */
  Failed((byte)(6));

    public final byte value;
    private FlightStatusCode(byte v) { this.value = v; }
    private FlightStatusCode(FlightStatusCode e) { this.value = e.value; }
    public FlightStatusCode intern() { for (FlightStatusCode e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}

// Silence warning
// "non dll-interface class RecordBatchReader used as base for dll-interface class"
// #ifdef _MSC_VER
// #pragma warning(push)
// #pragma warning(disable : 4275)
// Targeting ../../arrow_flight/FlightStatusDetail.java



// #ifdef _MSC_VER

///
// #pragma warning(pop)
// #endif

/** \brief Make an appropriate Arrow status for the given
 *  Flight-specific status.
 * 
 *  @param code The Flight status code.
 *  @param message The message for the error.
 *  @param extra_info Optional extra binary info for the error (eg protobuf) */
@Namespace("arrow::flight") public static native @ByVal Status MakeFlightError(FlightStatusCode code, @StdString String message,
                       @StdString String extra_info/*={}*/);
@Namespace("arrow::flight") public static native @ByVal Status MakeFlightError(FlightStatusCode code, @StdString String message);
@Namespace("arrow::flight") public static native @ByVal Status MakeFlightError(@Cast("arrow::flight::FlightStatusCode") byte code, @StdString BytePointer message,
                       @StdString BytePointer extra_info/*={}*/);
@Namespace("arrow::flight") public static native @ByVal Status MakeFlightError(@Cast("arrow::flight::FlightStatusCode") byte code, @StdString BytePointer message);
// Targeting ../../arrow_flight/CertKeyPair.java


// Targeting ../../arrow_flight/ActionType.java


// Targeting ../../arrow_flight/Criteria.java


// Targeting ../../arrow_flight/Action.java


// Targeting ../../arrow_flight/Result.java


// Targeting ../../arrow_flight/BasicAuth.java


// Targeting ../../arrow_flight/FlightDescriptor.java


// Targeting ../../arrow_flight/Ticket.java



@Namespace("arrow::flight") @MemberGetter public static native String kSchemeGrpc();
@Namespace("arrow::flight") @MemberGetter public static native String kSchemeGrpcTcp();
@Namespace("arrow::flight") @MemberGetter public static native String kSchemeGrpcUnix();
@Namespace("arrow::flight") @MemberGetter public static native String kSchemeGrpcTls();
// Targeting ../../arrow_flight/Location.java


// Targeting ../../arrow_flight/FlightEndpoint.java


// Targeting ../../arrow_flight/FlightPayload.java


// Targeting ../../arrow_flight/SchemaResult.java


// Targeting ../../arrow_flight/FlightInfo.java


// Targeting ../../arrow_flight/FlightListing.java


// Targeting ../../arrow_flight/ResultStream.java


// Targeting ../../arrow_flight/FlightStreamChunk.java


// Targeting ../../arrow_flight/MetadataRecordBatchReader.java



/** \brief Convert a MetadataRecordBatchReader to a regular RecordBatchReader. */
@Namespace("arrow::flight") public static native @ByVal RecordBatchReaderSharedResult MakeRecordBatchReader(
    @SharedPtr MetadataRecordBatchReader reader);
// Targeting ../../arrow_flight/MetadataRecordBatchWriter.java


// Targeting ../../arrow_flight/SimpleFlightListing.java


// Targeting ../../arrow_flight/SimpleResultStream.java



  // namespace flight
  // namespace arrow


// Parsed from arrow/flight/client_auth.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <string>

// #include "arrow/flight/visibility.h"
// #include "arrow/status.h"
// Targeting ../../arrow_flight/ClientAuthReader.java


// Targeting ../../arrow_flight/ClientAuthSender.java


// Targeting ../../arrow_flight/ClientAuthHandler.java



  // namespace flight
  // namespace arrow


// Parsed from arrow/flight/client.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

/** \brief Implementation of Flight RPC client using gRPC. API should be */
// considered experimental for now

// #pragma once

// #include <chrono>
// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/ipc/options.h"
// #include "arrow/ipc/reader.h"
// #include "arrow/ipc/writer.h"
// #include "arrow/result.h"
// #include "arrow/status.h"
// #include "arrow/util/cancel.h"
// #include "arrow/util/variant.h"

// #include "arrow/flight/types.h"  // IWYU pragma: keep
// #include "arrow/flight/visibility.h"
// Targeting ../../arrow_flight/ClientMiddleware.java


// Targeting ../../arrow_flight/ClientMiddlewareFactory.java



/** \brief A duration type for Flight call timeouts. */
// Targeting ../../arrow_flight/FlightCallOptions.java


// Targeting ../../arrow_flight/FlightWriteSizeStatusDetail.java


// Targeting ../../arrow_flight/FlightClientOptions.java


// Targeting ../../arrow_flight/FlightStreamReader.java



// Silence warning
// "non dll-interface class RecordBatchReader used as base for dll-interface class"
// #ifdef _MSC_VER
// #pragma warning(push)
// #pragma warning(disable : 4275)
// Targeting ../../arrow_flight/FlightStreamWriter.java



// #ifdef _MSC_VER
// #pragma warning(pop)
// Targeting ../../arrow_flight/FlightMetadataReader.java


// Targeting ../../arrow_flight/FlightClient.java



  // namespace flight
  // namespace arrow


// Parsed from arrow/flight/server_auth.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

/** \brief Server-side APIs to implement authentication for Flight. */

// #pragma once

// #include <string>

// #include "arrow/flight/visibility.h"
// #include "arrow/status.h"
// Targeting ../../arrow_flight/ServerAuthReader.java


// Targeting ../../arrow_flight/ServerAuthSender.java


// Targeting ../../arrow_flight/ServerAuthHandler.java


// Targeting ../../arrow_flight/NoOpAuthHandler.java



  // namespace flight
  // namespace arrow


// Parsed from arrow/flight/server.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// Interfaces to use for defining Flight RPC servers. API should be considered
// experimental for now

// #pragma once

// #include <functional>
// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/flight/server_auth.h"
// #include "arrow/flight/types.h"       // IWYU pragma: keep
// #include "arrow/flight/visibility.h"  // IWYU pragma: keep
// #include "arrow/ipc/dictionary.h"
// #include "arrow/ipc/options.h"
// #include "arrow/record_batch.h"
// Targeting ../../arrow_flight/ServerMiddleware.java


// Targeting ../../arrow_flight/ServerMiddlewareFactory.java


// Targeting ../../arrow_flight/FlightDataStream.java


// Targeting ../../arrow_flight/RecordBatchStream.java


// Targeting ../../arrow_flight/FlightMessageReader.java


// Targeting ../../arrow_flight/FlightMetadataWriter.java


// Targeting ../../arrow_flight/FlightMessageWriter.java


// Targeting ../../arrow_flight/ServerCallContext.java


// Targeting ../../arrow_flight/FlightServerOptions.java


// Targeting ../../arrow_flight/FlightServerBase.java



  // namespace flight
  // namespace arrow


}
