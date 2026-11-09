package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Key f20867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataFetcher f20869c;

    public t(Key key, DataFetcher dataFetcher) {
        this(key, Collections.EMPTY_LIST, dataFetcher);
    }

    public t(Key key, List list, DataFetcher dataFetcher) {
        J1.g.c(key, "Argument must not be null");
        this.f20867a = key;
        J1.g.c(list, "Argument must not be null");
        this.f20868b = list;
        J1.g.c(dataFetcher, "Argument must not be null");
        this.f20869c = dataFetcher;
    }
}
