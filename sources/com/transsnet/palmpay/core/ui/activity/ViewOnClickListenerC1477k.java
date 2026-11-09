package com.transsnet.palmpay.core.ui.activity;

import android.view.View;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1477k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1479m f27777b;

    public /* synthetic */ ViewOnClickListenerC1477k(AbstractActivityC1479m abstractActivityC1479m, int i7) {
        this.f27776a = i7;
        this.f27777b = abstractActivityC1479m;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27776a) {
            case 0:
                this.f27777b.getOnBackPressedDispatcher().d();
                break;
            case 1:
                this.f27777b.finish();
                break;
            default:
                AbstractActivityC1479m abstractActivityC1479m = this.f27777b;
                abstractActivityC1479m.H(abstractActivityC1479m.D());
                break;
        }
    }
}
