package p052da;

import G1.d;
import Kb.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder == null || i7 >= this.f4985b.size()) {
            return;
        }
        PalmPayContact palmPayContact = (PalmPayContact) this.f4985b.get(i7);
        F f10 = (F) viewHolder;
        b.e(this.f4984a).load(palmPayContact.getPhotoPath()).a(((d) new d().x(r.cv_avatar_default)).d()).S(f10.f35682d);
        f10.f35683e.setText(palmPayContact.getFullName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(g.core_item_contact_in_share_dialog, (ViewGroup) null);
        F f10 = new F(this, viewInflate);
        f10.f35682d = (ImageView) viewInflate.findViewById(e.cisa_iv);
        f10.f35683e = (TextView) viewInflate.findViewById(e.cisa_tv);
        f10.a(viewInflate);
        return f10;
    }
}
