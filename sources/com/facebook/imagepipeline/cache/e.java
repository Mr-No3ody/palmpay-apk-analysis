package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ValueDescriptor {
    @Override // com.facebook.imagepipeline.cache.ValueDescriptor
    public final int getSizeInBytes(Object obj) {
        return ((PooledByteBuffer) obj).size();
    }
}
