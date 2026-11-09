package E9;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.cash_in.bean.OrderList;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.ModelBillRecordItem;
import com.transsnet.palmpay.custom_view.model.ModelRecordListTitle;
import com.transsnet.palmpay.custom_view.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Kb.c implements StickyRecyclerHeadersAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2260e;

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        if (i7 < this.f4985b.size()) {
            return r0.h0(((OrderList.OrderData) this.f4985b.get(i7)).createTime);
        }
        return 0L;
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (i7 < this.f4985b.size()) {
            d dVar = (d) viewHolder;
            dVar.f2259d.f31576c.setText(r0.i0(r0.j0(((OrderList.OrderData) this.f4985b.get(i7)).createTime)));
            dVar.f2259d.f31577d.setText("");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (i7 < this.f4985b.size()) {
            OrderList.OrderData orderData = (OrderList.OrderData) this.f4985b.get(i7);
            c cVar = (c) viewHolder;
            cVar.f2258d.f31476d.setText(r0.R(orderData.createTime));
            boolean zEquals = "01".equals(orderData.transType);
            Context context = this.f4984a;
            ModelBillRecordItem modelBillRecordItem = cVar.f2258d;
            if (zEquals) {
                modelBillRecordItem.f31475c.setText(p366y9.d.ci_record_list_recharge);
                modelBillRecordItem.f31480i.setImageResource(r.cv_bill_deposit);
                G.x("+", r0.A(orderData.businessAmount), modelBillRecordItem.f31477e);
            } else if ("02".equals(orderData.transType)) {
                modelBillRecordItem.f31475c.setText(p366y9.d.ci_record_list_withdraw);
                com.bumptech.glide.b.e(context).load(orderData.bankUrl).a(((G1.d) new G1.d().x(r.cv_palmpay_logo_7)).d()).S(modelBillRecordItem.f31480i);
                G.x("-", r0.A(orderData.businessAmount), modelBillRecordItem.f31477e);
            } else if (TransType.TRANS_TYPE_AUTO_WITHDRAW.equals(orderData.transType)) {
                modelBillRecordItem.f31475c.setText(p366y9.d.ci_record_list_auto_withdraw);
                com.bumptech.glide.b.e(context).load(orderData.bankUrl).a(((G1.d) new G1.d().x(r.cv_palmpay_logo_7)).d()).S(modelBillRecordItem.f31480i);
                G.x("-", r0.A(orderData.businessAmount), modelBillRecordItem.f31477e);
            }
            int i10 = orderData.orderStatus;
            TextView textView = modelBillRecordItem.f31477e;
            if (i10 == 1 || i10 == 2) {
                textView.setTextColor(context.getResources().getColor(L6.b.ppColorTextPrimary));
            } else if (i10 != 3) {
                if (i10 == 4 || i10 == 7) {
                    textView.setTextColor(Color.parseColor("#95a1a8"));
                } else {
                    textView.setTextColor(Color.parseColor("#95a1a8"));
                }
            } else if ("01".equals(this.f2260e)) {
                textView.setTextColor(context.getResources().getColor(L6.b.ppColorPrimary));
            } else {
                textView.setTextColor(context.getResources().getColor(L6.b.ppColorTextPrimary));
            }
            int i11 = orderData.orderStatus;
            TextView textView2 = modelBillRecordItem.f31478f;
            if (i11 == 1 || i11 == 2) {
                textView2.setTextColor(context.getColor(L6.b.ppColorWarning));
                textView2.setText(p366y9.d.ci_record_status_pending);
                return;
            }
            if (i11 == 3) {
                textView2.setText("");
                return;
            }
            if (i11 == 4) {
                textView2.setTextColor(Color.parseColor("#95a1a8"));
                textView2.setText(p366y9.d.ci_record_status_failed);
            } else if (i11 != 7) {
                textView2.setTextColor(Color.parseColor("#95a1a8"));
                textView2.setText("");
            } else {
                textView2.setTextColor(Color.parseColor("#95a1a8"));
                textView2.setText(p366y9.d.ci_record_status_closed);
            }
        }
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        ModelRecordListTitle modelRecordListTitle = new ModelRecordListTitle(this.f4984a);
        d dVar = new d(this, modelRecordListTitle);
        dVar.f2259d = modelRecordListTitle;
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        ModelBillRecordItem modelBillRecordItem = new ModelBillRecordItem(this.f4984a);
        c cVar = new c(this, modelBillRecordItem);
        cVar.f2258d = modelBillRecordItem;
        cVar.a(modelBillRecordItem.f31481j);
        return cVar;
    }
}
