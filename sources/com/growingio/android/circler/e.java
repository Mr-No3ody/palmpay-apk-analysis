package com.growingio.android.circler;

import com.growingio.android.sdk.track.webservices.widget.TipView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p039cb.c f23143b;

    public /* synthetic */ e(p039cb.c cVar, int i7) {
        this.f23142a = i7;
        this.f23143b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23142a) {
            case 0:
                p039cb.c cVar = this.f23143b;
                TipView tipView = (TipView) cVar.f18901b;
                if (tipView != null) {
                    tipView.f23203e = true;
                    tipView.b();
                    cVar.f18901b = null;
                }
                break;
            case 1:
                this.f23143b.c();
                break;
            case 2:
                TipView tipView2 = (TipView) this.f23143b.f18901b;
                if (tipView2 != null) {
                    tipView2.b();
                }
                break;
            default:
                p039cb.c cVar2 = this.f23143b;
                cVar2.c();
                ((TipView) cVar2.f18901b).f23203e = false;
                break;
        }
    }
}
