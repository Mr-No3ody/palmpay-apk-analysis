package com.transsnet.palmpay.account.ui.dialog;

import F8.d;
import F8.e;
import Ja.C0328a;
import Oc.j;
import Pa.i0;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.custom_view.dialog.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/SignUpPermissionDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "confirmClose", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "callback", "<init>", "(Landroid/content/Context;ZLcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "Landroid/webkit/WebView;", "view", "", "injectNightModeState", "(Landroid/webkit/WebView;)V", "initViews", "()V", "Z", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignUpPermissionDialog extends b {

    @NotNull
    private final CompleteCallback<Boolean> callback;
    private final boolean confirmClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpPermissionDialog(@Nullable Context context, boolean z3, @NotNull CompleteCallback<Boolean> callback) {
        super(context, e.ac_dialog_sign_up_confirm_permission);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.confirmClose = z3;
        this.callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(SignUpPermissionDialog signUpPermissionDialog, View view, View view2) {
        int id2 = view2.getId();
        if (id2 != d.imageViewClose && id2 != d.tvNo) {
            if (id2 == d.tvYes) {
                signUpPermissionDialog.callback.onComplete(Boolean.TRUE);
                signUpPermissionDialog.dismiss();
                return;
            }
            return;
        }
        if (signUpPermissionDialog.confirmClose && view != null && view.isEnabled()) {
            signUpPermissionDialog.callback.onComplete(Boolean.FALSE);
        } else {
            signUpPermissionDialog.dismiss();
        }
    }

    private final void injectNightModeState(WebView view) {
        if (!i0.T()) {
            F6.d.h("PWebActivity", 3, "injectNightModeState: app in dark mode false");
            return;
        }
        F6.d.h("PWebActivity", 3, "injectNightModeState: app in dark mode");
        if (view != null) {
            view.addJavascriptInterface(Boolean.TRUE, "themeDark");
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View viewFindViewById = findViewById(d.tvYes);
        View viewFindViewById2 = findViewById(d.imageViewClose);
        View viewFindViewById3 = findViewById(d.loadingView);
        LinearLayout linearLayout = (LinearLayout) findViewById(d.ll_web);
        h.q(new j(8, this, viewFindViewById), viewFindViewById2, viewFindViewById);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(0);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(false);
        }
        ActivityWebView activityWebView = new ActivityWebView(getContext());
        activityWebView.setWebChromeClient(new Q8.e(viewFindViewById3, viewFindViewById));
        if (linearLayout != null) {
            linearLayout.addView(activityWebView);
        }
        String strG = com.transsnet.palmpay.core.config.d.g("/h5/policy/ng/permission");
        injectNightModeState(activityWebView);
        activityWebView.setWebViewClient(new C0328a(strG));
        activityWebView.loadUrl(strG);
    }
}
