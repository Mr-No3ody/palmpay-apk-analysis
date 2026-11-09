package p382zb;

import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.CLCalcReturnSendCouponResp;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeFinanceFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p099gb.g;
import p186mb.c;
import p186mb.d;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcHomeFinanceFragment f44538b;

    public /* synthetic */ N(OcHomeFinanceFragment ocHomeFinanceFragment, int i7) {
        this.f44537a = i7;
        this.f44538b = ocHomeFinanceFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44537a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        Map map = (Map) ((CommonBeanResult) ((p) it).f27360a).data;
                        OcHomeFinanceFragment ocHomeFinanceFragment = this.f44538b;
                        c cVar = d.f39634e;
                        cVar.getInstance().a(map);
                        g gVar = (g) ocHomeFinanceFragment.f27335j;
                        if (gVar != null) {
                            gVar.f37148e.e(cVar.getInstance().f39638c);
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CLCalcReturnSendCouponResp cLCalcReturnSendCouponResp = (CLCalcReturnSendCouponResp) ((p) it2).f27360a;
                        F6.d.h(this.f44538b.f27317a, 3, "calcReturnSendCouponResult = " + cLCalcReturnSendCouponResp);
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
