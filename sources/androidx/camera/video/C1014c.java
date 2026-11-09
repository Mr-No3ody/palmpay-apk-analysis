package androidx.camera.video;

import android.util.Range;

/* JADX INFO: renamed from: androidx.camera.video.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1014c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f14580f = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Range f14581g = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Range f14582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f14585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14586e;

    static {
        C1013b c1013bA = a();
        c1013bA.f14579e = 0;
        c1013bA.a();
    }

    public C1014c(Range range, int i7, int i10, Range range2, int i11) {
        this.f14582a = range;
        this.f14583b = i7;
        this.f14584c = i10;
        this.f14585d = range2;
        this.f14586e = i11;
    }

    public static C1013b a() {
        C1013b c1013b = new C1013b();
        c1013b.f14576b = -1;
        c1013b.f14577c = -1;
        c1013b.f14579e = -1;
        Range range = f14580f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        c1013b.f14575a = range;
        Range range2 = f14581g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        c1013b.f14578d = range2;
        return c1013b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1014c) {
            C1014c c1014c = (C1014c) obj;
            if (this.f14582a.equals(c1014c.f14582a) && this.f14583b == c1014c.f14583b && this.f14584c == c1014c.f14584c && this.f14585d.equals(c1014c.f14585d) && this.f14586e == c1014c.f14586e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f14582a.hashCode() ^ 1000003) * 1000003) ^ this.f14583b) * 1000003) ^ this.f14584c) * 1000003) ^ this.f14585d.hashCode()) * 1000003) ^ this.f14586e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpec{bitrate=");
        sb2.append(this.f14582a);
        sb2.append(", sourceFormat=");
        sb2.append(this.f14583b);
        sb2.append(", source=");
        sb2.append(this.f14584c);
        sb2.append(", sampleRate=");
        sb2.append(this.f14585d);
        sb2.append(", channelCount=");
        return C0.G.n(this.f14586e, "}", sb2);
    }
}
