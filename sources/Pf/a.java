package Pf;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends d {
    @Override // Pf.d
    public final int a(int i7) {
        return ((-i7) >> 31) & (e().nextInt() >>> (32 - i7));
    }

    @Override // Pf.d
    public final int b() {
        return e().nextInt();
    }

    @Override // Pf.d
    public final int c(int i7) {
        return e().nextInt(i7);
    }

    public abstract Random e();
}
