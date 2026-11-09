package com.palmpay.lib.webview.container;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PPWebActivity f24641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebViewConfig.Builder f24642c;

    public /* synthetic */ b(PPWebActivity pPWebActivity, WebViewConfig.Builder builder, int i7) {
        this.f24640a = i7;
        this.f24641b = pPWebActivity;
        this.f24642c = builder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24640a) {
            case 0:
                PPWebActivity.onCreate$lambda$6$lambda$5(this.f24641b, this.f24642c);
                break;
            default:
                PPWebActivity.onCreate$lambda$6(this.f24641b, this.f24642c);
                break;
        }
    }
}
