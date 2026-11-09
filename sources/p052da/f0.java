package p052da;

import Kb.c;
import L9.a;
import L9.b;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.rsp.UssdListRsp;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        UssdListRsp ussdListRsp = (UssdListRsp) getItem(i7);
        if (ussdListRsp != null) {
            return (TextUtils.isEmpty(ussdListRsp.getOpGuide()) && TextUtils.isEmpty(ussdListRsp.getFunDescri())) ? 0 : 1;
        }
        return super.getItemViewType(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i7) != 0) {
            e0 e0Var = (e0) holder;
            Object item = getItem(i7);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            UssdListRsp item2 = (UssdListRsp) item;
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(item2, "item");
            e0Var.f35765d.setText(item2.getFunDescri());
            e0Var.f35766e.setText(item2.getOpGuide());
            return;
        }
        d0 d0Var = (d0) holder;
        Object item3 = getItem(i7);
        Intrinsics.checkNotNullExpressionValue(item3, "getItem(...)");
        UssdListRsp item4 = (UssdListRsp) item3;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(item4, "item");
        r0.u1(d0Var.f35762d, item4.getChannelUrl(), r.cv_mobile_wallet_icon);
        d0Var.f35763e.setText(item4.getChannelName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4984a;
        if (i7 == 0) {
            View itemView = LayoutInflater.from(context).inflate(b.core_layout_ussd_head_item, parent, false);
            Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            d0 d0Var = new d0(this, itemView);
            View viewFindViewById = itemView.findViewById(a.ivIcon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            d0Var.f35762d = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(a.tvName);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            d0Var.f35763e = (TextView) viewFindViewById2;
            return d0Var;
        }
        View itemView2 = LayoutInflater.from(context).inflate(b.core_layout_ussd_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView2, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView2, "itemView");
        e0 e0Var = new e0(this, itemView2);
        View viewFindViewById3 = itemView2.findViewById(a.tvLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        e0Var.f35765d = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView2.findViewById(a.tvLine2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        e0Var.f35766e = (TextView) viewFindViewById4;
        e0Var.a(itemView2);
        return e0Var;
    }
}
