package com.transsnet.palmpay.account.ui.fragment.identify;

import C0.AbstractC0130w;
import Ce.H;
import D6.f;
import F8.c;
import F8.e;
import Fd.G;
import I8.r;
import L6.b;
import N8.C0463g;
import Pa.g0;
import T8.o;
import V8.v;
import V8.w;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
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
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStepFace2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/r;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationStepFace2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationStepFace2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStepFace2Fragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,393:1\n629#2,11:394\n171#3,12:405\n215#3:417\n171#3,12:418\n215#3:430\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationStepFace2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStepFace2Fragment\n*L\n85#1:394,11\n129#1:405,12\n129#1:417\n144#1:418,12\n144#1:430\n*E\n"})
public final class IdentityVerificationStepFace2Fragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, r> implements ScanFaceLogicUtil$IScanFaceResultCallBack, CustomActionCallback, IAutoTrack {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f26180p = new d(this);
    public AbstractC0130w t;

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "FaceCapture2";
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        r rVar = (r) this.f27335j;
        if (rVar != null) {
            ((PpButton) rVar.f4201b.f755c).d();
        }
        if (this.f26179o) {
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
        int i10 = k.core_continue;
        v vVar = new v(this, 3);
        int i11 = F8.h.ac_quit;
        n.O(context, 0, null, "Almost There!", Integer.valueOf(i7), null, null, "Only 2 steps left to claim your new-user reward.", Integer.valueOf(i10), null, vVar, Integer.valueOf(i11), null, new v(this, 4), null, true, 0, 8311411);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Window window;
        r rVar = (r) this.f27335j;
        if (rVar != null) {
            ((PpButton) rVar.f4201b.f755c).setOnClickListener(new v(this, 0));
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        decorView.post(new H(handlerJ, 9, this, this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
        l lVar = identityVerificationViewModel != null ? identityVerificationViewModel.f26424i : null;
        if (lVar != null) {
            lVar.e(this, new G(new o(5, this, this), 22));
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        l lVar2 = identityVerificationViewModel2 != null ? identityVerificationViewModel2.f26423g : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new w(0, this, this), 22));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        this.t = NavHostFragment.f17502e.findNavController(this);
        IdentityVerificationActivity identityVerificationActivityU = u();
        if (identityVerificationActivityU == null) {
            return 0;
        }
        identityVerificationActivityU.s((IdentityVerificationViewModel) this.f27333i, new C0463g(this, 16));
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
        r rVar = (r) this.f27335j;
        if (rVar != null) {
            ((PpButton) rVar.f4201b.f755c).b(false);
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
        Bc.l lVar;
        PpButton ppButton;
        Window window;
        super.onPause();
        IdentityVerificationActivity identityVerificationActivityU = u();
        if (identityVerificationActivityU != null) {
            identityVerificationActivityU.setTitle("");
        }
        IdentityVerificationActivity identityVerificationActivityU2 = u();
        if (identityVerificationActivityU2 != null && (window = identityVerificationActivityU2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, requireContext())));
        }
        r rVar = (r) this.f27335j;
        if (rVar == null || (lVar = rVar.f4201b) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.d();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        Bc.l lVar;
        PpButton ppButton;
        r rVar = (r) this.f27335j;
        if (rVar == null || (lVar = rVar.f4201b) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        Intrinsics.checkNotNullParameter(data, "data");
        r rVar = (r) this.f27335j;
        if (rVar != null) {
            ((PpButton) rVar.f4201b.f755c).b(false);
        }
        String str = data.token;
        if (TextUtils.isEmpty(str)) {
            Context context = getContext();
            if (context != null) {
                h.t(context, "Empty token\nPlease try again.");
                return;
            }
            return;
        }
        IdentityVerificationActivity identityVerificationActivityU = u();
        if (identityVerificationActivityU != null && (checkIdentifyReqN = identityVerificationActivityU.n()) != null) {
            checkIdentifyReqN.faceToken = str;
        }
        IdentityVerificationActivity identityVerificationActivityU2 = u();
        if (identityVerificationActivityU2 != null && (addUserExtraInfoReqL = identityVerificationActivityU2.l()) != null) {
            addUserExtraInfoReqL.faceToken = str;
        }
        r rVar2 = (r) this.f27335j;
        if (rVar2 != null) {
            ((PpButton) rVar2.f4201b.f755c).b(true);
        }
        IdentityVerificationActivity identityVerificationActivityU3 = u();
        if (identityVerificationActivityU3 == null || !identityVerificationActivityU3.q()) {
            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel != null) {
                IdentityVerificationActivity identityVerificationActivityU4 = u();
                identityVerificationViewModel.f(identityVerificationActivityU4 != null ? identityVerificationActivityU4.n() : null);
                return;
            }
            return;
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel2 != null) {
            IdentityVerificationActivity identityVerificationActivityU5 = u();
            identityVerificationViewModel2.d(identityVerificationActivityU5 != null ? identityVerificationActivityU5.l() : null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_identity_verification_step_face, viewGroup, false);
        int i7 = F8.d.faceGuideView;
        if (((FaceRecognitionGuideView) a.m(i7, viewInflate)) == null || (viewM = a.m((i7 = F8.d.layoutScanFaceBtn), viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        r rVar = new r((LinearLayout) viewInflate, Bc.l.a(viewM));
        Intrinsics.checkNotNullExpressionValue(rVar, "inflate(...)");
        return rVar;
    }

    public final IdentityVerificationActivity u() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }
}
