package p310ub;

import C0.G;
import Pa.r0;
import Ya.g;
import Z4.e;
import android.os.Handler;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p294tb.C2055q;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OcRepayResultActivity f42904f;

    public p1(OcRepayResultActivity ocRepayResultActivity) {
        this.f42904f = ocRepayResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42904f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OcRepayResultActivity ocRepayResultActivity = this.f42904f;
        ocRepayResultActivity.f29852s0.postDelayed(ocRepayResultActivity.o(), ocRepayResultActivity.f29851r0);
        ocRepayResultActivity.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        TopUpOrderDetailRsp.DataBean data;
        TopUpOrderDetailRsp topUpOrderDetailRsp = (TopUpOrderDetailRsp) obj;
        OcRepayResultActivity ocRepayResultActivity = this.f42904f;
        if (topUpOrderDetailRsp == null || !topUpOrderDetailRsp.isSuccess() || (data = topUpOrderDetailRsp.data) == null) {
            ocRepayResultActivity.f29852s0.postDelayed(ocRepayResultActivity.o(), ocRepayResultActivity.f29851r0);
            ToastUtils.showShort(topUpOrderDetailRsp != null ? topUpOrderDetailRsp.getRespMsg() : null, new Object[0]);
            return;
        }
        int i7 = data.status;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        Handler handler = ocRepayResultActivity.f29852s0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3 && i7 != 6) {
                    if (i7 != 7) {
                        ocRepayResultActivity.f29838Y = true;
                        handler.postDelayed(ocRepayResultActivity.o(), ocRepayResultActivity.f29851r0);
                        ocRepayResultActivity.n().e(ocRepayResultActivity.f29849p0, ocRepayResultActivity.f29846k0);
                        if (ocRepayResultActivity.f29839Z) {
                            return;
                        }
                        ocRepayResultActivity.f29839Z = true;
                        ocRepayResultActivity.p();
                        return;
                    }
                }
            }
            ocRepayResultActivity.f29838Y = false;
            handler.removeCallbacks(ocRepayResultActivity.o());
            ocRepayResultActivity.n().d(ocRepayResultActivity.getString(g.cs_top_up_result_failed));
            if (ocRepayResultActivity.f29839Z) {
                return;
            }
            ocRepayResultActivity.f29839Z = true;
            ocRepayResultActivity.p();
            return;
        }
        ocRepayResultActivity.f29838Y = false;
        handler.removeCallbacks(ocRepayResultActivity.o());
        Object value = ocRepayResultActivity.f29832C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelPreviewItem) value).setContent(r0.r0(data.payType, data.bankName, data.bankCard));
        ocRepayResultActivity.n().g(ocRepayResultActivity.getString(g.cs_top_up_result_success));
        G.h(c.f40268a).getBillInsRepaymentPlan(ocRepayResultActivity.f29837X).k(f.f42629b).i(b.a()).subscribe(new C2055q(ocRepayResultActivity, 26));
        Object value2 = ocRepayResultActivity.f29847o.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((SingleAdView) value2).setSlotId(ocRepayResultActivity.getString(g.oc_repay_result_top_slot_id));
        Object value3 = ocRepayResultActivity.f29845j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((SingleAdView) value3).setSlotId(ocRepayResultActivity.getString(g.oc_repay_result_middle_first_slot_id));
        Object value4 = ocRepayResultActivity.f29844i.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((SingleAdView) value4).setSlotId(ocRepayResultActivity.getString(g.oc_repay_result_middle_second_slot_id));
        Object value5 = ocRepayResultActivity.f29843g.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((SingleAdView) value5).setSlotId(ocRepayResultActivity.getString(g.oc_repay_result_middle_third_slot_id));
        Object value6 = ocRepayResultActivity.f29842f.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((SingleAdView) value6).setSlotId(ocRepayResultActivity.getString(g.oc_repay_result_bottom_slot_id));
    }
}
