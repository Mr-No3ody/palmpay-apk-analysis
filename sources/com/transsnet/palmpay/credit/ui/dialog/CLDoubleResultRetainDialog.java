package com.transsnet.palmpay.credit.ui.dialog;

import V9.C0714c;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.ui.view.TextCountDownView;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.TimeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLDoubleResultRetainDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "context", "Landroid/content/Context;", "layoutId", "", "<init>", "(Landroid/content/Context;I)V", "close", "Landroid/widget/ImageView;", "btnTv", "Landroid/view/View;", "countDownView", "Lcom/transsnet/palmpay/credit/ui/view/TextCountDownView;", "handlerChain", "", "initViews", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CLDoubleResultRetainDialog extends BaseChainResponsibilityDialog {

    @Nullable
    private View btnTv;

    @Nullable
    private ImageView close;

    @Nullable
    private TextCountDownView countDownView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLDoubleResultRetainDialog(@NotNull Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CLDoubleResultRetainDialog cLDoubleResultRetainDialog, View view) {
        if (p059e1.a.C("_show_new_loan_home", false)) {
            com.palmpay.lib.apm.launchcounter.util.d.I(536870912, "/credit_score/loan_home_activity");
        } else {
            N8.q0.u("/main/home");
        }
        cLDoubleResultRetainDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(CLDoubleResultRetainDialog cLDoubleResultRetainDialog, View view) {
        Pa.n0.g().m(cLDoubleResultRetainDialog.getClass().getSimpleName().concat("_element_click"), "Retaining BorrowNow", "");
        cLDoubleResultRetainDialog.dismiss();
        if (TextUtils.isEmpty(cLDoubleResultRetainDialog.getLoanProduct())) {
            com.palmpay.lib.apm.launchcounter.util.d.I(536870912, "/credit_score/loan_home_activity");
            return;
        }
        androidx.fragment.app.E activity = cLDoubleResultRetainDialog.getActivity(cLDoubleResultRetainDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, cLDoubleResultRetainDialog.getLoanProduct(), (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog
    public void handlerChain() {
        if (!TimeUtils.isToday(SPUtils.getInstance().getLong(com.transsnet.palmpay.core.config.d.d(), 0L))) {
            p221ob.c.f40268a.getInstance().getClass();
            p221ob.c.a().getActivityData().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 7));
            SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.d(), System.currentTimeMillis());
        } else {
            BaseChainResponsibilityDialog nextChain = getNextChain();
            if (nextChain != null) {
                nextChain.handlerChain();
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.close = (ImageView) findViewById(p116hb.c.close);
        this.btnTv = findViewById(p116hb.c.btnTv);
        this.countDownView = (TextCountDownView) findViewById(p116hb.c.countDownView);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        Pa.n0.g().m(getClass().getSimpleName().concat("_element_click"), "Loan retaining", "");
        TextCountDownView textCountDownView = this.countDownView;
        if (textCountDownView != null) {
            com.transsnet.palmpay.credit.ui.view.a aVar = textCountDownView.f30661e;
            if (aVar != null) {
                aVar.cancel();
                textCountDownView.f30661e = null;
            }
            com.transsnet.palmpay.credit.ui.view.a aVar2 = new com.transsnet.palmpay.credit.ui.view.a(textCountDownView);
            textCountDownView.f30661e = aVar2;
            aVar2.start();
        }
        ImageView imageView = this.close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLDoubleResultRetainDialog f30198b;

                {
                    this.f30198b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CLDoubleResultRetainDialog.initViews$lambda$1(this.f30198b, view);
                            break;
                        default:
                            CLDoubleResultRetainDialog.initViews$lambda$3(this.f30198b, view);
                            break;
                    }
                }
            }, imageView);
        }
        View view = this.btnTv;
        if (view != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLDoubleResultRetainDialog f30198b;

                {
                    this.f30198b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            CLDoubleResultRetainDialog.initViews$lambda$1(this.f30198b, view2);
                            break;
                        default:
                            CLDoubleResultRetainDialog.initViews$lambda$3(this.f30198b, view2);
                            break;
                    }
                }
            }, view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLDoubleResultRetainDialog(@NotNull Context context, int i7) {
        super(context, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CLDoubleResultRetainDialog(Context context, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? p116hb.d.cs_cl_double_result_retain_dialog : i7);
    }
}
