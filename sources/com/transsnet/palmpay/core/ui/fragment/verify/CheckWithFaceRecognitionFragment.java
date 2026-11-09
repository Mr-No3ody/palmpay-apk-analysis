package com.transsnet.palmpay.core.ui.fragment.verify;

import Bc.C0107d;
import C0.G;
import D6.f;
import Ja.L;
import Pa.g0;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckWithFaceRecognitionFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p038ca.d;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckWithFaceRecognitionFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckWithFaceRecognitionFragment extends BaseVerifyFragment<PayVerifyViewModel> implements ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f28049B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PpButton f28050A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28051j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f28052o = new d(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f28053p;
    public C0107d t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpButton f28054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PpButton f28055w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckWithFaceRecognitionFragment newInstance(@Nullable PayByOrderResp.DataBean dataBean) {
            CheckWithFaceRecognitionFragment checkWithFaceRecognitionFragment = new CheckWithFaceRecognitionFragment();
            Bundle bundle = new Bundle();
            bundle.putString("payId", dataBean != null ? dataBean.payId : null);
            checkWithFaceRecognitionFragment.setArguments(bundle);
            return checkWithFaceRecognitionFragment;
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
        C0107d c0107d = this.t;
        if (c0107d != null) {
            ((ViewStub) c0107d.f681c).inflate();
        }
        PpButton ppButton = (PpButton) this.f27318b.findViewById(s.btnScan);
        this.f28054v = ppButton;
        if (ppButton != null) {
            ppButton.setText(r0.H0(k.core_face_recognition));
        }
        PpButton ppButton2 = this.f28054v;
        if (ppButton2 == null) {
            return 0;
        }
        ppButton2.setOnClickListener(new L(this, 5));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_fragment_check_face_recognition, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i7 = e.statusBarView;
        if (((StatusBarView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                i7 = e.view1;
                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                if (viewStub != null) {
                    i7 = e.view2;
                    ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                    if (viewStub2 != null) {
                        C0107d c0107d = new C0107d((ViewGroup) constraintLayout, ppTitleBar, (View) viewStub, (View) viewStub2, 19);
                        this.t = c0107d;
                        return c0107d;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28051j = arguments.getString("payId");
        }
        C0107d c0107d = this.t;
        if (c0107d != null) {
            ((PpTitleBar) c0107d.f683e).setBackButton(S6.a.pay_Close);
        }
        C0107d c0107d2 = this.t;
        if (c0107d2 == null) {
            return 0;
        }
        ((PpTitleBar) c0107d2.f683e).setBackButtonClickListener(new L(this, 2));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onFailed(String str, String str2, String str3) {
        Context context;
        if (i0.W(getActivity())) {
            showLoadingDialog(false, false);
            PpButton ppButton = this.f28054v;
            if (ppButton != null) {
                ppButton.setEnabled(true);
            }
            PpButton ppButton2 = this.f28054v;
            if (ppButton2 != null) {
                ppButton2.b(false);
            }
            if (TextUtils.isEmpty(str3)) {
                if (Intrinsics.c(str, f.f1628i.f1633a) || (context = getContext()) == null) {
                    return;
                }
                n.O(context, 0, null, null, null, null, null, str2, Integer.valueOf(k.core_retry), null, new L(this, 3), Integer.valueOf(k.core_cancel), null, new L(this, 4), null, false, 0, 8360575);
                return;
            }
            Context context2 = getContext();
            if (context2 != null) {
                final int i7 = 0;
                final int i10 = 1;
                h.v(context2, str3, new Function1(this) { // from class: Ja.M

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CheckWithFaceRecognitionFragment f4637b;

                    {
                        this.f4637b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CheckWithFaceRecognitionFragment checkWithFaceRecognitionFragment = this.f4637b;
                        String str4 = (String) obj;
                        switch (i7) {
                            case 0:
                                CheckWithFaceRecognitionFragment.a aVar = CheckWithFaceRecognitionFragment.f28049B;
                                if (TextUtils.isEmpty(str4)) {
                                    checkWithFaceRecognitionFragment.z();
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(checkWithFaceRecognitionFragment.getActivity(), str4));
                                }
                                break;
                            default:
                                CheckWithFaceRecognitionFragment.a aVar2 = CheckWithFaceRecognitionFragment.f28049B;
                                if (TextUtils.isEmpty(str4)) {
                                    androidx.fragment.app.E activity = checkWithFaceRecognitionFragment.getActivity();
                                    if (activity != null) {
                                        activity.finish();
                                    }
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(checkWithFaceRecognitionFragment.getActivity(), str4));
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                }, new Function1(this) { // from class: Ja.M

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CheckWithFaceRecognitionFragment f4637b;

                    {
                        this.f4637b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CheckWithFaceRecognitionFragment checkWithFaceRecognitionFragment = this.f4637b;
                        String str4 = (String) obj;
                        switch (i10) {
                            case 0:
                                CheckWithFaceRecognitionFragment.a aVar = CheckWithFaceRecognitionFragment.f28049B;
                                if (TextUtils.isEmpty(str4)) {
                                    checkWithFaceRecognitionFragment.z();
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(checkWithFaceRecognitionFragment.getActivity(), str4));
                                }
                                break;
                            default:
                                CheckWithFaceRecognitionFragment.a aVar2 = CheckWithFaceRecognitionFragment.f28049B;
                                if (TextUtils.isEmpty(str4)) {
                                    androidx.fragment.app.E activity = checkWithFaceRecognitionFragment.getActivity();
                                    if (activity != null) {
                                        activity.finish();
                                    }
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(checkWithFaceRecognitionFragment.getActivity(), str4));
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                }, 8);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        showLoadingDialog(true, false);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        showLoadingDialog(false, false);
        PpButton ppButton = this.f28054v;
        if (ppButton != null) {
            ppButton.setEnabled(true);
        }
        PpButton ppButton2 = this.f28054v;
        if (ppButton2 != null) {
            ppButton2.b(false);
        }
        if (!TextUtils.isEmpty(data.token)) {
            PayVerificationActivity payVerificationActivityT = t();
            if (payVerificationActivityT != null) {
                payVerificationActivityT.verifyPayMethod(data.token, 24);
                return;
            }
            return;
        }
        C0107d c0107d = this.t;
        if (c0107d != null) {
            h.s((ViewStub) c0107d.f681c, false);
        }
        C0107d c0107d2 = this.t;
        if (c0107d2 != null) {
            h.s((ViewStub) c0107d2.f682d, true);
        }
        ToastUtils.showLong(data.errorMsg, new Object[0]);
        C0107d c0107d3 = this.t;
        if (c0107d3 != null) {
            h.s((ViewStub) c0107d3.f681c, false);
        }
        C0107d c0107d4 = this.t;
        if (c0107d4 != null) {
            h.s((ViewStub) c0107d4.f682d, true);
        }
        this.f28053p = false;
        this.f28055w = (PpButton) this.f27318b.findViewById(e.tvConfirm);
        this.f28050A = (PpButton) this.f27318b.findViewById(e.tvCancel);
        this.f28053p = true;
        PpButton ppButton3 = this.f28055w;
        if (ppButton3 != null) {
            ppButton3.setText(getString(k.core_confirm));
        }
        PpButton ppButton4 = this.f28050A;
        if (ppButton4 != null) {
            h.s(ppButton4, false);
        }
        PpButton ppButton5 = this.f28055w;
        if (ppButton5 != null) {
            ppButton5.setOnClickListener(new L(this, 0));
        }
        PpButton ppButton6 = this.f28050A;
        if (ppButton6 != null) {
            ppButton6.setOnClickListener(new L(this, 1));
        }
    }

    public final void z() {
        PpButton ppButton = this.f28054v;
        if (ppButton != null) {
            ppButton.b(true);
        }
        g0 e0Var = g0.f7080h.getInstance();
        e0Var.f7087f = this.f28051j;
        g0.f(e0Var, this, 5, this, this.f28052o, G.A(), true);
    }
}
