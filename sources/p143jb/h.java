package p143jb;

import C0.G;
import F6.d;
import android.app.Activity;
import android.text.TextUtils;
import com.flexibank.sdk.g;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.resp.BlockItem;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusData;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.util.ActivityUtils;
import io.reactivex.internal.operators.observable.C1761m;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f38528b;

    public /* synthetic */ h(o oVar, int i7) {
        this.f38527a = i7;
        this.f38528b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BlockItem blockItem;
        Activity topActivity;
        OcSignStatusData data;
        Integer type;
        switch (this.f38527a) {
            case 0:
                CLInitResp cLInitResp = (CLInitResp) obj;
                if (cLInitResp != null && cLInitResp.isSuccess() && cLInitResp.getData() != null) {
                    CLInitData data2 = cLInitResp.getData();
                    String applyId = data2 != null ? data2.getApplyId() : null;
                    o oVar = this.f38528b;
                    oVar.f38547e = applyId;
                    CLInitData data3 = cLInitResp.getData();
                    oVar.f38549g = data3 != null ? data3.getSceneType() : null;
                    CLInitData data4 = cLInitResp.getData();
                    oVar.f38548f = data4 != null ? data4.getCreditSceneRouteBindingFailTimes() : null;
                }
                return Unit.f38893a;
            case 1:
                CLInitResp it = (CLInitResp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccess() && it.getData() != null) {
                    o oVar2 = this.f38528b;
                    return o.u(oVar2.f38553k, oVar2.f38552j, oVar2.f38547e);
                }
                d.c("CreditRouterManager", "initApplyLog error >>> " + it);
                if (C1847n.p(o.f38541B, it.getRespCode())) {
                    d.h("CreditRouterManager", 3, "CLRouteInterceptDialog >>> show");
                    CLInitData data5 = it.getData();
                    if (data5 != null && (blockItem = data5.getBlockItem()) != null && (topActivity = ActivityUtils.getTopActivity()) != null) {
                        topActivity.runOnUiThread(new g(23, topActivity, blockItem));
                    }
                }
                OcRouterResp ocRouterResp = new OcRouterResp(null);
                ocRouterResp.setRespCode(it.getRespCode());
                ocRouterResp.setRespMsg(it.getRespMsg());
                return df.d.h(ocRouterResp);
            default:
                OcSignStatusResp it2 = (OcSignStatusResp) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                o oVar3 = this.f38528b;
                Integer num = oVar3.f38549g;
                if ((num != null && num.intValue() == 1) || TextUtils.equals("PALMPAY_CARD", oVar3.f38553k) || (it2.isSuccess() && (data = it2.getData()) != null && (type = data.getType()) != null && type.intValue() == 0)) {
                    d.h("CreditRouterManager", 3, "protocol is signed, just call submit");
                    return G.h(c.f40268a).openCashLoan(new CLOpenAccountReq(oVar3.f38552j, oVar3.f38547e, null, Integer.valueOf(o.g()), false, false, oVar3.f38554l, null, null, null, null, null, null, null, null, oVar3.f38553k, 32692, null)).k(f.f42629b);
                }
                oVar3.o();
                oVar3.y(null, "/credit_score/cl_last_protocol_activity", null);
                return C1761m.f37838a;
        }
    }
}
