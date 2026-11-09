package p284sb;

import Ya.g;
import Z4.e;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f42139g;

    public S(SearchMIDActivity searchMIDActivity, String str) {
        this.f42138f = searchMIDActivity;
        this.f42139g = str;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42138f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        ParseInstalmentsQrcodeRsp response = (ParseInstalmentsQrcodeRsp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        ParseInstalmentsQrcodeRsp.DataBean dataBean = response.data;
        boolean z3 = dataBean.isMine;
        SearchMIDActivity searchMIDActivity = this.f42138f;
        if (z3) {
            ToastUtils.showShort(searchMIDActivity.getString(g.cs_you_cant_pay_to), new Object[0]);
        }
        switch (dataBean.status) {
            case -1:
                ToastUtils.showShort(searchMIDActivity.getString(g.cs_merchant_id_not_find), new Object[0]);
                break;
            case 0:
            case 3:
                X x3 = (X) searchMIDActivity.f28783A.getValue();
                String merchantName = response.data.merchantName;
                Intrinsics.checkNotNullExpressionValue(merchantName, "merchantName");
                ParseInstalmentsQrcodeRsp.DataBean dataBean2 = response.data;
                int i7 = dataBean2.type;
                int i10 = dataBean2.businessType;
                x3.getClass();
                String snNo = this.f42139g;
                Intrinsics.checkNotNullParameter(snNo, "snNo");
                Intrinsics.checkNotNullParameter(merchantName, "merchantName");
                ARouter.getInstance().build("/credit_score/input_amount").withString("sn_no", snNo).withString("key_shop_name", merchantName).withInt("TYPE", i7).withInt("extra_type", i10).withString("FROM", "FindMerchantActivity").navigation();
                x3.f42145a.finish();
                break;
            case 1:
            case 2:
            case 4:
            case 5:
                ToastUtils.showShort(searchMIDActivity.getString(g.cs_merchant_not_support), new Object[0]);
                break;
            default:
                ToastUtils.showShort(searchMIDActivity.getString(g.cs_merchant_id_not_find), new Object[0]);
                break;
        }
    }
}
