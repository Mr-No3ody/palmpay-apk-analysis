package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
interface DecodeJob$Callback<R> {
    void onLoadFailed(u uVar);

    void onResourceReady(Resource<R> resource, com.bumptech.glide.load.a aVar, boolean z3);

    void reschedule(i iVar);
}
