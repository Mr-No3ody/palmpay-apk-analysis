package com.transsnet.adsdk.widgets.MarqueeTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeView f25593b;

    public /* synthetic */ a(MarqueeView marqueeView, int i7) {
        this.f25592a = i7;
        this.f25593b = marqueeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25592a) {
            case 0:
                this.f25593b.lambda$new$0();
                break;
            case 1:
                this.f25593b.lambda$loadAdData$7();
                break;
            default:
                this.f25593b.lambda$loadAdData$9();
                break;
        }
    }
}
