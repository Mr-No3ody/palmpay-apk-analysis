package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f20925b = new m(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f20926c = new m(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f20927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f20928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f20929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f20931h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20932a;

    static {
        m mVar = new m(1);
        f20927d = mVar;
        f20928e = new m(3);
        f20929f = mVar;
        f20930g = com.bumptech.glide.load.g.a(mVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f20931h = true;
    }

    public /* synthetic */ m(int i7) {
        this.f20932a = i7;
    }

    public final int a(int i7, int i10, int i11, int i12) {
        switch (this.f20932a) {
            case 0:
                if (b(i7, i10, i11, i12) == 1.0f) {
                    return 2;
                }
                return f20925b.a(i7, i10, i11, i12);
            case 1:
                return 2;
            case 2:
                return f20931h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i7, int i10, int i11, int i12) {
        switch (this.f20932a) {
            case 0:
                return Math.min(1.0f, f20925b.b(i7, i10, i11, i12));
            case 1:
                return Math.max(i11 / i7, i12 / i10);
            case 2:
                if (f20931h) {
                    return Math.min(i11 / i7, i12 / i10);
                }
                int iMax = Math.max(i10 / i12, i7 / i11);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
