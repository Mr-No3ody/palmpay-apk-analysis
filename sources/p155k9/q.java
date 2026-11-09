package p155k9;

import Ea.a;
import Kb.c;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.airtime.bean.AirtimeOrderList;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.ModelBillRecordItem;
import com.transsnet.palmpay.custom_view.model.ModelRecordListTitle;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends c implements StickyRecyclerHeadersAdapter {
    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        if (i7 < this.f4985b.size()) {
            return r0.h0(((AirtimeOrderList.OrderData) this.f4985b.get(i7)).createTime);
        }
        return 0L;
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (i7 < this.f4985b.size()) {
            p pVar = (p) viewHolder;
            pVar.f38719d.f31576c.setText(r0.i0(r0.j0(((AirtimeOrderList.OrderData) this.f4985b.get(i7)).createTime)));
            pVar.f38719d.f31577d.setText("");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:42:0x0148  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (i7 < this.f4985b.size()) {
            AirtimeOrderList.OrderData orderData = (AirtimeOrderList.OrderData) this.f4985b.get(i7);
            o oVar = (o) viewHolder;
            TextView textView = oVar.f38718d.f31477e;
            StringBuilder sb2 = new StringBuilder("-");
            sb2.append(r0.A("03".equals(orderData.orderType) ? orderData.amount : orderData.payAmount));
            textView.setText(sb2.toString());
            ModelBillRecordItem modelBillRecordItem = oVar.f38718d;
            modelBillRecordItem.f31476d.setText(r0.R(orderData.createTime));
            if ("03".equals(orderData.orderType)) {
                modelBillRecordItem.f31479g.setVisibility(0);
            } else {
                modelBillRecordItem.f31479g.setVisibility(8);
            }
            if (TextUtils.isEmpty(orderData.icon)) {
                r0.t1(modelBillRecordItem.f31480i, a.c("04", null, null, 0L));
            } else {
                r0.v1(orderData.icon, modelBillRecordItem.f31480i);
            }
            if (!TextUtils.isEmpty(orderData.transTypeName)) {
                modelBillRecordItem.f31475c.setText(orderData.transTypeName);
            } else if (TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY.equals(orderData.transType)) {
                modelBillRecordItem.f31475c.setText(k.core_daily_flash_sales);
            } else {
                modelBillRecordItem.f31475c.setText(k.core_top_up_airtime);
            }
            int i10 = orderData.orderStatus;
            TextView textView2 = modelBillRecordItem.f31478f;
            Intrinsics.checkNotNullParameter(textView2, "textView");
            String string = textView2.getContext().getString(k.core_processing);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Context context = this.f4984a;
            if (i10 == 0) {
                textView2.setText(k.core_failed);
                Intrinsics.e(context);
                textView2.setTextColor(context.getColor(b.ppColorError));
            } else if (i10 == 1) {
                textView2.setText("");
            } else if (i10 == 2 || i10 == 3) {
                textView2.setText(string);
                Intrinsics.e(context);
                textView2.setTextColor(context.getColor(b.ppColorWarning));
            } else if (i10 == 5) {
                textView2.setText(k.core_failed);
                Intrinsics.e(context);
                textView2.setTextColor(context.getColor(b.ppColorError));
            } else if (i10 != 14) {
                switch (i10) {
                    case 7:
                        textView2.setText("");
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        textView2.setText(k.core_failed);
                        Intrinsics.e(context);
                        textView2.setTextColor(context.getColor(b.ppColorError));
                        break;
                    case 12:
                        textView2.setText(k.core_closed);
                        Intrinsics.e(context);
                        textView2.setTextColor(context.getColor(b.ppColorTextNormal));
                        break;
                    default:
                        switch (i10) {
                            case 21:
                                textView2.setText(k.core_reservation);
                                Intrinsics.e(context);
                                textView2.setTextColor(context.getColor(b.ppColorTextNormal));
                                break;
                            case 22:
                                textView2.setText(k.core_failed);
                                Intrinsics.e(context);
                                textView2.setTextColor(context.getColor(b.ppColorError));
                                break;
                            case 23:
                                textView2.setText(k.core_closed);
                                Intrinsics.e(context);
                                textView2.setTextColor(context.getColor(b.ppColorTextNormal));
                                break;
                            default:
                                textView2.setText(string);
                                Intrinsics.e(context);
                                textView2.setTextColor(context.getColor(b.ppColorWarning));
                                break;
                        }
                        break;
                }
            } else {
                textView2.setText(k.core_closed);
                Intrinsics.e(context);
                textView2.setTextColor(context.getColor(b.ppColorTextNormal));
            }
            int i11 = orderData.orderStatus;
            TextView textView3 = modelBillRecordItem.f31477e;
            textView3.setTextColor(context.getResources().getColor(b.ppColorTextPrimary));
            if (i11 != 0 && i11 != 5) {
                if (i11 != 14) {
                    switch (i11) {
                    }
                    return;
                }
                textView3.setTextColor(context.getColor(b.ppColorTextNormal));
                return;
            }
            textView3.setTextColor(context.getColor(b.ppColorTextNormal));
        }
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        ModelRecordListTitle modelRecordListTitle = new ModelRecordListTitle(this.f4984a);
        p pVar = new p(this, modelRecordListTitle);
        pVar.f38719d = modelRecordListTitle;
        return pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        ModelBillRecordItem modelBillRecordItem = new ModelBillRecordItem(this.f4984a);
        o oVar = new o(this, modelBillRecordItem);
        oVar.f38718d = modelBillRecordItem;
        oVar.a(modelBillRecordItem.f31481j);
        return oVar;
    }
}
