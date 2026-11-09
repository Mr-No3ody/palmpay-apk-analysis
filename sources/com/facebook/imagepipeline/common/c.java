package com.facebook.imagepipeline.common;

import C0.G;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21424c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f21425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f21426b;

    static {
        p039cb.c cVar = new p039cb.c(4, false);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        cVar.f18901b = config;
        cVar.f18902c = config;
        f21424c = new c(cVar);
    }

    public c(p039cb.c cVar) {
        this.f21425a = (Bitmap.Config) cVar.f18901b;
        this.f21426b = (Bitmap.Config) cVar.f18902c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21425a == cVar.f21425a && this.f21426b == cVar.f21426b;
    }

    public final int hashCode() {
        int iOrdinal = (this.f21425a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.f21426b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageDecodeOptions{");
        androidx.camera.video.internal.c cVarM = p213o2.e.m(this);
        cVarM.a(100, "minDecodeIntervalMs");
        cVarM.a(Integer.MAX_VALUE, "maxDimensionPx");
        cVarM.b("decodePreviewFrame", false);
        cVarM.b("useLastFrameForPreview", false);
        cVarM.b("useEncodedImageForPreview", false);
        cVarM.b("decodeAllFrames", false);
        cVarM.b("forceStaticImage", false);
        cVarM.c(this.f21425a.name(), "bitmapConfigName");
        cVarM.c(this.f21426b.name(), "animatedBitmapConfigName");
        cVarM.c(null, "customImageDecoder");
        cVarM.c(null, "bitmapTransformation");
        cVarM.c(null, "colorSpace");
        return G.r(sb2, cVarM.toString(), "}");
    }
}
