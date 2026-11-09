package p284sb;

import Ya.e;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p054dd.n;
import p220oa.h;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f42135a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42136b;

    public P(SearchMIDActivity searchMIDActivity) {
        this.f42136b = searchMIDActivity;
        t tVar = searchMIDActivity.f28791f;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setAdapter(this);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Intrinsics.checkNotNullParameter(searchMIDActivity, "<this>");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(searchMIDActivity, 1, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Integer numValueOf = Integer.valueOf(this.f42135a.size());
        if (numValueOf.intValue() > 5) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        O holder = (O) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        P p3 = holder.f42134a;
        SearchMIDActivity searchMIDActivity = p3.f42136b;
        Object obj = p3.f42135a.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        GetRecentMerchantsResp.ListDataBean listDataBean = (GetRecentMerchantsResp.ListDataBean) obj;
        View view2 = holder.itemView;
        if (view2 != null) {
            TextView textView = (TextView) view2.findViewById(e.cs_no);
            if (textView != null) {
                KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                T tO = searchMIDActivity.o();
                String snNo = listDataBean.snNo;
                Intrinsics.checkNotNullExpressionValue(snNo, "snNo");
                textView.setText(tO.c(snNo));
            }
            TextView textView2 = (TextView) view2.findViewById(e.cs_name);
            if (textView2 != null) {
                textView2.setText(listDataBean.merchantName);
            }
        }
        Intrinsics.e(view);
        h.l(new n(28, searchMIDActivity, listDataBean), view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SearchMIDActivity searchMIDActivity = this.f42136b;
        Intrinsics.checkNotNullParameter(searchMIDActivity, "<this>");
        View viewInflate = LayoutInflater.from(searchMIDActivity).inflate(f.cs_recent_merchant_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new O(this, viewInflate);
    }
}
