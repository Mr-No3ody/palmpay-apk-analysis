package Uc;

import B6.ViewOnClickListenerC0087i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AgentLabelView;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MapPage f9591c;

    public U(MapPage mapPage) {
        this.f9591c = mapPage;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager container, int i7, Object obj) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(obj, "obj");
        container.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        int i7 = MapPage.f32859u0;
        return this.f9591c.r().c().size();
    }

    @Override // androidx.viewpager.widget.a
    public final float f() {
        return 0.95f;
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager container, int i7) {
        boolean z3 = true;
        int i10 = 0;
        Intrinsics.checkNotNullParameter(container, "container");
        MapPage mapPage = this.f9591c;
        Intrinsics.checkNotNullParameter(mapPage, "<this>");
        View viewInflate = LayoutInflater.from(mapPage).inflate(Sc.c.p2p_agent_item_layout, (ViewGroup) null);
        int i11 = MapPage.f32859u0;
        Object obj = mapPage.r().c().get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = (ShopHomeByMemberIdResp.NearbyShopListBean) obj;
        ((TextView) viewInflate.findViewById(Sc.b.p2p_name)).setText(nearbyShopListBean.networkName);
        TextView textView = (TextView) viewInflate.findViewById(Sc.b.p2p_address);
        textView.setText(nearbyShopListBean.networkAddress);
        textView.post(new Da.h(textView, 11, mapPage, nearbyShopListBean));
        TextView textView2 = (TextView) viewInflate.findViewById(Sc.b.p2p_distance);
        if (nearbyShopListBean.distance == 0.0d) {
            Intrinsics.e(textView2);
            p220oa.h.c(textView2);
        } else {
            Intrinsics.e(textView2);
            p220oa.h.C(textView2);
            double d2 = nearbyShopListBean.distance;
            textView2.setText(d2 >= 1.0d ? com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(d2)}, 1, "%.2fkm", "format(...)") : com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf((int) (d2 * ((double) 1000)))}, 1, "%dm", "format(...)"));
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(Sc.b.p2p_labels);
        List<String> list = nearbyShopListBean.businessLabel;
        if (list == null || !(!list.isEmpty())) {
            p220oa.h.c(MapPage.n(mapPage));
        } else {
            Intrinsics.e(linearLayout);
            p220oa.h.C(linearLayout);
            linearLayout.removeAllViews();
            boolean zC = Intrinsics.c(nearbyShopListBean.businessLabel.get(0), "CashBack");
            int i12 = zC ? 0 : -1;
            int size = nearbyShopListBean.businessLabel.size();
            int i13 = 0;
            while (i13 < size) {
                String str = nearbyShopListBean.businessLabel.get(i13);
                if (i13 == i12) {
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    AgentLabelView agentLabelView = new AgentLabelView(mapPage);
                    agentLabelView.a();
                    agentLabelView.setText(str);
                    MapPage.n(mapPage).addView(agentLabelView);
                } else if (i13 == zC) {
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    AgentLabelView agentLabelView2 = new AgentLabelView(mapPage);
                    agentLabelView2.b();
                    agentLabelView2.setText(str);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (zC == z3) {
                        marginLayoutParams.leftMargin = SizeUtils.dp2px(8.0f);
                    }
                    MapPage.n(mapPage).addView(agentLabelView2, marginLayoutParams);
                } else {
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    AgentLabelView agentLabelView3 = new AgentLabelView(mapPage);
                    agentLabelView3.c();
                    agentLabelView3.setText(str);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams2.leftMargin = SizeUtils.dp2px(8.0f);
                    MapPage.n(mapPage).addView(agentLabelView3, marginLayoutParams2);
                }
                i13++;
                z3 = z3;
            }
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(Sc.b.p2p_phone);
        boolean z8 = nearbyShopListBean.phoneSwitch;
        Intrinsics.e(imageView);
        if (z8) {
            p220oa.h.C(imageView);
        } else {
            p220oa.h.c(imageView);
        }
        ((ImageView) viewInflate.findViewById(Sc.b.p2p_phone)).setOnClickListener(new R8.d(nearbyShopListBean, 28));
        ((ImageView) viewInflate.findViewById(Sc.b.p2p_navigation)).setOnClickListener(new ViewOnClickListenerC0087i(viewInflate, 21, nearbyShopListBean, mapPage));
        View viewFindViewById = viewInflate.findViewById(Sc.b.p2p_rest_label);
        CardView cardView = (CardView) viewInflate.findViewById(Sc.b.p2p_booking_notes);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(Sc.b.p2p_cashback_label);
        CardView cardView2 = (CardView) viewInflate.findViewById(Sc.b.p2p_transfer);
        if (nearbyShopListBean.businessStatus) {
            Intrinsics.e(viewFindViewById);
            p220oa.h.c(viewFindViewById);
            if (nearbyShopListBean.bookingNotes) {
                Intrinsics.e(cardView);
                p220oa.h.C(cardView);
            } else {
                Intrinsics.e(cardView);
                p220oa.h.c(cardView);
            }
        } else {
            Intrinsics.e(viewFindViewById);
            p220oa.h.C(viewFindViewById);
            Intrinsics.e(cardView);
            p220oa.h.c(cardView);
        }
        cardView.setOnClickListener(new S(mapPage, nearbyShopListBean, 0));
        cardView2.setOnClickListener(new T(mapPage, i10));
        String str2 = nearbyShopListBean.pictureUrl;
        if (str2 != null) {
            Intrinsics.e(imageView2);
            p220oa.h.C(imageView2);
            Pa.r0.l1(str2, imageView2);
        } else {
            Intrinsics.e(imageView2);
            p220oa.h.c(imageView2);
        }
        container.addView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Intrinsics.c(view, obj);
    }
}
