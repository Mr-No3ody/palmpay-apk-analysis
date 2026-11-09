package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: loaded from: classes.dex */
public final class C implements ModelLoaderFactory, UriLoader$LocalUriFetcherFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f20814b;

    public /* synthetic */ C(ContentResolver contentResolver, int i7) {
        this.f20813a = i7;
        this.f20814b = contentResolver;
    }

    @Override // com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory
    public final DataFetcher build(Uri uri) {
        switch (this.f20813a) {
            case 0:
                return new com.bumptech.glide.load.data.a(this.f20814b, uri, 0);
            case 1:
                return new com.bumptech.glide.load.data.a(this.f20814b, uri, 1);
            default:
                return new com.bumptech.glide.load.data.n(this.f20814b, uri);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        int i7 = this.f20813a;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f20813a) {
            case 0:
                break;
            case 1:
                break;
        }
        return new D(this);
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
