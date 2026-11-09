package com.transsnet.adsdk.widgets.snackbar;

import android.text.TextUtils;
import com.google.android.material.snackbar.Snackbar;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.analysis.contants.EventsConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Snackbar.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackBarRecycle f25681a;

    public j(SnackBarRecycle snackBarRecycle) {
        this.f25681a = snackBarRecycle;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onDismissed(Snackbar snackbar, int i7) {
        super.onDismissed(snackbar, i7);
        SnackBarRecycle snackBarRecycle = this.f25681a;
        if (TextUtils.isEmpty(snackBarRecycle.mAdData.adId)) {
            return;
        }
        snackBarRecycle.mLastBeginId = AdSdkUtils.getBehaviorId();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onShown(Snackbar snackbar) {
        super.onShown(snackbar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SnackBarRecycle snackBarRecycle = this.f25681a;
        snackBarRecycle.mShowTime = jCurrentTimeMillis;
        String behaviorId = AdSdkUtils.getBehaviorId();
        AdManager.saveAdShowStatusBackground(snackBarRecycle.mAdData, true);
        AdSdkUtils.trackEvent(snackBarRecycle.mAdData.adId, System.currentTimeMillis(), snackBarRecycle.mAdData.adSlotId, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, snackBarRecycle.mLastBeginId);
        snackBarRecycle.mLastBeginId = behaviorId;
    }
}
