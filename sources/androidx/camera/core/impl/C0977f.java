package androidx.camera.core.impl;

/* JADX INFO: renamed from: androidx.camera.core.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14057j;

    public C0977f(int i7, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f14048a = i7;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f14049b = str;
        this.f14050c = i10;
        this.f14051d = i11;
        this.f14052e = i12;
        this.f14053f = i13;
        this.f14054g = i14;
        this.f14055h = i15;
        this.f14056i = i16;
        this.f14057j = i17;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0977f) {
            C0977f c0977f = (C0977f) obj;
            if (this.f14048a == c0977f.f14048a && this.f14049b.equals(c0977f.f14049b) && this.f14050c == c0977f.f14050c && this.f14051d == c0977f.f14051d && this.f14052e == c0977f.f14052e && this.f14053f == c0977f.f14053f && this.f14054g == c0977f.f14054g && this.f14055h == c0977f.f14055h && this.f14056i == c0977f.f14056i && this.f14057j == c0977f.f14057j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f14048a ^ 1000003) * 1000003) ^ this.f14049b.hashCode()) * 1000003) ^ this.f14050c) * 1000003) ^ this.f14051d) * 1000003) ^ this.f14052e) * 1000003) ^ this.f14053f) * 1000003) ^ this.f14054g) * 1000003) ^ this.f14055h) * 1000003) ^ this.f14056i) * 1000003) ^ this.f14057j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoProfileProxy{codec=");
        sb2.append(this.f14048a);
        sb2.append(", mediaType=");
        sb2.append(this.f14049b);
        sb2.append(", bitrate=");
        sb2.append(this.f14050c);
        sb2.append(", frameRate=");
        sb2.append(this.f14051d);
        sb2.append(", width=");
        sb2.append(this.f14052e);
        sb2.append(", height=");
        sb2.append(this.f14053f);
        sb2.append(", profile=");
        sb2.append(this.f14054g);
        sb2.append(", bitDepth=");
        sb2.append(this.f14055h);
        sb2.append(", chromaSubsampling=");
        sb2.append(this.f14056i);
        sb2.append(", hdrFormat=");
        return C0.G.n(this.f14057j, "}", sb2);
    }
}
