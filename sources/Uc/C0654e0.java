package Uc;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AgentLabelView;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0654e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MapPage f9640g;

    public C0654e0(MapPage mapPage) {
        this.f9640g = mapPage;
    }

    public final void a() {
        if (this.f9638e == 0) {
            this.f9638e = 1;
            String strO = C0.G.o("FIRST_ENTER_MAP_PAGE_", C0.G.k());
            if (SPUtils.get().getBoolean(strO, true)) {
                SPUtils.get().put(strO, false);
                this.f9640g.getWindow().getDecorView().post(new M7.s(this, 20));
            }
        }
    }

    public final void b() {
        MapPage mapPage = this.f9640g;
        mapPage.getWindow().getDecorView().post(new Z(this, mapPage));
    }

    public final void c() {
        int i7 = 1;
        int i10 = 2;
        if (this.f9639f) {
            MapPage mapPage = this.f9640g;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(MapPage.p(mapPage).getTranslationY(), this.f9635b - this.f9634a);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.addUpdateListener(new C0646a0(mapPage, i10));
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(MapPage.o(mapPage).getTranslationY(), this.f9637d);
            valueAnimatorOfFloat2.setDuration(150L);
            valueAnimatorOfFloat2.addUpdateListener(new C0646a0(mapPage, 3));
            valueAnimatorOfFloat2.addListener(new C0652d0(i7, mapPage, this));
            valueAnimatorOfFloat2.start();
        }
    }

    public final void d() {
        MapPage mapPage = this.f9640g;
        mapPage.getWindow().getDecorView().post(new Z(mapPage, this, 0));
        mapPage.getWindow().getDecorView().post(new Z(mapPage, this, 1));
    }

    public final void e() {
        int i7;
        int i10;
        MapPage mapPage = this.f9640g;
        Object value = mapPage.f32866Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.C((FrameLayout) value);
        Object value2 = mapPage.f32865M.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        p220oa.h.c((CardView) value2);
        p220oa.h.c(MapPage.q(mapPage));
        Object value3 = mapPage.f32880o.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(mapPage.r().a().networkName);
        Object value4 = mapPage.f32876g.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setText(mapPage.r().a().networkAddress);
        double d2 = mapPage.r().a().distance;
        p355xf.t tVar = mapPage.f32878j;
        if (d2 == 0.0d) {
            Object value5 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            p220oa.h.c((TextView) value5);
        } else {
            Object value6 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            p220oa.h.C((TextView) value6);
            Object value7 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((TextView) value7).setText(mapPage.r().a().distance >= 1.0d ? com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(mapPage.r().a().distance)}, 1, "%.2fkm", "format(...)") : com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf((int) (mapPage.r().a().distance * ((double) 1000)))}, 1, "%dm", "format(...)"));
        }
        List<String> list = mapPage.r().a().businessLabel;
        if (list == null || !(!list.isEmpty())) {
            p220oa.h.c(MapPage.n(mapPage));
        } else {
            p220oa.h.C(MapPage.n(mapPage));
            MapPage.n(mapPage).removeAllViews();
            if (Intrinsics.c(mapPage.r().a().businessLabel.get(0), "CashBack")) {
                i10 = 1;
                i7 = 0;
            } else {
                i7 = -1;
                i10 = 0;
            }
            int size = mapPage.r().a().businessLabel.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = mapPage.r().a().businessLabel.get(i11);
                if (i11 == i7) {
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    AgentLabelView agentLabelView = new AgentLabelView(mapPage);
                    agentLabelView.a();
                    agentLabelView.setText(str);
                    MapPage.n(mapPage).addView(agentLabelView);
                } else if (i11 == i10) {
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    AgentLabelView agentLabelView2 = new AgentLabelView(mapPage);
                    agentLabelView2.b();
                    agentLabelView2.setText(str);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (i10 == 1) {
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
            }
        }
        p355xf.t tVar2 = mapPage.f32875f;
        Object value8 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ImageView imageView = (ImageView) value8;
        if (mapPage.r().a().phoneSwitch) {
            p220oa.h.C(imageView);
        } else {
            p220oa.h.c(imageView);
        }
        Object value9 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((ImageView) value9).setOnClickListener(new T(mapPage, 1));
        Object value10 = mapPage.f32874e.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        ((ImageView) value10).setOnClickListener(new Oc.j(14, this, mapPage));
        boolean z3 = mapPage.r().a().businessStatus;
        p355xf.t tVar3 = mapPage.f32873d;
        if (z3) {
            Object value11 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            p220oa.h.c((LinearLayout) value11);
            if (mapPage.r().a().bookingNotes) {
                p220oa.h.C(MapPage.m(mapPage));
            } else {
                p220oa.h.c(MapPage.m(mapPage));
            }
        } else {
            Object value12 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            p220oa.h.C((LinearLayout) value12);
            p220oa.h.c(MapPage.m(mapPage));
        }
        MapPage.m(mapPage).setOnClickListener(new T(mapPage, 2));
        Object value13 = mapPage.f32871b.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        ((CardView) value13).setOnClickListener(new T(mapPage, 3));
        String str2 = mapPage.r().a().pictureUrl;
        p355xf.t tVar4 = mapPage.f32870a;
        if (str2 != null) {
            Object value14 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            p220oa.h.C((ImageView) value14);
            Object value15 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
            Pa.r0.l1(str2, (ImageView) value15);
        } else {
            Object value16 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
            p220oa.h.c((ImageView) value16);
        }
        b();
        d();
        a();
    }
}
