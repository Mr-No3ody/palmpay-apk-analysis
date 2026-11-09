package com.transsnet.palmpay.account.ui.fragment.login;

import Bc.C0107d;
import Bc.l;
import Bc.p;
import C0.AbstractC0130w;
import C0.U;
import D6.f;
import F8.c;
import F8.e;
import F8.h;
import Pa.F;
import Pa.g0;
import Pa.n0;
import V9.q;
import W8.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithFaceFragment;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p038ca.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/login/LogInWithFaceFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogInWithFaceFragment extends BaseFragment implements ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f26205B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f26206A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26208j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f26209o = new d(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f26210p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC0130w f26212w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final LogInWithFaceFragment newInstance() {
            LogInWithFaceFragment logInWithFaceFragment = new LogInWithFaceFragment();
            logInWithFaceFragment.setArguments(new Bundle());
            return logInWithFaceFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        LogInReq logInReq;
        LogInActivity logInActivityT = t();
        if (logInActivityT != null && (logInReq = logInActivityT.f25888b) != null) {
            logInReq.riskPassType = null;
        }
        p pVar = this.f26210p;
        if (pVar != null) {
            ((PpButton) ((l) pVar.f813d).f755c).setOnClickListener(new g(this, 0));
        }
        p pVar2 = this.f26210p;
        if (pVar2 == null) {
            return 0;
        }
        ((IconicsImageView) ((C0107d) pVar2.f812c).f682d).setOnClickListener(new W8.d(3));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_login_with_face, viewGroup, false);
        int i7 = F8.d.faceGuideView;
        if (((FaceRecognitionGuideView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = F8.d.layoutHeader2), viewInflate)) != null) {
            C0107d c0107dC = C0107d.c(viewM);
            int i10 = F8.d.layoutScanFaceBtn;
            View viewM2 = p059e1.a.m(i10, viewInflate);
            if (viewM2 != null) {
                p pVar = new p((LinearLayout) viewInflate, c0107dC, l.a(viewM2), 9);
                this.f26210p = pVar;
                return pVar;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        int iIntValue;
        Bundle arguments = getArguments();
        this.t = arguments != null ? arguments.getBoolean("_identify_verify") : false;
        Bundle arguments2 = getArguments();
        this.f26211v = arguments2 != null ? arguments2.getBoolean("_security_check") : false;
        Bundle arguments3 = getArguments();
        this.f26208j = arguments3 != null ? arguments3.getBoolean("_has_pin") : true;
        Bundle arguments4 = getArguments();
        this.f26207i = arguments4 != null ? arguments4.getBoolean("_need_otp") : false;
        Bundle arguments5 = getArguments();
        Integer numValueOf = arguments5 != null ? Integer.valueOf(arguments5.getInt("extra_type", 0)) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            iIntValue = this.f26211v ? 4 : 39;
        } else {
            iIntValue = numValueOf.intValue();
        }
        this.f26206A = iIntValue;
        this.f26212w = NavHostFragment.f17502e.findNavController(this);
        p pVar = this.f26210p;
        if (pVar != null) {
            ((IconicsImageView) ((C0107d) pVar.f812c).f681c).setOnClickListener(new g(this, 2));
        }
        p pVar2 = this.f26210p;
        if (pVar2 != null) {
            ((PpButton) ((l) pVar2.f813d).f755c).setText(CommonViewExtKt.string(h.ac_scan_face, getActivity()));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        g0.f7080h.getInstance().c(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onFailed(String str, String str2, String str3) {
        Context context;
        LogInActivity logInActivityT;
        PreCheckPhoneRsp preCheckPhoneRsp;
        p pVar = this.f26210p;
        if (pVar != null) {
            ((PpButton) ((l) pVar.f813d).f755c).b(false);
        }
        O6.d dVarV = null;
        if (!"VL000012".equals(str) || this.f26211v || (logInActivityT = t()) == null || (preCheckPhoneRsp = logInActivityT.t) == null || !preCheckPhoneRsp.isSupportMultiVerifyMethods()) {
            if (!TextUtils.isEmpty(str3)) {
                E activity = getActivity();
                if ((activity != null ? p220oa.h.v(activity, str3, null, null, 14) : null) != null) {
                    return;
                }
            }
            if (str2 == null || f.f1628i.f1633a.equals(str) || (context = getContext()) == null) {
                return;
            }
            p220oa.h.t(context, str2);
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            E activity2 = getActivity();
            if (activity2 != null) {
                final int i7 = 0;
                final int i10 = 1;
                dVarV = p220oa.h.v(activity2, str3, new Function1(this) { // from class: W8.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LogInWithFaceFragment f10585b;

                    {
                        this.f10585b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Z supportFragmentManager;
                        LogInWithFaceFragment logInWithFaceFragment = this.f10585b;
                        String str4 = (String) obj;
                        switch (i7) {
                            case 0:
                                int i11 = LogInWithFaceFragment.f26205B;
                                Intent intentA = F.a(logInWithFaceFragment.getContext(), str4);
                                if (intentA != null) {
                                    ActivityUtils.startActivity(intentA);
                                } else {
                                    logInWithFaceFragment.u();
                                }
                                break;
                            default:
                                int i12 = LogInWithFaceFragment.f26205B;
                                Intent intentA2 = F.a(logInWithFaceFragment.getContext(), str4);
                                if (intentA2 != null) {
                                    ActivityUtils.startActivity(intentA2);
                                } else {
                                    E activity3 = logInWithFaceFragment.getActivity();
                                    if (activity3 != null && (supportFragmentManager = activity3.getSupportFragmentManager()) != null) {
                                        supportFragmentManager.S();
                                    }
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                }, new Function1(this) { // from class: W8.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LogInWithFaceFragment f10585b;

                    {
                        this.f10585b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Z supportFragmentManager;
                        LogInWithFaceFragment logInWithFaceFragment = this.f10585b;
                        String str4 = (String) obj;
                        switch (i10) {
                            case 0:
                                int i11 = LogInWithFaceFragment.f26205B;
                                Intent intentA = F.a(logInWithFaceFragment.getContext(), str4);
                                if (intentA != null) {
                                    ActivityUtils.startActivity(intentA);
                                } else {
                                    logInWithFaceFragment.u();
                                }
                                break;
                            default:
                                int i12 = LogInWithFaceFragment.f26205B;
                                Intent intentA2 = F.a(logInWithFaceFragment.getContext(), str4);
                                if (intentA2 != null) {
                                    ActivityUtils.startActivity(intentA2);
                                } else {
                                    E activity3 = logInWithFaceFragment.getActivity();
                                    if (activity3 != null && (supportFragmentManager = activity3.getSupportFragmentManager()) != null) {
                                        supportFragmentManager.S();
                                    }
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                }, 8);
            }
            if (dVarV != null) {
                return;
            }
        }
        E activity3 = getActivity();
        if (activity3 != null) {
            n.O(activity3, 2, null, "Face Authentication Failed", Integer.valueOf(c.ac_quit_icon_8), null, null, str2, Integer.valueOf(k.core_retry), null, null, null, "Other Methods Verification", new g(this, 1), null, false, 0, 8375922);
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        l lVar;
        PpButton ppButton;
        p pVar = this.f26210p;
        if (pVar == null || (lVar = (l) pVar.f813d) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        LogInReq logInReq;
        LogInReq logInReq2;
        Intrinsics.checkNotNullParameter(data, "data");
        p pVar = this.f26210p;
        if (pVar != null) {
            ((PpButton) ((l) pVar.f813d).f755c).b(false);
        }
        if (TextUtils.isEmpty(data.token)) {
            Context context = getContext();
            if (context != null) {
                p220oa.h.t(context, "Empty token\nPlease try again.");
                return;
            }
            return;
        }
        LogInActivity logInActivityT = t();
        if (logInActivityT != null && (logInReq2 = logInActivityT.f25888b) != null) {
            logInReq2.faceToken = data.token;
        }
        if (this.f26211v) {
            n0.g().m("PalmPayLogin_VerifyType", "VerifyType", "faceid");
            LogInActivity logInActivityT2 = t();
            if (logInActivityT2 != null && (logInReq = logInActivityT2.f25888b) != null) {
                logInReq.riskPassType = "5";
            }
            LogInActivity logInActivityT3 = t();
            if (logInActivityT3 != null) {
                logInActivityT3.v();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("_has_pin", this.f26208j);
        bundle.putBoolean("_identify_verify", this.t);
        bundle.putBoolean("_need_otp", this.f26207i);
        U u6 = new U(false, false, F8.d.fragment_login_input_mobile, false, false, -1, -1, -1, -1);
        if (this.f26207i) {
            AbstractC0130w abstractC0130w = this.f26212w;
            if (abstractC0130w != null) {
                abstractC0130w.h(F8.d.fragment_login_input_sms, bundle, u6);
                return;
            }
            return;
        }
        if (this.t) {
            LogInActivity logInActivityT4 = t();
            if (logInActivityT4 != null) {
                logInActivityT4.p(new q(this, 7));
                return;
            }
            return;
        }
        LogInActivity logInActivityT5 = t();
        if (logInActivityT5 != null) {
            logInActivityT5.v();
        }
    }

    public final LogInActivity t() {
        E e10 = this.f27319c;
        if (!(e10 instanceof LogInActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
        return (LogInActivity) e10;
    }

    public final void u() {
        LogInReq logInReq;
        g0 e0Var = g0.f7080h.getInstance();
        int i7 = this.f26206A;
        LogInActivity logInActivityT = t();
        g0.f(e0Var, this, i7, this, this.f26209o, (logInActivityT == null || (logInReq = logInActivityT.f25888b) == null) ? null : logInReq.mobileNo, true);
    }
}
