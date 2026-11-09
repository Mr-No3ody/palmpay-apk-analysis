package com.transsnet.palmpay.core.ui.activity;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonClaimRewardActivity f27805b;

    public /* synthetic */ r(CommonClaimRewardActivity commonClaimRewardActivity, int i7) {
        this.f27804a = i7;
        this.f27805b = commonClaimRewardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CommonClaimRewardActivity commonClaimRewardActivity = this.f27805b;
        switch (this.f27804a) {
            case 0:
                int i7 = CommonClaimRewardActivity.f27481a;
                commonClaimRewardActivity.finish();
                break;
            case 1:
                int i10 = CommonClaimRewardActivity.f27481a;
                commonClaimRewardActivity.finish();
                break;
            case 2:
                int i11 = CommonClaimRewardActivity.f27481a;
                commonClaimRewardActivity.o();
                break;
            default:
                int i12 = CommonClaimRewardActivity.f27481a;
                commonClaimRewardActivity.finish();
                break;
        }
    }
}
