package com.transsnet.adsdk.widgets;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25612b;

    public /* synthetic */ a(SingleAdView singleAdView, int i7) {
        this.f25611a = i7;
        this.f25612b = singleAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25611a) {
            case 0:
                this.f25612b.postLoadFailResult();
                break;
            default:
                this.f25612b.postLoadFailResult();
                break;
        }
    }
}
