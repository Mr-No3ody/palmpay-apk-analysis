package com.transsnet.palmpay.core.callback;

import android.app.Dialog;
import com.transsnet.adsdk.widgets.snackbar.SnackBarRecycle;

/* JADX INFO: loaded from: classes3.dex */
public interface HomeAcCallback {
    void showDialog(Dialog dialog, int priority);

    void showSnackBar(SnackBarRecycle snackbar);

    default void switchToMainHomeTabOnLoanHomeExit() {
    }
}
