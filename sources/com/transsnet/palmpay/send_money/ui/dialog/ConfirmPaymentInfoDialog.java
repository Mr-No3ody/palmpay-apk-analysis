package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmPaymentInfoDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "name", "accountNo", "", "amount", "message", "updateUi", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "", "callback", "setResultCallback", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Landroid/widget/TextView;", "mTvName", "Landroid/widget/TextView;", "mTvAccountNo", "mTvAmount", "mTvMsg", "Landroid/widget/LinearLayout;", "layoutName", "Landroid/widget/LinearLayout;", "mResultCallback", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmPaymentInfoDialog extends b implements View.OnClickListener {

    @Nullable
    private LinearLayout layoutName;

    @Nullable
    private ResultCallback<Boolean> mResultCallback;

    @Nullable
    private TextView mTvAccountNo;

    @Nullable
    private TextView mTvAmount;

    @Nullable
    private TextView mTvMsg;

    @Nullable
    private TextView mTvName;

    public ConfirmPaymentInfoDialog(@Nullable Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_payment_info);
        this.mTvName = (TextView) findViewById(e.tv1);
        this.mTvAccountNo = (TextView) findViewById(e.tv2);
        this.mTvAmount = (TextView) findViewById(e.tv3);
        this.mTvMsg = (TextView) findViewById(e.tvMessage);
        this.layoutName = (LinearLayout) findViewById(e.layoutName);
        findViewById(e.tvConfirm).setOnClickListener(this);
        findViewById(e.ivClose).setOnClickListener(this);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        ResultCallback<Boolean> resultCallback;
        if (v3 != null) {
            if (v3.getId() == e.tvConfirm && (resultCallback = this.mResultCallback) != null) {
                resultCallback.onComplete(Boolean.TRUE);
            }
            dismiss();
        }
    }

    public final void setResultCallback(@Nullable ResultCallback<Boolean> callback) {
        this.mResultCallback = callback;
    }

    public final void updateUi(@Nullable String name, @Nullable String accountNo, long amount, @Nullable String message) {
        if (TextUtils.isEmpty(name)) {
            LinearLayout linearLayout = this.layoutName;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            LinearLayout linearLayout2 = this.layoutName;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView = this.mTvName;
            if (textView != null) {
                textView.setText(name);
            }
        }
        TextView textView2 = this.mTvAccountNo;
        if (textView2 != null) {
            textView2.setText(accountNo);
        }
        TextView textView3 = this.mTvAmount;
        if (textView3 != null) {
            textView3.setText(r0.B(amount, false));
        }
        TextView textView4 = this.mTvMsg;
        if (textView4 != null) {
            textView4.setText(message);
        }
    }
}
