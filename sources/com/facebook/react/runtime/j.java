package com.facebook.react.runtime;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReactSurfaceImpl f21801d;

    public /* synthetic */ j(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, int i7) {
        this.f21798a = i7;
        this.f21799b = reactHostImpl;
        this.f21800c = str;
        this.f21801d = reactSurfaceImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21798a) {
            case 0:
                return ReactHostImpl.prerenderSurface$lambda$1(this.f21799b, this.f21800c, this.f21801d, (ReactInstance) obj);
            case 1:
                return ReactHostImpl.stopSurface$lambda$3(this.f21799b, this.f21800c, this.f21801d, (ReactInstance) obj);
            default:
                return ReactHostImpl.startSurface$lambda$2(this.f21799b, this.f21800c, this.f21801d, (ReactInstance) obj);
        }
    }
}
