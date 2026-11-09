package W9;

import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends Kb.c implements StickyRecyclerHeadersAdapter {
    @Override // Kb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final PalmPayContact getItem(int i7) {
        return (PalmPayContact) this.f4985b.get(i7);
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        return Z4.e.m(getItem(i7).getFullName()).hashCode();
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
        s sVar = (s) viewHolder;
        sVar.b(R9.d.title_tv, Z4.e.m(getItem(i7).getFullName()));
        sVar.c(R9.d.icon_iv, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        Context context = this.f4984a;
        r rVar = (r) viewHolder;
        PalmPayContact item = getItem(i7);
        Z4.e.t(context, item.getPhotoPath(), (ImageView) rVar.getView(R9.d.contact_photo));
        rVar.b(R9.d.contact_note_name, item.getFullName());
        rVar.b(R9.d.contact_number, r0.D0(item.getPhone()));
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new s(this, LayoutInflater.from(this.f4984a).inflate(R9.e.ct_list_title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f4984a;
        if (i7 != 1) {
            View viewInflate = LayoutInflater.from(context).inflate(R9.e.ct_mobile_contact_list_item_layout, viewGroup, false);
            r rVar = new r(this, viewInflate);
            rVar.a(viewInflate);
            return rVar;
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(R9.e.ct_contact_list_header_item_layout, viewGroup, false);
        q qVar = new q(viewInflate2);
        qVar.f10647a = (TextView) viewInflate2.findViewById(R9.d.new_contact_number);
        viewInflate2.setOnClickListener(new F5.b(3));
        return qVar;
    }
}
