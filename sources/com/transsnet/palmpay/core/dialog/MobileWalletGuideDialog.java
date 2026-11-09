package com.transsnet.palmpay.core.dialog;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class MobileWalletGuideDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private String mMessage;
    private String mTitle;
    private String mWalletName;

    public MobileWalletGuideDialog(Context context, int layoutId) {
        super(context, layoutId);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ((TextView) findViewById(p025ba.e.title_tv)).setText(this.mTitle);
        ((TextView) findViewById(p025ba.e.mobile_wallet_name)).setText(this.mWalletName);
        ((TextView) findViewById(p025ba.e.guide_msg)).setText(this.mMessage);
        ((TextView) findViewById(p025ba.e.confirm_tv)).setOnClickListener(new p185ma.e(this, 1));
    }

    public void setMessage(String message) {
        this.mMessage = message;
    }

    public void setMobileWalletName(String walletName) {
        this.mWalletName = walletName;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
