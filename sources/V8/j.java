package V8;

import C0.AbstractC0130w;
import Pa.g0;
import Pa.i0;
import Pa.n0;
import android.view.View;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep0Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep0Fragment f10138b;

    public /* synthetic */ j(IdentityVerificationStep0Fragment identityVerificationStep0Fragment, int i7) {
        this.f10137a = i7;
        this.f10138b = identityVerificationStep0Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIntValue;
        PreCheckPhoneRsp preCheckPhoneRsp;
        IdentityVerificationActivity identityVerificationActivityW;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        PreCheckPhoneRsp preCheckPhoneRsp4;
        PreCheckPhoneRsp preCheckPhoneRsp5;
        AbstractC0130w abstractC0130w;
        PreCheckPhoneRsp preCheckPhoneRsp6;
        PreCheckPhoneRsp preCheckPhoneRsp7;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        switch (this.f10137a) {
            case 0:
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment = this.f10138b;
                if (i0.W(identityVerificationStep0Fragment.getActivity())) {
                    I8.m mVar = (I8.m) identityVerificationStep0Fragment.f27335j;
                    if (mVar != null) {
                        ((PpButton) mVar.f4151b.f755c).d();
                    }
                    androidx.fragment.app.E activity = identityVerificationStep0Fragment.getActivity();
                    if (activity != null) {
                        p220oa.h.g(activity, "SignUpFaceRecognitionButton");
                    }
                    g0 e0Var = g0.f7080h.getInstance();
                    IdentityVerificationActivity identityVerificationActivityW2 = identityVerificationStep0Fragment.w();
                    Integer num = null;
                    if (((identityVerificationActivityW2 == null || (preCheckPhoneRsp4 = identityVerificationActivityW2.f25869i) == null) ? null : preCheckPhoneRsp4.faceScene) == null) {
                        IdentityVerificationActivity identityVerificationActivityW3 = identityVerificationStep0Fragment.w();
                        if (identityVerificationActivityW3 == null || !identityVerificationActivityW3.q()) {
                            iIntValue = 11;
                        } else {
                            IdentityVerificationActivity identityVerificationActivityW4 = identityVerificationStep0Fragment.w();
                            iIntValue = ((identityVerificationActivityW4 == null || (preCheckPhoneRsp3 = identityVerificationActivityW4.f25869i) == null || !preCheckPhoneRsp3.hasBvn) && ((identityVerificationActivityW = identityVerificationStep0Fragment.w()) == null || (preCheckPhoneRsp2 = identityVerificationActivityW.f25869i) == null || !preCheckPhoneRsp2.hasNin)) ? 40 : 23;
                        }
                    } else {
                        IdentityVerificationActivity identityVerificationActivityW5 = identityVerificationStep0Fragment.w();
                        if (identityVerificationActivityW5 != null && (preCheckPhoneRsp = identityVerificationActivityW5.f25869i) != null) {
                            num = preCheckPhoneRsp.faceScene;
                        }
                        Intrinsics.e(num);
                        iIntValue = num.intValue();
                    }
                    g0.f(e0Var, identityVerificationStep0Fragment, iIntValue, identityVerificationStep0Fragment, identityVerificationStep0Fragment.f26172p, identityVerificationStep0Fragment.v(), false);
                    break;
                }
                break;
            case 1:
                n0.g().l(" SignUpVerifyFaceRecognitionSkip");
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment2 = this.f10138b;
                IdentityVerificationActivity identityVerificationActivityW6 = identityVerificationStep0Fragment2.w();
                if (identityVerificationActivityW6 != null && (checkIdentifyReqN = identityVerificationActivityW6.n()) != null) {
                    checkIdentifyReqN.faceToken = null;
                }
                IdentityVerificationActivity identityVerificationActivityW7 = identityVerificationStep0Fragment2.w();
                if (identityVerificationActivityW7 != null && (addUserExtraInfoReqL = identityVerificationActivityW7.l()) != null) {
                    addUserExtraInfoReqL.faceToken = null;
                }
                identityVerificationStep0Fragment2.u();
                IdentityVerificationActivity identityVerificationActivityW8 = identityVerificationStep0Fragment2.w();
                if (identityVerificationActivityW8 != null && (preCheckPhoneRsp7 = identityVerificationActivityW8.f25869i) != null && preCheckPhoneRsp7.needNameVerify) {
                    AbstractC0130w abstractC0130w2 = identityVerificationStep0Fragment2.t;
                    if (abstractC0130w2 != null) {
                        abstractC0130w2.h(F8.d.fragment_identity_verification_step_id, null, null);
                    }
                    break;
                } else {
                    IdentityVerificationActivity identityVerificationActivityW9 = identityVerificationStep0Fragment2.w();
                    if (identityVerificationActivityW9 != null && (preCheckPhoneRsp6 = identityVerificationActivityW9.f25869i) != null && preCheckPhoneRsp6.needIndustry) {
                        AbstractC0130w abstractC0130w3 = identityVerificationStep0Fragment2.t;
                        if (abstractC0130w3 != null) {
                            abstractC0130w3.h(F8.d.fragment_identity_verification_step_profile, null, null);
                        }
                        break;
                    } else {
                        IdentityVerificationActivity identityVerificationActivityW10 = identityVerificationStep0Fragment2.w();
                        if (identityVerificationActivityW10 != null && (preCheckPhoneRsp5 = identityVerificationActivityW10.f25869i) != null && preCheckPhoneRsp5.needAddress && (abstractC0130w = identityVerificationStep0Fragment2.t) != null) {
                            abstractC0130w.h(F8.d.fragment_identity_verification_step_address, null, null);
                            break;
                        }
                    }
                }
                break;
            case 2:
                n0.g().l("QuickVerificationPopupQuit");
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment3 = this.f10138b;
                identityVerificationStep0Fragment3.u();
                AbstractC0130w abstractC0130w4 = identityVerificationStep0Fragment3.t;
                if (abstractC0130w4 != null) {
                    abstractC0130w4.h(F8.d.fragment_identity_verification_step_id, null, null);
                }
                break;
            case 3:
                androidx.fragment.app.E activity2 = this.f10138b.getActivity();
                if (activity2 != null) {
                    p220oa.h.h(activity2, "SignUpFaceRecognitionPopupWait");
                }
                break;
            default:
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment4 = this.f10138b;
                androidx.fragment.app.E activity3 = identityVerificationStep0Fragment4.getActivity();
                if (activity3 != null) {
                    p220oa.h.h(activity3, "SignUpFaceRecognitionPopupQuit");
                }
                identityVerificationStep0Fragment4.f26171o = true;
                androidx.fragment.app.E activity4 = identityVerificationStep0Fragment4.getActivity();
                if (activity4 != null) {
                    activity4.onBackPressed();
                }
                break;
        }
    }
}
