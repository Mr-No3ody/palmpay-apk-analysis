package androidx.camera.core.impl.utils;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14222b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.f14221a) {
            case 0:
                int i7 = this.f14222b;
                l[] lVarArr = j.f14230c;
                return i7 < 4;
            default:
                int i10 = this.f14222b;
                l[] lVarArr2 = j.f14230c;
                return i10 < 4;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f14221a) {
            case 0:
                HashMap map = new HashMap();
                for (l lVar : j.f14231d[this.f14222b]) {
                    map.put(lVar.f14243b, lVar);
                }
                this.f14222b++;
                return map;
            default:
                this.f14222b++;
                return new HashMap();
        }
    }
}
