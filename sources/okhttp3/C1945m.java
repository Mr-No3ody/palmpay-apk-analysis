package okhttp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1945m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1944l f40947c = new C1944l(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1945m f40948d = new C1945m(CollectionsKt.b0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mg.e f40950b;

    public C1945m(Set pins, Mg.e eVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f40949a = pins;
        this.f40950b = eVar;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        kotlin.collections.z zVar = kotlin.collections.z.f38935a;
        Iterator it = this.f40949a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        zVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1945m)) {
            return false;
        }
        C1945m c1945m = (C1945m) obj;
        return Intrinsics.c(c1945m.f40949a, this.f40949a) && Intrinsics.c(c1945m.f40950b, this.f40950b);
    }

    public final int hashCode() {
        int iHashCode = (this.f40949a.hashCode() + 1517) * 41;
        Mg.e eVar = this.f40950b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
