package p328ve;

import Ac.e;
import Ac.f;
import Ea.a;
import G1.d;
import Kb.c;
import Pa.E;
import Pa.i0;
import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.i;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.custom_view.r;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        AccountFlowBean.DataBean.ListBean listBean = (AccountFlowBean.DataBean.ListBean) this.f4985b.get(i7);
        r rVar = (r) viewHolder;
        rVar.getClass();
        long amount = listBean.getAmount();
        String payId = listBean.getPayId();
        String businessDesc = listBean.getBusinessDesc();
        String merchantNo = listBean.getMerchantNo();
        int iB = E.b(listBean.getAccountType());
        String transType = listBean.getTransType();
        String strSubstring = payId.length() > 4 ? payId.substring(2, 4) : "";
        boolean zEquals = "Refund".equals(businessDesc);
        ImageView imageView = rVar.f43201d;
        if (zEquals || payId.startsWith("R_") || TransType.TRANS_SCENE_REFUND.equals(strSubstring)) {
            r0.d1(imageView, r.cv_bill_refund);
        } else {
            if (TextUtils.isEmpty(transType)) {
                transType = i0.F(payId);
            }
            int iB2 = a.b(amount, transType, -1, iB);
            if ((TransType.TRANS_TYPE_MERCHANT_PAYMENT.equals(transType) || TransType.TRANS_TYPE_MERCHANT_DISBURSEMENT.equals(transType) || TransType.TRANS_TYPE_AUTO_DEDUCT.equals(transType) || TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT.equals(transType) || TransType.TRANS_TYPE_BULK_MERCHANT_DISBURSEMENT.equals(transType) || TransType.TRANS_TYPE_BULK_DISBURSEMENT.equals(transType) || TransType.TRANS_TYPE_AIRTIME_DISBURSEMENT.equals(transType)) && !TextUtils.isEmpty(merchantNo)) {
                b.f(imageView).load(new MerchantLogo(merchantNo)).a(((d) ((d) new d().I(new i(), true)).j(iB2)).x(iB2)).S(imageView);
            } else {
                r0.g1(imageView, a.c(transType, 0, 0, 0L), (d) d.O(iB2).j(iB2));
            }
        }
        TextView textView = rVar.f43202e;
        r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
        if (amount > 0) {
            textView.setText("+" + r0.A(amount));
        } else {
            textView.setText(r0.A(amount));
        }
        rVar.f43203f.setText(r0.B(listBean.getBalanceAmount(), true));
        boolean zIsEmpty = TextUtils.isEmpty(listBean.getBusinessDesc());
        TextView textView2 = rVar.f43205i;
        if (zIsEmpty) {
            textView2.setText(TransTypeUtils.translateTransType(listBean.getTransType()));
        } else {
            textView2.setText(listBean.getBusinessDesc());
        }
        rVar.f43206j.setText(r0.O(listBean.getCreateTime()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.main_layout_account_flow_item, viewGroup, false);
        r rVar = new r(this, viewInflate);
        rVar.f43201d = (ImageView) viewInflate.findViewById(e.imageViewAvatar);
        rVar.f43202e = (TextView) viewInflate.findViewById(e.textViewAmount);
        rVar.f43203f = (TextView) viewInflate.findViewById(e.textViewBanlanceAmount);
        rVar.f43204g = (TextView) viewInflate.findViewById(e.textViewState);
        rVar.f43205i = (TextView) viewInflate.findViewById(e.textViewLine1);
        rVar.f43206j = (TextView) viewInflate.findViewById(e.textViewLine2);
        rVar.a(viewInflate);
        return rVar;
    }
}
