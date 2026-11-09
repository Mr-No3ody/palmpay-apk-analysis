package com.transsnet.palmpay.account.ui.dialog;

import F8.d;
import F8.e;
import I8.h;
import Pa.n0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/IdentityVerificationErrorDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "", "callback", "setConfirmCallback", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "message", "update", "(Ljava/lang/String;)V", "LI8/h;", "binding", "LI8/h;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Companion", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IdentityVerificationErrorDialog extends b implements View.OnClickListener {

    @NotNull
    public static final String BUTTON_BYHAND = "byhand";

    @NotNull
    public static final String BUTTON_FACE = "face";

    @NotNull
    public static final String BUTTON_ID = "id";

    @Nullable
    private h binding;

    @Nullable
    private CompleteCallback<String> callback;

    public IdentityVerificationErrorDialog(@Nullable Context context) {
        super(context, e.ac_dialog_identify_verification_error);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        View viewFindViewById = findViewById(d.rootView);
        int i7 = d.iv_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a.m(i7, viewFindViewById);
        if (appCompatImageView != null) {
            i7 = d.layout_btn_container;
            if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                i7 = d.tvCancel;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a.m(i7, viewFindViewById);
                if (appCompatTextView != null) {
                    i7 = d.tvConfirm;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.m(i7, viewFindViewById);
                    if (appCompatTextView2 != null) {
                        i7 = d.tvFill;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            i7 = d.tvMsg;
                            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                            if (textView2 != null && (viewM = a.m((i7 = d.view_gap), viewFindViewById)) != null) {
                                this.binding = new h(frameLayout, appCompatImageView, frameLayout, appCompatTextView, appCompatTextView2, textView, textView2, viewM);
                                showAtCenter(getWindow());
                                h hVar = this.binding;
                                p220oa.h.q(this, hVar != null ? hVar.f4087d : null, hVar != null ? hVar.f4085b : null, hVar != null ? hVar.f4089f : null, hVar != null ? hVar.f4088e : null);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = d.tvCancel;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            dismiss();
            CompleteCallback<String> completeCallback = this.callback;
            if (completeCallback != null) {
                completeCallback.onComplete("face");
                return;
            }
            return;
        }
        int i10 = d.tvConfirm;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            n0.g().l("FacialRecognitionFailedPopupID");
            dismiss();
            CompleteCallback<String> completeCallback2 = this.callback;
            if (completeCallback2 != null) {
                completeCallback2.onComplete("id");
                return;
            }
            return;
        }
        int i11 = d.tvFill;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            dismiss();
            CompleteCallback<String> completeCallback3 = this.callback;
            if (completeCallback3 != null) {
                completeCallback3.onComplete(BUTTON_BYHAND);
            }
        }
    }

    public final void setConfirmCallback(@Nullable CompleteCallback<String> callback) {
        this.callback = callback;
    }

    public final void update(@Nullable String message) {
        TextView textView;
        h hVar = this.binding;
        if (hVar == null || (textView = hVar.f4090g) == null) {
            return;
        }
        textView.setText(message);
    }
}
