package p137j3;

import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38213b;

    public final void a(int i7) {
        int i10;
        int i11 = this.f38213b;
        if (i11 < i7 || (i10 = this.f38212a) <= 0) {
            a.z("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i7), Integer.valueOf(this.f38213b), Integer.valueOf(this.f38212a));
        } else {
            this.f38212a = i10 - 1;
            this.f38213b = i11 - i7;
        }
    }
}
