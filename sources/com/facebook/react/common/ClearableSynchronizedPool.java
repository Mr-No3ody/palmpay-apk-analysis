package com.facebook.react.common;

import androidx.core.util.Pools$Pool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/common/ClearableSynchronizedPool;", "T", "", "Landroidx/core/util/Pools$Pool;", "maxSize", "", "<init>", "(I)V", "pool", "", "[Ljava/lang/Object;", "size", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "clear", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClearableSynchronizedPool<T> implements Pools$Pool<T> {

    @NotNull
    private final Object[] pool;
    private int size;

    public ClearableSynchronizedPool(int i7) {
        this.pool = new Object[i7];
    }

    @Override // androidx.core.util.Pools$Pool
    @Nullable
    public synchronized T acquire() {
        int i7 = this.size;
        if (i7 == 0) {
            return null;
        }
        int i10 = i7 - 1;
        this.size = i10;
        T t = (T) this.pool[i10];
        Intrinsics.f(t, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.pool[i10] = null;
        return t;
    }

    public final synchronized void clear() {
        try {
            int i7 = this.size;
            for (int i10 = 0; i10 < i7; i10++) {
                this.pool[i10] = null;
            }
            this.size = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.core.util.Pools$Pool
    public synchronized boolean release(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i7 = this.size;
        Object[] objArr = this.pool;
        if (i7 == objArr.length) {
            return false;
        }
        objArr[i7] = instance;
        this.size = i7 + 1;
        return true;
    }
}
