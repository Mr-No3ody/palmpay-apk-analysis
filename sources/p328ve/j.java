package p328ve;

import Ac.e;
import Ac.f;
import C0.G;
import He.b;
import Kb.c;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.main.export.bean.rsp.InviteeListResp;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends c implements StickyRecyclerHeadersAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SimpleDateFormat f43184e = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        InviteeListResp.DataBean.Invitee invitee = (InviteeListResp.DataBean.Invitee) getItem(i7);
        String firstName = invitee.getFirstName();
        if (TextUtils.isEmpty(firstName)) {
            firstName = invitee.getPhone();
        }
        return (TextUtils.isEmpty(firstName) ? " " : String.valueOf(firstName.charAt(0))).hashCode();
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        h hVar = (h) viewHolder;
        int i10 = e.header_tv;
        String firstName = ((InviteeListResp.DataBean.Invitee) getItem(i7)).getFirstName();
        hVar.b(i10, TextUtils.isEmpty(firstName) ? " " : String.valueOf(firstName.charAt(0)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        String str;
        i iVar = (i) viewHolder;
        InviteeListResp.DataBean.Invitee invitee = (InviteeListResp.DataBean.Invitee) getItem(i7);
        ImageView imageView = (ImageView) iVar.getView(e.invitee_photo);
        Context context = this.f4984a;
        b bVar = new b(context.getResources());
        String firstName = invitee.getFirstName();
        String lastName = invitee.getLastName();
        if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName)) {
            str = " ";
        } else {
            str = String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0));
        }
        bVar.f3874d = str;
        imageView.setBackground(bVar);
        iVar.b(e.invitee_name, r0.b0(invitee.getFirstName(), null, invitee.getLastName()));
        iVar.b(e.invitee_num, r0.D0(r0.w0(invitee.getPhone())));
        ((TextView) iVar.getView(e.rewards_points)).setText(G.i("₦").setFontSize(SizeUtils.sp2px(15.0f)).append(String.valueOf(invitee.getPointsAmount())).setFontSize(SizeUtils.sp2px(20.0f)).create());
        iVar.b(e.tvTime, TimeUtils.millis2String(invitee.getInvitTime(), f43184e));
        if (invitee.getPointsAmount() > 0) {
            iVar.setTextColor(e.rewards_points, context.getColor(Ac.b.main_invitee_points_color));
        } else {
            iVar.setTextColor(e.rewards_points, context.getColor(Ac.b.main_invitee_points_gray_color));
        }
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new h(this, LayoutInflater.from(this.f4984a).inflate(f.main_invitee_header_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.main_invitee_list_item_layout, viewGroup, false);
        i iVar = new i(this, viewInflate);
        iVar.a(viewInflate);
        return iVar;
    }
}
