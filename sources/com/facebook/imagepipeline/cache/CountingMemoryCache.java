package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.Nullable;
import p045d3.i;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public interface CountingMemoryCache<K, V> extends MemoryCache<K, V>, MemoryTrimmable {

    public interface EntryStateObserver<K> {
        void onExclusivityChanged(K k2, boolean z3);
    }

    @Nullable
    CloseableReference cache(K k2, CloseableReference closeableReference, EntryStateObserver<K> entryStateObserver);

    void clear();

    @Nullable
    p045d3.e getCachedEntries();

    int getEvictionQueueCount();

    int getEvictionQueueSizeInBytes();

    int getInUseSizeInBytes();

    i getMemoryCacheParams();

    @Nullable
    Map<Bitmap, Object> getOtherEntries();

    void maybeEvictEntries();

    @Nullable
    CloseableReference reuse(K k2);
}
