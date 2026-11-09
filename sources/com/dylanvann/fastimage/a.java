package com.dylanvann.fastimage;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FastImageOkHttpProgressGlideModule.ResponseProgressListener f21161a;

    public a(FastImageOkHttpProgressGlideModule.ResponseProgressListener responseProgressListener) {
        this.f21161a = responseProgressListener;
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        Y yRequest = chain.request();
        e0 e0VarProceed = chain.proceed(yRequest);
        String str = yRequest.f40685a.f40587i;
        d0 d0VarC = e0VarProceed.c();
        d0VarC.f40721g = new d(str, e0VarProceed.f40734g, this.f21161a);
        return d0VarC.a();
    }
}
