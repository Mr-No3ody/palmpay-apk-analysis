package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileLoader$FileOpener f20841a;

    public j(FileLoader$FileOpener fileLoader$FileOpener) {
        this.f20841a = fileLoader$FileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        return new C1328e(this.f20841a, 2);
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}
