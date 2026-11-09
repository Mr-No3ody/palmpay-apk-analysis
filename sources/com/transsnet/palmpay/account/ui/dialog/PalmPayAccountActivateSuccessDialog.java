package com.transsnet.palmpay.account.ui.dialog;

import F8.d;
import I8.e;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/PalmPayAccountActivateSuccessDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "", "callback", "setConfirmCallback", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "", "mobile", "update", "(Ljava/lang/String;)V", "show", "showLoading", "(Z)V", "LI8/e;", "binding", "LI8/e;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayAccountActivateSuccessDialog extends b implements View.OnClickListener {

    @Nullable
    private e binding;

    @Nullable
    private CompleteCallback<Boolean> callback;

    public PalmPayAccountActivateSuccessDialog(@Nullable Context context) {
        super(context, F8.e.ac_dialog_account_activate_success);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(d.rootView);
        int i7 = d.btnView;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = d.ivSuccess;
            if (((LottieAnimationView) a.m(i7, viewFindViewById)) != null) {
                i7 = d.layoutInfo;
                if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                    i7 = d.tv1;
                    TextView textView = (TextView) a.m(i7, viewFindViewById);
                    if (textView != null) {
                        i7 = d.tv2;
                        TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                        if (textView2 != null) {
                            i7 = d.tv3;
                            TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                            if (textView3 != null) {
                                i7 = d.tvBalanceLimit;
                                TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                                if (textView4 != null) {
                                    i7 = d.tvDailyLimit;
                                    TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView5 != null) {
                                        i7 = d.tvLevel;
                                        TextView textView6 = (TextView) a.m(i7, viewFindViewById);
                                        if (textView6 != null) {
                                            i7 = d.tvMsg;
                                            TextView textView7 = (TextView) a.m(i7, viewFindViewById);
                                            if (textView7 != null) {
                                                i7 = d.tvNo;
                                                TextView textView8 = (TextView) a.m(i7, viewFindViewById);
                                                if (textView8 != null) {
                                                    i7 = d.tvSubTitle1;
                                                    TextView textView9 = (TextView) a.m(i7, viewFindViewById);
                                                    if (textView9 != null) {
                                                        i7 = d.tvTitle;
                                                        TextView textView10 = (TextView) a.m(i7, viewFindViewById);
                                                        if (textView10 != null) {
                                                            this.binding = new e(constraintLayout, ppButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
                                                            showAtCenter(getWindow());
                                                            e eVar = this.binding;
                                                            h.q(this, eVar != null ? eVar.f4058b : null);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
        CompleteCallback<Boolean> completeCallback;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = d.btnView;
        if (numValueOf == null || numValueOf.intValue() != i7 || (completeCallback = this.callback) == null) {
            return;
        }
        completeCallback.onComplete(Boolean.TRUE);
    }

    public final void setConfirmCallback(@Nullable CompleteCallback<Boolean> callback) {
        this.callback = callback;
    }

    public final void showLoading(boolean show) {
        PpButton ppButton;
        e eVar = this.binding;
        if (eVar == null || (ppButton = eVar.f4058b) == null) {
            return;
        }
        ppButton.b(show);
    }

    public final void update(@Nullable String mobile) {
        TextView textView;
        e eVar = this.binding;
        if (eVar == null || (textView = eVar.f4066o) == null) {
            return;
        }
        textView.setText(r0.Z(mobile));
    }
}
