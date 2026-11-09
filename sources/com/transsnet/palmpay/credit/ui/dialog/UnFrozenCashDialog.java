package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/UnFrozenCashDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "btnTv", "Landroid/widget/TextView;", "close", "Landroid/widget/ImageView;", "findViews", "", "handlerChain", "initViews", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnFrozenCashDialog extends BaseChainResponsibilityDialog {

    @Nullable
    private TextView btnTv;

    @Nullable
    private ImageView close;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UnFrozenCashDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_unfrozen_flexi_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void findViews() {
        this.btnTv = (TextView) findViewById(p116hb.c.btnTv);
        this.close = (ImageView) findViewById(p116hb.c.close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(UnFrozenCashDialog unFrozenCashDialog, View view) {
        int id2 = view.getId();
        if (id2 == p116hb.c.close) {
            unFrozenCashDialog.dismiss();
            return;
        }
        if (id2 == p116hb.c.btnTv) {
            if (TextUtils.isEmpty(unFrozenCashDialog.getLoanProduct())) {
                N8.q0.v("/main/home", "tab", "finance");
            } else {
                androidx.fragment.app.E activity = unFrozenCashDialog.getActivity(unFrozenCashDialog.getContext());
                if (activity != null) {
                    ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
                    androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    iLoanCreditService.startBorrow(supportFragmentManager, unFrozenCashDialog.getLoanProduct(), (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
                }
            }
            unFrozenCashDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog
    public void handlerChain() {
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        TextView textView = this.btnTv;
        if (textView != null) {
            textView.setText(getContext().getString(p025ba.k.core_borrow_now));
        }
        TextView textView2 = this.btnTv;
        if (textView2 != null) {
            textView2.setBackgroundResource(p116hb.b.cs_cl_borrow_txt_bg);
        }
        p220oa.h.q(new ViewOnClickListenerC1533v(this, 16), this.btnTv, this.close);
    }
}
