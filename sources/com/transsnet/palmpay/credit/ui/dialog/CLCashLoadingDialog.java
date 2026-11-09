package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLCashLoadingDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "message", "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Landroid/content/DialogInterface$OnCancelListener;)V", "", "initViews", "()V", "show", "Landroid/widget/TextView;", "loadingMsg", "Landroid/widget/TextView;", "mMesaage", "Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCashLoadingDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private TextView loadingMsg;

    @Nullable
    private String mMesaage;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLCashLoadingDialog(@NotNull Context context) {
        this(context, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.loadingMsg = (TextView) findViewById(p116hb.c.loadingMsg);
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setDimAmount(0.1f);
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            Intrinsics.e(ownerActivity);
            if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
        }
        try {
            super.show();
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.mMesaage)) {
            TextView textView = this.loadingMsg;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.loadingMsg;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.loadingMsg;
        if (textView3 != null) {
            textView3.setText(this.mMesaage);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLCashLoadingDialog(@NotNull Context context, @Nullable String str) {
        this(context, str, null, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLCashLoadingDialog(@NotNull Context context, @Nullable String str, @Nullable Boolean bool) {
        this(context, str, bool, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CLCashLoadingDialog(Context context, String str, Boolean bool, DialogInterface.OnCancelListener onCancelListener, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? Boolean.FALSE : bool, (i7 & 8) != 0 ? null : onCancelListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLCashLoadingDialog(@NotNull Context context, @Nullable String str, @Nullable Boolean bool, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, p116hb.d.cs_layout_loading_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        initViews();
        setCancelable(bool != null ? bool.booleanValue() : false);
        setOnCancelListener(onCancelListener);
        this.mMesaage = str;
    }
}
