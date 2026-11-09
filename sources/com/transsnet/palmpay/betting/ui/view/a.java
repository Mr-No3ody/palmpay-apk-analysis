package com.transsnet.palmpay.betting.ui.view;

import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import kotlin.jvm.internal.Intrinsics;
import p282s9.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ModelBillerSelection.BillerSelectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelBettingRootView f26768a;

    public a(ModelBettingRootView modelBettingRootView) {
        this.f26768a = modelBettingRootView;
    }

    @Override // com.transsnet.palmpay.betting.ui.view.ModelBillerSelection.BillerSelectionCallback
    public final void onBillerSelected(BettingBillerListItemBean biller) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        l lVar = this.f26768a.f26743d;
        if (lVar != null) {
            lVar.onBillerItemSelected(biller);
        }
    }

    @Override // com.transsnet.palmpay.betting.ui.view.ModelBillerSelection.BillerSelectionCallback
    public final void onMoreClick() {
        l lVar = this.f26768a.f26743d;
        if (lVar != null) {
            lVar.onBillerClick();
        }
    }
}
