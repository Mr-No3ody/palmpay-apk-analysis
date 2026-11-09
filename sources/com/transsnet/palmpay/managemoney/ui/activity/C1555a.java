package com.transsnet.palmpay.managemoney.ui.activity;

import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1555a implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32224b;

    public /* synthetic */ C1555a(Object obj, int i7) {
        this.f32223a = i7;
        this.f32224b = obj;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        Object obj2 = this.f32224b;
        switch (this.f32223a) {
            case 0:
                int i7 = CashBoxCampaignMainActivity.f32019X;
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = (CashBoxCampaignMainActivity) obj2;
                cashBoxCampaignMainActivity.p().a();
                cashBoxCampaignMainActivity.p().setProgress(0.0f);
                cashBoxCampaignMainActivity.p().setComposition((com.airbnb.lottie.k) obj);
                cashBoxCampaignMainActivity.p().e();
                break;
            case 1:
                LottieAnimationViewManager.createViewInstance$lambda$0((LottieAnimationView) obj2, (Throwable) obj);
                break;
            default:
                com.airbnb.lottie.k kVar = (com.airbnb.lottie.k) obj;
                p385ze.g gVar = (p385ze.g) obj2;
                LottieAnimationView lottieAnimationViewD = gVar.d(gVar.itemView.getContext());
                if (lottieAnimationViewD != null) {
                    lottieAnimationViewD.setComposition(kVar);
                    lottieAnimationViewD.e();
                }
                break;
        }
    }
}
