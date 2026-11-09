package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;

/* JADX INFO: loaded from: classes4.dex */
public class TipsDialog extends b {
    private String mButtonText;
    private int mGravity;
    private String mMessage;
    private DialogInterface.OnCancelListener mOnCancelListener;

    public TipsDialog(Context context, int i7) {
        super(context, i7);
        this.mGravity = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView textView = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.tips_msg);
        TextView textView2 = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.confirm_tv);
        textView.setText(this.mMessage);
        textView.setGravity(this.mGravity);
        if (!TextUtils.isEmpty(this.mButtonText)) {
            textView2.setText(this.mButtonText);
        }
        textView2.setOnClickListener(new ViewOnClickListenerC1533v(this, 23));
    }

    public void setButtonText(String str) {
        this.mButtonText = str;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setMessageGravity(int i7) {
        this.mGravity = i7;
    }

    @Override // O6.f, android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
    }
}
