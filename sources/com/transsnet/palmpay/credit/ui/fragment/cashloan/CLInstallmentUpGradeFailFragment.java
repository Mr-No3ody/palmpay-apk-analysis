package com.transsnet.palmpay.credit.ui.fragment.cashloan;

import A8.b;
import Ab.ViewOnClickListenerC0053e;
import Ya.f;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeFailFragment;
import com.transsnet.palmpay.credit.viewmodel.OcEmptyViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLInstallmentUpGradeFailFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcEmptyViewModel;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentUpGradeFailFragment extends BaseMvvmFragment<OcEmptyViewModel> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f30589p = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30590j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30591o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLInstallmentUpGradeFailFragment newInstance() {
            Bundle bundle = new Bundle();
            CLInstallmentUpGradeFailFragment cLInstallmentUpGradeFailFragment = new CLInstallmentUpGradeFailFragment();
            cLInstallmentUpGradeFailFragment.setArguments(bundle);
            return cLInstallmentUpGradeFailFragment;
        }

        private a() {
        }
    }

    public CLInstallmentUpGradeFailFragment() {
        final int i7 = 0;
        this.f30590j = C2131j.b(new Function0(this) { // from class: Ab.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeFailFragment f141b;

            {
                this.f141b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeFailFragment cLInstallmentUpGradeFailFragment = this.f141b;
                switch (i7) {
                    case 0:
                        CLInstallmentUpGradeFailFragment.a aVar = CLInstallmentUpGradeFailFragment.f30589p;
                        View view = cLInstallmentUpGradeFailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Ya.e.tvOk);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeFailFragment.a aVar2 = CLInstallmentUpGradeFailFragment.f30589p;
                        View view2 = cLInstallmentUpGradeFailFragment.f27318b;
                        if (view2 != null) {
                            return (PpTitleBar) view2.findViewById(Ya.e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30591o = C2131j.b(new Function0(this) { // from class: Ab.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradeFailFragment f141b;

            {
                this.f141b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentUpGradeFailFragment cLInstallmentUpGradeFailFragment = this.f141b;
                switch (i10) {
                    case 0:
                        CLInstallmentUpGradeFailFragment.a aVar = CLInstallmentUpGradeFailFragment.f30589p;
                        View view = cLInstallmentUpGradeFailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Ya.e.tvOk);
                        }
                        return null;
                    default:
                        CLInstallmentUpGradeFailFragment.a aVar2 = CLInstallmentUpGradeFailFragment.f30589p;
                        View view2 = cLInstallmentUpGradeFailFragment.f27318b;
                        if (view2 != null) {
                            return (PpTitleBar) view2.findViewById(Ya.e.titleBar);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_install_upgrade_fail_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        h.q(new b(this, 2), (TextView) this.f30590j.getValue());
        PpTitleBar ppTitleBar = (PpTitleBar) this.f30591o.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.setBackButtonClickListener(new ViewOnClickListenerC0053e(1));
        }
        super.o();
        return 0;
    }
}
