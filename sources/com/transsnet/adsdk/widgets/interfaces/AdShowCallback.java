package com.transsnet.adsdk.widgets.interfaces;

import android.app.Dialog;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.snackbar.SnackBarRecycle;

/* JADX INFO: loaded from: classes3.dex */
public interface AdShowCallback {
    default void showAppAd(AdEntity adEntity) {
    }

    default void showCallback(Dialog dialog) {
    }

    default void showSnackBarCallback(SnackBarRecycle snackBar) {
    }
}
