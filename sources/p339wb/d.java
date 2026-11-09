package p339wb;

import C0.G;
import Pa.r0;
import Ya.e;
import Ya.f;
import Z1.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import p294tb.W;
import p327vd.c;
import p382zb.C2158a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f43364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f43365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2158a f43366d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f43364b.size();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public final int getSwipeLayoutResourceId(int i7) {
        return e.contact_swipe;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        String strD0;
        c cVar = (c) viewHolder;
        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) this.f43364b.get(i7);
        if (recipientBean.getRecipientType() == 4) {
            r0.j1((ImageView) cVar.getView(e.contact_photo), recipientBean.getRecipientHeadImage(), (G1.d) G1.d.O(r.cv_avatar_default).d());
            if (TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                cVar.b(e.contact_name, false);
            } else {
                cVar.b(e.contact_name, true);
                cVar.a(e.contact_name, recipientBean.getRecipientNickname());
            }
            int i10 = e.contact_number;
            String recipientChannel = recipientBean.getRecipientChannel();
            String recipientPhone = recipientBean.getRecipientPhone();
            if (TextUtils.isEmpty(recipientChannel)) {
                strD0 = r0.D0(r0.w0(recipientPhone));
            } else {
                StringBuilder sbT = G.t(recipientChannel, " (");
                sbT.append(r0.D0(r0.w0(recipientPhone)));
                sbT.append(")");
                strD0 = sbT.toString();
            }
            cVar.a(i10, strD0);
        } else if (recipientBean.getRecipientType() == 2 || recipientBean.getRecipientType() == 7) {
            r0.j1((ImageView) cVar.getView(e.contact_photo), recipientBean.getRecipientHeadImage(), G1.d.O(r.cv_bank_account));
            if (TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                cVar.b(e.contact_name, false);
            } else {
                cVar.b(e.contact_name, true);
                cVar.a(e.contact_name, recipientBean.getRecipientNickname());
            }
            cVar.a(e.contact_number, r0.A0(recipientBean.getRecipientBankName(), recipientBean.getRecipientAccountNumber()));
        } else {
            r0.j1((ImageView) cVar.getView(e.contact_photo), recipientBean.getRecipientHeadImage(), (G1.d) G1.d.O(r.cv_avatar_default).d());
            if (TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                cVar.b(e.contact_name, false);
            } else {
                cVar.b(e.contact_name, true);
                cVar.a(e.contact_name, recipientBean.getRecipientNickname());
            }
            cVar.a(e.contact_number, r0.D0(r0.w0(recipientBean.getRecipientPhone())));
        }
        cVar.getView(e.content).setOnClickListener(new Gd.e(this, i7, cVar, 4));
        cVar.getView(e.delete_tv).setOnClickListener(new c(this, i7));
        if (recipientBean.getRecipientType() == 2 || recipientBean.getRecipientType() == 7 || recipientBean.getRecipientType() == 1) {
            cVar.b(e.edit_tv, true);
        } else {
            cVar.b(e.edit_tv, false);
        }
        cVar.getView(e.edit_tv).setOnClickListener(new W(12, this, recipientBean));
        this.f11489a.a(i7, cVar.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        c cVar = new c(LayoutInflater.from(this.f43365c).inflate(f.cs_contact_list_item_layout, viewGroup, false));
        cVar.f43363a = new SparseArray();
        return cVar;
    }
}
