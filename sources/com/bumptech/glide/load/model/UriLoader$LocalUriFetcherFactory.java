package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: loaded from: classes.dex */
public interface UriLoader$LocalUriFetcherFactory<Data> {
    DataFetcher<Data> build(Uri uri);
}
