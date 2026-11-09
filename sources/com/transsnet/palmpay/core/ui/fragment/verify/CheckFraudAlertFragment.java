package com.transsnet.palmpay.core.ui.fragment.verify;

import Bc.C0105b;
import Ja.C0341n;
import Ma.s;
import Pa.r0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckFraudAlertFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;
import p054dd.q;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckFraudAlertFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckFraudAlertFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckFraudAlertFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckFraudAlertFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,131:1\n260#2,10:132\n296#2:142\n260#2,10:143\n296#2:153\n*S KotlinDebug\n*F\n+ 1 CheckFraudAlertFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckFraudAlertFragment\n*L\n52#1:132,10\n52#1:142\n64#1:143,10\n64#1:153\n*E\n"})
public final class CheckFraudAlertFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f27979w = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0105b f27980j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27982p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f27983v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckFraudAlertFragment newInstance(@NotNull PayByOrderResp.DataBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            CheckFraudAlertFragment checkFraudAlertFragment = new CheckFraudAlertFragment();
            Bundle bundle = new Bundle();
            bundle.putString("transType", bean.transType);
            bundle.putString("orderNo", bean.orderNo);
            bundle.putString("token", bean.token);
            bundle.putString("desc", bean.riskTips);
            checkFraudAlertFragment.setArguments(bundle);
            return checkFraudAlertFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PayVerifyViewModel payVerifyViewModel = (PayVerifyViewModel) this.f27333i;
        l lVar = payVerifyViewModel != null ? payVerifyViewModel.f28072g : null;
        if (lVar != null) {
            lVar.e(this, new q(new C0341n(this, this, 0), 2));
        }
        PayVerifyViewModel payVerifyViewModel2 = (PayVerifyViewModel) this.f27333i;
        l lVar2 = payVerifyViewModel2 != null ? payVerifyViewModel2.f28073i : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new q(new C0341n(this, this, 1), 2));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_fraud_alert_fragment, viewGroup, false);
        int i7 = e.cancelBtn;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = e.ivIcon;
            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.submitBtn;
                PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton2 != null) {
                    i7 = e.tvContent;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = e.tvTitle;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = e.vClose;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                            if (iconicsImageView != null) {
                                i7 = e.viewContainer;
                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                    C0105b c0105b = new C0105b((ViewGroup) viewInflate, (Object) ppButton, (View) ppButton2, textView, textView2, (View) iconicsImageView, 18);
                                    this.f27980j = c0105b;
                                    return c0105b;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        C0105b c0105b = this.f27980j;
        if (c0105b != null) {
            final int i7 = 0;
            ((PpButton) c0105b.f666f).setOnClickListener(new View.OnClickListener(this) { // from class: Ja.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckFraudAlertFragment f4665b;

                {
                    this.f4665b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerifyViewModel payVerifyViewModel;
                    CheckFraudAlertFragment checkFraudAlertFragment = this.f4665b;
                    switch (i7) {
                        case 0:
                            CheckFraudAlertFragment.a aVar = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0() && (payVerifyViewModel = (PayVerifyViewModel) checkFraudAlertFragment.f27333i) != null) {
                                String token = checkFraudAlertFragment.t;
                                if (token == null) {
                                    token = "";
                                }
                                Intrinsics.checkNotNullParameter(token, "token");
                                p140j8.f.s(payVerifyViewModel, new Ma.r(token, null), payVerifyViewModel.f28072g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        case 1:
                            CheckFraudAlertFragment.a aVar2 = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0()) {
                                checkFraudAlertFragment.z();
                                break;
                            }
                            break;
                        default:
                            CheckFraudAlertFragment.a aVar3 = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0()) {
                                checkFraudAlertFragment.z();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0105b c0105b2 = this.f27980j;
        if (c0105b2 != null) {
            final int i10 = 1;
            ((PpButton) c0105b2.f665e).setOnClickListener(new View.OnClickListener(this) { // from class: Ja.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckFraudAlertFragment f4665b;

                {
                    this.f4665b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerifyViewModel payVerifyViewModel;
                    CheckFraudAlertFragment checkFraudAlertFragment = this.f4665b;
                    switch (i10) {
                        case 0:
                            CheckFraudAlertFragment.a aVar = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0() && (payVerifyViewModel = (PayVerifyViewModel) checkFraudAlertFragment.f27333i) != null) {
                                String token = checkFraudAlertFragment.t;
                                if (token == null) {
                                    token = "";
                                }
                                Intrinsics.checkNotNullParameter(token, "token");
                                p140j8.f.s(payVerifyViewModel, new Ma.r(token, null), payVerifyViewModel.f28072g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        case 1:
                            CheckFraudAlertFragment.a aVar2 = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0()) {
                                checkFraudAlertFragment.z();
                                break;
                            }
                            break;
                        default:
                            CheckFraudAlertFragment.a aVar3 = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0()) {
                                checkFraudAlertFragment.z();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0105b c0105b3 = this.f27980j;
        if (c0105b3 != null) {
            final int i11 = 2;
            ((IconicsImageView) c0105b3.f667g).setOnClickListener(new View.OnClickListener(this) { // from class: Ja.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckFraudAlertFragment f4665b;

                {
                    this.f4665b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerifyViewModel payVerifyViewModel;
                    CheckFraudAlertFragment checkFraudAlertFragment = this.f4665b;
                    switch (i11) {
                        case 0:
                            CheckFraudAlertFragment.a aVar = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0() && (payVerifyViewModel = (PayVerifyViewModel) checkFraudAlertFragment.f27333i) != null) {
                                String token = checkFraudAlertFragment.t;
                                if (token == null) {
                                    token = "";
                                }
                                Intrinsics.checkNotNullParameter(token, "token");
                                p140j8.f.s(payVerifyViewModel, new Ma.r(token, null), payVerifyViewModel.f28072g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        case 1:
                            CheckFraudAlertFragment.a aVar2 = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0()) {
                                checkFraudAlertFragment.z();
                                break;
                            }
                            break;
                        default:
                            CheckFraudAlertFragment.a aVar3 = CheckFraudAlertFragment.f27979w;
                            if (!r0.U0()) {
                                checkFraudAlertFragment.z();
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27981o = arguments.getString("transType");
            this.f27982p = arguments.getString("orderNo");
            this.t = arguments.getString("token");
            this.f27983v = arguments.getString("desc");
        }
        C0105b c0105b = this.f27980j;
        if (c0105b == null) {
            return 0;
        }
        TextView textView = (TextView) c0105b.f663c;
        String str = this.f27983v;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.verify.BaseVerifyFragment
    public final void onBackPressed() {
        z();
    }

    public final void z() {
        PayVerifyViewModel payVerifyViewModel = (PayVerifyViewModel) this.f27333i;
        if (payVerifyViewModel != null) {
            String token = this.t;
            if (token == null) {
                token = "";
            }
            String str = this.f27983v;
            if (str == null) {
                str = "";
            }
            Intrinsics.checkNotNullParameter(token, "token");
            f.s(payVerifyViewModel, new Ma.q(token, str, null), payVerifyViewModel.f28073i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        PayVerifyViewModel payVerifyViewModel2 = (PayVerifyViewModel) this.f27333i;
        if (payVerifyViewModel2 != null) {
            String str2 = this.f27981o;
            String str3 = this.f27982p;
            String orderNo = str3 != null ? str3 : "";
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            f.s(payVerifyViewModel2, new s(str2, orderNo, null), payVerifyViewModel2.f28074j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
