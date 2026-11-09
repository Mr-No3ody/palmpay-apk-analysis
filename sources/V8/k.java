package V8;

import C0.AbstractC0130w;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.BvnIdentityInfoRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep0Fragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep0Fragment f10140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep0Fragment f10141c;

    public /* synthetic */ k(IdentityVerificationStep0Fragment identityVerificationStep0Fragment, IdentityVerificationStep0Fragment identityVerificationStep0Fragment2, int i7) {
        this.f10139a = i7;
        this.f10140b = identityVerificationStep0Fragment;
        this.f10141c = identityVerificationStep0Fragment2;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bc.l lVar;
        androidx.fragment.app.E activity;
        Bc.l lVar2;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        switch (this.f10139a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment = this.f10140b;
                if (z3) {
                    identityVerificationStep0Fragment.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof com.transsnet.palmpay.core.base.p;
                    IdentityVerificationStep0Fragment identityVerificationStep0Fragment2 = this.f10141c;
                    if (z8) {
                        identityVerificationStep0Fragment.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            BvnIdentityInfoRsp bvnIdentityInfoRsp = (BvnIdentityInfoRsp) commonBeanResult.data;
                            if (TextUtils.isEmpty(bvnIdentityInfoRsp != null ? bvnIdentityInfoRsp.bvnHide : null)) {
                                BvnIdentityInfoRsp bvnIdentityInfoRsp2 = (BvnIdentityInfoRsp) commonBeanResult.data;
                                if (TextUtils.isEmpty(bvnIdentityInfoRsp2 != null ? bvnIdentityInfoRsp2.ninHide : null)) {
                                    identityVerificationStep0Fragment2.u();
                                    AbstractC0130w abstractC0130w = identityVerificationStep0Fragment2.t;
                                    if (abstractC0130w != null) {
                                        abstractC0130w.h(F8.d.fragment_identity_verification_step_id, null, null);
                                    }
                                } else {
                                    n0.g().v("QuickVerificationPopup");
                                    activity = identityVerificationStep0Fragment2.getActivity();
                                    if (activity != null) {
                                        io.fastkv.n.O(activity, 0, null, "Request Approval", null, null, null, identityVerificationStep0Fragment2.getString(F8.h.ac_msg_allow_use_bvn_lib_info, r0.Y(identityVerificationStep0Fragment2.v())), Integer.valueOf(p025ba.k.core_allow), null, new Oc.j(16, commonBeanResult, identityVerificationStep0Fragment2), Integer.valueOf(p025ba.k.core_cancel), null, new j(identityVerificationStep0Fragment2, 2), null, false, 0, 8376955);
                                    }
                                }
                            } else {
                                n0.g().v("QuickVerificationPopup");
                                activity = identityVerificationStep0Fragment2.getActivity();
                                if (activity != null) {
                                    io.fastkv.n.O(activity, 0, null, "Request Approval", null, null, null, identityVerificationStep0Fragment2.getString(F8.h.ac_msg_allow_use_bvn_lib_info, r0.Y(identityVerificationStep0Fragment2.v())), Integer.valueOf(p025ba.k.core_allow), null, new Oc.j(16, commonBeanResult, identityVerificationStep0Fragment2), Integer.valueOf(p025ba.k.core_cancel), null, new j(identityVerificationStep0Fragment2, 2), null, false, 0, 8376955);
                                }
                            }
                        } else {
                            Context context = identityVerificationStep0Fragment2.getContext();
                            if (context != null) {
                                String respMsg = commonBeanResult.getRespMsg();
                                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                                p220oa.h.t(context, respMsg);
                            }
                        }
                        IdentityVerificationActivity identityVerificationActivityW = identityVerificationStep0Fragment2.w();
                        if (identityVerificationActivityW != null) {
                            identityVerificationActivityW.f25865d = false;
                        }
                        I8.m mVar = (I8.m) identityVerificationStep0Fragment2.f27335j;
                        if (mVar != null) {
                            lVar = mVar.f4151b;
                            ((PpButton) lVar.f755c).setEnabled(true);
                        }
                    } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                        identityVerificationStep0Fragment.showLoadingDialog(false, true);
                        IdentityVerificationActivity identityVerificationActivityW2 = identityVerificationStep0Fragment2.w();
                        if (identityVerificationActivityW2 != null) {
                            identityVerificationActivityW2.f25865d = false;
                        }
                        I8.m mVar2 = (I8.m) identityVerificationStep0Fragment2.f27335j;
                        if (mVar2 != null) {
                            lVar = mVar2.f4151b;
                            ((PpButton) lVar.f755c).setEnabled(true);
                        }
                    } else {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        identityVerificationStep0Fragment.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        IdentityVerificationActivity identityVerificationActivityW3 = identityVerificationStep0Fragment2.w();
                        if (identityVerificationActivityW3 != null) {
                            identityVerificationActivityW3.f25865d = false;
                        }
                        I8.m mVar3 = (I8.m) identityVerificationStep0Fragment2.f27335j;
                        if (mVar3 != null) {
                            lVar = mVar3.f4151b;
                            ((PpButton) lVar.f755c).setEnabled(true);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof com.transsnet.palmpay.core.base.o;
                IdentityVerificationStep0Fragment identityVerificationStep0Fragment3 = this.f10140b;
                if (z10) {
                    identityVerificationStep0Fragment3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    IdentityVerificationStep0Fragment identityVerificationStep0Fragment4 = this.f10141c;
                    if (z11) {
                        identityVerificationStep0Fragment3.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            IdentityVerificationActivity identityVerificationActivityW4 = identityVerificationStep0Fragment4.w();
                            if (identityVerificationActivityW4 != null && (addUserExtraInfoReqL = identityVerificationActivityW4.l()) != null) {
                                addUserExtraInfoReqL.faceToken = null;
                            }
                            IdentityVerificationActivity identityVerificationActivityW5 = identityVerificationStep0Fragment4.w();
                            if (identityVerificationActivityW5 != null) {
                                AbstractC0130w abstractC0130w2 = identityVerificationStep0Fragment4.t;
                                T data = commonBeanResult2.data;
                                Intrinsics.checkNotNullExpressionValue(data, "data");
                                identityVerificationActivityW5.p(abstractC0130w2, (AddUserExtraActionRsp) data, Integer.valueOf(F8.d.fragment_identity_verification_step_face));
                            }
                        } else {
                            Context context2 = identityVerificationStep0Fragment4.getContext();
                            if (context2 != null) {
                                String respMsg2 = commonBeanResult2.getRespMsg();
                                Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                                p220oa.h.t(context2, respMsg2);
                            }
                        }
                        IdentityVerificationActivity identityVerificationActivityW6 = identityVerificationStep0Fragment4.w();
                        if (identityVerificationActivityW6 != null) {
                            identityVerificationActivityW6.f25865d = false;
                        }
                        I8.m mVar4 = (I8.m) identityVerificationStep0Fragment4.f27335j;
                        if (mVar4 != null) {
                            lVar2 = mVar4.f4151b;
                            ((PpButton) lVar2.f755c).setEnabled(true);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        identityVerificationStep0Fragment3.showLoadingDialog(false, true);
                        IdentityVerificationActivity identityVerificationActivityW7 = identityVerificationStep0Fragment4.w();
                        if (identityVerificationActivityW7 != null) {
                            identityVerificationActivityW7.f25865d = false;
                        }
                        I8.m mVar5 = (I8.m) identityVerificationStep0Fragment4.f27335j;
                        if (mVar5 != null) {
                            lVar2 = mVar5.f4151b;
                            ((PpButton) lVar2.f755c).setEnabled(true);
                        }
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        identityVerificationStep0Fragment3.showLoadingDialog(false, true);
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it2;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                        IdentityVerificationActivity identityVerificationActivityW8 = identityVerificationStep0Fragment4.w();
                        if (identityVerificationActivityW8 != null) {
                            identityVerificationActivityW8.f25865d = false;
                        }
                        I8.m mVar6 = (I8.m) identityVerificationStep0Fragment4.f27335j;
                        if (mVar6 != null) {
                            lVar2 = mVar6.f4151b;
                            ((PpButton) lVar2.f755c).setEnabled(true);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}
