package com.transsnet.palmpay.managemoney.ui.fragment;

import android.app.Dialog;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements AdShowCallback {
    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showCallback(Dialog dialog) {
        super.showCallback(dialog);
        if (dialog != null) {
            dialog.show();
        }
    }
}
