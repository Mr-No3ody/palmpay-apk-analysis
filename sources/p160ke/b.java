package p160ke;

import Ac.h;
import G1.d;
import Pa.r0;
import Z4.e;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import com.bumptech.glide.load.resource.bitmap.i;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.main.export.bean.rsp.BulkDisbursementOrderDetailRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantDisburseOrderDetailRsp;
import com.transsnet.palmpay.ui.activity.detail.DisbursementOrderDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DisbursementOrderDetailActivity f38750g;

    public /* synthetic */ b(DisbursementOrderDetailActivity disbursementOrderDetailActivity, int i7) {
        this.f38749f = i7;
        this.f38750g = disbursementOrderDetailActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f38749f) {
            case 0:
                this.f38750g.addSubscription(disposable);
                break;
            default:
                this.f38750g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f38749f) {
            case 0:
                this.f38750g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
            default:
                this.f38750g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        DisbursementOrderDetailActivity disbursementOrderDetailActivity = this.f38750g;
        switch (this.f38749f) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                disbursementOrderDetailActivity.showLoadingDialog(false);
                if (!commonBeanResult.isSuccess()) {
                    DisbursementOrderDetailActivity.m(disbursementOrderDetailActivity, commonBeanResult.getRespMsg());
                    break;
                } else {
                    int i7 = DisbursementOrderDetailActivity.f34688p;
                    T t = commonBeanResult.data;
                    if (t != 0) {
                        MerchantDisburseOrderDetailRsp merchantDisburseOrderDetailRsp = (MerchantDisburseOrderDetailRsp) t;
                        com.bumptech.glide.b.f(disbursementOrderDetailActivity.f34691c.f31471i).load(new MerchantLogo(merchantDisburseOrderDetailRsp.merchantNo)).a(((d) ((d) new d().I(new i(), true)).j(r.cv_default_merchat)).x(r.cv_default_merchat)).S(disbursementOrderDetailActivity.f34691c.f31471i);
                        disbursementOrderDetailActivity.f34691c.f31466c.setText(disbursementOrderDetailActivity.getString(h.main_from_merchant, merchantDisburseOrderDetailRsp.merchantName));
                        disbursementOrderDetailActivity.f34691c.f31467d.setText("+" + r0.A(merchantDisburseOrderDetailRsp.payeeAmount.longValue()));
                        disbursementOrderDetailActivity.f34691c.f31468e.setText(k.core_completed);
                        disbursementOrderDetailActivity.f34692d.f31443c.setText(k.core_amount);
                        disbursementOrderDetailActivity.f34692d.f31443c.setAllCaps(true);
                        disbursementOrderDetailActivity.f34692d.f31444d.setText(r0.B(merchantDisburseOrderDetailRsp.payeeAmount.longValue(), true));
                        disbursementOrderDetailActivity.f34692d.f31443c.setTextColor(disbursementOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                        disbursementOrderDetailActivity.f34692d.f31444d.setTextColor(disbursementOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                        disbursementOrderDetailActivity.f34693e.f31587c.setText(k.core_payment_type);
                        disbursementOrderDetailActivity.f34693e.f31588d.setText(h.main_disbursement);
                        disbursementOrderDetailActivity.f34694f.setMessage(merchantDisburseOrderDetailRsp.orderNo);
                        disbursementOrderDetailActivity.f34695g.setText(disbursementOrderDetailActivity.getString(k.core_transaction_date, r0.Q(merchantDisburseOrderDetailRsp.createTime)));
                        disbursementOrderDetailActivity.f34696i.setVisibility(8);
                        if (!TextUtils.isEmpty(merchantDisburseOrderDetailRsp.remark)) {
                            disbursementOrderDetailActivity.f34698o.setVisibility(0);
                            TextView textView = disbursementOrderDetailActivity.f34697j;
                            int i10 = k.core_remark;
                            String str = merchantDisburseOrderDetailRsp.remark;
                            textView.setText(BaseApplication.getContext().getResources().getString(i10) + ": " + str);
                        }
                        break;
                    }
                }
                break;
            default:
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
                disbursementOrderDetailActivity.showLoadingDialog(false);
                if (!commonBeanResult2.isSuccess()) {
                    DisbursementOrderDetailActivity.m(disbursementOrderDetailActivity, commonBeanResult2.getRespMsg());
                    break;
                } else {
                    int i11 = DisbursementOrderDetailActivity.f34688p;
                    T t3 = commonBeanResult2.data;
                    if (t3 != 0) {
                        BulkDisbursementOrderDetailRsp bulkDisbursementOrderDetailRsp = (BulkDisbursementOrderDetailRsp) t3;
                        if (TransType.TRANS_TYPE_BULK_MERCHANT_DISBURSEMENT.equalsIgnoreCase(disbursementOrderDetailActivity.f34690b)) {
                            if (TextUtils.isEmpty(((BulkDisbursementOrderDetailRsp) commonBeanResult2.data).merchantUrl)) {
                                disbursementOrderDetailActivity.f34691c.f31471i.setImageResource(r.cv_default_merchat);
                            } else {
                                com.bumptech.glide.b.f(disbursementOrderDetailActivity.f34691c.f31471i).load(Uri.parse(((BulkDisbursementOrderDetailRsp) commonBeanResult2.data).merchantUrl)).a(((d) ((d) new d().I(new i(), true)).j(r.cv_default_merchat)).x(r.cv_default_merchat)).S(disbursementOrderDetailActivity.f34691c.f31471i);
                            }
                            disbursementOrderDetailActivity.f34691c.f31466c.setText(disbursementOrderDetailActivity.getString(h.main_from_merchant, bulkDisbursementOrderDetailRsp.merchantName));
                        } else {
                            disbursementOrderDetailActivity.f34691c.f31471i.setImageResource(r.cv_bill_default_icon);
                            disbursementOrderDetailActivity.f34691c.f31466c.setText(h.main_from_palmpay);
                        }
                        disbursementOrderDetailActivity.f34691c.f31467d.setText("+" + r0.A(bulkDisbursementOrderDetailRsp.amount));
                        disbursementOrderDetailActivity.f34691c.f31468e.setText(k.core_completed);
                        disbursementOrderDetailActivity.f34692d.f31443c.setText(k.core_amount);
                        disbursementOrderDetailActivity.f34692d.f31443c.setAllCaps(true);
                        disbursementOrderDetailActivity.f34692d.f31444d.setText(r0.B(bulkDisbursementOrderDetailRsp.amount, true));
                        disbursementOrderDetailActivity.f34692d.f31443c.setTextColor(disbursementOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                        disbursementOrderDetailActivity.f34692d.f31444d.setTextColor(disbursementOrderDetailActivity.getResources().getColor(L6.b.ppColorTextPrimary));
                        disbursementOrderDetailActivity.f34693e.f31587c.setText(k.core_payment_type);
                        disbursementOrderDetailActivity.f34693e.f31588d.setText(h.main_disbursement);
                        disbursementOrderDetailActivity.f34694f.setMessage(bulkDisbursementOrderDetailRsp.orderNo);
                        disbursementOrderDetailActivity.f34695g.setText(disbursementOrderDetailActivity.getString(k.core_transaction_date, r0.Q(bulkDisbursementOrderDetailRsp.finishTime)));
                        disbursementOrderDetailActivity.f34696i.setText(disbursementOrderDetailActivity.getString(k.core_expiration_date) + ": " + r0.Q(bulkDisbursementOrderDetailRsp.finishTime));
                        if (!TextUtils.isEmpty(bulkDisbursementOrderDetailRsp.remark)) {
                            disbursementOrderDetailActivity.f34698o.setVisibility(0);
                            disbursementOrderDetailActivity.f34697j.setText(bulkDisbursementOrderDetailRsp.remark);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
