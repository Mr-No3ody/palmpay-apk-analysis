package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f20888b;

    public /* synthetic */ y(Resources resources, int i7) {
        this.f20887a = i7;
        this.f20888b = resources;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f20887a) {
            case 0:
                return new C1325b(this.f20888b, xVar.c(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C1325b(this.f20888b, xVar.c(Uri.class, InputStream.class));
            default:
                return new C1325b(this.f20888b, B.f20811b);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        int i7 = this.f20887a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
