package p368yb;

import Kb.c;
import Pa.r0;
import Ya.d;
import Ya.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcInviteListData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44199g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44200i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44202f;

    static {
        new O(null);
        f44199g = 1;
        f44200i = 2;
    }

    public final int c() {
        List list = this.f4985b;
        int size = list == null ? 0 : list.size();
        return this.f44201e ? size + 1 : size;
    }

    @Override // Kb.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final OcInviteListData getItem(int i7) {
        if (this.f4985b.size() == 0) {
            return new OcInviteListData(0, 0L, 0L, 0L, "", "", 0L, 0L, "", 0L, 0);
        }
        if (!this.f44201e) {
            Object obj = this.f4985b.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (OcInviteListData) obj;
        }
        if (i7 == 0) {
            Object obj2 = this.f4985b.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            return (OcInviteListData) obj2;
        }
        Object obj3 = this.f4985b.get(i7 - 1);
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        return (OcInviteListData) obj3;
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44202f ? c() : Math.min(c(), 6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (i7 == 0 && this.f44201e) ? f44199g : super.getItemViewType(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i7) == f44199g) {
            return;
        }
        Q q10 = (Q) holder;
        q10.f44198i.setVisibility(8);
        q10.f44197g.setVisibility(8);
        q10.f44196f.setVisibility(8);
        TextView textView = q10.f44195e;
        String strSubstring = getItem(i7).getFriendPhone().substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = getItem(i7).getFriendPhone().substring(getItem(i7).getFriendPhone().length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        textView.setText(strSubstring + "***" + strSubstring2);
        q10.f44197g.setText("+" + r0.n0(getItem(i7).getAmount()));
        int activeStatus = getItem(i7).getActiveStatus();
        if (activeStatus == -1) {
            q10.f44194d.setBackgroundResource(d.cs_refer_earn_invite_nomal);
            q10.f44196f.setVisibility(0);
            return;
        }
        if (activeStatus == 1) {
            q10.f44194d.setBackgroundResource(d.cs_refer_earn_invite_succ);
            q10.f44198i.setVisibility(0);
            q10.f44198i.setBackgroundResource(d.cs_refer_earn_invite_bottom_succ);
            q10.f44198i.setText("Successful");
            q10.f44197g.setVisibility(0);
            return;
        }
        if (activeStatus != 2) {
            return;
        }
        q10.f44194d.setBackgroundResource(d.cs_refer_earn_invite_failed);
        q10.f44198i.setVisibility(0);
        q10.f44198i.setBackgroundResource(d.cs_refer_earn_invite_bottom_failed);
        q10.f44198i.setText("Failed");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4984a;
        if (i7 == f44199g) {
            View viewInflate = LayoutInflater.from(context).inflate(f.cs_oc_refer_earn_invite_item, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new P(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(f.cs_oc_refer_earn_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new Q(this, viewInflate2);
    }
}
