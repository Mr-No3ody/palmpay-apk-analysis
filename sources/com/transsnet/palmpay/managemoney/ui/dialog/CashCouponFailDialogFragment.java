package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import O6.f;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.managemoney.ui.dialog.CashCouponFailDialogFragment;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashCouponFailDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashCouponFailDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32290C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CashCouponFailDialogFragment newInstance$default(a aVar, long j6, boolean z3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j6 = 0;
            }
            if ((i7 & 2) != 0) {
                z3 = false;
            }
            return aVar.newInstance(j6, z3);
        }

        @NotNull
        public final CashCouponFailDialogFragment newInstance(long j6, boolean z3) {
            CashCouponFailDialogFragment cashCouponFailDialogFragment = new CashCouponFailDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("coupon_amount", j6);
            bundle.putBoolean("isDarkMode", z3);
            cashCouponFailDialogFragment.setArguments(bundle);
            return cashCouponFailDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        View viewFindViewById;
        View viewFindViewById2;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cash_coupon_fail_dialog_fragnment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = (int) (ScreenUtils.getScreenWidth() * 0.92f);
        this.f31246p = false;
        this.f31243i = w.Animation_CommonDialog;
        this.f31242g = 17;
        if (viewF != null && (viewFindViewById2 = viewF.findViewById(c.ivClose)) != null) {
            final int i7 = 0;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashCouponFailDialogFragment f6777b;

                {
                    this.f6777b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashCouponFailDialogFragment cashCouponFailDialogFragment = this.f6777b;
                    switch (i7) {
                        case 0:
                            CashCouponFailDialogFragment.a aVar = CashCouponFailDialogFragment.f32290C;
                            cashCouponFailDialogFragment.dismissAllowingStateLoss();
                            break;
                        default:
                            CashCouponFailDialogFragment.a aVar2 = CashCouponFailDialogFragment.f32290C;
                            cashCouponFailDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        if (viewF != null && (viewFindViewById = viewF.findViewById(c.rtvCreateNew)) != null) {
            final int i10 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashCouponFailDialogFragment f6777b;

                {
                    this.f6777b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashCouponFailDialogFragment cashCouponFailDialogFragment = this.f6777b;
                    switch (i10) {
                        case 0:
                            CashCouponFailDialogFragment.a aVar = CashCouponFailDialogFragment.f32290C;
                            cashCouponFailDialogFragment.dismissAllowingStateLoss();
                            break;
                        default:
                            CashCouponFailDialogFragment.a aVar2 = CashCouponFailDialogFragment.f32290C;
                            cashCouponFailDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView = viewF != null ? (TextView) viewF.findViewById(c.tvCouponAmount) : null;
            if (textView != null) {
                textView.setText(r0.B(arguments.getLong("coupon_amount"), true));
            }
        }
        return baseDialog;
    }
}
