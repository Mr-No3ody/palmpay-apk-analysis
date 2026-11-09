package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1324a implements ModelLoaderFactory, AssetUriLoader$AssetFetcherFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20821b;

    public /* synthetic */ C1324a(AssetManager assetManager, int i7) {
        this.f20820a = i7;
        this.f20821b = assetManager;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f20820a) {
            case 0:
                return new C1325b(0, (AssetManager) this.f20821b, this);
            case 1:
                return new C1325b(0, (AssetManager) this.f20821b, this);
            default:
                return new C1328e((C1326c) this.f20821b, 1);
        }
    }

    @Override // com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory
    public DataFetcher buildFetcher(AssetManager assetManager, String str) {
        switch (this.f20820a) {
            case 0:
                return new com.bumptech.glide.load.data.g(str, 0, assetManager);
            default:
                return new com.bumptech.glide.load.data.g(str, 1, assetManager);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        int i7 = this.f20820a;
    }

    public C1324a() {
        this.f20820a = 2;
        this.f20821b = new C1326c(3);
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
