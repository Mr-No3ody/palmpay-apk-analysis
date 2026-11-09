package com.transsnet.palmpay.managemoney.ui.fragment;

import Pa.AbstractC0511h;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/CashBoxAutoSaveFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxAutoSaveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxAutoSaveFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxAutoSaveFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,337:1\n115#2,8:338\n145#2:346\n171#2,12:347\n215#2:359\n*S KotlinDebug\n*F\n+ 1 CashBoxAutoSaveFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxAutoSaveFragment\n*L\n95#1:338,8\n95#1:346\n102#1:347,12\n102#1:359\n*E\n"})
public final class CashBoxAutoSaveFragment extends BaseMvvmFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f32343Y = new a(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public GetAutoTransferConfigResp f32350Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f32351X;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32352j = C2131j.b(new C1579a(this, 7));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32353o = C2131j.b(new C1579a(this, 10));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32354p = C2131j.b(new C1579a(this, 11));
    public final p355xf.t t = C2131j.b(new C1579a(this, 12));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32355v = C2131j.b(new C1579a(this, 0));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32356w = C2131j.b(new C1579a(this, 1));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32344A = C2131j.b(new C1579a(this, 2));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32345B = C2131j.b(new C1579a(this, 3));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32346C = C2131j.b(new C1579a(this, 4));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32347H = C2131j.b(new C1579a(this, 5));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32348L = C2131j.b(new C1579a(this, 8));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f32349M = C2131j.b(new C1579a(this, 9));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxAutoSaveFragment newInstance(@Nullable GetAutoTransferConfigResp getAutoTransferConfigResp) {
            CashBoxAutoSaveFragment cashBoxAutoSaveFragment = new CashBoxAutoSaveFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("auto_transfer_config", getAutoTransferConfigResp);
            cashBoxAutoSaveFragment.setArguments(bundle);
            return cashBoxAutoSaveFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_cash_box_auto_save_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = cashBoxViewModel != null ? cashBoxViewModel.f32741Y : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new V8.w(this, 8), 16));
        }
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = cashBoxViewModel2 != null ? cashBoxViewModel2.f32748k0 : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new Wd.I(new T8.o(16, this, this), 16));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        CashBoxViewModel cashBoxViewModel;
        if (this.f32350Q != null || (cashBoxViewModel = (CashBoxViewModel) this.f27333i) == null) {
            return;
        }
        cashBoxViewModel.f();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Pa.n0.g().v("Auto_Save_View");
        if (!org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().j(this);
        }
        Bundle arguments = getArguments();
        GetAutoTransferConfigResp getAutoTransferConfigResp = arguments != null ? (GetAutoTransferConfigResp) arguments.getParcelable("auto_transfer_config") : null;
        this.f32350Q = getAutoTransferConfigResp;
        this.f32351X = getAutoTransferConfigResp != null;
        p355xf.t tVar = this.f32348L;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            S6.a aVar = S6.a.pay_Setup;
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
            ImageView imageView = ppTitleBar.f24624e;
            if (imageView != null) {
                imageView.setImageDrawable(p059e1.a.h(ppTitleBar.getContext(), aVar, null, iColorInt, 24));
            }
        }
        PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar2 != null) {
            ppTitleBar2.setRightImageView1ClickListener(new ViewOnClickListenerC1478l(18));
        }
        t();
        TextView textView = (TextView) this.f32352j.getValue();
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC1580b(this, 0));
        }
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        CashBoxViewModel cashBoxViewModel;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() != 2457 || (cashBoxViewModel = (CashBoxViewModel) this.f27333i) == null) {
            return;
        }
        cashBoxViewModel.f();
    }

    public final void t() {
        GetAutoTransferConfigResp getAutoTransferConfigResp = this.f32350Q;
        p355xf.t tVar = this.f32355v;
        p355xf.t tVar2 = this.f32345B;
        String str = null;
        int i7 = 0;
        if (getAutoTransferConfigResp == null || getAutoTransferConfigResp.isAutoTransfer != 1) {
            NestedScrollView nestedScrollView = (NestedScrollView) tVar2.getValue();
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            LinearLayout linearLayout = (LinearLayout) tVar.getValue();
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ImageView imageView = (ImageView) this.f32346C.getValue();
            if (Pa.i0.T()) {
                GetAutoTransferConfigResp getAutoTransferConfigResp2 = this.f32350Q;
                if (getAutoTransferConfigResp2 != null) {
                    str = getAutoTransferConfigResp2.darkAutoTransferIntroduceUrl;
                }
            } else {
                GetAutoTransferConfigResp getAutoTransferConfigResp3 = this.f32350Q;
                if (getAutoTransferConfigResp3 != null) {
                    str = getAutoTransferConfigResp3.autoTransferIntroduceUrl;
                }
            }
            Pa.r0.h1(imageView, str, Jc.b.mm_bg_intro_banner);
            RoundedTextView roundedTextView = (RoundedTextView) this.f32344A.getValue();
            if (roundedTextView != null) {
                roundedTextView.setOnClickListener(new ViewOnClickListenerC1580b(this, 2));
            }
            TextView textView = (TextView) this.f32356w.getValue();
            if (textView != null) {
                AbstractC0511h.f7089a.richText(textView, getString(Jc.f.mm_cashbox_auto_save_transfer_agreement), "Automatic Saving Service Agreement", new C1581c(this, 1));
            }
            TextView textView2 = (TextView) this.f32347H.getValue();
            if (textView2 != null) {
                AbstractC0511h.f7089a.richText(textView2, "Turn on Auto Save, money in your PalmPay Balance will be automatically move to CashBox to Earn Daily", "Earn Daily", new C1581c(this, 2));
                return;
            }
            return;
        }
        NestedScrollView nestedScrollView2 = (NestedScrollView) tVar2.getValue();
        if (nestedScrollView2 != null) {
            nestedScrollView2.setVisibility(8);
        }
        LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        p355xf.t tVar3 = this.f32354p;
        Pa.r0.R1((TextView) tVar3.getValue(), "fonts/PalmPayNum-Bold.ttf");
        TextView textView3 = (TextView) tVar3.getValue();
        if (textView3 != null) {
            GetInterestRateConfigResp getInterestRateConfigResp = Kc.f.f4999b.getInstance().f5000a;
            String str2 = String.format("%s%%", Arrays.copyOf(new Object[]{Pa.r0.z0(String.valueOf(Pa.r0.w1(getInterestRateConfigResp != null ? getInterestRateConfigResp.getProductRate() : null, "100")))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView3.setText(str2);
        }
        GetAutoTransferConfigResp getAutoTransferConfigResp4 = this.f32350Q;
        long j6 = getAutoTransferConfigResp4 != null ? getAutoTransferConfigResp4.reserveAmount : 0L;
        p355xf.t tVar4 = this.f32349M;
        if (getAutoTransferConfigResp4 == null || getAutoTransferConfigResp4.reserveSet != 1 || j6 <= 0) {
            TextView textView4 = (TextView) tVar4.getValue();
            if (textView4 != null) {
                textView4.setText("Money in your PalmPay Balance will be automatically credited to your CashBox to Earn Daily for you");
            }
        } else {
            TextView textView5 = (TextView) tVar4.getValue();
            if (textView5 != null) {
                AbstractC0511h.f7089a.richText(textView5, getResources().getString(Jc.f.mm_auto_save_amount, Pa.r0.B(j6, true)), Pa.r0.B(j6, true), new C1581c(this, 0));
            }
        }
        RoundedTextView roundedTextView2 = (RoundedTextView) this.f32353o.getValue();
        if (roundedTextView2 != null) {
            roundedTextView2.setOnClickListener(new ViewOnClickListenerC1580b(this, 1));
        }
        p355xf.t tVar5 = this.t;
        TextView textView6 = (TextView) tVar5.getValue();
        if (textView6 != null) {
            textView6.setText("ON");
        }
        TextView textView7 = (TextView) tVar5.getValue();
        if (textView7 != null) {
            GetAutoTransferConfigResp getAutoTransferConfigResp5 = this.f32350Q;
            textView7.setTextColor((getAutoTransferConfigResp5 == null || getAutoTransferConfigResp5.isAutoTransfer != 1) ? requireContext().getColor(L6.b.ppColorError) : requireContext().getColor(L6.b.ppColorSuccess));
        }
        TextView textView8 = (TextView) tVar5.getValue();
        if (textView8 != null) {
            Drawable drawable = requireContext().getDrawable(Jc.b.mm_bg_auto_save);
            Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
            LevelListDrawable levelListDrawable = (LevelListDrawable) drawable;
            GetAutoTransferConfigResp getAutoTransferConfigResp6 = this.f32350Q;
            if (getAutoTransferConfigResp6 != null && getAutoTransferConfigResp6.isAutoTransfer == 1) {
                i7 = 1;
            }
            levelListDrawable.setLevel(i7);
            textView8.setBackground(levelListDrawable);
        }
    }
}
