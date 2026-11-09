package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.i0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p159kd.e;
import p159kd.f;
import p159kd.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmBankInfoDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "bankName", "accountNo", "verifiedName", "bankUrl", "updateUi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "", "callback", "setResultCallback", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Landroid/widget/TextView;", "mBankNameTv", "Landroid/widget/TextView;", "mAccountNoTv", "mVerifiedNameTv", "tvMessage", "Landroid/widget/ImageView;", "mBankIconIv", "Landroid/widget/ImageView;", "mResultCallback", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmBankInfoDialog extends b implements View.OnClickListener {
    private TextView mAccountNoTv;
    private ImageView mBankIconIv;
    private TextView mBankNameTv;

    @Nullable
    private ResultCallback<Boolean> mResultCallback;
    private TextView mVerifiedNameTv;
    private TextView tvMessage;

    public ConfirmBankInfoDialog(@Nullable Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_bank_info);
        this.mBankNameTv = (TextView) findViewById(e.tv1);
        this.mAccountNoTv = (TextView) findViewById(e.tv2);
        this.mVerifiedNameTv = (TextView) findViewById(e.tv3);
        this.mBankIconIv = (ImageView) findViewById(e.iv1);
        this.tvMessage = (TextView) findViewById(e.tvMessage);
        findViewById(e.tvConfirm).setOnClickListener(this);
        findViewById(e.ivClose).setOnClickListener(this);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
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

    public final void updateUi(@Nullable String bankName, @Nullable String accountNo, @Nullable String verifiedName, @Nullable String bankUrl) {
        TextView textView = this.tvMessage;
        if (textView == null) {
            Intrinsics.n("tvMessage");
            throw null;
        }
        textView.setText(this.mContext.getString(h.sm_information_confirmed_to_sb));
        TextView textView2 = this.mBankNameTv;
        if (textView2 == null) {
            Intrinsics.n("mBankNameTv");
            throw null;
        }
        textView2.setText(bankName);
        TextView textView3 = this.mAccountNoTv;
        if (textView3 == null) {
            Intrinsics.n("mAccountNoTv");
            throw null;
        }
        textView3.setText(i0.o(accountNo));
        TextView textView4 = this.mVerifiedNameTv;
        if (textView4 == null) {
            Intrinsics.n("mVerifiedNameTv");
            throw null;
        }
        textView4.setText(verifiedName);
        ImageView imageView = this.mBankIconIv;
        if (imageView != null) {
            p002a.a.r(bankUrl, imageView);
        } else {
            Intrinsics.n("mBankIconIv");
            throw null;
        }
    }
}
