package com.transsnet.palmpay.credit.view;

import Ce.ViewOnClickListenerC0159a;
import Gb.C0282e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView;
import com.transsnet.palmpay.credit.view.CLMultipleCashProductView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/view/CLMultipleCashProductView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/LinearLayout;", "a", "Lkotlin/Lazy;", "getAgreement_ll", "()Landroid/widget/LinearLayout;", "agreement_ll", "Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView;", "b", "getOneTouchBorrowView", "()Lcom/transsnet/palmpay/credit/ui/view/OneTouchBorrowView;", "oneTouchBorrowView", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMultipleCashProductView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30722c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLMultipleCashProductView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30723a = C2131j.b(new Function0(this) { // from class: Gb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMultipleCashProductView f3270b;

            {
                this.f3270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMultipleCashProductView cLMultipleCashProductView = this.f3270b;
                switch (i7) {
                    case 0:
                        int i10 = CLMultipleCashProductView.f30722c;
                        return (LinearLayout) cLMultipleCashProductView.findViewById(Ya.e.agreement_ll);
                    default:
                        int i11 = CLMultipleCashProductView.f30722c;
                        return (OneTouchBorrowView) cLMultipleCashProductView.findViewById(Ya.e.oneTouchBorrowView);
                }
            }
        });
        final int i10 = 1;
        this.f30724b = C2131j.b(new Function0(this) { // from class: Gb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMultipleCashProductView f3270b;

            {
                this.f3270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMultipleCashProductView cLMultipleCashProductView = this.f3270b;
                switch (i10) {
                    case 0:
                        int i11 = CLMultipleCashProductView.f30722c;
                        return (LinearLayout) cLMultipleCashProductView.findViewById(Ya.e.agreement_ll);
                    default:
                        int i12 = CLMultipleCashProductView.f30722c;
                        return (OneTouchBorrowView) cLMultipleCashProductView.findViewById(Ya.e.oneTouchBorrowView);
                }
            }
        });
        View.inflate(context, f.cs_cl_multiple_cash_product_layout, this);
    }

    private final LinearLayout getAgreement_ll() {
        return (LinearLayout) this.f30723a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OneTouchBorrowView getOneTouchBorrowView() {
        return (OneTouchBorrowView) this.f30724b.getValue();
    }

    public final void b() {
        PpButton ppButton;
        OneTouchBorrowView oneTouchBorrowView = getOneTouchBorrowView();
        if (oneTouchBorrowView == null || (ppButton = oneTouchBorrowView.f30649d) == null) {
            return;
        }
        ppButton.b(false);
    }

    public final void c(CLRepaymentPlanData cLRepaymentPlanData) {
        BorrowCLInfoView borrowCLInfoView;
        OneTouchBorrowView oneTouchBorrowView = getOneTouchBorrowView();
        if (oneTouchBorrowView != null && (borrowCLInfoView = oneTouchBorrowView.f30650e) != null) {
            borrowCLInfoView.d(cLRepaymentPlanData);
        }
        OneTouchBorrowView oneTouchBorrowView2 = getOneTouchBorrowView();
        if (oneTouchBorrowView2 != null) {
            oneTouchBorrowView2.setOneTouchBorrowListener(new C0282e(this));
        }
        LinearLayout agreement_ll = getAgreement_ll();
        if (agreement_ll != null) {
            h.l(new ViewOnClickListenerC0159a(cLRepaymentPlanData, 17), agreement_ll);
        }
    }
}
