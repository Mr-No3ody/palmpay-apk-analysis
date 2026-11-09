package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.rsp.QueryPopUpsReq;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OpenCashSuccDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "oneTouchBorrowView", "Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView;", "btnTv", "Landroid/widget/TextView;", "text2", "amountTv", "text1", "close", "Landroid/widget/ImageView;", "findViews", "", "handlerChain", "initViews", "fillData", "creditQuota", "", "productSubId", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenCashSuccDialog extends BaseChainResponsibilityDialog {

    @Nullable
    private TextView amountTv;

    @Nullable
    private TextView btnTv;

    @Nullable
    private ImageView close;

    @Nullable
    private OneTouchBorrowView oneTouchBorrowView;

    @Nullable
    private TextView text1;

    @Nullable
    private TextView text2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OpenCashSuccDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_result_open_cash_succ_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void findViews() {
        this.oneTouchBorrowView = (OneTouchBorrowView) findViewById(p116hb.c.oneTouchBorrowView);
        this.btnTv = (TextView) findViewById(p116hb.c.btnTv);
        this.text2 = (TextView) findViewById(p116hb.c.text2);
        this.amountTv = (TextView) findViewById(p116hb.c.amountTv);
        this.text1 = (TextView) findViewById(p116hb.c.text1);
        this.close = (ImageView) findViewById(p116hb.c.close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(OpenCashSuccDialog openCashSuccDialog, View view) {
        Pa.n0.g().m(openCashSuccDialog.getClass().getSimpleName().concat("_element_click"), "FlexiResult Pay", "");
        openCashSuccDialog.dismiss();
        if (TextUtils.isEmpty(openCashSuccDialog.getLoanProduct())) {
            N8.q0.v("/main/home", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = openCashSuccDialog.getActivity(openCashSuccDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, openCashSuccDialog.getLoanProduct(), (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    public final void fillData(long creditQuota, int productSubId) {
        show();
        TextView textView = this.amountTv;
        if (textView != null) {
            textView.setText(Pa.r0.F(creditQuota));
        }
        p171lb.c.f39296f.getInstance().d(productSubId, 22, null, new S0(this));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog
    public void handlerChain() {
        if (!SPUtils.getInstance().getBoolean(com.transsnet.palmpay.core.config.d.e(), false)) {
            C0.G.h(p221ob.c.f40268a).queryPopUps(new QueryPopUpsReq(11)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new T0(this));
            return;
        }
        BaseChainResponsibilityDialog nextChain = getNextChain();
        if (nextChain != null) {
            nextChain.handlerChain();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        TextView textView = this.text1;
        if (textView != null) {
            textView.setText(getContext().getString(p116hb.f.cs_you_get_flexi_loan_amount));
        }
        ImageView imageView = this.close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenCashSuccDialog f30016b;

                {
                    this.f30016b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30016b.dismiss();
                            break;
                        default:
                            OpenCashSuccDialog.initViews$lambda$2(this.f30016b, view);
                            break;
                    }
                }
            }, imageView);
        }
        TextView textView2 = this.btnTv;
        if (textView2 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenCashSuccDialog f30016b;

                {
                    this.f30016b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30016b.dismiss();
                            break;
                        default:
                            OpenCashSuccDialog.initViews$lambda$2(this.f30016b, view);
                            break;
                    }
                }
            }, textView2);
        }
        Pa.r0.R1(this.amountTv, "fonts/PalmPayNum-Bold.ttf");
    }
}
