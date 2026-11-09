package com.transsnet.palmpay.credit.ui.fragment.cashloan;

import Ab.A;
import Ab.D;
import Ab.y;
import Ya.f;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.credit.viewmodel.OcEmptyViewModel;
import df.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p071ef.b;
import p161kf.e;
import p220oa.h;
import p221ob.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLInstallmentUpGradeSuccFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcEmptyViewModel;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentUpGradeSuccFragment extends BaseMvvmFragment<OcEmptyViewModel> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a f30601q0 = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30602A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30603B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30604C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30605H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30606L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30607M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30608Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30609X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f30610Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30611Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30612j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto f30613k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30615p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public e f30616p0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30618w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLInstallmentUpGradeSuccFragment newInstance() {
            Bundle bundle = new Bundle();
            CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = new CLInstallmentUpGradeSuccFragment();
            cLInstallmentUpGradeSuccFragment.setArguments(bundle);
            return cLInstallmentUpGradeSuccFragment;
        }

        private a() {
        }
    }

    public CLInstallmentUpGradeSuccFragment() {
        final int i7 = 8;
        this.f30612j = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i7) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i10 = 15;
        this.f30614o = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i10) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i11 = 0;
        this.f30615p = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i11) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i12 = 1;
        this.t = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i12) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i13 = 2;
        this.f30617v = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i13) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i14 = 3;
        this.f30618w = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i14) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i15 = 4;
        this.f30602A = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i15) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i16 = 5;
        this.f30603B = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i16) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i17 = 6;
        this.f30604C = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i17) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i18 = 7;
        this.f30605H = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i18) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i19 = 9;
        this.f30606L = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i19) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i20 = 10;
        this.f30607M = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i20) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i21 = 11;
        this.f30608Q = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i21) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i22 = 12;
        this.f30609X = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i22) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i23 = 13;
        this.f30610Y = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i23) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
        final int i24 = 14;
        this.f30611Z = C2131j.b(new Function0(this) { // from class: Ab.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeSuccFragment f151b;

            {
                this.f151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f151b;
                switch (i24) {
                    case 0:
                        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view != null) {
                            return (RelativeLayout) view.findViewById(Ya.e.rl_more_loan_service);
                        }
                        return null;
                    case 1:
                        CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view2 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Ya.e.ccuial_learn_more);
                        }
                        return null;
                    case 2:
                        CLInstallmentUpGradeSuccFragment.a aVar3 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view3 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Ya.e.ccuial_borrow);
                        }
                        return null;
                    case 3:
                        CLInstallmentUpGradeSuccFragment.a aVar4 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view4 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Ya.e.ccuial_day_term);
                        }
                        return null;
                    case 4:
                        CLInstallmentUpGradeSuccFragment.a aVar5 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view5 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Ya.e.ccuial_day_term_unit);
                        }
                        return null;
                    case 5:
                        CLInstallmentUpGradeSuccFragment.a aVar6 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view6 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Ya.e.ccuial_installments);
                        }
                        return null;
                    case 6:
                        CLInstallmentUpGradeSuccFragment.a aVar7 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view7 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Ya.e.ccuial_loan_period);
                        }
                        return null;
                    case 7:
                        CLInstallmentUpGradeSuccFragment.a aVar8 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view8 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Ya.e.ccuial_term);
                        }
                        return null;
                    case 8:
                        CLInstallmentUpGradeSuccFragment.a aVar9 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view9 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Ya.e.tv_more_loan_service_btn);
                        }
                        return null;
                    case 9:
                        CLInstallmentUpGradeSuccFragment.a aVar10 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view10 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(Ya.e.ccuial_amount);
                        }
                        return null;
                    case 10:
                        CLInstallmentUpGradeSuccFragment.a aVar11 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view11 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Ya.e.terms_tips);
                        }
                        return null;
                    case 11:
                        CLInstallmentUpGradeSuccFragment.a aVar12 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view12 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(Ya.e.daily_interest2);
                        }
                        return null;
                    case 12:
                        CLInstallmentUpGradeSuccFragment.a aVar13 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view13 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(Ya.e.daily_interest);
                        }
                        return null;
                    case 13:
                        CLInstallmentUpGradeSuccFragment.a aVar14 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view14 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(Ya.e.tv_upgrade_succ_title);
                        }
                        return null;
                    case 14:
                        CLInstallmentUpGradeSuccFragment.a aVar15 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view15 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view15 != null) {
                            return (PpTitleBar) view15.findViewById(Ya.e.titleBar);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeSuccFragment.a aVar16 = CLInstallmentUpGradeSuccFragment.f30601q0;
                        View view16 = cLInstallmentUpGradeSuccFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(Ya.e.tv_more_loan_service_desc);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_install_upgrade_succ_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        showLoadingDialog(true);
        p221ob.a aVar = c.f40268a;
        aVar.getInstance().getClass();
        d<CLMainResp> cashLoanNew = c.a().getCashLoanNew();
        aVar.getInstance().getClass();
        cashLoanNew.l(c.a().getInstallmentLoanMainPage(), new A8.a(new y(0), 3)).k(p298tf.f.f42629b).i(b.a()).subscribe(new D(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ImageView backImageView;
        PpTitleBar ppTitleBar = (PpTitleBar) this.f30611Z.getValue();
        if (ppTitleBar != null && (backImageView = ppTitleBar.getBackImageView()) != null) {
            h.l(new A(this, 0), backImageView);
        }
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.f30616p0;
        if (eVar != null) {
            p001if.a.a(eVar);
        }
    }

    public final void t() {
        e eVar = this.f30616p0;
        if (eVar != null) {
            p001if.a.a(eVar);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", 9);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str = Eb.a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanBorrowFlexiLoan");
    }
}
