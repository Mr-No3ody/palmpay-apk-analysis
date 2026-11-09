package V8;

import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10132c;

    public /* synthetic */ g(IdentityVerificationAddressFragment identityVerificationAddressFragment, IdentityVerificationAddressFragment identityVerificationAddressFragment2, int i7) {
        this.f10130a = i7;
        this.f10131b = identityVerificationAddressFragment;
        this.f10132c = identityVerificationAddressFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IdentityVerificationAddressFragment identityVerificationAddressFragment = this.f10132c;
        IdentityVerificationAddressFragment identityVerificationAddressFragment2 = this.f10131b;
        switch (this.f10130a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationAddressFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationAddressFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (!commonBeanResult.isSuccess()) {
                        int i7 = IdentityVerificationAddressFragment.f26156Q;
                        I8.p pVar = (I8.p) identityVerificationAddressFragment.f27335j;
                        if (pVar != null) {
                            pVar.f4182i.b(false);
                        }
                        I8.p pVar2 = (I8.p) identityVerificationAddressFragment.f27335j;
                        if (pVar2 != null) {
                            pVar2.f4184o.setEnabled(true);
                        }
                        androidx.fragment.app.E activity = identityVerificationAddressFragment.getActivity();
                        if (activity != null) {
                            io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                        }
                    } else if (TextUtils.isEmpty(((CheckIdentifyRsp) commonBeanResult.data).verifyToken)) {
                        ToastUtils.showLong("Verify Token is empty", new Object[0]);
                    } else {
                        int i10 = IdentityVerificationAddressFragment.f26156Q;
                        IdentityVerificationActivity identityVerificationActivityX = identityVerificationAddressFragment.x();
                        if (identityVerificationActivityX == null || !identityVerificationActivityX.r()) {
                            IdentityVerificationActivity identityVerificationActivityX2 = identityVerificationAddressFragment.x();
                            ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityX2 != null ? identityVerificationActivityX2.m() : null;
                            if (applyBalanceV2ReqM != null) {
                                applyBalanceV2ReqM.verifyToken = ((CheckIdentifyRsp) commonBeanResult.data).verifyToken;
                            }
                            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationAddressFragment.f27333i;
                            if (identityVerificationViewModel != null) {
                                identityVerificationViewModel.e(applyBalanceV2ReqM);
                            }
                        } else {
                            identityVerificationAddressFragment.B(((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationAddressFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationAddressFragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                    String str = nVar.f27358a;
                    int i11 = IdentityVerificationAddressFragment.f26156Q;
                    I8.p pVar3 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar3 != null) {
                        pVar3.f4182i.b(false);
                    }
                    I8.p pVar4 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar4 != null) {
                        pVar4.f4184o.setEnabled(true);
                    }
                    p220oa.h.y(identityVerificationAddressFragment, str);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    identityVerificationAddressFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    identityVerificationAddressFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        AddUserExtraActionRsp addUserExtraActionRsp = (AddUserExtraActionRsp) commonBeanResult2.data;
                        addUserExtraActionRsp.needAddress = false;
                        addUserExtraActionRsp.needIndustry = false;
                        int i12 = IdentityVerificationAddressFragment.f26156Q;
                        IdentityVerificationActivity identityVerificationActivityX3 = identityVerificationAddressFragment.x();
                        if (identityVerificationActivityX3 != null) {
                            T data = commonBeanResult2.data;
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            int i13 = IdentityVerificationActivity.f25861A;
                            identityVerificationActivityX3.p(null, (AddUserExtraActionRsp) data, null);
                        }
                    } else {
                        int i14 = IdentityVerificationAddressFragment.f26156Q;
                        I8.p pVar5 = (I8.p) identityVerificationAddressFragment.f27335j;
                        if (pVar5 != null) {
                            pVar5.f4182i.b(false);
                        }
                        I8.p pVar6 = (I8.p) identityVerificationAddressFragment.f27335j;
                        if (pVar6 != null) {
                            pVar6.f4184o.setEnabled(true);
                        }
                        androidx.fragment.app.E activity2 = identityVerificationAddressFragment.getActivity();
                        if (activity2 != null) {
                            io.fastkv.n.O(activity2, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult2.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                        }
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    identityVerificationAddressFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    identityVerificationAddressFragment2.showLoadingDialog(false, true);
                    com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it2;
                    ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                    String str2 = nVar2.f27358a;
                    int i15 = IdentityVerificationAddressFragment.f26156Q;
                    I8.p pVar7 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar7 != null) {
                        pVar7.f4182i.b(false);
                    }
                    I8.p pVar8 = (I8.p) identityVerificationAddressFragment.f27335j;
                    if (pVar8 != null) {
                        pVar8.f4184o.setEnabled(true);
                    }
                    p220oa.h.y(identityVerificationAddressFragment, str2);
                }
                return Unit.f38893a;
        }
    }
}
