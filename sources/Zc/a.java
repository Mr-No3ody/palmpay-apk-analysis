package Zc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f11611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f11613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11614d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f11611a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        g gVar = (g) viewHolder;
        b bVar = (b) this.f11611a.get(i7);
        int i10 = l.photo_folder_cover_iv;
        String str = bVar.f11616b;
        com.bumptech.glide.b.e(gVar.f11634c).load(str).S((ImageView) gVar.getView(i10));
        int i11 = l.photo_folder_name_tv;
        ((TextView) gVar.getView(i11)).setText(bVar.f11615a);
        int i12 = l.photo_folder_num_tv;
        ((TextView) gVar.getView(i12)).setText(String.valueOf(bVar.f11617c.size()));
        if (i7 == this.f11614d) {
            gVar.getView(l.photo_folder_check_box).setVisibility(0);
        } else {
            gVar.getView(l.photo_folder_check_box).setVisibility(8);
        }
        gVar.itemView.setOnClickListener(new Nd.d(this, i7, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f11612b;
        return new g(LayoutInflater.from(context).inflate(m.photo_folder_pick_item, viewGroup, false), context);
    }
}
