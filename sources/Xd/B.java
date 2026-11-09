package Xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends Kb.c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        WAECOperatorBean wAECOperatorBean = (WAECOperatorBean) obj;
        A a3 = (A) holder;
        ImageView imageView = (ImageView) a3.itemView.findViewById(Pd.c.qis_iv);
        TextView textView = (TextView) a3.itemView.findViewById(Pd.c.qis_tv);
        com.bumptech.glide.b.e(this.f4984a).load(wAECOperatorBean.getLogo()).S(imageView);
        textView.setText(wAECOperatorBean.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4984a).inflate(Pd.d.qt_item_select_new_work, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        A a3 = new A(this, itemView);
        a3.a(itemView);
        return a3;
    }
}
