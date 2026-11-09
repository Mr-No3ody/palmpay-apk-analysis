package W9;

import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.PalmPayContact;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends Kb.c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C c6 = (C) viewHolder;
        PalmPayContact palmPayContact = (PalmPayContact) getItem(i7);
        ImageView imageView = (ImageView) c6.getView(R9.d.contact_photo);
        Z4.e.t(this.f4984a, palmPayContact.getPhotoPath(), imageView);
        if (TextUtils.equals(palmPayContact.getAlias(), palmPayContact.getFullName())) {
            c6.b(R9.d.contact_note_name, palmPayContact.getAlias());
            c6.c(R9.d.contact_full_name, false);
        } else {
            c6.b(R9.d.contact_note_name, palmPayContact.getAlias());
            c6.c(R9.d.contact_full_name, true);
            c6.b(R9.d.contact_full_name, palmPayContact.getFullName());
        }
        c6.b(R9.d.contact_number, r0.D0(palmPayContact.getPhone()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(R9.e.ct_palmpay_contact_search_item_layout, viewGroup, false);
        C c6 = new C(this, viewInflate);
        c6.a(viewInflate);
        return c6;
    }
}
