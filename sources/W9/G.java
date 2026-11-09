package W9;

import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayNewContactsListActivity;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.ArrayList;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends Z1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PalmPayNewContactsListActivity f10612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2085k0 f10614d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f10613c.size();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public final int getSwipeLayoutResourceId(int i7) {
        return R9.d.contact_swipe;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        F f10 = (F) viewHolder;
        RequestContact requestContact = (RequestContact) this.f10613c.get(i7);
        Z4.e.t(this.f10612b, requestContact.getPhotoPath(), f10.f10606a);
        boolean zIsEmpty = TextUtils.isEmpty(requestContact.getAlias());
        TextView textView = f10.f10607b;
        if (zIsEmpty) {
            textView.setText(r0.w0(requestContact.getPhone()));
        } else {
            textView.setText(requestContact.getAlias());
        }
        long nowMills = TimeUtils.getNowMills();
        long expireTime = requestContact.getExpireTime();
        ViewGroup viewGroup = f10.f10611f;
        TextView textView2 = f10.f10609d;
        if (nowMills >= expireTime) {
            textView2.setText(R9.f.ct_expired);
            textView2.setEnabled(false);
            viewGroup.setOnClickListener(null);
        } else {
            textView2.setEnabled(!requestContact.isFriend());
            textView2.setText(requestContact.isFriend() ? R9.f.ct_added : R9.f.ct_view);
            viewGroup.setOnClickListener(new E(this, i7, 0));
        }
        f10.f10610e.setOnClickListener(new E(this, i7, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f10612b).inflate(R9.e.ct_palmpay_new_contact_list_item_layout, viewGroup, false);
        F f10 = new F(viewInflate);
        f10.f10606a = (ImageView) viewInflate.findViewById(R9.d.contact_photo);
        f10.f10607b = (TextView) viewInflate.findViewById(R9.d.contact_note_name);
        f10.f10608c = (TextView) viewInflate.findViewById(R9.d.contact_full_name);
        f10.f10609d = (TextView) viewInflate.findViewById(R9.d.contact_status);
        f10.f10610e = (TextView) viewInflate.findViewById(R9.d.delete_tv);
        f10.f10611f = (ViewGroup) viewInflate.findViewById(R9.d.contact_swipe);
        return f10;
    }
}
