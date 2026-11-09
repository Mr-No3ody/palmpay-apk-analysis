package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: loaded from: classes.dex */
public interface AssetUriLoader$AssetFetcherFactory<Data> {
    DataFetcher<Data> buildFetcher(AssetManager assetManager, String str);
}
