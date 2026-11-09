package com.transsnet.palmpay.managemoney.ui.dialog;

import C0.G;
import C9.C0138e;
import C9.C0139f;
import Gb.T;
import Jc.c;
import Jc.d;
import L6.b;
import Nc.x;
import O6.f;
import Oc.C0501d;
import Oc.C0502e;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashBoxNewUserOpenDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxNewUserOpenDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxNewUserOpenDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxNewUserOpenDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,244:1\n152#2:245\n169#2:246\n*S KotlinDebug\n*F\n+ 1 CashBoxNewUserOpenDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxNewUserOpenDialogFragment\n*L\n166#1:245\n166#1:246\n*E\n"})
public final class CashBoxNewUserOpenDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f32282L = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxNewUserOpenDialogFragment newInstance(long j6) {
            CashBoxNewUserOpenDialogFragment cashBoxNewUserOpenDialogFragment = new CashBoxNewUserOpenDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("orderAmount", j6);
            cashBoxNewUserOpenDialogFragment.setArguments(bundle);
            return cashBoxNewUserOpenDialogFragment;
        }

        private a() {
        }
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
            TextView textView = (TextView) viewFindViewById3;
            View viewFindViewById4 = viewF.findViewById(c.ckProtocol);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            View viewFindViewById5 = viewF.findViewById(c.rtvConfirm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            RoundedTextView roundedTextView = (RoundedTextView) viewFindViewById5;
            View viewFindViewById6 = viewF.findViewById(c.tvPaidCashBoxAccount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            ((TextView) viewFindViewById6).setText(getString(Jc.f.mm_coupon_paid_into_cashbox_account, r0.F(arguments.getLong("orderAmount"))));
            ((ImageView) viewFindViewById2).setOnClickListener(new x(this, 6));
            ((CheckBox) viewFindViewById4).setOnCheckedChangeListener(new C0501d(roundedTextView, 0));
            roundedTextView.setOnClickListener(new T(29, this, (ConstraintLayout) viewFindViewById));
            int iColorInt = CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext());
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            textView.setText(G.i("I agree to").appendSpace(SizeUtils.dp2px(2.0f)).append("Terms & Conditions").setForegroundColor(iColorInt).setClickSpan(new C0502e(this, 0)).appendSpace(SizeUtils.dp2px(2.0f)).append("and").appendSpace(SizeUtils.dp2px(2.0f)).append("Privacy Policy").setForegroundColor(iColorInt).setClickSpan(new C0502e(this, 1)).appendSpace(SizeUtils.dp2px(2.0f)).append("to open a CashBox account. I also agree to the CashBox").appendSpace(SizeUtils.dp2px(2.0f)).append("Auto Save Agreement").setForegroundColor(iColorInt).setClickSpan(new C0502e(this, 2)).appendSpace(SizeUtils.dp2px(2.0f)).append("to enable Auto Save.").create());
            l lVar = ((CashBoxViewModel) j()).f32761x0;
            if (lVar != null) {
                lVar.e(this, new C0138e(new C0139f(this, 19), (short) 0));
            }
        }
        this.f31242g = 17;
        return baseDialog;
    }
}
