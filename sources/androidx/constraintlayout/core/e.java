package androidx.constraintlayout.core;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Pools$Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f15104a = new Object[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15105b;

    @Override // androidx.constraintlayout.core.Pools$Pool
    public final Object acquire() {
        int i7 = this.f15105b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object[] objArr = this.f15104a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f15105b = i7 - 1;
        return obj;
    }

    @Override // androidx.constraintlayout.core.Pools$Pool
    public final boolean release(Object obj) {
        int i7 = this.f15105b;
        Object[] objArr = this.f15104a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f15105b = i7 + 1;
        return true;
    }

    @Override // androidx.constraintlayout.core.Pools$Pool
    public final void releaseAll(Object[] objArr, int i7) {
        if (i7 > objArr.length) {
            i7 = objArr.length;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[i10];
            int i11 = this.f15105b;
            Object[] objArr2 = this.f15104a;
            if (i11 < objArr2.length) {
                objArr2[i11] = obj;
                this.f15105b = i11 + 1;
            }
        }
    }
}
