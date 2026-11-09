package Ce;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.ClaimPalmZoneRewardsRsp;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomePalmZoneTabV2 f1443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomePalmZoneTabV2 f1444c;

    public /* synthetic */ P(HomePalmZoneTabV2 homePalmZoneTabV2, HomePalmZoneTabV2 homePalmZoneTabV3, int i7) {
        this.f1442a = i7;
        this.f1443b = homePalmZoneTabV2;
        this.f1444c = homePalmZoneTabV3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1442a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                HomePalmZoneTabV2 homePalmZoneTabV2 = this.f1443b;
                if (z3) {
                    homePalmZoneTabV2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    homePalmZoneTabV2.showLoadingDialog(false, true);
                    CommonBeanResult result = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    boolean zIsSuccess = result.isSuccess();
                    HomePalmZoneTabV2 homePalmZoneTabV3 = this.f1444c;
                    if (zIsSuccess) {
                        HomePalmZoneTabV2.t(homePalmZoneTabV3, (ClaimPalmZoneRewardsRsp) result.data);
                    } else {
                        Intrinsics.checkNotNullParameter(homePalmZoneTabV3, "<this>");
                        Intrinsics.checkNotNullParameter(result, "result");
                        ToastUtils.showLong(result.getRespMsg(), new Object[0]);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    homePalmZoneTabV2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    homePalmZoneTabV2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                HomePalmZoneTabV2 homePalmZoneTabV4 = this.f1443b;
                if (z8) {
                    homePalmZoneTabV4.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    homePalmZoneTabV4.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        HomePalmZoneTabV2.t(this.f1444c, (ClaimPalmZoneRewardsRsp) commonBeanResult.data);
                    } else {
                        ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    homePalmZoneTabV4.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    homePalmZoneTabV4.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
        }
    }
}
