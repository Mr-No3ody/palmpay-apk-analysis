package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p025ba.l;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0012\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\t2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010&\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010'\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010!R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmRecipientInfoDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "", "eventPrefix", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/core/bean/BankInfo;", "bankInfo", "accountNo", "verifiedName", "", "isNotActive", "updateUi", "(Lcom/transsnet/palmpay/core/bean/BankInfo;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "callback", "setResultCallback", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)V", "setRecheckCallback", "show", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Ljava/lang/String;", "Landroid/widget/TextView;", "mBankNameTv", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "ivBank", "Landroid/widget/ImageView;", "mAccountNoTv", "mVerifiedNameTv", "tvMessage", "mResultCallback", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "mResultRecheckCallback", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmRecipientInfoDialog extends b implements View.OnClickListener {

    @NotNull
    private final String eventPrefix;
    private ImageView ivBank;
    private TextView mAccountNoTv;
    private TextView mBankNameTv;

    @Nullable
    private ResultCallback<Boolean> mResultCallback;

    @Nullable
    private ResultCallback<Boolean> mResultRecheckCallback;
    private TextView mVerifiedNameTv;
    private TextView tvMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmRecipientInfoDialog(@Nullable Context context, @NotNull String eventPrefix) {
        super(context);
        Intrinsics.checkNotNullParameter(eventPrefix, "eventPrefix");
        this.eventPrefix = eventPrefix;
    }

    public static /* synthetic */ void updateUi$default(ConfirmRecipientInfoDialog confirmRecipientInfoDialog, BankInfo bankInfo, String str, String str2, boolean z3, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z3 = false;
        }
        confirmRecipientInfoDialog.updateUi(bankInfo, str, str2, z3);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_recipient_info);
        this.mBankNameTv = (TextView) findViewById(e.tvBankName);
        this.ivBank = (ImageView) findViewById(e.ivBank);
        this.mAccountNoTv = (TextView) findViewById(e.tvAccountNo);
        this.mVerifiedNameTv = (TextView) findViewById(e.tvName);
        this.tvMessage = (TextView) findViewById(e.tvMessage);
        findViewById(e.tvConfirm).setOnClickListener(this);
        findViewById(e.ivClose).setOnClickListener(this);
        findViewById(e.tvRecheck).setOnClickListener(this);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        if (v3 != null) {
            int id2 = v3.getId();
            if (id2 == e.tvConfirm) {
                n0.g().l(this.eventPrefix + "_Confirm_Click");
                ResultCallback<Boolean> resultCallback = this.mResultCallback;
                if (resultCallback != null) {
                    resultCallback.onComplete(Boolean.TRUE);
                }
            } else if (id2 == e.tvRecheck) {
                n0.g().l(this.eventPrefix + "_Recheck_Click");
                ResultCallback<Boolean> resultCallback2 = this.mResultRecheckCallback;
                if (resultCallback2 != null) {
                    resultCallback2.onComplete(Boolean.TRUE);
                }
            } else if (id2 == e.ivClose) {
                n0.g().l(this.eventPrefix + "_Close_Click");
            }
            dismiss();
        }
    }

    public final void setRecheckCallback(@Nullable ResultCallback<Boolean> callback) {
        this.mResultRecheckCallback = callback;
    }

    public final void setResultCallback(@Nullable ResultCallback<Boolean> callback) {
        this.mResultCallback = callback;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        n0.g().v(this.eventPrefix + "_View");
    }

    public final void updateUi(@Nullable BankInfo bankInfo, @Nullable String accountNo, @Nullable String verifiedName, boolean isNotActive) {
        if (bankInfo != null) {
            ImageView imageView = this.ivBank;
            if (imageView == null) {
                Intrinsics.n("ivBank");
                throw null;
            }
            r0.l1(bankInfo.bankUrl, imageView);
            TextView textView = this.mBankNameTv;
            if (textView == null) {
                Intrinsics.n("mBankNameTv");
                throw null;
            }
            textView.setText(bankInfo.bankName);
        }
        TextView textView2 = this.mAccountNoTv;
        if (textView2 == null) {
            Intrinsics.n("mAccountNoTv");
            throw null;
        }
        textView2.setText(i0.o(accountNo != null ? y.k(accountNo, " ", "") : null));
        TextView textView3 = this.mVerifiedNameTv;
        if (textView3 == null) {
            Intrinsics.n("mVerifiedNameTv");
            throw null;
        }
        textView3.setText(verifiedName);
        if (isNotActive) {
            TextView textView4 = this.tvMessage;
            if (textView4 != null) {
                textView4.setText(getContext().getResources().getString(k.core_recipient_not_act));
                return;
            } else {
                Intrinsics.n("tvMessage");
                throw null;
            }
        }
        TextView textView5 = this.tvMessage;
        if (textView5 != null) {
            textView5.setText(getContext().getResources().getString(k.core_kindly_review));
        } else {
            Intrinsics.n("tvMessage");
            throw null;
        }
    }
}
