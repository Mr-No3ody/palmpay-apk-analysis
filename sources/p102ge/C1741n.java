package p102ge;

import Bc.C0108e;
import Z4.e;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.rsp.BuyEarlyRefundOrderDetailRsp;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import com.transsnet.palmpay.ui.activity.BuyEarlyRefundResultActivity;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: renamed from: ge.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1741n extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BuyEarlyRefundResultActivity f37224f;

    public C1741n(BuyEarlyRefundResultActivity buyEarlyRefundResultActivity) {
        this.f37224f = buyEarlyRefundResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f37224f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        TextView textView;
        BuyEarlyRefundOrderDetailRsp buyEarlyRefundOrderDetailRsp = (BuyEarlyRefundOrderDetailRsp) obj;
        if (buyEarlyRefundOrderDetailRsp != null) {
            if (!buyEarlyRefundOrderDetailRsp.isSuccess()) {
                ToastUtils.showLong(buyEarlyRefundOrderDetailRsp.getRespMsg(), new Object[0]);
                return;
            }
            BuyEarlyRefundOrderDetailRsp.DataBean data = buyEarlyRefundOrderDetailRsp.data;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            BuyEarlyRefundResultActivity buyEarlyRefundResultActivity = this.f37224f;
            C0108e c0108e = buyEarlyRefundResultActivity.f34449c;
            if (c0108e != null) {
                ((ModelPreviewItem) c0108e.f693o).setContent(buyEarlyRefundResultActivity.getString(k.core_early_refund));
            }
            C0108e c0108e2 = buyEarlyRefundResultActivity.f34449c;
            if (c0108e2 != null) {
                ((ModelPreviewItem) c0108e2.f689f).setContent(data.memberName);
            }
            C0108e c0108e3 = buyEarlyRefundResultActivity.f34449c;
            if (c0108e3 != null) {
                ((ModelPreviewItem) c0108e3.f692j).setContent(buyEarlyRefundResultActivity.f34448b);
            }
            C0108e c0108e4 = buyEarlyRefundResultActivity.f34449c;
            if (c0108e4 != null) {
                ((ModelPreviewItem) c0108e4.f690g).setContent("Until " + TimeUtils.millis2String(data.endTime, new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)));
            }
            C0108e c0108e5 = buyEarlyRefundResultActivity.f34449c;
            if (c0108e5 != null && (textView = ((ModelPreviewItem) c0108e5.f691i).f31568d) != null) {
                textView.setText(data.payTypeName);
            }
            C0108e c0108e6 = buyEarlyRefundResultActivity.f34449c;
            if (c0108e6 != null) {
                ((ModelPaymentResultProgress) c0108e6.f694p).setAmount(data.amount);
            }
            buyEarlyRefundResultActivity.l();
        }
    }
}
