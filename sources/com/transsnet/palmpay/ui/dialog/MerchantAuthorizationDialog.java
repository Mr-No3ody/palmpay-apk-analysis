package com.transsnet.palmpay.ui.dialog;

import Ac.e;
import Ae.h;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import p025ba.d;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantAuthorizationDialog extends b {
    private String mAvatar;
    private String mMerchantNameDesc;
    private String mMessage;
    private View.OnClickListener mNegativeButtonListener;
    private View.OnClickListener mPositiveButtonListener;

    public MerchantAuthorizationDialog(Context context, int i7) {
        super(context, i7);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ImageView imageView = (ImageView) findViewById(e.merchant_icon_iv);
        if (TextUtils.isEmpty(this.mAvatar)) {
            imageView.setImageResource(d.core_authorization_icon);
        } else {
            r0.m1(this.mAvatar, imageView);
        }
        ((TextView) findViewById(e.merchant_name_tv)).setText(this.mMerchantNameDesc);
        ((TextView) findViewById(e.authorization_desc)).setText(this.mMessage);
        findViewById(e.disagree_tv).setOnClickListener(new h(this, 0));
        findViewById(e.agree_tv).setOnClickListener(new h(this, 1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mContext = null;
    }

    public void setAvatar(String str) {
        this.mAvatar = str;
    }

    public void setMerchantNameDesc(String str) {
        this.mMerchantNameDesc = str;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setNegativeButtonListener(View.OnClickListener onClickListener) {
        this.mNegativeButtonListener = onClickListener;
    }

    public void setPositiveButtonListener(View.OnClickListener onClickListener) {
        this.mPositiveButtonListener = onClickListener;
    }
}
