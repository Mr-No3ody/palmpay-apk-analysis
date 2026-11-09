package Uc;

import B6.ViewOnClickListenerC0087i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AgentLabelView;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0664j0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9664a;

    public C0664j0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9664a = nearbyAgent2Page;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i7 = NearbyAgent2Page.f32889k0;
        return this.f9664a.n().a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        int i10 = NearbyAgent2Page.f32889k0;
        return ((Vc.a) this.f9664a.n().a().get(i7)).a() ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        int i10;
        int i11;
        C0662i0 holder = (C0662i0) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        C0664j0 c0664j0 = holder.f9661j;
        NearbyAgent2Page nearbyAgent2Page = c0664j0.f9664a;
        if (c0664j0.getItemViewType(i7) == 2) {
            ((SingleAdView) view.findViewById(Sc.b.p2p_nearby_agent_ad)).setAdListener(new C0660h0(nearbyAgent2Page, i7, c0664j0));
            return;
        }
        Object obj = nearbyAgent2Page.n().a().get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        Vc.a aVar = (Vc.a) obj;
        boolean zK = aVar.k();
        p355xf.t tVar = holder.f9658f;
        if (zK) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            p220oa.h.C((TextView) value);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(aVar.j());
        } else {
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            p220oa.h.c((TextView) value3);
        }
        Object value4 = holder.f9657e.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setText(aVar.g());
        Object value5 = holder.f9655c.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setText(aVar.b());
        double dC = aVar.c();
        p355xf.t tVar2 = holder.f9656d;
        if (dC == 0.0d) {
            Object value6 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            p220oa.h.c((TextView) value6);
        } else {
            Object value7 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            p220oa.h.C((TextView) value7);
            Object value8 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            ((TextView) value8).setText(aVar.c() >= 1.0d ? com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(aVar.c())}, 1, "%.2fkm", "format(...)") : com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf((int) (aVar.c() * ((double) 1000)))}, 1, "%dm", "format(...)"));
        }
        if (aVar.d().isEmpty()) {
            p220oa.h.c(holder.a());
        } else {
            p220oa.h.C(holder.a());
            holder.a().removeAllViews();
            if (Intrinsics.c(aVar.d().get(0), "CashBack")) {
                i11 = 1;
                i10 = 0;
            } else {
                i10 = -1;
                i11 = 0;
            }
            int size = aVar.d().size();
            for (int i12 = 0; i12 < size; i12++) {
                String str = (String) aVar.d().get(i12);
                if (i12 == i10) {
                    Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
                    AgentLabelView agentLabelView = new AgentLabelView(nearbyAgent2Page);
                    agentLabelView.a();
                    agentLabelView.setText(str);
                    holder.a().addView(agentLabelView);
                } else if (i12 == i11) {
                    Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
                    AgentLabelView agentLabelView2 = new AgentLabelView(nearbyAgent2Page);
                    agentLabelView2.b();
                    agentLabelView2.setText(str);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (i11 == 1) {
                        marginLayoutParams.leftMargin = SizeUtils.dp2px(8.0f);
                    }
                    holder.a().addView(agentLabelView2, marginLayoutParams);
                } else {
                    Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
                    AgentLabelView agentLabelView3 = new AgentLabelView(nearbyAgent2Page);
                    agentLabelView3.c();
                    agentLabelView3.setText(str);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams2.leftMargin = SizeUtils.dp2px(8.0f);
                    holder.a().addView(agentLabelView3, marginLayoutParams2);
                }
            }
        }
        p355xf.t tVar3 = holder.f9654b;
        Object value9 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        p220oa.h.c((ImageView) value9);
        p355xf.t tVar4 = holder.f9653a;
        Object value10 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        p220oa.h.c((ImageView) value10);
        Object value11 = holder.f9660i.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        p220oa.h.c((View) value11);
        Object value12 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        ((ImageView) value12).setOnClickListener(new R8.d(aVar, 29));
        Object value13 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        ((ImageView) value13).setOnClickListener(new ViewOnClickListenerC0087i(view, 22, aVar, nearbyAgent2Page));
        view.setOnClickListener(new Oc.j(15, nearbyAgent2Page, aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        NearbyAgent2Page nearbyAgent2Page = this.f9664a;
        if (i7 == 2) {
            Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
            View viewInflate = LayoutInflater.from(nearbyAgent2Page).inflate(Sc.c.p2p_nearby_ad_item_layout, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new C0662i0(this, viewInflate);
        }
        Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
        View viewInflate2 = LayoutInflater.from(nearbyAgent2Page).inflate(Sc.c.p2p_nearby_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new C0662i0(this, viewInflate2);
    }
}
