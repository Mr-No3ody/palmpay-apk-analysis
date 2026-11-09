package O8;

import com.transsnet.palmpay.account.bean.rsp.QueryT3QuotaRsp;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaApplyResultActivity;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaManageFragment;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Tier3QuotaManageActivity f6681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Tier3QuotaManageActivity f6682c;

    public /* synthetic */ b(Tier3QuotaManageActivity tier3QuotaManageActivity, Tier3QuotaManageActivity tier3QuotaManageActivity2, int i7) {
        this.f6680a = i7;
        this.f6681b = tier3QuotaManageActivity;
        this.f6682c = tier3QuotaManageActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Tier3QuotaManageActivity tier3QuotaManageActivity = this.f6681b;
        switch (this.f6680a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    tier3QuotaManageActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    tier3QuotaManageActivity.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it).f27360a;
                    boolean zIsSuccess = commonResult.isSuccess();
                    Tier3QuotaManageActivity tier3QuotaManageActivity2 = this.f6682c;
                    if (zIsSuccess) {
                        Tier3QuotaApplyResultActivity.a.start$default(Tier3QuotaApplyResultActivity.f26089b, tier3QuotaManageActivity2, true, tier3QuotaManageActivity2.f26093d.transactionLimit, null, 8, null);
                    } else {
                        Tier3QuotaApplyResultActivity.f26089b.start(tier3QuotaManageActivity2, false, tier3QuotaManageActivity2.f26093d.transactionLimit, commonResult.getRespMsg());
                    }
                    tier3QuotaManageActivity2.finish();
                } else if (it instanceof m) {
                    tier3QuotaManageActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    tier3QuotaManageActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    tier3QuotaManageActivity.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    tier3QuotaManageActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        int i7 = Tier3QuotaManageActivity.f26091f;
                        ((Tier3QuotaManageFragment) this.f6682c.f26094e.getValue()).u((QueryT3QuotaRsp) commonBeanResult.data);
                    } else {
                        ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof m) {
                    tier3QuotaManageActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    tier3QuotaManageActivity.showLoadingDialog(false, true);
                    n nVar = (n) it2;
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                    ToastUtils.showLong(nVar.f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
