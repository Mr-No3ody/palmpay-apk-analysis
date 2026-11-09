package com.transsnet.palmpay.account.ui.fragment.verify;

import Bc.l;
import Bc.p;
import D6.f;
import F8.e;
import F8.h;
import Pa.C0525w;
import Pa.g0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepFaceFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.r;
import io.fastkv.n;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p038ca.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/VerifyAccountFaceFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountFaceFragment extends BaseVerifyAccountFragment implements ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f26307w = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f26309p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26310v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f26308o = new d(this);
    public int t = 14;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final UpgradeTier3StepFaceFragment newInstance() {
            UpgradeTier3StepFaceFragment upgradeTier3StepFaceFragment = new UpgradeTier3StepFaceFragment();
            upgradeTier3StepFaceFragment.setArguments(new Bundle());
            return upgradeTier3StepFaceFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        p pVar = this.f26309p;
        if (pVar != null) {
            ((PpButton) ((l) pVar.f812c).f755c).setOnClickListener(new p037c9.a(this, 1));
        }
        p pVar2 = this.f26309p;
        z(pVar2 != null ? (PpTitleBar) pVar2.f813d : null);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_face, viewGroup, false);
        int i7 = F8.d.faceGuideView;
        if (((FaceRecognitionGuideView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = F8.d.layoutScanFaceBtn), viewInflate)) != null) {
            l lVarA = l.a(viewM);
            int i10 = F8.d.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i10, viewInflate);
            if (ppTitleBar != null) {
                p pVar = new p((LinearLayout) viewInflate, lVarA, ppTitleBar, 10);
                this.f26309p = pVar;
                return pVar;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("extra_data")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                Integer numH = C0525w.h(string, "scene");
                Intrinsics.checkNotNullExpressionValue(numH, "getJsonInt(...)");
                this.t = numH.intValue();
                Boolean boolG = C0525w.g(string, "other");
                Intrinsics.checkNotNullExpressionValue(boolG, "getJsonBoolean(...)");
                this.f26310v = boolG.booleanValue();
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        g0.f7080h.getInstance().c(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onFailed(String str, String str2, String str3) {
        p pVar = this.f26309p;
        if (pVar != null) {
            ((PpButton) ((l) pVar.f812c).f755c).b(false);
        }
        if ("VL000073".equals(str)) {
            Context context = getContext();
            if (context != null) {
                n.O(context, 0, Integer.valueOf(k.core_opps), null, null, null, null, str2, Integer.valueOf(h.ac_rescan_face), null, null, null, null, null, null, false, 0, 8388221);
                return;
            }
            return;
        }
        if (f.f1628i.f1633a.equals(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            E activity = getActivity();
            if ((activity != null ? p220oa.h.v(activity, str3, null, null, 14) : null) != null) {
                return;
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            int i7 = r.cv_face_verify_fail;
            n.O(context2, 2, null, "Face Authentication Failed", Integer.valueOf(i7), null, null, TextUtils.isEmpty(str2) ? "The face authentication and the ID information do not match. Please check the ID information and re-scan face." : str2, Integer.valueOf(k.core_retry), null, null, null, this.f26310v ? "Other Methods Verification" : "Cancel", new p037c9.a(this, 0), null, false, 0, 8375922);
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        l lVar;
        PpButton ppButton;
        p pVar = this.f26309p;
        if (pVar == null || (lVar = (l) pVar.f812c) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        p pVar = this.f26309p;
        if (pVar != null) {
            ((PpButton) ((l) pVar.f812c).f755c).b(false);
        }
        if (TextUtils.isEmpty(data.token)) {
            Context context = getContext();
            if (context != null) {
                p220oa.h.t(context, "Empty token\nPlease try again.");
                return;
            }
            return;
        }
        CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq = new CheckSecurityVerifyMethodReq();
        checkSecurityVerifyMethodReq.flowId = this.f26306j;
        checkSecurityVerifyMethodReq.verifyMethod = 5;
        HashMap<String, Object> verifyParams = new HashMap<>();
        checkSecurityVerifyMethodReq.verifyParams = verifyParams;
        Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
        verifyParams.put("faceToken", data.token);
        VerifyAccountActivity verifyAccountActivityW = w();
        if (verifyAccountActivityW != null) {
            verifyAccountActivityW.p(checkSecurityVerifyMethodReq);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment
    public final void y(CommonBeanResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        super.y(rsp);
    }
}
