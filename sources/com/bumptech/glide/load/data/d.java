package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DataRewinder.Factory {
    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final DataRewinder build(Object obj) {
        return new m(obj);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final Class getDataClass() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
