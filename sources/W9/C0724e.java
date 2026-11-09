package W9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CloseContactTag;

/* JADX INFO: renamed from: W9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0724e extends Kb.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10628e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C0723d c0723d = (C0723d) viewHolder;
        c0723d.f10627d.setText(((CloseContactTag) this.f4985b.get(i7)).tag);
        viewHolder.itemView.setSelected(this.f10628e == i7);
        c0723d.f10627d.setOnClickListener(new ViewOnClickListenerC0722c(this, i7, c0723d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(R9.e.ct_item_tag, viewGroup, false);
        C0723d c0723d = new C0723d(this, viewInflate);
        c0723d.f10627d = (TextView) viewInflate.findViewById(R9.d.cit_tv);
        return c0723d;
    }
}
