package G9;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.cash_in.bean.response.NearbyAgentsResp;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.core.bean.rsp.WithdrawalMenuRsp;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawHomeFragment f3180b;

    public /* synthetic */ l(WithdrawHomeFragment withdrawHomeFragment, int i7) {
        this.f3179a = i7;
        this.f3180b = withdrawHomeFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<QueryRecentlyMerchantResp.Data> data;
        List<NearbyAgentsResp.NearbyShopListBean> list;
        ConstraintLayout constraintLayout;
        List<WithdrawalMenuRsp.WithdrawalMenuBean> list2;
        WithdrawHomeFragment withdrawHomeFragment = this.f3180b;
        switch (this.f3179a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        QueryRecentlyMerchantResp queryRecentlyMerchantResp = (QueryRecentlyMerchantResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (queryRecentlyMerchantResp.isSuccess()) {
                            List<QueryRecentlyMerchantResp.Data> data2 = queryRecentlyMerchantResp.getData();
                            p355xf.t tVar = withdrawHomeFragment.f27041w;
                            if (data2 == null || ((data = queryRecentlyMerchantResp.getData()) != null && data.isEmpty())) {
                                LinearLayout linearLayout = (LinearLayout) tVar.getValue();
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                int i7 = WithdrawHomeFragment.f27021t0;
                                ((E9.i) withdrawHomeFragment.f27031Z.getValue()).setList(queryRecentlyMerchantResp.getData());
                                View view = (View) withdrawHomeFragment.f27025H.getValue();
                                if (view != null) {
                                    view.setVisibility(0);
                                }
                                LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                                if (linearLayout2 != null) {
                                    p220oa.h.C(linearLayout2);
                                }
                            }
                        } else {
                            ToastUtils.showShort(queryRecentlyMerchantResp.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            T t = commonBeanResult.data;
                            if (t != 0 && (list = ((NearbyAgentsResp) t).nearbyShopList) != null && !list.isEmpty() && (constraintLayout = (ConstraintLayout) withdrawHomeFragment.f27024C.getValue()) != null) {
                                constraintLayout.setVisibility(0);
                            }
                            View view2 = (View) withdrawHomeFragment.f27025H.getValue();
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            withdrawHomeFragment.v().setList(((NearbyAgentsResp) commonBeanResult.data).nearbyShopList);
                        } else {
                            ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        WithdrawalMenuRsp withdrawalMenuRsp = (WithdrawalMenuRsp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (withdrawalMenuRsp.isSuccess() && (list2 = withdrawalMenuRsp.data) != null && !list2.isEmpty()) {
                            View view3 = (View) withdrawHomeFragment.f27025H.getValue();
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            ((E9.f) withdrawHomeFragment.f27033k0.getValue()).setList(withdrawalMenuRsp.data);
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
