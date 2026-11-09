package p102ge;

import Ac.e;
import Bc.m;
import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountV2Resp;
import com.transsnet.palmpay.main.export.bean.rsp.GuaranteeQueryRsp;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p054dd.d;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyAssetsActivity f37186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyAssetsActivity f37187c;

    public /* synthetic */ G(MyAssetsActivity myAssetsActivity, MyAssetsActivity myAssetsActivity2, int i7) {
        this.f37185a = i7;
        this.f37186b = myAssetsActivity;
        this.f37187c = myAssetsActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GuaranteeQueryRsp guaranteeQueryRsp;
        switch (this.f37185a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                MyAssetsActivity myAssetsActivity = this.f37186b;
                if (z3) {
                    myAssetsActivity.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    MyAssetsActivity myAssetsActivity2 = this.f37187c;
                    if (z8) {
                        myAssetsActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        GetUserAssetsAmountV2Resp getUserAssetsAmountV2Resp = (GetUserAssetsAmountV2Resp) commonBeanResult.data;
                        myAssetsActivity2.f34501d = getUserAssetsAmountV2Resp;
                        myAssetsActivity2.m(getUserAssetsAmountV2Resp);
                        GetUserAssetsAmountV2Resp getUserAssetsAmountV2Resp2 = (GetUserAssetsAmountV2Resp) commonBeanResult.data;
                        myAssetsActivity2.n(getUserAssetsAmountV2Resp2 != null ? getUserAssetsAmountV2Resp2.savingMonthReport : null);
                        m mVar = myAssetsActivity2.f34503f;
                        if (mVar != null) {
                            mVar.f757B.setRefreshing(false);
                        }
                        m mVar2 = myAssetsActivity2.f34503f;
                        if (mVar2 != null) {
                            h.c(mVar2.f756A);
                        }
                    } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                        myAssetsActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        myAssetsActivity.showLoadingDialog(false, true);
                        ((n) it).getClass();
                        m mVar3 = myAssetsActivity2.f34503f;
                        if (mVar3 != null) {
                            mVar3.f757B.setRefreshing(false);
                        }
                        m mVar4 = myAssetsActivity2.f34503f;
                        if (mVar4 != null) {
                            h.c(mVar4.f756A);
                        }
                        myAssetsActivity2.m(myAssetsActivity2.f34501d);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                MyAssetsActivity myAssetsActivity3 = this.f37186b;
                if (z10) {
                    myAssetsActivity3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    MyAssetsActivity myAssetsActivity4 = this.f37187c;
                    if (z11) {
                        myAssetsActivity3.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        m mVar5 = myAssetsActivity4.f34503f;
                        if (mVar5 != null) {
                            mVar5.f757B.setRefreshing(false);
                        }
                        if (commonBeanResult2.isSuccess() && (guaranteeQueryRsp = (GuaranteeQueryRsp) commonBeanResult2.data) != null) {
                            if (guaranteeQueryRsp.guaranteeSuccess) {
                                m mVar6 = myAssetsActivity4.f34503f;
                                if (mVar6 != null) {
                                    h.s(mVar6.f774j, true);
                                }
                                m mVar7 = myAssetsActivity4.f34503f;
                                if (mVar7 != null) {
                                    h.s(mVar7.f776p, true);
                                }
                            } else if (i0.W(myAssetsActivity4)) {
                                try {
                                    if (myAssetsActivity4.f34500c == null) {
                                        m mVar8 = myAssetsActivity4.f34503f;
                                        if (mVar8 != null) {
                                            h.s(mVar8.f778w, true);
                                        }
                                        View viewFindViewById = myAssetsActivity4.findViewById(e.layoutSecurityGuaranteed);
                                        myAssetsActivity4.f34500c = viewFindViewById;
                                        if (viewFindViewById != null) {
                                            viewFindViewById.setOnClickListener(new d(9));
                                        }
                                    }
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        myAssetsActivity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        myAssetsActivity3.showLoadingDialog(false, true);
                        ((n) it2).getClass();
                        m mVar9 = myAssetsActivity4.f34503f;
                        if (mVar9 != null) {
                            mVar9.f757B.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}
