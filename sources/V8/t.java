package V8;

import C0.AbstractC0130w;
import android.os.Bundle;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep2Fragment f10161b;

    public t(IdentityVerificationStep2Fragment identityVerificationStep2Fragment) {
        this.f10160a = 0;
        this.f10161b = identityVerificationStep2Fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IdentityVerificationStep2Fragment identityVerificationStep2Fragment;
        IdentityVerificationActivity identityVerificationActivityA;
        CheckIdentifyReq checkIdentifyReqN;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN2;
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        PreCheckPhoneRsp preCheckPhoneRsp4;
        AddUserExtraInfoReq addUserExtraInfoReqL2;
        switch (this.f10160a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess() && (identityVerificationActivityA = (identityVerificationStep2Fragment = this.f10161b).A()) != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
                            if (TextUtils.isEmpty(checkIdentifyReqN.firstName)) {
                                checkIdentifyReqN.firstName = ((PreCheckPhoneRsp) commonBeanResult.data).firstName;
                            }
                            if (TextUtils.isEmpty(checkIdentifyReqN.middleName)) {
                                checkIdentifyReqN.middleName = ((PreCheckPhoneRsp) commonBeanResult.data).middleName;
                            }
                            if (TextUtils.isEmpty(checkIdentifyReqN.lastName)) {
                                checkIdentifyReqN.lastName = ((PreCheckPhoneRsp) commonBeanResult.data).lastName;
                            }
                            if (TextUtils.isEmpty(checkIdentifyReqN.birthday)) {
                                checkIdentifyReqN.birthday = ((PreCheckPhoneRsp) commonBeanResult.data).birthday;
                            }
                            IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationStep2Fragment.A();
                            if (identityVerificationActivityA2 != null && (checkIdentifyReqN2 = identityVerificationActivityA2.n()) != null) {
                                identityVerificationStep2Fragment.C(checkIdentifyReqN2);
                            }
                            IdentityVerificationActivity identityVerificationActivityA3 = identityVerificationStep2Fragment.A();
                            if (identityVerificationActivityA3 != null && (addUserExtraInfoReqL = identityVerificationActivityA3.l()) != null) {
                                identityVerificationStep2Fragment.C(addUserExtraInfoReqL);
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    boolean z3 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    IdentityVerificationStep2Fragment identityVerificationStep2Fragment2 = this.f10161b;
                    if (z3) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            IdentityVerificationActivity identityVerificationActivityA4 = identityVerificationStep2Fragment2.A();
                            ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityA4 != null ? identityVerificationActivityA4.m() : null;
                            if (applyBalanceV2ReqM != null) {
                                applyBalanceV2ReqM.verifyToken = ((CheckIdentifyRsp) commonBeanResult2.data).verifyToken;
                            }
                            if (TextUtils.isEmpty(((CheckIdentifyRsp) commonBeanResult2.data).verifyToken)) {
                                IdentityVerificationActivity identityVerificationActivityA5 = identityVerificationStep2Fragment2.A();
                                if (identityVerificationActivityA5 == null || (preCheckPhoneRsp4 = identityVerificationActivityA5.f25869i) == null || !preCheckPhoneRsp4.needIndustry) {
                                    IdentityVerificationActivity identityVerificationActivityA6 = identityVerificationStep2Fragment2.A();
                                    if (identityVerificationActivityA6 == null || (preCheckPhoneRsp3 = identityVerificationActivityA6.f25869i) == null || !preCheckPhoneRsp3.needAddress) {
                                        ToastUtils.showLong("Verify Token is empty", new Object[0]);
                                    } else {
                                        AbstractC0130w abstractC0130w = identityVerificationStep2Fragment2.t;
                                        if (abstractC0130w != null) {
                                            abstractC0130w.h(F8.d.fragment_identity_verification_step_address, ((CheckIdentifyRsp) commonBeanResult2.data).saveAddressToBundle(new Bundle()), null);
                                        }
                                    }
                                } else {
                                    AbstractC0130w abstractC0130w2 = identityVerificationStep2Fragment2.t;
                                    if (abstractC0130w2 != null) {
                                        abstractC0130w2.h(F8.d.fragment_identity_verification_step_profile, null, null);
                                    }
                                }
                            } else {
                                IdentityVerificationActivity identityVerificationActivityA7 = identityVerificationStep2Fragment2.A();
                                if (identityVerificationActivityA7 == null || (preCheckPhoneRsp2 = identityVerificationActivityA7.f25869i) == null || !preCheckPhoneRsp2.needIndustry) {
                                    IdentityVerificationActivity identityVerificationActivityA8 = identityVerificationStep2Fragment2.A();
                                    if (identityVerificationActivityA8 == null || (preCheckPhoneRsp = identityVerificationActivityA8.f25869i) == null || !preCheckPhoneRsp.needAddress) {
                                        IdentityVerificationActivity identityVerificationActivityA9 = identityVerificationStep2Fragment2.A();
                                        if (identityVerificationActivityA9 == null || !identityVerificationActivityA9.r()) {
                                            I8.o oVar = (I8.o) identityVerificationStep2Fragment2.f27335j;
                                            if (oVar != null) {
                                                oVar.f4172g.b(true);
                                            }
                                            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationStep2Fragment2.f27333i;
                                            if (identityVerificationViewModel != null) {
                                                identityVerificationViewModel.e(applyBalanceV2ReqM);
                                            }
                                        } else {
                                            IdentityVerificationActivity identityVerificationActivityA10 = identityVerificationStep2Fragment2.A();
                                            if (identityVerificationActivityA10 != null) {
                                                identityVerificationActivityA10.t(((CheckIdentifyRsp) commonBeanResult2.data).verifyToken);
                                            }
                                        }
                                    } else {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("_token", ((CheckIdentifyRsp) commonBeanResult2.data).verifyToken);
                                        ((CheckIdentifyRsp) commonBeanResult2.data).saveAddressToBundle(bundle);
                                        AbstractC0130w abstractC0130w3 = identityVerificationStep2Fragment2.t;
                                        if (abstractC0130w3 != null) {
                                            abstractC0130w3.h(F8.d.fragment_identity_verification_step_address, bundle, null);
                                        }
                                    }
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_token", ((CheckIdentifyRsp) commonBeanResult2.data).verifyToken);
                                    AbstractC0130w abstractC0130w4 = identityVerificationStep2Fragment2.t;
                                    if (abstractC0130w4 != null) {
                                        abstractC0130w4.h(F8.d.fragment_identity_verification_step_profile, bundle2, null);
                                    }
                                }
                            }
                        } else {
                            I8.o oVar2 = (I8.o) identityVerificationStep2Fragment2.f27335j;
                            if (oVar2 != null) {
                                oVar2.f4172g.b(false);
                            }
                            androidx.fragment.app.E activity = identityVerificationStep2Fragment2.getActivity();
                            if (activity != null) {
                                io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult2.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it2;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        p220oa.h.y(identityVerificationStep2Fragment2, nVar.f27358a);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    boolean z8 = it3 instanceof com.transsnet.palmpay.core.base.p;
                    IdentityVerificationStep2Fragment identityVerificationStep2Fragment3 = this.f10161b;
                    if (z8) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        I8.o oVar3 = (I8.o) identityVerificationStep2Fragment3.f27335j;
                        if (oVar3 != null) {
                            oVar3.f4172g.b(false);
                        }
                        if (commonBeanResult3.isSuccess()) {
                            IdentityVerificationActivity identityVerificationActivityA11 = identityVerificationStep2Fragment3.A();
                            if (identityVerificationActivityA11 != null && (addUserExtraInfoReqL2 = identityVerificationActivityA11.l()) != null) {
                                addUserExtraInfoReqL2.gender = null;
                                addUserExtraInfoReqL2.birthday = null;
                                addUserExtraInfoReqL2.firstName = null;
                                addUserExtraInfoReqL2.lastName = null;
                                addUserExtraInfoReqL2.middleName = null;
                            }
                            IdentityVerificationActivity identityVerificationActivityA12 = identityVerificationStep2Fragment3.A();
                            if (identityVerificationActivityA12 != null) {
                                AbstractC0130w abstractC0130w5 = identityVerificationStep2Fragment3.t;
                                T data = commonBeanResult3.data;
                                Intrinsics.checkNotNullExpressionValue(data, "data");
                                identityVerificationActivityA12.p(abstractC0130w5, (AddUserExtraActionRsp) data, Integer.valueOf(F8.d.fragment_identity_verification_step_id));
                            }
                        } else {
                            I8.o oVar4 = (I8.o) identityVerificationStep2Fragment3.f27335j;
                            if (oVar4 != null) {
                                oVar4.f4172g.b(false);
                            }
                            androidx.fragment.app.E activity2 = identityVerificationStep2Fragment3.getActivity();
                            if (activity2 != null) {
                                io.fastkv.n.O(activity2, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult3.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it3;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        String str = nVar2.f27358a;
                        I8.o oVar5 = (I8.o) identityVerificationStep2Fragment3.f27335j;
                        if (oVar5 != null) {
                            oVar5.f4172g.b(false);
                        }
                        p220oa.h.y(identityVerificationStep2Fragment3, str);
                    }
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ t(IdentityVerificationStep2Fragment identityVerificationStep2Fragment, IdentityVerificationStep2Fragment identityVerificationStep2Fragment2, int i7) {
        this.f10160a = i7;
        this.f10161b = identityVerificationStep2Fragment2;
    }
}
