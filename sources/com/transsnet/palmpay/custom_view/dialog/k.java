package com.transsnet.palmpay.custom_view.dialog;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f31280b;

    public /* synthetic */ k(l lVar, int i7) {
        this.f31279a = i7;
        this.f31280b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f31279a) {
            case 0:
                View view = this.f31280b.f31281a;
                if (view.getVisibility() == 0 && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    viewGroup.bringChildToFront(view);
                    view.requestLayout();
                    view.invalidate();
                    break;
                }
                break;
            default:
                this.f31280b.f31283c = true;
                break;
        }
    }
}
