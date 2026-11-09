package com.transsnet.palmpay.credit.ui.fragment;

import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.ui.viewmodel.LoanHomeGuestViewModel;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p099gb.h;
import p186mb.d;
import p310ub.h1;
import p327vd.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/LoanHomeGuestFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/LoanHomeGuestViewModel;", "Lgb/h;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanHomeGuestFragment extends BaseMvvmVBFragment<LoanHomeGuestViewModel, h> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f30353o = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoanHomeGuestFragment newInstance() {
            LoanHomeGuestFragment loanHomeGuestFragment = new LoanHomeGuestFragment();
            loanHomeGuestFragment.setArguments(new Bundle());
            return loanHomeGuestFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ImageView rightImageView1;
        h hVar = (h) this.f27335j;
        if (hVar != null) {
            hVar.f37155c.setBackButtonClickListener(new c(this, 17));
        }
        h hVar2 = (h) this.f27335j;
        if (hVar2 != null && (rightImageView1 = hVar2.f37155c.getRightImageView1()) != null) {
            p220oa.h.l(new h1(15), rightImageView1);
        }
        h hVar3 = (h) this.f27335j;
        if (hVar3 != null) {
            hVar3.f37154b.setOnClickListener(new h1(16));
        }
        h hVar4 = (h) this.f27335j;
        if (hVar4 == null) {
            return 0;
        }
        LoanHomeBottomInfoView loanHomeBottomInfoView = hVar4.f37160i;
        LoanHomeBottomInfo loanHomeBottomInfo = d.f39634e.getInstance().f39636a;
        int i7 = LoanHomeBottomInfoView.f30793c;
        loanHomeBottomInfoView.e(loanHomeBottomInfo, null, null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(f.cs_fragment_loan_home_guest, viewGroup, false);
        int i7 = e.btnBorrowNow;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = e.clCard;
            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.ivLightning;
                if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.llPoints;
                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.titleBar;
                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                        if (ppTitleBar != null) {
                            i7 = e.tvAmount;
                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = e.tvBorrowUpTo;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = e.tvRateTip;
                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView3 != null) {
                                        i7 = e.tvTitle;
                                        TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView4 != null) {
                                            i7 = e.viewLoanHomeBottomInfo;
                                            LoanHomeBottomInfoView loanHomeBottomInfoView = (LoanHomeBottomInfoView) p059e1.a.m(i7, viewInflate);
                                            if (loanHomeBottomInfoView != null) {
                                                h hVar = new h((ConstraintLayout) viewInflate, ppButton, ppTitleBar, textView, textView2, textView3, textView4, loanHomeBottomInfoView);
                                                Intrinsics.checkNotNullExpressionValue(hVar, "inflate(...)");
                                                return hVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}
