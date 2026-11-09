package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
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
@TargetApi(27)
@Nullsafe(a.f41451a)
public class AshmemMemoryChunkPool extends r {
    @DoNotStrip
    public AshmemMemoryChunkPool(MemoryTrimmableRegistry memoryTrimmableRegistry, x xVar, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, xVar, poolStatsTracker);
    }

    @Override // p137j3.c
    public final Object a(int i7) {
        return new p137j3.a(i7);
    }
}
