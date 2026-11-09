package W9;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends Kb.c implements StickyRecyclerHeadersAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10601f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10602e;

    public B(Context context, boolean z3) {
        super(context);
        this.f10602e = z3;
    }

    @Override // Kb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final PalmPayContact getItem(int i7) {
        try {
            return this.f10602e ? (PalmPayContact) this.f4985b.get(i7 - 1) : (PalmPayContact) this.f4985b.get(i7);
        } catch (Exception e10) {
            F6.d.c("B", "getItem: ", e10);
            return null;
        }
    }

    public final int d(String str) {
        List list = this.f4985b;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i7 = "★".equals(str) ? 0 : -2;
        for (int i10 = 0; i10 < this.f4985b.size(); i10++) {
            if (((PalmPayContact) this.f4985b.get(i10)).getFavouriteType() != 1 && Z4.e.m(((PalmPayContact) this.f4985b.get(i10)).getAlias()).equals(str)) {
                i7 = i10;
                break;
            }
        }
        return this.f10602e ? i7 + 1 : i7;
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        if (getItemViewType(i7) == 1) {
            return -1L;
        }
        return getItem(i7).getFavouriteType() == 1 ? 221757577 : Z4.e.m(getItem(i7).getAlias()).hashCode();
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f4985b;
        int size = list == null ? 0 : list.size();
        return this.f10602e ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (this.f10602e && i7 == 0) ? 1 : 0;
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        w wVar = (w) viewHolder;
        if (getItemViewType(i7) == 0) {
            if (getItem(i7).getFavouriteType() != 1) {
                wVar.b(R9.d.title_tv, Z4.e.m(getItem(i7).getAlias()));
                wVar.c(R9.d.icon_iv, false);
                return;
            }
            wVar.b(R9.d.title_tv, this.f4984a.getString(R9.f.ct_favourite));
            wVar.c(R9.d.icon_iv, true);
            int i10 = R9.d.icon_iv;
            ((ImageView) wVar.getView(i10)).setImageResource(R9.c.ct_favorite_icon);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        int itemViewType = getItemViewType(i7);
        Context context = this.f4984a;
        if (itemViewType == 1) {
            u uVar = (u) viewHolder;
            int i10 = p367ya.a.d().f44149a.getInt("key_new_contact_request_num", 0);
            if (i10 > 0) {
                uVar.f10648a.setVisibility(0);
                uVar.f10648a.setText(context.getString(R9.f.ct_contacts_request_format, Integer.valueOf(i10)));
            } else {
                uVar.f10648a.setVisibility(8);
            }
            SingleAdView singleAdView = uVar.f10649b;
            List list = this.f4985b;
            singleAdView.setVisibility((list == null ? 0 : list.size()) > 0 ? 8 : 0);
            return;
        }
        v vVar = (v) viewHolder;
        PalmPayContact item = getItem(i7);
        Z4.e.t(context, item.getPhotoPath(), (ImageView) vVar.getView(R9.d.contact_photo));
        if (TextUtils.equals(item.getAlias(), item.getFullName())) {
            vVar.b(R9.d.contact_note_name, item.getAlias());
            vVar.c(R9.d.contact_full_name, false);
        } else {
            vVar.b(R9.d.contact_note_name, item.getAlias());
            vVar.c(R9.d.contact_full_name, true);
            vVar.b(R9.d.contact_full_name, item.getFullName());
        }
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new w(this, LayoutInflater.from(this.f4984a).inflate(R9.e.ct_list_title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        Context context = this.f4984a;
        return i7 == 1 ? new u(this, LayoutInflater.from(context).inflate(R9.e.ct_contact_list_header_item_layout, viewGroup, false)) : new v(this, LayoutInflater.from(context).inflate(R9.e.ct_palmpay_contact_list_item_layout, viewGroup, false));
    }
}
