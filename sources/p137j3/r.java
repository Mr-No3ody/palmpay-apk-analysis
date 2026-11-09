package p137j3;

import P0.c;
import android.util.SparseIntArray;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.MemoryChunk;
import com.facebook.imagepipeline.memory.PoolStatsTracker;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f38249o;

    public r(MemoryTrimmableRegistry memoryTrimmableRegistry, x xVar, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, xVar, poolStatsTracker);
        SparseIntArray sparseIntArray = xVar.f38279c;
        sparseIntArray.getClass();
        this.f38249o = new int[sparseIntArray.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = this.f38249o;
            if (i7 >= iArr.length) {
                this.f38215b.registerMemoryTrimmable(this);
                this.f38222j.setBasePool(this);
                return;
            } else {
                iArr[i7] = sparseIntArray.keyAt(i7);
                i7++;
            }
        }
    }

    @Override // p137j3.c
    public final void c(Object obj) {
        ((MemoryChunk) obj).close();
    }

    @Override // p137j3.c
    public final int e(int i7) {
        if (i7 <= 0) {
            throw new c(Integer.valueOf(i7));
        }
        for (int i10 : this.f38249o) {
            if (i10 >= i7) {
                return i10;
            }
        }
        return i7;
    }

    @Override // p137j3.c
    public final int f(Object obj) {
        return ((MemoryChunk) obj).getSize();
    }

    @Override // p137j3.c
    public final boolean j(Object obj) {
        return !((MemoryChunk) obj).isClosed();
    }

    @Override // p137j3.c
    public final int g(int i7) {
        return i7;
    }
}
