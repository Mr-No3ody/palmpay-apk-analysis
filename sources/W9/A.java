package W9;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends Kb.c implements StickyRecyclerHeadersAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10599f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10600e;

    @Override // Kb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final PalmPayContact getItem(int i7) {
        try {
            return this.f10600e ? (PalmPayContact) this.f4985b.get(i7 - 1) : (PalmPayContact) this.f4985b.get(i7);
        } catch (Exception e10) {
            F6.d.c("A", "getItem: ", e10);
            return null;
        }
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        if (getItemViewType(i7) == 1) {
            return -1L;
        }
        return (TextUtils.isEmpty(getItem(i7).getRelationship()) || !getItem(i7).isFromLinkFaves()) ? Z4.e.m(getItem(i7).getAlias()).hashCode() : 1333692771;
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f4985b;
        int size = list == null ? 0 : list.size();
        return this.f10600e ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (this.f10600e && i7 == 0) ? 1 : 0;
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        z zVar = (z) viewHolder;
        if (getItemViewType(i7) == 0) {
            if (TextUtils.isEmpty(getItem(i7).getRelationship()) || !getItem(i7).isFromLinkFaves()) {
                zVar.b(R9.d.title_tv, Z4.e.m(getItem(i7).getAlias()));
            } else {
                zVar.b(R9.d.title_tv, this.f4984a.getString(R9.f.ct_link_faves));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        int itemViewType = getItemViewType(i7);
        Context context = this.f4984a;
        if (itemViewType != 1) {
            y yVar = (y) viewHolder;
            PalmPayContact item = getItem(i7);
            Z4.e.t(context, item.getPhotoPath(), (ImageView) yVar.getView(R9.d.contact_photo));
            yVar.b(R9.d.contact_note_name, item.getAlias());
            int i10 = TextUtils.isEmpty(item.getRelationship()) ? 8 : 0;
            ImageView imageView = yVar.f10655d;
            imageView.setVisibility(i10);
            r0.i1(imageView, item.getRelationshipPic(), Integer.MIN_VALUE, SizeUtils.dp2px(24.0f));
            return;
        }
        x xVar = (x) viewHolder;
        int i11 = p367ya.a.d().f44149a.getInt("key_new_contact_request_num", 0);
        if (i11 > 0) {
            xVar.f10652a.setVisibility(0);
            xVar.f10652a.setText(context.getString(R9.f.ct_contacts_request_format, Integer.valueOf(i11)));
        } else {
            xVar.f10652a.setVisibility(8);
        }
        SingleAdView singleAdView = xVar.f10653b;
        List list = this.f4985b;
        singleAdView.setVisibility((list == null ? 0 : list.size()) <= 0 ? 0 : 8);
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new z(this, LayoutInflater.from(this.f4984a).inflate(R9.e.ct_list_title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f4984a;
        return i7 == 1 ? new x(this, LayoutInflater.from(context).inflate(R9.e.ct_contact_list_header_item_layout2, viewGroup, false)) : new y(this, LayoutInflater.from(context).inflate(R9.e.ct_palmpay_contact_list_item_layout2, viewGroup, false));
    }
}
