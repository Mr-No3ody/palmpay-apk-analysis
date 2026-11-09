package V8;

import C0.AbstractC0130w;
import C9.C0142i;
import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.TeenagerPopInfo;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.dialog.ConfirmDobDialog;
import com.transsnet.palmpay.account.ui.dialog.IdentityVerificationErrorDialog;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep1Fragment f10151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep1Fragment f10152c;

    public /* synthetic */ o(IdentityVerificationStep1Fragment identityVerificationStep1Fragment, IdentityVerificationStep1Fragment identityVerificationStep1Fragment2, int i7) {
        this.f10150a = i7;
        this.f10151b = identityVerificationStep1Fragment;
        this.f10152c = identityVerificationStep1Fragment2;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0347 A[PHI: r1
      0x0347: PHI (r1v12 I8.n) = (r1v8 I8.n), (r1v11 I8.n), (r1v50 I8.n) binds: [B:155:0x0378, B:150:0x035a, B:145:0x0345] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b A[PHI: r1
      0x009b: PHI (r1v68 I8.n) = (r1v64 I8.n), (r1v67 I8.n), (r1v71 I8.n) binds: [B:49:0x00d7, B:41:0x00ae, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        I8.n nVar;
        PreCheckPhoneRsp preCheckPhoneRsp;
        TeenagerPopInfo teenagerPopInfo;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        I8.n nVar2;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        PreCheckPhoneRsp preCheckPhoneRsp4;
        String string = null;
        IdentityVerificationStep1Fragment identityVerificationStep1Fragment = this.f10152c;
        IdentityVerificationStep1Fragment identityVerificationStep1Fragment2 = this.f10151b;
        switch (this.f10150a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationStep1Fragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationStep1Fragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        IdentityVerificationStep1Fragment.w(identityVerificationStep1Fragment);
                        IdentityVerificationActivity identityVerificationActivityA = identityVerificationStep1Fragment.A();
                        if (identityVerificationActivityA != null && (preCheckPhoneRsp2 = identityVerificationActivityA.f25869i) != null) {
                            Boolean bool = ((CheckIdentifyRsp) commonBeanResult.data).needAddress;
                            if (bool != null) {
                                preCheckPhoneRsp2.needAddress = bool.booleanValue();
                            }
                            Boolean bool2 = ((CheckIdentifyRsp) commonBeanResult.data).canSkipAddress;
                            if (bool2 != null) {
                                preCheckPhoneRsp2.canSkipAddress = bool2.booleanValue();
                            }
                            Boolean bool3 = ((CheckIdentifyRsp) commonBeanResult.data).needIndustry;
                            if (bool3 != null) {
                                preCheckPhoneRsp2.needIndustry = bool3.booleanValue();
                            }
                            Boolean bool4 = ((CheckIdentifyRsp) commonBeanResult.data).canSkipIndustry;
                            if (bool4 != null) {
                                preCheckPhoneRsp2.canSkipIndustry = bool4.booleanValue();
                            }
                        }
                        if (((CheckIdentifyRsp) commonBeanResult.data).teenagerPop != null) {
                            ConfirmDobDialog confirmDobDialog = new ConfirmDobDialog(identityVerificationStep1Fragment.getContext(), (CheckIdentifyRsp) commonBeanResult.data, new p(identityVerificationStep1Fragment, commonBeanResult, 0));
                            confirmDobDialog.setCancelable(false);
                            confirmDobDialog.setCanceledOnTouchOutside(false);
                            confirmDobDialog.show();
                            n0 n0VarG = n0.g();
                            ViewEvent viewEvent = new ViewEvent("Popup_Confirm_DOB_Exposure");
                            CheckIdentifyRsp checkIdentifyRsp = (CheckIdentifyRsp) commonBeanResult.data;
                            if (checkIdentifyRsp != null && (teenagerPopInfo = checkIdentifyRsp.teenagerPop) != null) {
                                string = Integer.valueOf(teenagerPopInfo.ageGrade).toString();
                            }
                            n0VarG.u(viewEvent.add("age-type", string));
                        } else {
                            IdentityVerificationStep1Fragment.u(identityVerificationStep1Fragment, commonBeanResult);
                        }
                    } else if ("VL000014".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                        int i7 = IdentityVerificationStep1Fragment.f26173w;
                        androidx.fragment.app.E activity = identityVerificationStep1Fragment.getActivity();
                        if (activity != null) {
                            String respMsg = commonBeanResult.getRespMsg();
                            Integer numValueOf = Integer.valueOf(F8.h.ac_re_enter_id);
                            IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationStep1Fragment.A();
                            if (identityVerificationActivityA2 == null || (preCheckPhoneRsp = identityVerificationActivityA2.f25869i) == null || !preCheckPhoneRsp.needFace) {
                                string = identityVerificationStep1Fragment.getString(p025ba.k.core_confirm);
                            } else {
                                Context context = identityVerificationStep1Fragment.getContext();
                                if (context != null) {
                                    string = context.getString(F8.h.ac_rescan_face);
                                }
                            }
                            io.fastkv.n.O(activity, 0, null, null, null, null, null, respMsg, numValueOf, null, null, null, string, new l(identityVerificationStep1Fragment, 2), null, false, 0, 8375935);
                        }
                    } else if ("VL000012".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                        int i10 = IdentityVerificationStep1Fragment.f26173w;
                        IdentityVerificationErrorDialog identityVerificationErrorDialog = new IdentityVerificationErrorDialog(identityVerificationStep1Fragment.getActivity());
                        identityVerificationErrorDialog.show();
                        androidx.fragment.app.E activity2 = identityVerificationStep1Fragment.getActivity();
                        if (activity2 != null) {
                            p220oa.h.h(activity2, "FacialRecognitionFailedPopup");
                        }
                        identityVerificationErrorDialog.update(commonBeanResult.getRespMsg());
                        identityVerificationErrorDialog.setConfirmCallback(new C0142i(identityVerificationStep1Fragment, 7));
                    } else if ("VL000107".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                        int i11 = IdentityVerificationStep1Fragment.f26173w;
                        androidx.fragment.app.E activity3 = identityVerificationStep1Fragment.getActivity();
                        if (activity3 != null) {
                            io.fastkv.n.O(activity3, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(p025ba.k.core_confirm), null, new l(identityVerificationStep1Fragment, 3), null, null, null, null, false, 0, 8387199);
                        }
                    } else if ("VL000200".equalsIgnoreCase(commonBeanResult.getRespCode()) || "VL000206".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                        int i12 = IdentityVerificationStep1Fragment.f26173w;
                        String respMsg2 = Intrinsics.c(commonBeanResult.getRespCode(), "VL000206") ? "Your NIN information indicates that you are under 13. Please enter a new NIN/BVN to proceed with registration." : "Your BVN information indicates that you are under 18. According to CBN regulations, users under 18 can only register using the NIN. \nPlease enter your NIN to proceed with registration.";
                        androidx.fragment.app.E activity4 = identityVerificationStep1Fragment.getActivity();
                        if (activity4 != null) {
                            String str = Intrinsics.c(commonBeanResult.getRespCode(), "VL000206") ? "You are under the age of 13" : "You are under the age of 18";
                            if (!TextUtils.isEmpty(commonBeanResult.getRespMsg())) {
                                respMsg2 = commonBeanResult.getRespMsg();
                            }
                            io.fastkv.n.O(activity4, 0, null, str, null, null, null, respMsg2, Integer.valueOf(F8.h.ac_re_enter_id), null, null, null, null, null, null, false, 0, 8388219);
                        }
                    } else if ("VL000219".equalsIgnoreCase(commonBeanResult.getRespCode()) || "VL000218".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                        androidx.fragment.app.E activity5 = identityVerificationStep1Fragment.getActivity();
                        if (activity5 != null) {
                            io.fastkv.n.O(activity5, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_re_enter_id), null, null, null, null, null, null, false, 0, 8388221);
                        }
                    } else {
                        IdentityVerificationStep1Fragment.v(identityVerificationStep1Fragment, commonBeanResult);
                    }
                    int i13 = IdentityVerificationStep1Fragment.f26173w;
                    nVar = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar != null) {
                        nVar.f4159g.b(false);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationStep1Fragment2.showLoadingDialog(false, true);
                    int i14 = IdentityVerificationStep1Fragment.f26173w;
                    nVar = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar != null) {
                        nVar.f4159g.b(false);
                    }
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationStep1Fragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar3 = (com.transsnet.palmpay.core.base.n) it;
                    ToastUtils.showLong(nVar3.f27358a, new Object[0]);
                    p220oa.h.y(identityVerificationStep1Fragment, nVar3.f27358a);
                    int i15 = IdentityVerificationStep1Fragment.f26173w;
                    nVar = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar != null) {
                        nVar.f4159g.b(false);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationStep1Fragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationStep1Fragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    int i16 = IdentityVerificationStep1Fragment.f26173w;
                    I8.n nVar4 = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar4 != null) {
                        nVar4.f4159g.b(false);
                    }
                    if (commonBeanResult2.isSuccess()) {
                        IdentityVerificationStep1Fragment.w(identityVerificationStep1Fragment);
                        int i17 = F8.d.fragment_identity_verification_step_id;
                        IdentityVerificationActivity identityVerificationActivityA3 = identityVerificationStep1Fragment.A();
                        if (identityVerificationActivityA3 != null && (addUserExtraInfoReqL = identityVerificationActivityA3.l()) != null) {
                            addUserExtraInfoReqL.verifyNum = null;
                            addUserExtraInfoReqL.verifyType = null;
                            if (!TextUtils.isEmpty(addUserExtraInfoReqL.faceToken)) {
                                addUserExtraInfoReqL.faceToken = null;
                                IdentityVerificationActivity identityVerificationActivityA4 = identityVerificationStep1Fragment.A();
                                if (identityVerificationActivityA4 != null && (preCheckPhoneRsp4 = identityVerificationActivityA4.f25869i) != null) {
                                    preCheckPhoneRsp4.needFace = false;
                                }
                                i17 = F8.d.fragment_identity_verification_step_face;
                            }
                            IdentityVerificationActivity identityVerificationActivityA5 = identityVerificationStep1Fragment.A();
                            if (identityVerificationActivityA5 != null && (preCheckPhoneRsp3 = identityVerificationActivityA5.f25869i) != null) {
                                preCheckPhoneRsp3.needNameVerify = false;
                            }
                        }
                        IdentityVerificationActivity identityVerificationActivityA6 = identityVerificationStep1Fragment.A();
                        if (identityVerificationActivityA6 != null) {
                            AbstractC0130w abstractC0130w = identityVerificationStep1Fragment.f26175p;
                            T data = commonBeanResult2.data;
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            identityVerificationActivityA6.p(abstractC0130w, (AddUserExtraActionRsp) data, Integer.valueOf(i17));
                        }
                    } else {
                        IdentityVerificationStep1Fragment.v(identityVerificationStep1Fragment, commonBeanResult2);
                    }
                    nVar2 = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar2 != null) {
                        nVar2.f4159g.b(false);
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationStep1Fragment2.showLoadingDialog(false, true);
                    int i18 = IdentityVerificationStep1Fragment.f26173w;
                    nVar2 = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar2 != null) {
                        nVar2.f4159g.b(false);
                    }
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationStep1Fragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar5 = (com.transsnet.palmpay.core.base.n) it2;
                    ToastUtils.showLong(nVar5.f27358a, new Object[0]);
                    String str2 = nVar5.f27358a;
                    int i19 = IdentityVerificationStep1Fragment.f26173w;
                    I8.n nVar6 = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar6 != null) {
                        nVar6.f4159g.b(false);
                    }
                    p220oa.h.y(identityVerificationStep1Fragment, str2);
                    nVar2 = (I8.n) identityVerificationStep1Fragment.f27335j;
                    if (nVar2 != null) {
                        nVar2.f4159g.b(false);
                    }
                }
                return Unit.f38893a;
        }
    }
}
