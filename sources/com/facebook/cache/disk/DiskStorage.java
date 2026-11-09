package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public interface DiskStorage {

    public interface Entry {
        String getId();

        BinaryResource getResource();

        long getSize();

        long getTimestamp();
    }

    public interface Inserter {
        boolean cleanUp();

        BinaryResource commit(Object obj) throws IOException;

        BinaryResource commit(Object obj, long j6) throws IOException;

        void writeData(WriterCallback writerCallback, Object obj) throws IOException;
    }

    void clearAll() throws IOException;

    boolean contains(String str, Object obj) throws IOException;

    p136j2.c getDumpInfo() throws IOException;

    Collection<Entry> getEntries() throws IOException;

    @Nullable
    BinaryResource getResource(String str, Object obj) throws IOException;

    String getStorageName();

    Inserter insert(String str, Object obj) throws IOException;

    boolean isEnabled();

    boolean isExternal();

    void purgeUnexpectedResources();

    long remove(Entry entry) throws IOException;

    long remove(String str) throws IOException;

    boolean touch(String str, Object obj) throws IOException;
}
