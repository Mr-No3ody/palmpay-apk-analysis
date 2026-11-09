package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.internal.http2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1934e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pg.m f40812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pg.m f40813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pg.m f40814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pg.m f40815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pg.m f40816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pg.m f40817i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.m f40818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pg.m f40819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40820c;

    static {
        new C1933d(null);
        Pg.l lVar = Pg.m.f7359d;
        f40812d = lVar.encodeUtf8(":");
        f40813e = lVar.encodeUtf8(":status");
        f40814f = lVar.encodeUtf8(":method");
        f40815g = lVar.encodeUtf8(":path");
        f40816h = lVar.encodeUtf8(":scheme");
        f40817i = lVar.encodeUtf8(":authority");
    }

    public C1934e(Pg.m name, Pg.m value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f40818a = name;
        this.f40819b = value;
        this.f40820c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1934e)) {
            return false;
        }
        C1934e c1934e = (C1934e) obj;
        return Intrinsics.c(this.f40818a, c1934e.f40818a) && Intrinsics.c(this.f40819b, c1934e.f40819b);
    }

    public final int hashCode() {
        return this.f40819b.hashCode() + (this.f40818a.hashCode() * 31);
    }

    public final String toString() {
        return this.f40818a.l() + ": " + this.f40819b.l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1934e(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Pg.l lVar = Pg.m.f7359d;
        this(lVar.encodeUtf8(name), lVar.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1934e(Pg.m name, String value) {
        this(name, Pg.m.f7359d.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
