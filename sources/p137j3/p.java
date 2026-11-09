package p137j3;

import android.util.SparseIntArray;
import com.facebook.common.memory.ByteArrayPool;
import kotlin.jvm.internal.Intrinsics;
import p262r2.c;

/* JADX INFO: loaded from: classes.dex */
public class p extends c implements ByteArrayPool {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f38244o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c memoryTrimmableRegistry, x poolParams, u poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f38279c;
        if (sparseIntArray != null) {
            this.f38244o = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f38244o[i7] = sparseIntArray.keyAt(i7);
            }
        } else {
            this.f38244o = new int[0];
        }
        this.f38215b.registerMemoryTrimmable(this);
        this.f38222j.setBasePool(this);
    }

    @Override // p137j3.c
    public final Object a(int i7) {
        return new byte[i7];
    }

    @Override // p137j3.c
    public final void c(Object obj) {
        byte[] value = (byte[]) obj;
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // p137j3.c
    public final int e(int i7) {
        if (i7 <= 0) {
            throw new P0.c(Integer.valueOf(i7));
        }
        for (int i10 : this.f38244o) {
            if (i10 >= i7) {
                return i10;
            }
        }
        return i7;
    }

    @Override // p137j3.c
    public final int f(Object obj) {
        byte[] value = (byte[]) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    @Override // p137j3.c
    public final int g(int i7) {
        return i7;
    }
}
