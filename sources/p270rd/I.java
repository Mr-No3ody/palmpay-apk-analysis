package p270rd;

import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeBean;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeResp;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p173ld.v;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransReceiptActivity f41688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransReceiptActivity f41689c;

    public /* synthetic */ I(TransReceiptActivity transReceiptActivity, TransReceiptActivity transReceiptActivity2, int i7) {
        this.f41687a = i7;
        this.f41688b = transReceiptActivity;
        this.f41689c = transReceiptActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList<TransReceiptTypeBean> detailConfigs;
        TransReceiptActivity transReceiptActivity = this.f41689c;
        TransReceiptActivity transReceiptActivity2 = this.f41688b;
        switch (this.f41687a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    transReceiptActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transReceiptActivity2.showLoadingDialog(false, true);
                    TradeRecordDetailResp tradeRecordDetailResp = (TradeRecordDetailResp) ((p) it).f27360a;
                    if (tradeRecordDetailResp.isSuccess()) {
                        TradeRecordDetailResp.RecordDetail data = tradeRecordDetailResp.getData();
                        if (data != null) {
                            transReceiptActivity.t = data;
                            transReceiptActivity.q();
                        }
                    } else {
                        h.x(transReceiptActivity, tradeRecordDetailResp.getRespMsg());
                    }
                } else if (it instanceof m) {
                    transReceiptActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transReceiptActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    transReceiptActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transReceiptActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        TransReceiptTypeResp transReceiptTypeResp = (TransReceiptTypeResp) commonBeanResult.data;
                        if (transReceiptTypeResp != null && (detailConfigs = transReceiptTypeResp.getDetailConfigs()) != null && (!detailConfigs.isEmpty())) {
                            TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                            h.C(transReceiptActivity.p());
                            v vVarM = transReceiptActivity.m();
                            ArrayList<TransReceiptTypeBean> detailConfigs2 = transReceiptTypeResp.getDetailConfigs();
                            Intrinsics.e(detailConfigs2);
                            vVarM.addData((Collection<Object>) detailConfigs2);
                        }
                    } else {
                        h.x(transReceiptActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    transReceiptActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transReceiptActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
