package com.growingio.android.sdk;

import N8.q0;
import android.app.Application;
import android.content.ContextWrapper;
import com.growingio.android.sdk.track.modelloader.DataFetcher;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContextWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f23195b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f23196c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p247q5.c f23197a;

    public d(Application application) {
        super(application);
        this.f23197a = new p247q5.c();
    }

    public static d a() {
        if (f23195b == null) {
            h.b("ContextProvider", new NullPointerException("you should init growingio sdk first"));
        }
        return f23195b;
    }

    public final void b(Object obj, Class cls, LoadDataFetcher.DataCallback dataCallback) {
        ModelLoader modelLoaderA = this.f23197a.a(cls);
        if (modelLoaderA == null) {
            dataCallback.onLoadFailed(new NullPointerException(q0.k("please register ", cls.getSimpleName(), " component first")));
            return;
        }
        DataFetcher dataFetcher = modelLoaderA.buildLoadData(obj).f41455a;
        if (dataFetcher instanceof LoadDataFetcher) {
            ((LoadDataFetcher) dataFetcher).loadData(dataCallback);
        }
    }
}
