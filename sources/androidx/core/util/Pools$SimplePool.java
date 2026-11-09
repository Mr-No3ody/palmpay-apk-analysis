package androidx.core.util;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements Pools$Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f16157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16158b;

    public Pools$SimplePool(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f16157a = new Object[i7];
    }

    @Override // androidx.core.util.Pools$Pool
    public Object acquire() {
        int i7 = this.f16158b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object[] objArr = this.f16157a;
        Object obj = objArr[i10];
        Intrinsics.f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f16158b--;
        return obj;
    }

    @Override // androidx.core.util.Pools$Pool
    public boolean release(Object instance) {
        Object[] objArr;
        boolean z3;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i7 = this.f16158b;
        int i10 = 0;
        while (true) {
            objArr = this.f16157a;
            if (i10 >= i7) {
                z3 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z3 = true;
                break;
            }
            i10++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f16158b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f16158b = i11 + 1;
        return true;
    }
}
