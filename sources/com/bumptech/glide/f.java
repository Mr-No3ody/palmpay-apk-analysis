package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f20458k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J1.h f20460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.sufficientlysecure.htmltextview.k f20461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Glide$RequestOptionsFactory f20462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f20463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M.f f20464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.m f20465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Oe.a f20466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public G1.d f20468j;

    public f(Context context, com.bumptech.glide.load.engine.bitmap_recycle.f fVar, Eg.g gVar, org.sufficientlysecure.htmltextview.k kVar, Glide$RequestOptionsFactory glide$RequestOptionsFactory, M.f fVar2, List list, com.bumptech.glide.load.engine.m mVar, Oe.a aVar, int i7) {
        super(context.getApplicationContext());
        this.f20459a = fVar;
        this.f20461c = kVar;
        this.f20462d = glide$RequestOptionsFactory;
        this.f20463e = list;
        this.f20464f = fVar2;
        this.f20465g = mVar;
        this.f20466h = aVar;
        this.f20467i = i7;
        this.f20460b = new J1.h(gVar);
    }

    public final j a() {
        return (j) this.f20460b.get();
    }
}
