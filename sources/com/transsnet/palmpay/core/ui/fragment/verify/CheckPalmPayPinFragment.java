package com.transsnet.palmpay.core.ui.fragment.verify;

import Bc.q;
import C0.G;
import Pa.C0521s;
import Pa.n0;
import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayPinWithTouchFragment;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckPalmPayPinFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseCheckPinFragment;", "Lcom/transsnet/palmpay/core/viewmodel/KeyboardGridLayout$NumKeyboardClickListener;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckPalmPayPinFragment extends BaseCheckPinFragment implements KeyboardGridLayout.NumKeyboardClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f27991L = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public KeyboardGridLayout f27992B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LinearLayout f27993C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public q f27994H;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        B(this.f27993C);
        if (this.f27931p) {
            q qVar = this.f27994H;
            if (qVar != null) {
                qVar.f816c.setText(r0.B(this.f27930o, false));
            }
            q qVar2 = this.f27994H;
            if (qVar2 != null) {
                h.s(qVar2.f816c, true);
                return 0;
            }
        } else {
            q qVar3 = this.f27994H;
            if (qVar3 != null) {
                h.s(qVar3.f816c, false);
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_fragment_check_palm_pay_pin, viewGroup, false);
        int i7 = e.ivClose;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
        if (iconicsImageView != null) {
            i7 = e.paymentInfoContainer;
            if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                i7 = e.pinView;
                PinEntryView pinEntryView = (PinEntryView) a.m(i7, viewInflate);
                if (pinEntryView != null) {
                    i7 = e.tvAmount;
                    TextView textView = (TextView) a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = e.tvForgotPin;
                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = e.tvForgotPin2;
                            TextView textView3 = (TextView) a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = e.tvTouchId;
                                TextView textView4 = (TextView) a.m(i7, viewInflate);
                                if (textView4 != null) {
                                    i7 = e.viewContainer;
                                    if (((LinearLayout) a.m(i7, viewInflate)) != null && (viewM = a.m((i7 = e.viewLine), viewInflate)) != null) {
                                        i7 = e.viewVerifyType;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, viewInflate);
                                        if (constraintLayout != null) {
                                            q qVar = new q((ConstraintLayout) viewInflate, iconicsImageView, pinEntryView, textView, textView2, textView3, textView4, viewM, constraintLayout);
                                            this.f27994H = qVar;
                                            return qVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        q qVar = this.f27994H;
        if (qVar != null) {
            ((PinEntryView) qVar.f818e).setEnabled(false);
        }
        q qVar2 = this.f27994H;
        if (qVar2 != null) {
            ((PinEntryView) qVar2.f818e).setOnPinEnteredListener(new Dg.a(this, 23));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        this.f27992B = (KeyboardGridLayout) this.f27318b.findViewById(e.number_keyboard_content);
        this.f27993C = (LinearLayout) this.f27318b.findViewById(e.paymentInfoContainer);
        q qVar = this.f27994H;
        if (qVar != null) {
            final int i7 = 0;
            ((IconicsImageView) qVar.f815b).setOnClickListener(new View.OnClickListener(this) { // from class: Ja.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckPalmPayPinFragment f4676b;

                {
                    this.f4676b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckPalmPayPinFragment checkPalmPayPinFragment = this.f4676b;
                    switch (i7) {
                        case 0:
                            int i10 = CheckPalmPayPinFragment.f27991L;
                            checkPalmPayPinFragment.A();
                            n0 n0VarG = n0.g();
                            String str = checkPalmPayPinFragment.f27933w;
                            if (str == null) {
                                str = "";
                            }
                            Pair pair = new Pair("TransType", str);
                            String str2 = checkPalmPayPinFragment.f27929j;
                            n0VarG.n("PPay_Pay_Check_PIN_Close", kotlin.collections.G.g(pair, new Pair("OrderNo", str2 != null ? str2 : "")));
                            break;
                        default:
                            int i11 = CheckPalmPayPinFragment.f27991L;
                            checkPalmPayPinFragment.C(new CheckPalmPayPinWithTouchFragment());
                            n0.g().u(((ViewEvent) C0.G.g("PalmPayCashier_PIN_VerifyType", false)).add("orderNo", checkPalmPayPinFragment.f27929j).add("transType", checkPalmPayPinFragment.f27933w).add("VerifyType", "3"));
                            break;
                    }
                }
            });
        }
        KeyboardGridLayout keyboardGridLayout = this.f27992B;
        if (keyboardGridLayout != null) {
            keyboardGridLayout.setNumKeyboardClickListener(this);
        }
        n0.g().u((ViewEvent) G.g("PPay_Pay_Check_PIN", true));
        q qVar2 = this.f27994H;
        if (qVar2 != null) {
            qVar2.f822j.setOnClickListener(this);
        }
        q qVar3 = this.f27994H;
        if (qVar3 != null) {
            ((TextView) qVar3.f819f).setOnClickListener(this);
        }
        if (n.x()) {
            q qVar4 = this.f27994H;
            if (qVar4 != null) {
                h.s((TextView) qVar4.f819f, false);
            }
            q qVar5 = this.f27994H;
            if (qVar5 != null) {
                h.s((ConstraintLayout) qVar5.f823o, true);
            }
            q qVar6 = this.f27994H;
            if (qVar6 != null) {
                final int i10 = 1;
                ((TextView) qVar6.f820g).setOnClickListener(new View.OnClickListener(this) { // from class: Ja.r

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CheckPalmPayPinFragment f4676b;

                    {
                        this.f4676b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheckPalmPayPinFragment checkPalmPayPinFragment = this.f4676b;
                        switch (i10) {
                            case 0:
                                int i11 = CheckPalmPayPinFragment.f27991L;
                                checkPalmPayPinFragment.A();
                                n0 n0VarG = n0.g();
                                String str = checkPalmPayPinFragment.f27933w;
                                if (str == null) {
                                    str = "";
                                }
                                Pair pair = new Pair("TransType", str);
                                String str2 = checkPalmPayPinFragment.f27929j;
                                n0VarG.n("PPay_Pay_Check_PIN_Close", kotlin.collections.G.g(pair, new Pair("OrderNo", str2 != null ? str2 : "")));
                                break;
                            default:
                                int i12 = CheckPalmPayPinFragment.f27991L;
                                checkPalmPayPinFragment.C(new CheckPalmPayPinWithTouchFragment());
                                n0.g().u(((ViewEvent) C0.G.g("PalmPayCashier_PIN_VerifyType", false)).add("orderNo", checkPalmPayPinFragment.f27929j).add("transType", checkPalmPayPinFragment.f27933w).add("VerifyType", "3"));
                                break;
                        }
                    }
                });
            }
        }
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (getActivity() != null) {
            C0521s c0521s = C0521s.f7158a;
            C0521s.f(BaseApplication.get().getUser().getPhoneNumber());
        }
        n0.g().u((ViewEvent) G.g("PPay_Pay_Forget_PIN", true));
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        q qVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        q qVar2 = this.f27994H;
        String strValueOf = String.valueOf((qVar2 == null || (pinEntryView2 = (PinEntryView) qVar2.f818e) == null) ? null : pinEntryView2.getText());
        if (TextUtils.isEmpty(strValueOf) || (qVar = this.f27994H) == null || (pinEntryView = (PinEntryView) qVar.f818e) == null) {
            return;
        }
        String strSubstring = strValueOf.substring(0, strValueOf.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        pinEntryView.setText(strSubstring);
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String num) {
        q qVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        Intrinsics.checkNotNullParameter(num, "num");
        q qVar2 = this.f27994H;
        String strValueOf = String.valueOf((qVar2 == null || (pinEntryView2 = (PinEntryView) qVar2.f818e) == null) ? null : pinEntryView2.getText());
        if (strValueOf.length() > 4 || (qVar = this.f27994H) == null || (pinEntryView = (PinEntryView) qVar.f818e) == null) {
            return;
        }
        pinEntryView.setText(strValueOf + num);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.verify.BaseCheckPinFragment
    public final boolean z(CheckPayResp checkPayResp) {
        q qVar;
        boolean z3 = super.z(checkPayResp);
        if (("pin_300044".equalsIgnoreCase(checkPayResp.getRespCode()) || "pin_300026".equalsIgnoreCase(checkPayResp.getRespCode()) || "pin_300001".equalsIgnoreCase(checkPayResp.getRespCode())) && (qVar = this.f27994H) != null) {
            ((PinEntryView) qVar.f818e).b();
        }
        return z3;
    }
}
