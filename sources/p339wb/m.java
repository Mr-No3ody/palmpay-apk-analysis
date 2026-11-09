package p339wb;

import G1.d;
import Kb.c;
import Pa.r0;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends c implements StickyRecyclerHeadersAdapter {
    @Override // Kb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final PalmPayContact getItem(int i7) {
        return (PalmPayContact) this.f4985b.get(i7);
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        return a.t(getItem(i7).getFullName()).hashCode();
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f4985b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return 0;
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        l lVar = (l) viewHolder;
        lVar.b(e.title_tv, a.t(getItem(i7).getFullName()));
        lVar.c(e.icon_iv, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        Context context = this.f4984a;
        k kVar = (k) viewHolder;
        PalmPayContact item = getItem(i7);
        ImageView imageView = (ImageView) kVar.getView(e.contact_photo);
        String photoPath = item.getPhotoPath();
        b.e(context).load(photoPath).a((d) d.O(r.cv_avatar_default).d()).S(imageView);
        kVar.b(e.contact_note_name, item.getFullName());
        kVar.b(e.contact_number, r0.D0(item.getPhone()));
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new l(this, LayoutInflater.from(this.f4984a).inflate(f.cs_list_title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f4984a;
        if (i7 != 1) {
            View viewInflate = LayoutInflater.from(context).inflate(f.cs_mobile_contact_list_item_layout, viewGroup, false);
            k kVar = new k(this, viewInflate);
            kVar.a(viewInflate);
            return kVar;
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(f.cs_contact_list_header_item_layout, viewGroup, false);
        j jVar = new j(viewInflate2);
        jVar.f43381a = (TextView) viewInflate2.findViewById(e.new_contact_number);
        viewInflate2.setOnClickListener(new F5.b(10));
        return jVar;
    }
}
