package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.rsp.QueryPopUpsReq;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0014J\u0010\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/AutoOpenCashSuccDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "btnTv", "Landroid/widget/TextView;", "text1", "close", "Landroid/widget/ImageView;", "amountTv", "handlerChain", "", "initViews", "fillData", "trafficChannel", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoOpenCashSuccDialog extends BaseChainResponsibilityDialog {

    @Nullable
    private TextView amountTv;

    @Nullable
    private TextView btnTv;

    @Nullable
    private ImageView close;

    @Nullable
    private TextView text1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoOpenCashSuccDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_result_auto_open_cash_succ_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(AutoOpenCashSuccDialog autoOpenCashSuccDialog, View view) {
        Pa.n0.g().m(autoOpenCashSuccDialog.getClass().getSimpleName().concat("_element_click"), "FlexiResult Pay", "");
        autoOpenCashSuccDialog.dismiss();
        if (TextUtils.isEmpty(autoOpenCashSuccDialog.getLoanProduct())) {
            N8.q0.v("/main/home", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = autoOpenCashSuccDialog.getActivity(autoOpenCashSuccDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, autoOpenCashSuccDialog.getLoanProduct(), (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    public final void fillData(@Nullable String trafficChannel) {
        show();
        if (TextUtils.equals("CALLBACK_USER_SELF_CREDIT_REJECT_JOB", trafficChannel)) {
            TextView textView = this.text1;
            if (textView != null) {
                textView.setText(BaseApplication.get().getString(p116hb.f.cs_cl_credit_failed_and_success_tips));
                return;
            }
            return;
        }
        TextView textView2 = this.text1;
        if (textView2 != null) {
            textView2.setText(BaseApplication.get().getString(p116hb.f.cs_cl_skip_credit_and_success_tips));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog
    public void handlerChain() {
        if (!SPUtils.getInstance().getBoolean(com.transsnet.palmpay.core.config.d.e(), false)) {
            C0.G.h(p221ob.c.f40268a).queryPopUps(new QueryPopUpsReq(11)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C1494b(this));
            return;
        }
        BaseChainResponsibilityDialog nextChain = getNextChain();
        if (nextChain != null) {
            nextChain.handlerChain();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.btnTv = (TextView) findViewById(p116hb.c.btnTv);
        this.text1 = (TextView) findViewById(p116hb.c.text1);
        this.close = (ImageView) findViewById(p116hb.c.close);
        this.amountTv = (TextView) findViewById(p116hb.c.amountTv);
        ImageView imageView = this.close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoOpenCashSuccDialog f30075b;

                {
                    this.f30075b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30075b.dismiss();
                            break;
                        default:
                            AutoOpenCashSuccDialog.initViews$lambda$2(this.f30075b, view);
                            break;
                    }
                }
            }, imageView);
        }
        TextView textView = this.btnTv;
        if (textView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoOpenCashSuccDialog f30075b;

                {
                    this.f30075b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30075b.dismiss();
                            break;
                        default:
                            AutoOpenCashSuccDialog.initViews$lambda$2(this.f30075b, view);
                            break;
                    }
                }
            }, textView);
        }
    }
}
