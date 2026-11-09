package com.transsnet.palmpay.account.ui.activity;

import Bc.l;
import D6.f;
import F8.e;
import Pa.g0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p038ca.d;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/verify_account_face")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/VerifyAccountFaceActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountFaceActivity extends BaseActivity implements ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26070d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GetSecurityFlowRsp f26071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f26072b = new d(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I8.d f26073c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(-1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_verify_face, (ViewGroup) null, false);
        int i7 = F8.d.faceGuideView;
        if (((FaceRecognitionGuideView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = F8.d.layoutScanFaceBtn), viewInflate)) != null) {
            l lVarA = l.a(viewM);
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i10 = F8.d.titleBar;
            if (((PpTitleBar) p059e1.a.m(i10, viewInflate)) != null) {
                I8.d dVar = new I8.d(linearLayout, lVarA, 0);
                this.f26073c = dVar;
                return dVar;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        g0.f7080h.getInstance().c(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onFailed(String str, String str2, String str3) {
        I8.d dVar = this.f26073c;
        if (dVar != null) {
            ((PpButton) dVar.f4056c.f755c).b(false);
        }
        if (!TextUtils.isEmpty(str3)) {
            h.v(this, str3, null, null, 14);
        } else {
            if (str2 == null || f.f1628i.f1633a.equals(str)) {
                return;
            }
            h.t(this, str2);
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        l lVar;
        PpButton ppButton;
        I8.d dVar = this.f26073c;
        if (dVar == null || (lVar = dVar.f4056c) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (TextUtils.isEmpty(data.token)) {
            I8.d dVar = this.f26073c;
            if (dVar != null) {
                ((PpButton) dVar.f4056c.f755c).b(false);
            }
            h.t(this, "Empty token\nPlease try again.");
            return;
        }
        I8.d dVar2 = this.f26073c;
        if (dVar2 != null) {
            ((PpButton) dVar2.f4056c.f755c).b(false);
        }
        GetSecurityFlowRsp getSecurityFlowRsp = this.f26071a;
        if (getSecurityFlowRsp != null) {
            getSecurityFlowRsp.nextStep(this, "face");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        I8.d dVar = this.f26073c;
        if (dVar != null) {
            ((PpButton) dVar.f4056c.f755c).setOnClickListener(new Je.l(this, 25));
        }
    }
}
