package p052da;

import Kb.c;
import L6.b;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35671e;

    public A(Context context) {
        super(context);
        this.f35671e = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        Resources resources;
        int i10;
        BillType billType = (BillType) getItem(i7);
        TextView textView = (TextView) ((C1653z) viewHolder).getView(e.tvContent);
        textView.setText(billType.typeName);
        textView.setSelected(billType.type.equals(this.f35671e));
        boolean zEquals = billType.type.equals(this.f35671e);
        Context context = this.f4984a;
        if (zEquals) {
            resources = context.getResources();
            i10 = p.md_white_1000;
        } else {
            resources = context.getResources();
            i10 = b.ppColorTextPrimary;
        }
        textView.setTextColor(resources.getColor(i10));
        textView.setBackgroundResource(billType.type.equals(this.f35671e) ? r.cv_shape_rect_corner_8_bg_primary : r.cv_rect_corner_8_solid_121212);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(g.core_item_choose_pop_multi_item, viewGroup, false);
        C1653z c1653z = new C1653z(this, viewInflate);
        c1653z.a(viewInflate);
        return c1653z;
    }
}
