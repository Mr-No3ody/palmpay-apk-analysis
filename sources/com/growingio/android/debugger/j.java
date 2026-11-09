package com.growingio.android.debugger;

import com.growingio.android.sdk.track.webservices.widget.TipView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.b f23180b;

    public /* synthetic */ j(androidx.work.impl.model.b bVar, int i7) {
        this.f23179a = i7;
        this.f23180b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23179a) {
            case 0:
                androidx.work.impl.model.b bVar = this.f23180b;
                bVar.g();
                ((TipView) bVar.f18580b).f23203e = false;
                break;
            case 1:
                this.f23180b.g();
                break;
            case 2:
                TipView tipView = (TipView) this.f23180b.f18580b;
                if (tipView != null) {
                    tipView.b();
                }
                break;
            default:
                androidx.work.impl.model.b bVar2 = this.f23180b;
                TipView tipView2 = (TipView) bVar2.f18580b;
                if (tipView2 != null) {
                    tipView2.f23203e = true;
                    tipView2.b();
                    bVar2.f18580b = null;
                }
                break;
        }
    }
}
