package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class TipsDialog2 extends b {
    private String mConfirmBtnText;
    private String mMessage;
    private String mOpposeBtnText;
    private TipsDialogCallback mTipsDialogCallback;
    private String mTitle;

    public interface TipsDialogCallback {
        void confirmClick();

        void opposeClick();
    }

    public TipsDialog2(Context context, int i7) {
        super(context, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
        this.mTipsDialogCallback.confirmClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        dismiss();
        this.mTipsDialogCallback.opposeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$2(View view) {
        dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView textView = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.tips_msg);
        TextView textView2 = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.tips_title);
        TextView textView3 = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.confirm_tv);
        TextView textView4 = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.oppose_tv);
        textView.setText(this.mMessage);
        textView2.setText(this.mTitle);
        if (!TextUtils.isEmpty(this.mConfirmBtnText)) {
            textView3.setText(this.mConfirmBtnText);
        }
        if (!TextUtils.isEmpty(this.mOpposeBtnText)) {
            textView4.setText(this.mOpposeBtnText);
        }
        final int i7 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TipsDialog2 f31320b;

            {
                this.f31320b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f31320b.lambda$initViews$0(view);
                        break;
                    case 1:
                        this.f31320b.lambda$initViews$1(view);
                        break;
                    default:
                        this.f31320b.lambda$initViews$2(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TipsDialog2 f31320b;

            {
                this.f31320b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f31320b.lambda$initViews$0(view);
                        break;
                    case 1:
                        this.f31320b.lambda$initViews$1(view);
                        break;
                    default:
                        this.f31320b.lambda$initViews$2(view);
                        break;
                }
            }
        });
        final int i11 = 2;
        findViewById(com.transsnet.palmpay.custom_view.s.ctd_close_iv).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TipsDialog2 f31320b;

            {
                this.f31320b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f31320b.lambda$initViews$0(view);
                        break;
                    case 1:
                        this.f31320b.lambda$initViews$1(view);
                        break;
                    default:
                        this.f31320b.lambda$initViews$2(view);
                        break;
                }
            }
        });
    }

    public void setConfirmBtnText(String str) {
        this.mConfirmBtnText = str;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setOnConfirmListener(TipsDialogCallback tipsDialogCallback) {
        this.mTipsDialogCallback = tipsDialogCallback;
    }

    public void setOpposeBtnText(String str) {
        this.mOpposeBtnText = str;
    }

    public void setTitleText(String str) {
        this.mTitle = str;
    }
}
