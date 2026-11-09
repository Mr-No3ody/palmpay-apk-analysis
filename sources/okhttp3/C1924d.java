package okhttp3;

import Pg.AbstractC0555b;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: renamed from: okhttp3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1924d extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eg.j f40711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pg.x f40714d;

    public C1924d(Eg.j snapshot, String str, String str2) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f40711a = snapshot;
        this.f40712b = str;
        this.f40713c = str2;
        this.f40714d = AbstractC0555b.c(new C1923c((Source) snapshot.f2460c.get(1), this));
    }

    @Override // okhttp3.h0
    public final long contentLength() {
        String str = this.f40713c;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = Dg.c.f1879a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // okhttp3.h0
    public final L contentType() {
        String str = this.f40712b;
        if (str != null) {
            return L.f40589e.parse(str);
        }
        return null;
    }

    @Override // okhttp3.h0
    public final BufferedSource source() {
        return this.f40714d;
    }
}
