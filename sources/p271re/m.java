package p271re;

import Pa.i0;
import Pa.r0;
import Z4.e;
import com.transsnet.palmpay.core.bean.rsp.QueryAcqOrderDetailRsp;
import com.transsnet.palmpay.ui.activity.qr.QrcodePayMoneySuccessActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ QrcodePayMoneySuccessActivity f41802f;

    public m(QrcodePayMoneySuccessActivity qrcodePayMoneySuccessActivity) {
        this.f41802f = qrcodePayMoneySuccessActivity;
    }

    @Override // Z4.e, io.reactivex.Observer
    public final void onError(Throwable th) {
        super.onError(th);
        this.f41802f.showLoadingDialog(false);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41802f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f41802f.showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryAcqOrderDetailRsp queryAcqOrderDetailRsp = (QueryAcqOrderDetailRsp) obj;
        QrcodePayMoneySuccessActivity qrcodePayMoneySuccessActivity = this.f41802f;
        qrcodePayMoneySuccessActivity.showLoadingDialog(false);
        if (!queryAcqOrderDetailRsp.isSuccess()) {
            ToastUtils.showShort(queryAcqOrderDetailRsp.getRespMsg());
            return;
        }
        QueryAcqOrderDetailRsp.DataBean dataBean = queryAcqOrderDetailRsp.data;
        qrcodePayMoneySuccessActivity.f34922B = dataBean;
        if (dataBean == null) {
            return;
        }
        qrcodePayMoneySuccessActivity.f34923a.e();
        i0.k0();
        qrcodePayMoneySuccessActivity.f34924b.setText(k.core_success_upper);
        qrcodePayMoneySuccessActivity.f34925c.setText(r0.A(qrcodePayMoneySuccessActivity.f34922B.payAmount));
        qrcodePayMoneySuccessActivity.f34926d.setVisibility(0);
        qrcodePayMoneySuccessActivity.f34928f.setText(r0.A(qrcodePayMoneySuccessActivity.f34922B.orderAmount));
        qrcodePayMoneySuccessActivity.f34934v.setText("P " + qrcodePayMoneySuccessActivity.f34922B.returnPoint);
        qrcodePayMoneySuccessActivity.f34931j.setText(qrcodePayMoneySuccessActivity.f34922B.shopName);
        qrcodePayMoneySuccessActivity.f34933p.setText(r0.A(qrcodePayMoneySuccessActivity.f34922B.payAmount));
        qrcodePayMoneySuccessActivity.f34932o.setText(qrcodePayMoneySuccessActivity.f34921A);
        qrcodePayMoneySuccessActivity.f34929g.setText(r0.A(qrcodePayMoneySuccessActivity.f34922B.taxFee));
        qrcodePayMoneySuccessActivity.f34927e.setText(r0.A(qrcodePayMoneySuccessActivity.f34922B.payFee));
        qrcodePayMoneySuccessActivity.t.setText(r0.A(qrcodePayMoneySuccessActivity.f34922B.couponAmount));
    }
}
