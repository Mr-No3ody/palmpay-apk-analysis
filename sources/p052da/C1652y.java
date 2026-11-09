package p052da;

import Kb.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;

/* JADX INFO: renamed from: da.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1652y extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35831e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        KeyValue keyValue = (KeyValue) getItem(i7);
        TextView textView = (TextView) ((C1651x) viewHolder).getView(e.tvContent);
        textView.setText(keyValue.getKey());
        textView.setEnabled(keyValue.getIsEnable());
        textView.setSelected(keyValue.getValue() == this.f35831e);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, textView.isSelected() ? r.cv_icon_check : 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(g.core_item_choose_pop_item, viewGroup, false);
        C1651x c1651x = new C1651x(this, viewInflate);
        c1651x.a(viewInflate);
        return c1651x;
    }
}
