package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.ThreadSafe;
import p137j3.r;
import p137j3.x;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@ThreadSafe
@Nullsafe(a.f41451a)
public class NativeMemoryChunkPool extends r {
    @DoNotStrip
    public NativeMemoryChunkPool(MemoryTrimmableRegistry memoryTrimmableRegistry, x xVar, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, xVar, poolStatsTracker);
    }

    @Override // p137j3.c
    public final Object a(int i7) {
        return new NativeMemoryChunk(i7);
    }
}
