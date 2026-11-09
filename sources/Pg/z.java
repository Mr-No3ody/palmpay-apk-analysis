package Pg;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f7396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f7397g;

    static {
        new y(null);
    }

    public z() {
        this.f7391a = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        this.f7395e = true;
        this.f7394d = false;
    }

    public final z a() {
        z zVar = this.f7396f;
        if (zVar == this) {
            zVar = null;
        }
        z zVar2 = this.f7397g;
        Intrinsics.e(zVar2);
        zVar2.f7396f = this.f7396f;
        z zVar3 = this.f7396f;
        Intrinsics.e(zVar3);
        zVar3.f7397g = this.f7397g;
        this.f7396f = null;
        this.f7397g = null;
        return zVar;
    }

    public final void b(z segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f7397g = this;
        segment.f7396f = this.f7396f;
        z zVar = this.f7396f;
        Intrinsics.e(zVar);
        zVar.f7397g = segment;
        this.f7396f = segment;
    }

    public final z c() {
        this.f7394d = true;
        return new z(this.f7391a, this.f7392b, this.f7393c, true, false);
    }

    public final void d(z sink, int i7) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f7395e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.f7393c;
        int i11 = i10 + i7;
        byte[] bArr = sink.f7391a;
        if (i11 > 8192) {
            if (sink.f7394d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f7392b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            C1846m.e(bArr, 0, bArr, i12, i10);
            sink.f7393c -= sink.f7392b;
            sink.f7392b = 0;
        }
        int i13 = sink.f7393c;
        int i14 = this.f7392b;
        C1846m.e(this.f7391a, i13, bArr, i14, i14 + i7);
        sink.f7393c += i7;
        this.f7392b += i7;
    }

    public z(byte[] data, int i7, int i10, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f7391a = data;
        this.f7392b = i7;
        this.f7393c = i10;
        this.f7394d = z3;
        this.f7395e = z8;
    }
}
