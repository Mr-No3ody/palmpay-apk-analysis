package p310ub;

import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRePayPreviewActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcRepaymentCouponTipsDialog;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcRePayPreviewActivity f42759b;

    public /* synthetic */ G0(OcRePayPreviewActivity ocRePayPreviewActivity, int i7) {
        this.f42758a = i7;
        this.f42759b = ocRePayPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OcRePayPreviewActivity ocRePayPreviewActivity = this.f42759b;
        switch (this.f42758a) {
            case 0:
                int i7 = OcRePayPreviewActivity.f29661w0;
                if (ocRePayPreviewActivity.f27789d == null) {
                    ToastUtils.showShort("please select a payment method", new Object[0]);
                } else if (!TextUtils.isEmpty(ocRePayPreviewActivity.f27793i)) {
                    ocRePayPreviewActivity.E();
                } else {
                    ToastUtils.showLong("orderNo id is null", new Object[0]);
                    ocRePayPreviewActivity.finish();
                }
                break;
            case 1:
                int i10 = OcRePayPreviewActivity.f29661w0;
                ocRePayPreviewActivity.L();
                break;
            case 2:
                ocRePayPreviewActivity.F(ocRePayPreviewActivity.f29671v0);
                break;
            default:
                int i11 = OcRePayPreviewActivity.f29661w0;
                new OcRepaymentCouponTipsDialog(ocRePayPreviewActivity).show();
                break;
        }
    }
}
