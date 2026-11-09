package p310ub;

import Z4.e;
import com.transsnet.palmpay.credit.bean.rsp.OcBillDetailResp;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109x extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcBillDetailActivity f42944g;

    public /* synthetic */ C2109x(OcBillDetailActivity ocBillDetailActivity, int i7) {
        this.f42943f = i7;
        this.f42944g = ocBillDetailActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42943f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42944g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42944g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42943f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f42943f) {
            case 0:
                OcBillDetailResp ocBillDetailResp = (OcBillDetailResp) obj;
                if (ocBillDetailResp != null && ocBillDetailResp.isSuccess()) {
                    OcCurBillData data = ocBillDetailResp.getData();
                    OcBillDetailActivity ocBillDetailActivity = this.f42944g;
                    ocBillDetailActivity.f29343A = data;
                    ocBillDetailActivity.o();
                } else {
                    ToastUtils.showShort(ocBillDetailResp != null ? ocBillDetailResp.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                OcBillDetailResp ocBillDetailResp2 = (OcBillDetailResp) obj;
                if (ocBillDetailResp2 != null && ocBillDetailResp2.isSuccess()) {
                    OcCurBillData data2 = ocBillDetailResp2.getData();
                    OcBillDetailActivity ocBillDetailActivity2 = this.f42944g;
                    ocBillDetailActivity2.f29343A = data2;
                    ocBillDetailActivity2.o();
                } else {
                    ToastUtils.showShort(ocBillDetailResp2 != null ? ocBillDetailResp2.getRespMsg() : null, new Object[0]);
                }
                break;
        }
    }
}
