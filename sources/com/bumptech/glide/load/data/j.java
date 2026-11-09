package com.bumptech.glide.load.data;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j implements DataRewinder.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20545a;

    public j(com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20545a = fVar;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final DataRewinder build(Object obj) {
        return new m((InputStream) obj, this.f20545a);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final Class getDataClass() {
        return InputStream.class;
    }
}
