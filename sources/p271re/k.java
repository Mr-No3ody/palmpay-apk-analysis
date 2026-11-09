package p271re;

import Pa.r0;
import Z4.e;
import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.rsp.QueryAcqOrderDetailRsp;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.ui.activity.qr.QrcodePayMoneyOrderDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ QrcodePayMoneyOrderDetailActivity f41800f;

    public k(QrcodePayMoneyOrderDetailActivity qrcodePayMoneyOrderDetailActivity) {
        this.f41800f = qrcodePayMoneyOrderDetailActivity;
    }

    @Override // Z4.e, io.reactivex.Observer
    public final void onError(Throwable th) {
        super.onError(th);
        this.f41800f.showLoadingDialog(false);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41800f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f41800f.showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        String string;
        QueryAcqOrderDetailRsp queryAcqOrderDetailRsp = (QueryAcqOrderDetailRsp) obj;
        QrcodePayMoneyOrderDetailActivity qrcodePayMoneyOrderDetailActivity = this.f41800f;
        qrcodePayMoneyOrderDetailActivity.showLoadingDialog(false);
        if (!queryAcqOrderDetailRsp.isSuccess()) {
            ToastUtils.showShort(queryAcqOrderDetailRsp.getRespMsg());
            return;
        }
        qrcodePayMoneyOrderDetailActivity.f34917p = queryAcqOrderDetailRsp.data;
        qrcodePayMoneyOrderDetailActivity.f34908b.f31466c.setText("To " + qrcodePayMoneyOrderDetailActivity.f34917p.shopName);
        r0.m1(qrcodePayMoneyOrderDetailActivity.f34917p.payerHeadPortrait, qrcodePayMoneyOrderDetailActivity.f34908b.f31471i);
        ModelTitleContentImg modelTitleContentImg = qrcodePayMoneyOrderDetailActivity.f34909c;
        QueryAcqOrderDetailRsp.DataBean dataBean = qrcodePayMoneyOrderDetailActivity.f34917p;
        r0.S1(modelTitleContentImg, dataBean.payerAccountType, dataBean.payerBankName, dataBean.payerBankUrl, dataBean.payerCardNo);
        qrcodePayMoneyOrderDetailActivity.f34910d.f31588d.setText(p025ba.k.core_qrcode_payment);
        qrcodePayMoneyOrderDetailActivity.f34911e.setText(qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.Q(qrcodePayMoneyOrderDetailActivity.f34917p.createTime)));
        qrcodePayMoneyOrderDetailActivity.f34913g.setText(qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_post_date, r0.Q(qrcodePayMoneyOrderDetailActivity.f34917p.updateTime)));
        qrcodePayMoneyOrderDetailActivity.f34912f.setText(qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_reference_no, qrcodePayMoneyOrderDetailActivity.f34917p.orderNo));
        if (!TextUtils.isEmpty(qrcodePayMoneyOrderDetailActivity.f34917p.remark)) {
            qrcodePayMoneyOrderDetailActivity.f34914i.setText(qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_what_its_for, qrcodePayMoneyOrderDetailActivity.f34917p.remark));
            qrcodePayMoneyOrderDetailActivity.f34915j.setVisibility(0);
        }
        qrcodePayMoneyOrderDetailActivity.f34916o.f31430c.f31455d.setText(r0.B(qrcodePayMoneyOrderDetailActivity.f34917p.orderAmount, false));
        qrcodePayMoneyOrderDetailActivity.f34916o.f31433f.f31455d.setText("P " + qrcodePayMoneyOrderDetailActivity.f34917p.loyaltyPoint);
        qrcodePayMoneyOrderDetailActivity.f34916o.f31434g.f31455d.setText("P " + qrcodePayMoneyOrderDetailActivity.f34917p.returnPoint);
        TextView textView = qrcodePayMoneyOrderDetailActivity.f34916o.f31432e.f31455d;
        QueryAcqOrderDetailRsp.DataBean dataBean2 = qrcodePayMoneyOrderDetailActivity.f34917p;
        textView.setText(r0.B(dataBean2.payFee + dataBean2.taxFee, false));
        qrcodePayMoneyOrderDetailActivity.f34916o.f31432e.setTips(r0.W(qrcodePayMoneyOrderDetailActivity, qrcodePayMoneyOrderDetailActivity.f34917p.taxFee));
        qrcodePayMoneyOrderDetailActivity.f34916o.f31440w.f31455d.setText(r0.B(qrcodePayMoneyOrderDetailActivity.f34917p.payAmount, false));
        if (qrcodePayMoneyOrderDetailActivity.f34917p.couponAmount > 0) {
            qrcodePayMoneyOrderDetailActivity.f34916o.f31437o.setVisibility(0);
            qrcodePayMoneyOrderDetailActivity.f34916o.f31437o.setContent("- " + r0.B(qrcodePayMoneyOrderDetailActivity.f34917p.couponAmount, true));
        } else {
            qrcodePayMoneyOrderDetailActivity.f34916o.f31437o.setVisibility(8);
        }
        long j6 = qrcodePayMoneyOrderDetailActivity.f34917p.discountAmount;
        if (j6 > 0) {
            qrcodePayMoneyOrderDetailActivity.f34916o.f31438p.setContent(r0.A(j6));
            qrcodePayMoneyOrderDetailActivity.f34916o.f31438p.setVisibility(0);
        } else {
            qrcodePayMoneyOrderDetailActivity.f34916o.f31438p.setVisibility(8);
        }
        qrcodePayMoneyOrderDetailActivity.f34908b.f31467d.setText("-" + r0.A(qrcodePayMoneyOrderDetailActivity.f34917p.payAmount));
        int i7 = qrcodePayMoneyOrderDetailActivity.f34917p.orderStatus;
        qrcodePayMoneyOrderDetailActivity.f34908b.t.setVisibility(8);
        if (i7 == 0 || i7 == 1) {
            qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_pending);
        } else if (i7 == 2) {
            qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_completed);
            qrcodePayMoneyOrderDetailActivity.f34908b.t.setVisibility(0);
        } else if (i7 == 3) {
            qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_failed);
            qrcodePayMoneyOrderDetailActivity.f34908b.t.setVisibility(0);
        } else if (i7 == 4) {
            qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_closed);
        }
        int i10 = qrcodePayMoneyOrderDetailActivity.f34917p.orderStatus;
        TextView textView2 = qrcodePayMoneyOrderDetailActivity.f34908b.f31468e;
        if (i10 == 0 || i10 == 1) {
            textView2.setTextColor(-1);
            textView2.setText(p025ba.k.core_pending);
            qrcodePayMoneyOrderDetailActivity.findViewById(p025ba.e.lhtidp_root).setVisibility(8);
            string = qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_pending);
        } else if (i10 == 2) {
            textView2.setTextColor(-1);
            textView2.setText(p025ba.k.core_completed);
            qrcodePayMoneyOrderDetailActivity.f34913g.setVisibility(0);
            string = qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_completed);
        } else if (i10 == 3) {
            textView2.setTextColor(-1);
            textView2.setText(p025ba.k.core_failed);
            qrcodePayMoneyOrderDetailActivity.f34916o.d();
            qrcodePayMoneyOrderDetailActivity.f34909c.d();
            qrcodePayMoneyOrderDetailActivity.f34910d.d();
            qrcodePayMoneyOrderDetailActivity.f34913g.setVisibility(0);
            qrcodePayMoneyOrderDetailActivity.f34918v.setVisibility(0);
            string = qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_failed);
        } else if (i10 != 4) {
            string = "";
        } else {
            textView2.setTextColor(-1);
            textView2.setText(p025ba.k.core_closed);
            qrcodePayMoneyOrderDetailActivity.f34916o.d();
            qrcodePayMoneyOrderDetailActivity.f34909c.d();
            qrcodePayMoneyOrderDetailActivity.f34910d.d();
            string = qrcodePayMoneyOrderDetailActivity.getString(p025ba.k.core_closed);
        }
        qrcodePayMoneyOrderDetailActivity.f34903A = string;
        qrcodePayMoneyOrderDetailActivity.t.setVisibility(8);
        qrcodePayMoneyOrderDetailActivity.f34904B.setEmailData(qrcodePayMoneyOrderDetailActivity.m());
    }
}
