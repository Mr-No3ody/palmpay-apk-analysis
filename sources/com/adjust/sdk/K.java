package com.adjust.sdk;

import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class K implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f19324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustLinkResolution.AdjustLinkResolutionCallback f19325b;

    public K(URL url, AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        this.f19324a = url;
        this.f19325b = adjustLinkResolutionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustLinkResolution.requestAndResolve(this.f19324a, 0, this.f19325b);
    }
}
