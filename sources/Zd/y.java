package Zd;

import Rd.g0;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.transsnet.palmpay.teller.bean.TvItemTipsBean;
import com.transsnet.palmpay.teller.bean.TvItemTipsResp;
import com.transsnet.palmpay.teller.bean.resp.QueryCustomerIdIsExitResp;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p086fe.U0;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f11696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11697c;

    public /* synthetic */ y(com.transsnet.palmpay.core.base.l lVar, BillPaymentTvHomeFragment billPaymentTvHomeFragment, int i7) {
        this.f11695a = i7;
        this.f11696b = lVar;
        this.f11697c = billPaymentTvHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11697c;
        com.transsnet.palmpay.core.base.l lVar = this.f11696b;
        switch (this.f11695a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj2 = lVar.f27356m;
                        QueryCustomerIdIsExitResp queryCustomerIdIsExitResp = (QueryCustomerIdIsExitResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        String str = (String) obj2;
                        if (!queryCustomerIdIsExitResp.isSuccess() || queryCustomerIdIsExitResp.getData() == null) {
                            int i7 = BillPaymentTvHomeFragment.f34295v0;
                            billPaymentTvHomeFragment.z().stop();
                            g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
                            if (g0Var != null && (linearLayout2 = g0Var.f8323o) != null) {
                                p220oa.h.s(linearLayout2, false);
                            }
                        } else if (str != null) {
                            HashMap map = billPaymentTvHomeFragment.f34311t0;
                            QueryCustomerIdIsExitResp.DataBean data = queryCustomerIdIsExitResp.getData();
                            Intrinsics.e(data);
                            map.put(str, data);
                            billPaymentTvHomeFragment.w(str, queryCustomerIdIsExitResp.getData());
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        int i10 = BillPaymentTvHomeFragment.f34295v0;
                        billPaymentTvHomeFragment.z().stop();
                        g0 g0Var2 = (g0) billPaymentTvHomeFragment.f27335j;
                        if (g0Var2 != null && (linearLayout = g0Var2.f8323o) != null) {
                            p220oa.h.s(linearLayout, false);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj3 = lVar.f27356m;
                        TvItemTipsResp tvItemTipsResp = (TvItemTipsResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        String operatorId = (String) obj3;
                        if (tvItemTipsResp.isSuccess() && tvItemTipsResp.getData() != null && !TextUtils.isEmpty(operatorId)) {
                            U0 u6 = (U0) billPaymentTvHomeFragment.f34308q0.getValue();
                            Intrinsics.e(operatorId);
                            ArrayList<TvItemTipsBean> cacheData = tvItemTipsResp.getData();
                            Intrinsics.e(cacheData);
                            u6.getClass();
                            Intrinsics.checkNotNullParameter(operatorId, "operatorId");
                            Intrinsics.checkNotNullParameter(cacheData, "cacheData");
                            androidx.lifecycle.F f10 = u6.f36586d;
                            Map linkedHashMap = (Map) f10.d();
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            linkedHashMap.put(operatorId, cacheData);
                            f10.k(linkedHashMap);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
