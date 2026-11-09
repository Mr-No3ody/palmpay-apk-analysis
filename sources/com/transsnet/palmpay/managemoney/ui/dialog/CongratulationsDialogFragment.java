package com.transsnet.palmpay.managemoney.ui.dialog;

import C0.G;
import Jc.c;
import Jc.d;
import La.i;
import O6.f;
import Oc.C0500c;
import Pa.AbstractC0511h;
import Pa.C0510g;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.ui.dialog.CongratulationsDialogFragment;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CongratulationsDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CongratulationsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f32292L = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Function0 f32293C = new i(22);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Function0 f32294H = new i(23);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CongratulationsDialogFragment newInstance$default(a aVar, String str, long j6, long j10, boolean z3, PayoutOption payoutOption, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                j6 = 0;
            }
            if ((i7 & 4) != 0) {
                j10 = 0;
            }
            if ((i7 & 8) != 0) {
                z3 = false;
            }
            return aVar.newInstance(str, j6, j10, z3, payoutOption);
        }

        @NotNull
        public final CongratulationsDialogFragment newInstance(@Nullable String str, long j6, long j10, boolean z3, @Nullable PayoutOption payoutOption) {
            CongratulationsDialogFragment congratulationsDialogFragment = new CongratulationsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.PRODUCT_NAME, str);
            bundle.putLong("total_back_amount", j6);
            bundle.putLong("total_mature_num", j10);
            bundle.putParcelable("payout_option", payoutOption);
            bundle.putBoolean("isDarkMode", z3);
            congratulationsDialogFragment.setArguments(bundle);
            return congratulationsDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_congratulations_dialog_fragnment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = (int) (ScreenUtils.getScreenWidth() * 0.78f);
        this.f31246p = false;
        this.f31243i = w.Animation_CommonDialog;
        this.f31242g = 17;
        final int i7 = 0;
        viewF.findViewById(c.rtvViewAll).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CongratulationsDialogFragment f6781b;

            {
                this.f6781b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CongratulationsDialogFragment congratulationsDialogFragment = this.f6781b;
                switch (i7) {
                    case 0:
                        CongratulationsDialogFragment.a aVar = CongratulationsDialogFragment.f32292L;
                        congratulationsDialogFragment.dismissAllowingStateLoss();
                        Function0 function0 = congratulationsDialogFragment.f32293C;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    default:
                        CongratulationsDialogFragment.a aVar2 = CongratulationsDialogFragment.f32292L;
                        congratulationsDialogFragment.dismissAllowingStateLoss();
                        Function0 function1 = congratulationsDialogFragment.f32294H;
                        if (function1 != null) {
                            function1.invoke();
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        viewF.findViewById(c.rtvCreateNew).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CongratulationsDialogFragment f6781b;

            {
                this.f6781b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CongratulationsDialogFragment congratulationsDialogFragment = this.f6781b;
                switch (i10) {
                    case 0:
                        CongratulationsDialogFragment.a aVar = CongratulationsDialogFragment.f32292L;
                        congratulationsDialogFragment.dismissAllowingStateLoss();
                        Function0 function0 = congratulationsDialogFragment.f32293C;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    default:
                        CongratulationsDialogFragment.a aVar2 = CongratulationsDialogFragment.f32292L;
                        congratulationsDialogFragment.dismissAllowingStateLoss();
                        Function0 function1 = congratulationsDialogFragment.f32294H;
                        if (function1 != null) {
                            function1.invoke();
                        }
                        break;
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            View viewFindViewById = viewF.findViewById(c.tvProductName);
            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(arguments.getString(FirebaseAnalytics.Param.PRODUCT_NAME));
            View viewFindViewById2 = viewF.findViewById(c.tvMaturedOrderNum);
            Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewF.findViewById(c.tvPayoutTips);
            Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById3;
            String strB = r0.B(arguments.getLong("total_back_amount"), true);
            long j6 = arguments.getLong("total_mature_num");
            PayoutOption payoutOption = (PayoutOption) arguments.getParcelable("payout_option");
            C0510g c0510g = AbstractC0511h.f7089a;
            c0510g.richText(textView, getResources().getString(Jc.f.mm_total_matured_nums, Long.valueOf(j6)), String.valueOf(j6), new C0500c(this, 4));
            textView.setVisibility(j6 > 0 ? 0 : 8);
            View viewFindViewById4 = viewF.findViewById(c.tvTotalBackAmount);
            Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            c0510g.richText((TextView) viewFindViewById4, G.o("Total Payout ", strB), strB, requireContext().getColor(arguments.getBoolean("isDarkMode", false) ? p.md_white_1000 : Jc.a.black));
            textView2.setText(getString(Jc.f.mm_fixed_saving_payout_tips, payoutOption != null ? payoutOption.getName() : null));
        }
        return baseDialog;
    }
}
