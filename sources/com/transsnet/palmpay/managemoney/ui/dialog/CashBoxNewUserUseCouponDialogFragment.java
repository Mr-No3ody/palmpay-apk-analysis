package com.transsnet.palmpay.managemoney.ui.dialog;

import B6.ViewOnClickListenerC0087i;
import C9.C0138e;
import Jc.c;
import Jc.d;
import Nc.x;
import O6.f;
import Oc.C0500c;
import Oc.C0501d;
import Oc.h;
import Pa.AbstractC0511h;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxCampaignViewModel;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_use_coupon_fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashBoxNewUserUseCouponDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxCampaignViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxNewUserUseCouponDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxNewUserUseCouponDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxNewUserUseCouponDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,168:1\n152#2:169\n169#2:170\n*S KotlinDebug\n*F\n+ 1 CashBoxNewUserUseCouponDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxNewUserUseCouponDialogFragment\n*L\n115#1:169\n115#1:170\n*E\n"})
public final class CashBoxNewUserUseCouponDialogFragment extends BaseMvvmDialogFragment<CashBoxCampaignViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f32283L = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxNewUserUseCouponDialogFragment newInstance(long j6, @NotNull String couponId) {
            Intrinsics.checkNotNullParameter(couponId, "couponId");
            CashBoxNewUserUseCouponDialogFragment cashBoxNewUserUseCouponDialogFragment = new CashBoxNewUserUseCouponDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("orderAmount", j6);
            bundle.putString("ITEM_ID", couponId);
            cashBoxNewUserUseCouponDialogFragment.setArguments(bundle);
            return cashBoxNewUserUseCouponDialogFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cash_box_newuser_use_coupon_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31239d = (int) (ScreenUtils.getScreenWidth() * 0.92f);
        this.f31246p = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            View viewFindViewById = viewF.findViewById(c.layoutRoot);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = viewF.findViewById(c.ivClose);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = viewF.findViewById(c.tvProtocol);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            View viewFindViewById4 = viewF.findViewById(c.ckProtocol);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            View viewFindViewById5 = viewF.findViewById(c.rtvConfirm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            RoundedTextView roundedTextView = (RoundedTextView) viewFindViewById5;
            View viewFindViewById6 = viewF.findViewById(c.tvPaidCashBoxAccount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            long j6 = arguments.getLong("orderAmount");
            String string = arguments.getString("ITEM_ID");
            ((TextView) viewFindViewById6).setText(getString(Jc.f.mm_coupon_paid_into_cashbox_account, r0.F(j6)));
            ((ImageView) viewFindViewById2).setOnClickListener(new x(this, 7));
            ((CheckBox) viewFindViewById4).setOnCheckedChangeListener(new C0501d(roundedTextView, 1));
            roundedTextView.setOnClickListener(new ViewOnClickListenerC0087i(this, 18, string, (ConstraintLayout) viewFindViewById));
            AbstractC0511h.f7089a.richText((TextView) viewFindViewById3, getString(Jc.f.mm_cash_box_terms_and_conditions), "Terms and Conditions", new C0500c(this, 1));
            l lVar = ((CashBoxCampaignViewModel) j()).f32724g;
            if (lVar != null) {
                lVar.e(this, new C0138e(new h(this, j6)));
            }
        }
        this.f31242g = 17;
        return baseDialog;
    }
}
