package com.adjust.sdk.sig;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f19424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19426c;

    public c(d dVar, int i7, int i10) {
        this.f19424a = dVar;
        this.f19425b = i7;
        int iA = dVar.a();
        if (i7 < 0 || i10 > iA) {
            StringBuilder sbP = N8.q0.p(i7, "fromIndex: ", i10, ", toIndex: ", ", size: ");
            sbP.append(iA);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(i7, "fromIndex: ", i10, " > toIndex: "));
        }
        this.f19426c = i10 - i7;
    }

    @Override // com.adjust.sdk.sig.d
    public final int a() {
        return this.f19426c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i10 = this.f19426c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
        }
        return this.f19424a.get(this.f19425b + i7);
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final List subList(int i7, int i10) {
        int i11 = this.f19426c;
        if (i7 < 0 || i10 > i11) {
            StringBuilder sbP = N8.q0.p(i7, "fromIndex: ", i10, ", toIndex: ", ", size: ");
            sbP.append(i11);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(i7, "fromIndex: ", i10, " > toIndex: "));
        }
        d dVar = this.f19424a;
        int i12 = this.f19425b;
        return new c(dVar, i7 + i12, i12 + i10);
    }
}
