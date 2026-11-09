package p310ub;

import C0.G;
import Pa.r0;
import Ya.g;
import Z4.e;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseData;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseLimitData;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseLimitResp;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseListData;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseListResp;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalAmountActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcTotalAmountActivity f42942g;

    public /* synthetic */ w1(OcTotalAmountActivity ocTotalAmountActivity, int i7) {
        this.f42941f = i7;
        this.f42942g = ocTotalAmountActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42941f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42942g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42942g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42942g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42941f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42942g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42942g.showLoadingDialog(false);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Long changeCreditLimit;
        Long changeCreditLimit2;
        Long initCreditLimit;
        Long totalCreditLimit;
        String strB;
        switch (this.f42941f) {
            case 0:
                OcIncreaseLimitResp ocIncreaseLimitResp = (OcIncreaseLimitResp) obj;
                OcTotalAmountActivity ocTotalAmountActivity = this.f42942g;
                ocTotalAmountActivity.showLoadingDialog(false);
                if (ocIncreaseLimitResp == null || !ocIncreaseLimitResp.isSuccess()) {
                    ToastUtils.showShort(ocIncreaseLimitResp != null ? ocIncreaseLimitResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                ocTotalAmountActivity.f29890w = ocIncreaseLimitResp.getData();
                Object value = ocTotalAmountActivity.t.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                TextView textView = (TextView) value;
                OcIncreaseLimitData ocIncreaseLimitData = ocTotalAmountActivity.f29890w;
                textView.setText(r0.B((ocIncreaseLimitData == null || (totalCreditLimit = ocIncreaseLimitData.getTotalCreditLimit()) == null) ? 0L : totalCreditLimit.longValue(), true));
                Object value2 = ocTotalAmountActivity.f29888p.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView2 = (TextView) value2;
                OcIncreaseLimitData ocIncreaseLimitData2 = ocTotalAmountActivity.f29890w;
                textView2.setText(r0.B((ocIncreaseLimitData2 == null || (initCreditLimit = ocIncreaseLimitData2.getInitCreditLimit()) == null) ? 0L : initCreditLimit.longValue(), true));
                Object value3 = ocTotalAmountActivity.f29887o.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView3 = (TextView) value3;
                OcIncreaseLimitData ocIncreaseLimitData3 = ocTotalAmountActivity.f29890w;
                textView3.setText(r0.B((ocIncreaseLimitData3 == null || (changeCreditLimit2 = ocIncreaseLimitData3.getChangeCreditLimit()) == null) ? 0L : changeCreditLimit2.longValue(), true));
                Object value4 = ocTotalAmountActivity.f29886j.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView4 = (TextView) value4;
                OcIncreaseLimitData ocIncreaseLimitData4 = ocTotalAmountActivity.f29890w;
                textView4.setText(((ocIncreaseLimitData4 == null || (changeCreditLimit = ocIncreaseLimitData4.getChangeCreditLimit()) == null) ? 0L : changeCreditLimit.longValue()) >= 0 ? ocTotalAmountActivity.getString(g.cs_total_limit_increased) : ocTotalAmountActivity.getString(g.cs_total_limit_decreased));
                return;
            case 1:
                OcIncreaseListResp ocIncreaseListResp = (OcIncreaseListResp) obj;
                if (ocIncreaseListResp == null || !ocIncreaseListResp.isSuccess()) {
                    ToastUtils.showShort(ocIncreaseListResp != null ? ocIncreaseListResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                List<OcIncreaseListData> data = ocIncreaseListResp.getData();
                OcTotalAmountActivity ocTotalAmountActivity2 = this.f42942g;
                if (data != null) {
                    ocTotalAmountActivity2.f29880A.clear();
                    List<OcIncreaseListData> data2 = ocIncreaseListResp.getData();
                    if (data2 != null && !data2.isEmpty()) {
                        ArrayList arrayList = ocTotalAmountActivity2.f29880A;
                        List<OcIncreaseListData> data3 = ocIncreaseListResp.getData();
                        Intrinsics.e(data3);
                        arrayList.addAll(data3);
                    }
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                Object value5 = ocTotalAmountActivity2.f29889v.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((NestedScrollView) value5).requestLayout();
                Object value6 = ocTotalAmountActivity2.f29889v.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((NestedScrollView) value6).invalidate();
                t tVar = ocTotalAmountActivity2.f29885i;
                Object value7 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((RecyclerView) value7).requestLayout();
                Object value8 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((RecyclerView) value8).invalidate();
                t tVar2 = ocTotalAmountActivity2.f29883f;
                Object value9 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((TextView) value9).requestLayout();
                Object value10 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((TextView) value10).invalidate();
                return;
            default:
                OcIncreaseResp ocIncreaseResp = (OcIncreaseResp) obj;
                if (ocIncreaseResp == null || !ocIncreaseResp.isSuccess()) {
                    ToastUtils.showShort(ocIncreaseResp != null ? ocIncreaseResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                List<OcIncreaseData> data4 = ocIncreaseResp.getData();
                if (data4 == null || data4.isEmpty()) {
                    return;
                }
                List<OcIncreaseData> data5 = ocIncreaseResp.getData();
                Intrinsics.e(data5);
                OcIncreaseData ocIncreaseData = data5.get(0);
                OcTotalAmountActivity ocTotalAmountActivity3 = this.f42942g;
                Object value11 = ocTotalAmountActivity3.f29883f.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((TextView) value11).setText(ocIncreaseData.getDesc());
                Object value12 = ocTotalAmountActivity3.f29882e.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                TextView textView5 = (TextView) value12;
                Long createTime = ocIncreaseData.getCreateTime();
                textView5.setText(r0.X1(Long.valueOf(createTime != null ? createTime.longValue() : 0L), "HH:mm, MMM dd, yyyy"));
                Object value13 = ocTotalAmountActivity3.f29881d.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                TextView textView6 = (TextView) value13;
                Long changeQuota = ocIncreaseData.getChangeQuota();
                if ((changeQuota != null ? changeQuota.longValue() : 0L) > 0) {
                    Long changeQuota2 = ocIncreaseData.getChangeQuota();
                    strB = G.o("+", r0.B(changeQuota2 != null ? changeQuota2.longValue() : 0L, true));
                } else {
                    Long changeQuota3 = ocIncreaseData.getChangeQuota();
                    strB = r0.B(changeQuota3 != null ? changeQuota3.longValue() : 0L, true);
                }
                textView6.setText(strB);
                Object value14 = ocTotalAmountActivity3.f29884g.getValue();
                Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                ((LinearLayout) value14).setVisibility(0);
                return;
        }
    }
}
