package W9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends Kb.c implements StickyRecyclerHeadersAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f10645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.greenrobot.eventbus.f f10646f;

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
        o oVar = (o) viewHolder;
        oVar.b(R9.d.title_tv, Z4.e.m(getItem(i7).getFullName()));
        oVar.c(R9.d.icon_iv, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        Context context = this.f4984a;
        n nVar = (n) viewHolder;
        PalmPayContact item = getItem(i7);
        Z4.e.t(context, item.getPhotoPath(), (ImageView) nVar.getView(R9.d.contact_photo));
        nVar.b(R9.d.contact_note_name, item.getAlias());
        TextView textView = (TextView) nVar.getView(R9.d.contact_status);
        if (item.isFriend()) {
            textView.setEnabled(false);
            textView.setText(R9.f.ct_added);
        } else {
            LinkedHashMap linkedHashMap = this.f10645e;
            if (linkedHashMap.get(getItem(i7).getContactsMemberId()) == null || !((Boolean) linkedHashMap.get(getItem(i7).getContactsMemberId())).booleanValue()) {
                textView.setEnabled(true);
                textView.setText(R9.f.ct_add);
            } else {
                textView.setEnabled(false);
                textView.setText(R9.f.ct_request_sent);
            }
        }
        textView.setOnClickListener(new l(this, item, i7));
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new o(this, LayoutInflater.from(this.f4984a).inflate(R9.e.ct_list_title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f4984a;
        if (i7 != 1) {
            View viewInflate = LayoutInflater.from(context).inflate(R9.e.ct_local_contact_list_item_layout, viewGroup, false);
            n nVar = new n(this, viewInflate);
            nVar.a(viewInflate);
            return nVar;
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(R9.e.ct_contact_list_header_item_layout, viewGroup, false);
        m mVar = new m(viewInflate2);
        mVar.f10644a = (TextView) viewInflate2.findViewById(R9.d.new_contact_number);
        viewInflate2.setOnClickListener(new F5.b(2));
        return mVar;
    }
}
