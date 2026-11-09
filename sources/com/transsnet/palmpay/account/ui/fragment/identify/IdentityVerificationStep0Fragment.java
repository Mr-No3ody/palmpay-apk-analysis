package com.transsnet.palmpay.account.ui.fragment.identify;

import C0.AbstractC0130w;
import Ce.H;
import D6.f;
import F8.c;
import F8.e;
import Fd.G;
import I8.m;
import L6.b;
import Pa.g0;
import V8.j;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.FaceToken;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p038ca.d;
import p059e1.a;
import p097g9.C1723v;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep0Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/m;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationStep0Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationStep0Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep0Fragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,354:1\n629#2,11:355\n171#3,12:366\n215#3:378\n171#3,12:379\n215#3:391\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationStep0Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep0Fragment\n*L\n95#1:355,11\n138#1:366,12\n138#1:378\n164#1:379,12\n164#1:391\n*E\n"})
public final class IdentityVerificationStep0Fragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, m> implements ScanFaceLogicUtil$IScanFaceResultCallBack, CustomActionCallback, IAutoTrack {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f26172p = new d(this);
    public AbstractC0130w t;

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "FaceCapture";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        m mVar = (m) this.f27335j;
        if (mVar != null) {
            ((PpButton) mVar.f4151b.f755c).d();
        }
        if (this.f26171o) {
            return false;
        }
        E activity = getActivity();
        if (activity != null) {
            h.h(activity, "SignUpFaceRecognitionPopup");
        }
        Context context = getContext();
        if (context == null) {
            return true;
        }
        int i7 = c.ac_quit_icon_5;
        int i10 = k.core_retry;
        j jVar = new j(this, 3);
        int i11 = F8.h.ac_quit;
        n.O(context, 0, null, "Almost There!", Integer.valueOf(i7), null, null, "Only 2 steps left to claim your new-user reward.", Integer.valueOf(i10), null, jVar, Integer.valueOf(i11), null, new j(this, 4), null, true, 0, 8311411);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Window window;
        boolean z3;
        PreCheckPhoneRsp preCheckPhoneRsp;
        m mVar = (m) this.f27335j;
        if (mVar != null) {
            ((PpButton) mVar.f4151b.f755c).setOnClickListener(new j(this, 0));
        }
        m mVar2 = (m) this.f27335j;
        if (mVar2 != null) {
            TextView textView = mVar2.f4152c;
            IdentityVerificationActivity identityVerificationActivityW = w();
            if (identityVerificationActivityW != null && (preCheckPhoneRsp = identityVerificationActivityW.f25869i) != null) {
                z3 = preCheckPhoneRsp.canSkipFace;
            }
            h.s(textView, z3);
        }
        m mVar3 = (m) this.f27335j;
        if (mVar3 != null) {
            mVar3.f4152c.setOnClickListener(new j(this, 1));
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new H(handlerJ, 7, this, this));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        IdentityVerificationActivity identityVerificationActivityW;
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        l lVar = identityVerificationViewModel != null ? identityVerificationViewModel.f26427p : null;
        if (lVar != null) {
            lVar.e(this, new G(new V8.k(this, this, 0), 19));
        }
        IdentityVerificationActivity identityVerificationActivityW2 = w();
        if (identityVerificationActivityW2 != null && !identityVerificationActivityW2.q()) {
            String lastValidToken = FaceToken.getLastValidToken(v());
            if (!TextUtils.isEmpty(lastValidToken) && (identityVerificationActivityW = w()) != null && identityVerificationActivityW.f25865d) {
                m mVar = (m) this.f27335j;
                if (mVar != null) {
                    ((PpButton) mVar.f4151b.f755c).setEnabled(false);
                }
                IdentityVerificationActivity identityVerificationActivityW3 = w();
                if (identityVerificationActivityW3 != null) {
                    identityVerificationActivityW3.f25865d = false;
                }
                x(lastValidToken);
            }
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        l lVar2 = identityVerificationViewModel2 != null ? identityVerificationViewModel2.f26424i : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new V8.k(this, this, 1), 19));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        this.t = NavHostFragment.f17502e.findNavController(this);
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
        m mVar = (m) this.f27335j;
        if (mVar != null) {
            ((PpButton) mVar.f4151b.f755c).b(false);
        }
        if (!TextUtils.isEmpty(str3)) {
            E activity = getActivity();
            if ((activity != null ? h.v(activity, str3, null, null, 14) : null) != null) {
                return;
            }
        }
        if (str2 == null || f.f1628i.f1633a.equals(str) || (context = getContext()) == null) {
            return;
        }
        h.t(context, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        Bc.l lVar;
        PpButton ppButton;
        super.onPause();
        m mVar = (m) this.f27335j;
        if (mVar != null && (lVar = mVar.f4151b) != null && (ppButton = (PpButton) lVar.f755c) != null) {
            ppButton.d();
        }
        IdentityVerificationActivity identityVerificationActivityW = w();
        if (identityVerificationActivityW != null) {
            identityVerificationActivityW.setTitle("");
        }
        IdentityVerificationActivity identityVerificationActivityW2 = w();
        if (identityVerificationActivityW2 == null || (window = identityVerificationActivityW2.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, requireContext())));
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        Bc.l lVar;
        PpButton ppButton;
        m mVar = (m) this.f27335j;
        if (mVar == null || (lVar = mVar.f4151b) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        Bc.l lVar;
        PpButton ppButton;
        Intrinsics.checkNotNullParameter(data, "data");
        m mVar = (m) this.f27335j;
        if (mVar != null && (lVar = mVar.f4151b) != null && (ppButton = (PpButton) lVar.f755c) != null) {
            ppButton.b(false);
        }
        x(data.token);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_identity_verification_step0, viewGroup, false);
        int i7 = F8.d.faceGuideView;
        if (((FaceRecognitionGuideView) a.m(i7, viewInflate)) != null && (viewM = a.m((i7 = F8.d.layoutScanFaceBtn), viewInflate)) != null) {
            Bc.l lVarA = Bc.l.a(viewM);
            int i10 = F8.d.tvSkip;
            TextView textView = (TextView) a.m(i10, viewInflate);
            if (textView != null) {
                m mVar = new m((LinearLayout) viewInflate, lVarA, textView);
                Intrinsics.checkNotNullExpressionValue(mVar, "inflate(...)");
                return mVar;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IdentityVerificationActivity identityVerificationActivityW = w();
        if (identityVerificationActivityW != null && (checkIdentifyReqN = identityVerificationActivityW.n()) != null) {
            checkIdentifyReqN.verifyType = -1;
            checkIdentifyReqN.verifyNum = null;
        }
        IdentityVerificationActivity identityVerificationActivityW2 = w();
        if (identityVerificationActivityW2 == null || (addUserExtraInfoReqL = identityVerificationActivityW2.l()) == null) {
            return;
        }
        addUserExtraInfoReqL.verifyType = -1;
        addUserExtraInfoReqL.verifyNum = null;
    }

    public final String v() {
        IdentityVerificationActivity identityVerificationActivityW = w();
        if (identityVerificationActivityW != null && identityVerificationActivityW.q()) {
            return C0.G.A();
        }
        IdentityVerificationActivity identityVerificationActivityW2 = w();
        if (identityVerificationActivityW2 != null) {
            return identityVerificationActivityW2.f25864c;
        }
        return null;
    }

    public final IdentityVerificationActivity w() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }

    public final void x(String str) {
        IdentityVerificationViewModel identityVerificationViewModel;
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        if (TextUtils.isEmpty(str)) {
            Context context = getContext();
            if (context != null) {
                h.t(context, "Empty token\nPlease try again.");
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityW = w();
        if (identityVerificationActivityW != null && !identityVerificationActivityW.q()) {
            new FaceToken(str, v()).saveToken();
        }
        IdentityVerificationActivity identityVerificationActivityW2 = w();
        if (identityVerificationActivityW2 != null && (checkIdentifyReqN = identityVerificationActivityW2.n()) != null) {
            checkIdentifyReqN.faceToken = str;
        }
        IdentityVerificationActivity identityVerificationActivityW3 = w();
        if (identityVerificationActivityW3 != null && (addUserExtraInfoReqL = identityVerificationActivityW3.l()) != null) {
            addUserExtraInfoReqL.faceToken = str;
        }
        IdentityVerificationActivity identityVerificationActivityW4 = w();
        int i7 = 1;
        if (identityVerificationActivityW4 != null && (preCheckPhoneRsp3 = identityVerificationActivityW4.f25869i) != null && preCheckPhoneRsp3.needNameVerify) {
            IdentityVerificationActivity identityVerificationActivityW5 = w();
            if (identityVerificationActivityW5 != null && identityVerificationActivityW5.q()) {
                AbstractC0130w abstractC0130w = this.t;
                if (abstractC0130w != null) {
                    abstractC0130w.h(F8.d.fragment_identity_verification_step_id, null, null);
                    return;
                }
                return;
            }
            IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel2 != null) {
                String strV = v();
                IdentityVerificationActivity identityVerificationActivityW6 = w();
                if (identityVerificationActivityW6 != null && identityVerificationActivityW6.r()) {
                    i7 = 2;
                }
                p140j8.f.s(identityVerificationViewModel2, new C1723v(i7, strV, str, null), identityVerificationViewModel2.f26427p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityW7 = w();
        if (identityVerificationActivityW7 != null && (preCheckPhoneRsp2 = identityVerificationActivityW7.f25869i) != null && preCheckPhoneRsp2.needIndustry) {
            AbstractC0130w abstractC0130w2 = this.t;
            if (abstractC0130w2 != null) {
                abstractC0130w2.h(F8.d.fragment_identity_verification_step_profile, null, null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityW8 = w();
        if (identityVerificationActivityW8 != null && (preCheckPhoneRsp = identityVerificationActivityW8.f25869i) != null && preCheckPhoneRsp.needAddress) {
            AbstractC0130w abstractC0130w3 = this.t;
            if (abstractC0130w3 != null) {
                abstractC0130w3.h(F8.d.fragment_identity_verification_step_address, null, null);
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityW9 = w();
        if (identityVerificationActivityW9 == null || !identityVerificationActivityW9.q() || (identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i) == null) {
            return;
        }
        IdentityVerificationActivity identityVerificationActivityW10 = w();
        identityVerificationViewModel.d(identityVerificationActivityW10 != null ? identityVerificationActivityW10.l() : null);
    }
}
