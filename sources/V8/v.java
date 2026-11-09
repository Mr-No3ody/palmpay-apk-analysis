package V8;

import C0.AbstractC0130w;
import C0.G;
import Pa.g0;
import Pa.i0;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStepFace2Fragment f10165b;

    public /* synthetic */ v(IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment, int i7) {
        this.f10164a = i7;
        this.f10165b = identityVerificationStepFace2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIntValue;
        PreCheckPhoneRsp preCheckPhoneRsp;
        IdentityVerificationActivity identityVerificationActivityU;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        PreCheckPhoneRsp preCheckPhoneRsp4;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        switch (this.f10164a) {
            case 0:
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment = this.f10165b;
                if (i0.W(identityVerificationStepFace2Fragment.getActivity())) {
                    I8.r rVar = (I8.r) identityVerificationStepFace2Fragment.f27335j;
                    if (rVar != null) {
                        ((PpButton) rVar.f4201b.f755c).d();
                    }
                    androidx.fragment.app.E activity = identityVerificationStepFace2Fragment.getActivity();
                    if (activity != null) {
                        p220oa.h.g(activity, "SignUpFaceRecognitionButton2");
                    }
                    g0 e0Var = g0.f7080h.getInstance();
                    IdentityVerificationActivity identityVerificationActivityU2 = identityVerificationStepFace2Fragment.u();
                    String strA = null;
                    if (((identityVerificationActivityU2 == null || (preCheckPhoneRsp4 = identityVerificationActivityU2.f25869i) == null) ? null : preCheckPhoneRsp4.faceScene) == null) {
                        IdentityVerificationActivity identityVerificationActivityU3 = identityVerificationStepFace2Fragment.u();
                        if (identityVerificationActivityU3 == null || !identityVerificationActivityU3.q()) {
                            iIntValue = 11;
                        } else {
                            IdentityVerificationActivity identityVerificationActivityU4 = identityVerificationStepFace2Fragment.u();
                            iIntValue = ((identityVerificationActivityU4 == null || (preCheckPhoneRsp3 = identityVerificationActivityU4.f25869i) == null || !preCheckPhoneRsp3.hasBvn) && ((identityVerificationActivityU = identityVerificationStepFace2Fragment.u()) == null || (preCheckPhoneRsp2 = identityVerificationActivityU.f25869i) == null || !preCheckPhoneRsp2.hasNin)) ? 40 : 23;
                        }
                    } else {
                        IdentityVerificationActivity identityVerificationActivityU5 = identityVerificationStepFace2Fragment.u();
                        Integer num = (identityVerificationActivityU5 == null || (preCheckPhoneRsp = identityVerificationActivityU5.f25869i) == null) ? null : preCheckPhoneRsp.faceScene;
                        Intrinsics.e(num);
                        iIntValue = num.intValue();
                    }
                    int i7 = iIntValue;
                    IdentityVerificationActivity identityVerificationActivityU6 = identityVerificationStepFace2Fragment.u();
                    if (identityVerificationActivityU6 == null || !identityVerificationActivityU6.q()) {
                        IdentityVerificationActivity identityVerificationActivityU7 = identityVerificationStepFace2Fragment.u();
                        if (identityVerificationActivityU7 != null) {
                            strA = identityVerificationActivityU7.f25864c;
                        }
                    } else {
                        strA = G.A();
                    }
                    g0.f(e0Var, identityVerificationStepFace2Fragment, i7, identityVerificationStepFace2Fragment, identityVerificationStepFace2Fragment.f26180p, strA, false);
                    break;
                }
                break;
            case 1:
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment2 = this.f10165b;
                IdentityVerificationActivity identityVerificationActivityU8 = identityVerificationStepFace2Fragment2.u();
                if (identityVerificationActivityU8 != null && (checkIdentifyReqN = identityVerificationActivityU8.n()) != null) {
                    checkIdentifyReqN.faceToken = null;
                }
                IdentityVerificationActivity identityVerificationActivityU9 = identityVerificationStepFace2Fragment2.u();
                if (identityVerificationActivityU9 != null && (addUserExtraInfoReqL = identityVerificationActivityU9.l()) != null) {
                    addUserExtraInfoReqL.faceToken = null;
                }
                AbstractC0130w abstractC0130w = identityVerificationStepFace2Fragment2.t;
                if (abstractC0130w != null) {
                    abstractC0130w.k(F8.d.fragment_identity_verification_step_id, false);
                }
                break;
            case 2:
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment3 = this.f10165b;
                IdentityVerificationActivity identityVerificationActivityU10 = identityVerificationStepFace2Fragment3.u();
                if (identityVerificationActivityU10 == null || !identityVerificationActivityU10.r()) {
                    IdentityVerificationActivity identityVerificationActivityU11 = identityVerificationStepFace2Fragment3.u();
                    if (Intrinsics.c(identityVerificationActivityU11 != null ? identityVerificationActivityU11.f25866e : null, "FROM_REGISITER_PAGE")) {
                        ActivityUtils.finishActivity((Class<?>) SignUpActivity.class);
                        Postcard postcardBuild = ARouter.getInstance().build("/account/signup");
                        IdentityVerificationActivity identityVerificationActivityU12 = identityVerificationStepFace2Fragment3.u();
                        postcardBuild.withString("_number", identityVerificationActivityU12 != null ? identityVerificationActivityU12.f25864c : null).withBoolean("extra_flag", true).navigation();
                    }
                } else {
                    ActivityUtils.finishActivity((Class<?>) LogInActivity.class);
                    Postcard postcardBuild2 = ARouter.getInstance().build("/account/login");
                    IdentityVerificationActivity identityVerificationActivityU13 = identityVerificationStepFace2Fragment3.u();
                    postcardBuild2.withString("_number", identityVerificationActivityU13 != null ? identityVerificationActivityU13.f25864c : null).withBoolean("extra_flag", true).navigation();
                }
                IdentityVerificationActivity identityVerificationActivityU14 = identityVerificationStepFace2Fragment3.u();
                if (identityVerificationActivityU14 != null) {
                    identityVerificationActivityU14.finish();
                }
                break;
            case 3:
                androidx.fragment.app.E activity2 = this.f10165b.getActivity();
                if (activity2 != null) {
                    p220oa.h.h(activity2, "SignUpFaceRecognitionPopupWait");
                }
                break;
            default:
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment4 = this.f10165b;
                androidx.fragment.app.E activity3 = identityVerificationStepFace2Fragment4.getActivity();
                if (activity3 != null) {
                    p220oa.h.h(activity3, "SignUpFaceRecognitionPopupQuit");
                }
                identityVerificationStepFace2Fragment4.f26179o = true;
                androidx.fragment.app.E activity4 = identityVerificationStepFace2Fragment4.getActivity();
                if (activity4 != null) {
                    activity4.onBackPressed();
                }
                break;
        }
    }
}
