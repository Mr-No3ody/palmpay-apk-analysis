package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DataRewinder.Factory {
    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final DataRewinder build(Object obj) {
        return new m((ParcelFileDescriptor) obj);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final Class getDataClass() {
        return ParcelFileDescriptor.class;
    }
}
