package W9;

import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.bean.resp.QueryPhonesData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0726g extends Kb.c {
    @Override // Kb.c
    public final Object getItem(int i7) {
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        return (QueryPhonesData) obj;
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
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C0725f c0725f = (C0725f) holder;
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        QueryPhonesData queryPhonesData = (QueryPhonesData) obj;
        String fullName = queryPhonesData.getFullName();
        String headPortrait = queryPhonesData.getHeadPortrait();
        String phone = queryPhonesData.getPhone();
        Long incentiveAmount = queryPhonesData.getIncentiveAmount();
        ImageView imageView = (ImageView) c0725f.getView(R9.d.contact_photo);
        if (headPortrait == null) {
            headPortrait = "";
        }
        Z4.e.t(this.f4984a, headPortrait, imageView);
        int i10 = R9.d.contact_note_name;
        if (fullName == null) {
            fullName = "";
        }
        c0725f.b(i10, fullName);
        c0725f.c(R9.d.cifclil_invite, true);
        int i11 = R9.d.cifclil_reward;
        c0725f.b(i11, "P" + r0.E(incentiveAmount != null ? incentiveAmount.longValue() : 0L));
        int i12 = R9.d.contact_number;
        if (phone == null) {
            phone = "";
        }
        c0725f.b(i12, r0.D0(phone));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4984a).inflate(R9.e.ct_invite_friends_contact_list_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C0725f c0725f = new C0725f(this, itemView);
        View viewFindViewById = itemView.findViewById(R9.d.cifclil_invite);
        Intrinsics.checkNotNullParameter(viewFindViewById, "<set-?>");
        c0725f.f10629d = viewFindViewById;
        if (viewFindViewById != null) {
            c0725f.a(viewFindViewById);
            return c0725f;
        }
        Intrinsics.n("invite");
        throw null;
    }
}
