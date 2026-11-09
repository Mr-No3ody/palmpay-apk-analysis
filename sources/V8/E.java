package V8;

import C0.AbstractC0130w;
import android.os.Bundle;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationUserProfileFragment f10114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationUserProfileFragment f10115c;

    public /* synthetic */ E(IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment, IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment2, int i7) {
        this.f10113a = i7;
        this.f10114b = identityVerificationUserProfileFragment;
        this.f10115c = identityVerificationUserProfileFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        boolean z3 = false;
        IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10115c;
        IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment2 = this.f10114b;
        switch (this.f10113a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationUserProfileFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationUserProfileFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        AddUserExtraActionRsp addUserExtraActionRsp = (AddUserExtraActionRsp) commonBeanResult.data;
                        addUserExtraActionRsp.needIndustry = false;
                        int i7 = IdentityVerificationUserProfileFragment.f26181L;
                        IdentityVerificationActivity identityVerificationActivityA = identityVerificationUserProfileFragment.A();
                        if (identityVerificationActivityA != null && (preCheckPhoneRsp = identityVerificationActivityA.f25869i) != null) {
                            z3 = preCheckPhoneRsp.needAddress;
                        }
                        addUserExtraActionRsp.needAddress = z3;
                        IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationUserProfileFragment.A();
                        if (identityVerificationActivityA2 != null) {
                            AbstractC0130w abstractC0130w = identityVerificationUserProfileFragment.f26185H;
                            T data = commonBeanResult.data;
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            int i10 = IdentityVerificationActivity.f25861A;
                            identityVerificationActivityA2.p(abstractC0130w, (AddUserExtraActionRsp) data, null);
                        }
                    } else {
                        int i11 = IdentityVerificationUserProfileFragment.f26181L;
                        I8.t tVar = (I8.t) identityVerificationUserProfileFragment.f27335j;
                        if (tVar != null) {
                            tVar.f4224w.b(false);
                        }
                        I8.t tVar2 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                        if (tVar2 != null) {
                            tVar2.f4210C.setEnabled(true);
                        }
                        androidx.fragment.app.E activity = identityVerificationUserProfileFragment.getActivity();
                        if (activity != null) {
                            io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationUserProfileFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationUserProfileFragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                    String str = nVar.f27358a;
                    int i12 = IdentityVerificationUserProfileFragment.f26181L;
                    I8.t tVar3 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar3 != null) {
                        tVar3.f4224w.b(false);
                    }
                    I8.t tVar4 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar4 != null) {
                        tVar4.f4210C.setEnabled(true);
                    }
                    p220oa.h.y(identityVerificationUserProfileFragment, str);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationUserProfileFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationUserProfileFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (!commonBeanResult2.isSuccess()) {
                        int i13 = IdentityVerificationUserProfileFragment.f26181L;
                        I8.t tVar5 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                        if (tVar5 != null) {
                            tVar5.f4224w.b(false);
                        }
                        I8.t tVar6 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                        if (tVar6 != null) {
                            tVar6.f4210C.setEnabled(true);
                        }
                        androidx.fragment.app.E activity2 = identityVerificationUserProfileFragment.getActivity();
                        if (activity2 != null) {
                            io.fastkv.n.O(activity2, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult2.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                        }
                    } else if (TextUtils.isEmpty(((CheckIdentifyRsp) commonBeanResult2.data).verifyToken)) {
                        int i14 = IdentityVerificationUserProfileFragment.f26181L;
                        IdentityVerificationActivity identityVerificationActivityA3 = identityVerificationUserProfileFragment.A();
                        if (identityVerificationActivityA3 == null || (preCheckPhoneRsp3 = identityVerificationActivityA3.f25869i) == null || !preCheckPhoneRsp3.needAddress) {
                            ToastUtils.showLong("Verify Token is empty", new Object[0]);
                        } else {
                            AbstractC0130w abstractC0130w2 = identityVerificationUserProfileFragment.f26185H;
                            if (abstractC0130w2 != null) {
                                abstractC0130w2.h(F8.d.fragment_identity_verification_step_address, ((CheckIdentifyRsp) commonBeanResult2.data).saveAddressToBundle(new Bundle()), null);
                            }
                        }
                    } else {
                        int i15 = IdentityVerificationUserProfileFragment.f26181L;
                        IdentityVerificationActivity identityVerificationActivityA4 = identityVerificationUserProfileFragment.A();
                        if (identityVerificationActivityA4 == null || (preCheckPhoneRsp2 = identityVerificationActivityA4.f25869i) == null || !preCheckPhoneRsp2.needAddress) {
                            IdentityVerificationActivity identityVerificationActivityA5 = identityVerificationUserProfileFragment.A();
                            if (identityVerificationActivityA5 == null || !identityVerificationActivityA5.r()) {
                                IdentityVerificationActivity identityVerificationActivityA6 = identityVerificationUserProfileFragment.A();
                                ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityA6 != null ? identityVerificationActivityA6.m() : null;
                                if (applyBalanceV2ReqM != null) {
                                    applyBalanceV2ReqM.verifyToken = ((CheckIdentifyRsp) commonBeanResult2.data).verifyToken;
                                }
                                IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationUserProfileFragment.f27333i;
                                if (identityVerificationViewModel != null) {
                                    identityVerificationViewModel.e(applyBalanceV2ReqM);
                                }
                            } else {
                                identityVerificationUserProfileFragment.F(((CheckIdentifyRsp) commonBeanResult2.data).verifyToken);
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("_token", ((CheckIdentifyRsp) commonBeanResult2.data).verifyToken);
                            ((CheckIdentifyRsp) commonBeanResult2.data).saveAddressToBundle(bundle);
                            AbstractC0130w abstractC0130w3 = identityVerificationUserProfileFragment.f26185H;
                            if (abstractC0130w3 != null) {
                                abstractC0130w3.h(F8.d.fragment_identity_verification_step_address, bundle, null);
                            }
                        }
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationUserProfileFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationUserProfileFragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it2;
                    ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                    String str2 = nVar2.f27358a;
                    int i16 = IdentityVerificationUserProfileFragment.f26181L;
                    I8.t tVar7 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar7 != null) {
                        tVar7.f4224w.b(false);
                    }
                    I8.t tVar8 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar8 != null) {
                        tVar8.f4210C.setEnabled(true);
                    }
                    p220oa.h.y(identityVerificationUserProfileFragment, str2);
                }
                return Unit.f38893a;
        }
    }
}
