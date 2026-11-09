package p052da;

import Kb.c;
import L6.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import p025ba.d;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class V extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35736e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof U) {
            U u6 = (U) viewHolder;
            List list = this.f4985b;
            if (list != null && i7 < list.size()) {
                u6.f35735d.setText(((BillType) this.f4985b.get(i7)).typeName);
            }
            int i10 = this.f35736e;
            Context context = this.f4984a;
            if (i7 == i10) {
                u6.f35735d.setTextColor(context.getResources().getColor(b.ppColorPrimary));
                u6.f35735d.setBackgroundResource(r.cv_bill_type_selected);
            } else {
                u6.f35735d.setTextColor(context.getResources().getColor(b.ppColorTextNormal));
                u6.f35735d.setBackgroundResource(d.core_shape_rect_corner_2_stroke_gray_width_0_5);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(g.core_item_select_bill_type, viewGroup, false);
        U u6 = new U(this, viewInflate);
        TextView textView = (TextView) viewInflate;
        u6.f35735d = textView;
        u6.a(textView);
        return u6;
    }
}
