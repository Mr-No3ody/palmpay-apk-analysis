package cn.tongdun.android.qgq9qg99.gqgg9q99qg9;

/* JADX INFO: loaded from: classes.dex */
public class qgq9qg99 {
    private static volatile qgq9qg99 qgqq999g;
    private volatile int gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private final Object f19089q999ggg99999qqggqqg9qg = new Object();
    private final Object qgq9qg99 = new Object();
    private byte[] qqggggg9g9q99q9gq;

    private qgq9qg99() {
    }

    public static qgq9qg99 q999ggg99999qqggqqg9qg() {
        if (qgqq999g == null) {
            synchronized (qgq9qg99.class) {
                try {
                    if (qgqq999g == null) {
                        qgqq999g = new qgq9qg99();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qgqq999g;
    }

    public final byte[] gqgg9q99qg9() {
        byte[] bArr;
        synchronized (this.f19089q999ggg99999qqggqqg9qg) {
            bArr = this.qqggggg9g9q99q9gq;
        }
        return bArr;
    }

    public final boolean qgq9qg99() {
        boolean z3;
        synchronized (this.qgq9qg99) {
            z3 = this.gqgg9q99qg9 == 0;
        }
        return z3;
    }

    public final void qgqq999g() {
        synchronized (this.f19089q999ggg99999qqggqqg9qg) {
            this.qqggggg9g9q99q9gq = null;
        }
        synchronized (this.qgq9qg99) {
            this.gqgg9q99qg9 = 0;
        }
    }

    public final boolean qqggggg9g9q99q9gq() {
        boolean z3;
        synchronized (this.qgq9qg99) {
            z3 = this.gqgg9q99qg9 == 2;
        }
        return z3;
    }

    public final void q999ggg99999qqggqqg9qg(int i7) {
        synchronized (this.qgq9qg99) {
            this.gqgg9q99qg9 = i7;
        }
    }

    public final void q999ggg99999qqggqqg9qg(byte[] bArr) {
        synchronized (this.f19089q999ggg99999qqggqqg9qg) {
            this.qqggggg9g9q99q9gq = bArr;
        }
    }

    public final boolean q999ggg99999qqggqqg9qg(int i7, int i10) {
        boolean z3;
        synchronized (this.qgq9qg99) {
            try {
                z3 = true;
                if (this.gqgg9q99qg9 != 1) {
                    z3 = false;
                }
                if (z3) {
                    this.gqgg9q99qg9 = 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
