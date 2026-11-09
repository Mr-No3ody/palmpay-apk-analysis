package com.transsnet.adsdk.widgets;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25637b;

    public /* synthetic */ d(SingleAdView singleAdView, int i7) {
        this.f25636a = i7;
        this.f25637b = singleAdView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25636a) {
            case 0:
                SingleAdView._get_closeButton_$lambda$24(this.f25637b, view);
                break;
            default:
                SingleAdView.getImageView$lambda$2(this.f25637b, view);
                break;
        }
    }
}
