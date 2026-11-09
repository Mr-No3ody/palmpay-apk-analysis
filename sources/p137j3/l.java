package p137j3;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f38242a = new SparseIntArray(0);

    public static final x a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new x(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, f38242a, -1);
    }
}
