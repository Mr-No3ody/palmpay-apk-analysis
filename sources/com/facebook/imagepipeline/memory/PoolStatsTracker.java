package com.facebook.imagepipeline.memory;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137j3.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/facebook/imagepipeline/memory/PoolStatsTracker;", "", "Lj3/c;", "basePool", "", "setBasePool", "(Lj3/c;)V", "", "bucketedSize", "onValueReuse", "(I)V", "onSoftCapReached", "()V", "onHardCapReached", "size", "onAlloc", "sizeInBytes", "onFree", "onValueRelease", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PoolStatsTracker {
    void onAlloc(int size);

    void onFree(int sizeInBytes);

    void onHardCapReached();

    void onSoftCapReached();

    void onValueRelease(int sizeInBytes);

    void onValueReuse(int bucketedSize);

    void setBasePool(@NotNull c basePool);
}
