package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.common.disk.DiskTrimmable;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public interface FileCache extends DiskTrimmable {
    void clearAll();

    long clearOldEntries(long j6);

    long getCount();

    p136j2.c getDumpInfo() throws IOException;

    @Nullable
    BinaryResource getResource(CacheKey cacheKey);

    long getSize();

    boolean hasKey(CacheKey cacheKey);

    boolean hasKeySync(CacheKey cacheKey);

    @Nullable
    BinaryResource insert(CacheKey cacheKey, WriterCallback writerCallback) throws IOException;

    boolean isEnabled();

    boolean probe(CacheKey cacheKey);

    void remove(CacheKey cacheKey);
}
