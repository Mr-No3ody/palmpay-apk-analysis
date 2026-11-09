package com.transsnet.palmpay.account.ui.dialog;

import F8.d;
import F8.e;
import I8.i;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/IdentityVerificationExitConfirmDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "", "callback", "setConfirmCallback", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "", "url", "update", "(Ljava/lang/String;)V", "LI8/i;", "binding", "LI8/i;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IdentityVerificationExitConfirmDialog extends b implements View.OnClickListener {

    @Nullable
    private i binding;

    @Nullable
    private CompleteCallback<Boolean> callback;

    public IdentityVerificationExitConfirmDialog(@Nullable Context context) {
        super(context, e.ac_dialog_identify_verification_exit_confirm);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(d.rootView);
        int i7 = d.ivBg;
        ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
        if (imageView != null) {
            i7 = d.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                this.binding = new i((ConstraintLayout) viewFindViewById, imageView, iconicsImageView);
                showAtCenter(getWindow());
                i iVar = this.binding;
                h.q(this, iVar != null ? iVar.f4093b : null, iVar != null ? iVar.f4094c : null);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = d.ivBg;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            dismiss();
            CompleteCallback<Boolean> completeCallback = this.callback;
            if (completeCallback != null) {
                completeCallback.onComplete(Boolean.TRUE);
                return;
            }
            return;
        }
        int i10 = d.ivClose;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            dismiss();
            CompleteCallback<Boolean> completeCallback2 = this.callback;
            if (completeCallback2 != null) {
                completeCallback2.onComplete(Boolean.FALSE);
            }
        }
    }

    public final void setConfirmCallback(@Nullable CompleteCallback<Boolean> callback) {
        this.callback = callback;
    }

    public final void update(@Nullable String url) {
        i iVar = this.binding;
        r0.l1(url, iVar != null ? iVar.f4093b : null);
    }
}
