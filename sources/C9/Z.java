package C9;

import android.widget.LinearLayout;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawQueryAccountListActivity;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawQueryAccountListActivity f1290b;

    public /* synthetic */ Z(WithdrawQueryAccountListActivity withdrawQueryAccountListActivity, int i7) {
        this.f1289a = i7;
        this.f1290b = withdrawQueryAccountListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<QueryRecentlyMerchantResp.Data> data;
        WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1290b;
        switch (this.f1289a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonListResultV2.isSuccess()) {
                            int i7 = WithdrawQueryAccountListActivity.f26945C;
                            withdrawQueryAccountListActivity.o().setVisibility(0);
                            withdrawQueryAccountListActivity.t().setVisibility(8);
                            withdrawQueryAccountListActivity.u().setVisibility(8);
                            List<T> list = commonListResultV2.data;
                            if (list == 0 || list.isEmpty()) {
                                ToastUtils.showLong(withdrawQueryAccountListActivity.getString(p366y9.d.ci_not_palmpay_accout), new Object[0]);
                                p220oa.h.s(withdrawQueryAccountListActivity.o(), false);
                            } else {
                                withdrawQueryAccountListActivity.u().setVisibility(0);
                                withdrawQueryAccountListActivity.u().setText(withdrawQueryAccountListActivity.getString(p366y9.d.ci_query_result));
                                withdrawQueryAccountListActivity.s().setVisibility(0);
                                withdrawQueryAccountListActivity.r().setList(commonListResultV2.data);
                                withdrawQueryAccountListActivity.r().notifyDataSetChanged();
                                Object value = withdrawQueryAccountListActivity.f26952g.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                p220oa.h.s((LinearLayout) value, false);
                            }
                        } else {
                            ToastUtils.showShort(commonListResultV2.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryRecentlyMerchantResp queryRecentlyMerchantResp = (QueryRecentlyMerchantResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (!queryRecentlyMerchantResp.isSuccess()) {
                            ToastUtils.showShort(queryRecentlyMerchantResp.getRespMsg(), new Object[0]);
                        } else if (queryRecentlyMerchantResp.getData() == null || ((data = queryRecentlyMerchantResp.getData()) != null && data.isEmpty())) {
                            withdrawQueryAccountListActivity.w();
                        } else {
                            int i10 = WithdrawQueryAccountListActivity.f26945C;
                            withdrawQueryAccountListActivity.o().setVisibility(0);
                            withdrawQueryAccountListActivity.u().setVisibility(0);
                            withdrawQueryAccountListActivity.p().setList(queryRecentlyMerchantResp.getData());
                            withdrawQueryAccountListActivity.p().notifyDataSetChanged();
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
