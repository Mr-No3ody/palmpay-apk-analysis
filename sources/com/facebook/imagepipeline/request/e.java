package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.i;
import com.facebook.imagepipeline.listener.RequestListener;
import java.util.HashSet;
import java.util.Iterator;
import p061e3.o;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final HashSet t = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f21664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f21665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f21667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f21668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.facebook.imagepipeline.common.c f21669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f21670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.facebook.imagepipeline.common.e f21674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Postprocessor f21675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f21676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RequestListener f21677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.facebook.imagepipeline.common.b f21678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f21679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p061e3.i f21680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f21682s;

    public static e b(d dVar) {
        e eVarD = d(dVar.getSourceUri());
        eVarD.f21669f = dVar.getImageDecodeOptions();
        eVarD.f21678o = dVar.getBytesRange();
        eVarD.f21670g = dVar.getCacheChoice();
        eVarD.f21672i = dVar.getLocalThumbnailPreviewsEnabled();
        eVarD.f21673j = dVar.getLoadThumbnailOnlyForAndroidSdkAboveQ();
        eVarD.f21665b = dVar.getLowestPermittedRequestLevel();
        eVarD.f21666c = dVar.getCachesDisabled();
        if (eVarD.f21670g != b.f21657c) {
            eVarD.f21682s = null;
        }
        eVarD.f21675l = dVar.getPostprocessor();
        eVarD.f21671h = dVar.getProgressiveRenderingEnabled();
        eVarD.f21674k = dVar.getPriority();
        eVarD.f21667d = dVar.getResizeOptions();
        eVarD.f21677n = dVar.getRequestListener();
        eVarD.f21668e = dVar.getRotationOptions();
        eVarD.f21676m = dVar.shouldDecodePrefetches();
        eVarD.f21681r = dVar.getDelayMs();
        eVarD.f21682s = dVar.getDiskCacheId();
        eVarD.f21680q = dVar.getDownsampleOverride();
        eVarD.f21679p = dVar.getResizingAllowedOverride();
        return eVarD;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = t;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static e d(Uri uri) {
        e eVar = new e();
        eVar.f21664a = null;
        eVar.f21665b = c.FULL_FETCH;
        eVar.f21666c = 0;
        eVar.f21667d = null;
        eVar.f21668e = null;
        eVar.f21669f = com.facebook.imagepipeline.common.c.f21424c;
        eVar.f21670g = b.f21656b;
        o.f36052D.getDefaultImageRequestConfig().getClass();
        eVar.f21671h = false;
        eVar.f21672i = false;
        eVar.f21673j = false;
        eVar.f21674k = com.facebook.imagepipeline.common.e.f21430d;
        eVar.f21675l = null;
        eVar.f21676m = null;
        eVar.f21678o = null;
        eVar.f21679p = null;
        eVar.f21680q = null;
        eVar.f21682s = null;
        uri.getClass();
        eVar.f21664a = uri;
        return eVar;
    }

    public final d a() {
        Uri uri = this.f21664a;
        if (uri == null) {
            throw new P0.c("Source must be set!", 9);
        }
        if ("res".equals(p333w2.a.b(uri))) {
            if (!this.f21664a.isAbsolute()) {
                throw new P0.c("Resource URI path must be absolute.", 9);
            }
            if (this.f21664a.getPath().isEmpty()) {
                throw new P0.c("Resource URI must not be empty", 9);
            }
            try {
                Integer.parseInt(this.f21664a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new P0.c("Resource URI path must be a resource id.", 9);
            }
        }
        if (!"asset".equals(p333w2.a.b(this.f21664a)) || this.f21664a.isAbsolute()) {
            return new d(this);
        }
        throw new P0.c("Asset URI path must be absolute.", 9);
    }
}
