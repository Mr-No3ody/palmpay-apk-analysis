package Zc;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.photograph.PhotoPickerActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PhotoPickerActivity f11628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PhotoPickerActivity f11629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11631e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f11627a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        g gVar = (g) viewHolder;
        int i10 = l.photo_pick_item_iv;
        Uri uri = (Uri) this.f11627a.get(i7);
        com.bumptech.glide.b.e(gVar.f11634c).load(uri).a(((G1.d) new G1.d().w(this.f11630d, this.f11631e)).h()).S((ImageView) gVar.getView(i10));
        gVar.itemView.setOnClickListener(new Nd.d(this, i7, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        PhotoPickerActivity photoPickerActivity = this.f11628b;
        return new g(LayoutInflater.from(photoPickerActivity).inflate(m.photo_pick_item, viewGroup, false), photoPickerActivity);
    }
}
