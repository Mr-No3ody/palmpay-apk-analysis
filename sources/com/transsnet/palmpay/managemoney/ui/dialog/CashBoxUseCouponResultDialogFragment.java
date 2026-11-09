package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import L6.b;
import N8.ViewOnClickListenerC0468l;
import O6.f;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_use_coupon_result_fragment")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashBoxUseCouponResultDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxUseCouponResultDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32289C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CashBoxUseCouponResultDialogFragment newInstance$default(a aVar, boolean z3, long j6, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = true;
            }
            if ((i7 & 4) != 0) {
                str = "";
            }
            return aVar.newInstance(z3, j6, str);
        }

        @NotNull
        public final CashBoxUseCouponResultDialogFragment newInstance(boolean z3, long j6, @Nullable String str) {
            CashBoxUseCouponResultDialogFragment cashBoxUseCouponResultDialogFragment = new CashBoxUseCouponResultDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("orderState", z3);
            bundle.putLong("coupon_amount", j6);
            bundle.putString("err_msg", str);
            cashBoxUseCouponResultDialogFragment.setArguments(bundle);
            return cashBoxUseCouponResultDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cash_box_use_coupon_result_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = (int) (ScreenUtils.getScreenWidth() * 0.7f);
        this.f31246p = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView = (TextView) viewF.findViewById(c.tvCouponAmount);
            TextView textView2 = (TextView) viewF.findViewById(c.tvCouponTitle);
            TextView textView3 = (TextView) viewF.findViewById(c.tvCouponContent);
            RoundedTextView roundedTextView = (RoundedTextView) viewF.findViewById(c.rtvSaveNow);
            ImageView imageView = (ImageView) viewF.findViewById(c.ivOrderResult);
            boolean z3 = arguments.getBoolean("orderState");
            long j6 = arguments.getLong("coupon_amount");
            String string = arguments.getString("err_msg");
            textView.setText(r0.F(j6));
            textView.setTextColor(z3 ? requireContext().getColor(b.ppColorSuccess) : requireContext().getColor(b.ppColorError));
            textView2.setText(getString(z3 ? Jc.f.mm_create_cash_box_coupon_order_success_title : Jc.f.mm_create_cash_box_coupon_order_failed_title));
            if (z3) {
                string = getString(Jc.f.mm_create_cash_box_coupon_order_success_content);
            }
            textView3.setText(string);
            roundedTextView.setText(getString(z3 ? Jc.f.mm_action_save_now : Jc.f.mm_action_okay));
            imageView.setImageResource(z3 ? Jc.b.mm_icon_rocket_success : Jc.b.mm_icon_roctet_failed);
            roundedTextView.setOnClickListener(new ViewOnClickListenerC0468l(z3, this, 1));
        }
        this.f31242g = 17;
        return baseDialog;
    }
}
