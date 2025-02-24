// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;

@Name("std::map<std::string,std::shared_ptr<parquet::ColumnDecryptionProperties> >") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ColumnDecryptionPropertiesStringMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColumnDecryptionPropertiesStringMap(Pointer p) { super(p); }
    public ColumnDecryptionPropertiesStringMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ColumnDecryptionPropertiesStringMap put(@ByRef ColumnDecryptionPropertiesStringMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @SharedPtr ColumnDecryptionProperties get(@StdString String i);
    public native ColumnDecryptionPropertiesStringMap put(@StdString String i, ColumnDecryptionProperties value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString String first();
        public native @Name("operator *().second") @MemberGetter @SharedPtr @Const ColumnDecryptionProperties second();
    }
}

