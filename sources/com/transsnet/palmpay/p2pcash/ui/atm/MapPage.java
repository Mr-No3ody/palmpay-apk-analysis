package com.transsnet.palmpay.p2pcash.ui.atm;

import Ad.C0058e;
import N8.C0457a;
import Oc.C0500c;
import Pa.C0525w;
import Sc.b;
import Sc.c;
import Uc.C0654e0;
import Uc.T;
import Uc.W;
import Uc.X;
import Uc.Y;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.api.Service;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u0005\u0006\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/MapPage;", "Lcom/transsnet/palmpay/core/base/h;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "<init>", "()V", "a", "Uc/e0", "Uc/W", "Uc/X", "Uc/f0", "Uc/Y", "Uc/U", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPage.kt\ncom/transsnet/palmpay/p2pcash/ui/atm/MapPage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1089:1\n1#2:1090\n*E\n"})
public final class MapPage extends h implements OnMapReadyCallback {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f32859u0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f32860A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f32861B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f32862C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f32863H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f32864L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f32865M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f32866Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f32867X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f32868Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f32869Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32876g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32878j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f32879k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32881p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f32882p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f32883q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f32884r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f32885s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f32886t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f32887v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f32888w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public MapPage() {
        final int i7 = 0;
        this.f32870a = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i7) {
                    case 0:
                        int i10 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i11 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i12 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i13 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i14 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i15 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i16 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i17 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i18 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i19 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i10 = 2;
        this.f32871b = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i10) {
                    case 0:
                        int i11 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i12 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i13 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i14 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i15 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i16 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i17 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i18 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i19 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i110 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i11 = 14;
        this.f32872c = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i11) {
                    case 0:
                        int i12 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i13 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i14 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i15 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i16 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i17 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i18 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i19 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i110 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i111 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i12 = 15;
        this.f32873d = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i12) {
                    case 0:
                        int i13 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i14 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i15 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i16 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i17 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i18 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i19 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i110 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i111 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i112 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i13 = 16;
        this.f32874e = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i13) {
                    case 0:
                        int i14 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i15 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i16 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i17 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i18 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i19 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i110 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i111 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i112 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i113 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i14 = 17;
        this.f32875f = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i14) {
                    case 0:
                        int i15 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i16 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i17 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i18 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i19 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i110 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i111 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i112 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i113 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i114 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i15 = 18;
        this.f32876g = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i15) {
                    case 0:
                        int i16 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i17 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i18 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i19 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i110 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i111 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i112 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i113 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i114 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i115 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i16 = 19;
        this.f32877i = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i16) {
                    case 0:
                        int i17 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i18 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i19 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i110 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i111 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i112 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i113 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i114 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i115 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i116 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i17 = 20;
        this.f32878j = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i17) {
                    case 0:
                        int i18 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i19 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i110 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i111 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i112 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i113 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i114 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i115 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i116 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i117 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i18 = 21;
        this.f32880o = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i18) {
                    case 0:
                        int i19 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i110 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i112 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i114 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i115 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i116 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i117 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i118 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i19 = 11;
        this.f32881p = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i19) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i20 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i21 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i22 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i23 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i24 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i25 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i26 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i20 = 22;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i20) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i21 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i22 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i23 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i24 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i25 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i26 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i27 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i28 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i29 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i210 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i21 = 23;
        this.f32887v = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i21) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i22 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i23 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i24 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i25 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i26 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i27 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i28 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i29 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i210 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i211 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i22 = 24;
        this.f32888w = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i22) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i23 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i24 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i25 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i26 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i27 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i28 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i29 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i210 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i212 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i23 = 25;
        this.f32860A = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i23) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i24 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i25 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i26 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i27 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i28 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i29 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i210 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i211 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i212 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i213 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i24 = 26;
        this.f32861B = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i24) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i25 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i26 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i27 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i28 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i29 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i210 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i211 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i212 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i213 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i214 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i25 = 27;
        this.f32862C = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i25) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i26 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i27 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i28 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i29 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i210 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i211 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i212 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i213 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i214 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i26 = 28;
        this.f32863H = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i26) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i27 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i28 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i29 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i210 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i211 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i212 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i213 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i214 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i215 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i216 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i27 = 29;
        this.f32864L = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i27) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i28 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i29 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i210 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i211 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i212 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i213 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i214 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i215 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i216 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i217 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i28 = 1;
        this.f32865M = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i28) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i29 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i210 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i211 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i212 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i213 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i214 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i215 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i217 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i218 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i29 = 3;
        this.f32866Q = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i29) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i30 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i32 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i33 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i34 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i36 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i37 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i30 = 4;
        this.f32867X = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i30) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i31 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i32 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i33 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i34 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i35 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i37 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i38 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i310 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i31 = 5;
        this.f32868Y = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i31) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i32 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i33 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i34 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i35 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i36 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i38 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i39 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i310 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i311 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i32 = 6;
        this.f32869Z = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i32) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i33 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i34 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i35 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i36 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i37 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i39 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i310 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i311 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i312 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i33 = 7;
        this.f32879k0 = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i33) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i34 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i35 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i36 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i37 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i38 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i310 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i311 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i312 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i313 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i34 = 8;
        this.f32882p0 = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i34) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i35 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i36 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i37 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i38 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i39 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i311 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i312 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i313 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i314 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i35 = 9;
        this.f32883q0 = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i35) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i36 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i37 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i38 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i39 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i310 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i312 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i313 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i314 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i315 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i36 = 10;
        this.f32884r0 = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i36) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i37 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i38 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i39 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i310 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i311 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i313 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i314 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i315 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i316 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i37 = 12;
        this.f32885s0 = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i37) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i38 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i39 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i310 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i311 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i312 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i314 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i315 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i316 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i317 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
        final int i38 = 13;
        this.f32886t0 = C2131j.b(new Function0(this) { // from class: Uc.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPage f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MapPage mapPage = this.f9585b;
                switch (i38) {
                    case 0:
                        int i110 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_cashback_label);
                    case 1:
                        int i111 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_agent_empty);
                    case 2:
                        int i112 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_transfer);
                    case 3:
                        int i113 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_single_agent_module);
                    case 4:
                        int i114 = MapPage.f32859u0;
                        return (FrameLayout) mapPage.findViewById(Sc.b.p2p_move_module);
                    case 5:
                        int i115 = MapPage.f32859u0;
                        return mapPage.findViewById(Sc.b.v_mask);
                    case 6:
                        int i116 = MapPage.f32859u0;
                        return Integer.valueOf(mapPage.getIntent().getIntExtra("MAP_TYPE", 1));
                    case 7:
                        int i117 = MapPage.f32859u0;
                        String stringExtra = mapPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 8:
                        int i118 = MapPage.f32859u0;
                        return new C0654e0(mapPage);
                    case 9:
                        int i119 = MapPage.f32859u0;
                        return new W(mapPage);
                    case 10:
                        int i210 = MapPage.f32859u0;
                        return new C0656f0(mapPage);
                    case 11:
                        int i211 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_content);
                    case 12:
                        int i212 = MapPage.f32859u0;
                        return new X(mapPage);
                    case 13:
                        int i213 = MapPage.f32859u0;
                        return new Y(mapPage);
                    case 14:
                        int i214 = MapPage.f32859u0;
                        return (CardView) mapPage.findViewById(Sc.b.p2p_booking_notes);
                    case 15:
                        int i215 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_rest_label);
                    case 16:
                        int i216 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_navigation);
                    case 17:
                        int i217 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_phone);
                    case 18:
                        int i218 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_address);
                    case 19:
                        int i219 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_labels);
                    case 20:
                        int i39 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_distance);
                    case 21:
                        int i310 = MapPage.f32859u0;
                        return (TextView) mapPage.findViewById(Sc.b.p2p_name);
                    case 22:
                        int i311 = MapPage.f32859u0;
                        return (SingleAdView) mapPage.findViewById(Sc.b.viewADBanner);
                    case 23:
                        int i312 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_agreement_close);
                    case 24:
                        int i313 = MapPage.f32859u0;
                        return (LinearLayout) mapPage.findViewById(Sc.b.p2p_laksjdlfk);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_back);
                    case 26:
                        int i315 = MapPage.f32859u0;
                        return (ConstraintLayout) mapPage.findViewById(Sc.b.viewContainer);
                    case 27:
                        int i316 = MapPage.f32859u0;
                        return (ViewPager) mapPage.findViewById(Sc.b.p2p_viewpager);
                    case 28:
                        int i317 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_list);
                    default:
                        int i318 = MapPage.f32859u0;
                        return (ImageView) mapPage.findViewById(Sc.b.p2p_loc);
                }
            }
        });
    }

    public static final CardView m(MapPage mapPage) {
        Object value = mapPage.f32872c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CardView) value;
    }

    public static final LinearLayout n(MapPage mapPage) {
        Object value = mapPage.f32877i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public static final LinearLayout o(MapPage mapPage) {
        Object value = mapPage.f32888w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public static final FrameLayout p(MapPage mapPage) {
        Object value = mapPage.f32867X.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    public static final ViewPager q(MapPage mapPage) {
        Object value = mapPage.f32862C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewPager) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_map_page_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        W wR = r();
        C0525w c0525wF = C0525w.f();
        String str = (String) this.f32879k0.getValue();
        c0525wF.getClass();
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = (ShopHomeByMemberIdResp.NearbyShopListBean) C0525w.d(str, ShopHomeByMemberIdResp.NearbyShopListBean.class);
        wR.getClass();
        Intrinsics.checkNotNullParameter(nearbyShopListBean, "<set-?>");
        wR.f9601g = nearbyShopListBean;
        int iIntValue = ((Number) this.f32869Z.getValue()).intValue();
        if (iIntValue == 1) {
            t().e();
            return;
        }
        if (iIntValue != 2) {
            return;
        }
        MapPage mapPage = t().f9640g;
        t tVar = mapPage.f32863H;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.C((ImageView) value);
        t tVar2 = mapPage.f32864L;
        Object value2 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        p220oa.h.C((ImageView) value2);
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((ImageView) value3).setOnClickListener(new T(mapPage, 5));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((ImageView) value4).setOnClickListener(new T(mapPage, 6));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
        Y yS = s();
        yS.getClass();
        Intrinsics.checkNotNullParameter(googleMap, "<set-?>");
        yS.f9605a = googleMap;
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        int iIntValue = ((Number) this.f32869Z.getValue()).intValue();
        if (iIntValue == 1) {
            LatLng latLng = new LatLng(r().a().latitude, r().a().longitude);
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(latLng);
            markerOptions.title(r().a().networkName);
            googleMap.addMarker(markerOptions);
            s().getClass();
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 13.0f));
            return;
        }
        if (iIntValue != 2) {
            return;
        }
        googleMap.setOnCameraMoveListener(new U8.a(3, googleMap, this));
        MapPage mapPage = ((X) this.f32885s0.getValue()).f9604a;
        Intrinsics.checkNotNullParameter(mapPage, "<this>");
        if (d.a(mapPage, com.transsnet.palmpay.core.config.d.j()) == 0) {
            googleMap.setMyLocationEnabled(true);
            googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        }
        googleMap.setOnMarkerClickListener(new C0457a(this, 27));
        r().b();
        if (((r().f9595a == null || r().f9596b == null) ? null : this) != null) {
            String str = r().f9595a;
            Intrinsics.e(str);
            double d2 = Double.parseDouble(str);
            String str2 = r().f9596b;
            Intrinsics.e(str2);
            LatLng latLng2 = new LatLng(d2, Double.parseDouble(str2));
            s().getClass();
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng2, 13.0f));
            W wR = r();
            String str3 = r().f9596b;
            Intrinsics.e(str3);
            double d10 = Double.parseDouble(str3);
            String str4 = r().f9595a;
            Intrinsics.e(str4);
            wR.d(d10, Double.parseDouble(str4));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final W r() {
        return (W) this.f32883q0.getValue();
    }

    public final Y s() {
        return (Y) this.f32886t0.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 6;
        final int i10 = 0;
        final int i11 = 1;
        BarUtils.setStatusBarLightMode((Activity) this, true);
        Fragment fragmentD = getSupportFragmentManager().D(b.map);
        SupportMapFragment supportMapFragment = fragmentD instanceof SupportMapFragment ? (SupportMapFragment) fragmentD : null;
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
        Object value = this.f32868Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.s((View) value, isDarkMode());
        MapPage mapPage = t().f9640g;
        t tVar = mapPage.f32860A;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Intrinsics.checkNotNullParameter(mapPage, "<this>");
        ((ImageView) value2).setColorFilter(mapPage.getColor(Sc.a.p2p_theme_color));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((ImageView) value3).setOnClickListener(new T(mapPage, 4));
        final C0654e0 c0654e0T = t();
        MapPage mapPage2 = c0654e0T.f9640g;
        Object value4 = mapPage2.f32861B.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((ConstraintLayout) value4).setOnClickListener(new View.OnClickListener() { // from class: Uc.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0654e0 c0654e0 = c0654e0T;
                int i12 = 1;
                int i13 = 0;
                switch (i10) {
                    case 0:
                        c0654e0.c();
                        break;
                    default:
                        if (c0654e0.f9639f) {
                            MapPage mapPage3 = c0654e0.f9640g;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(MapPage.p(mapPage3).getTranslationY(), 0.0f);
                            valueAnimatorOfFloat.setDuration(150L);
                            valueAnimatorOfFloat.addUpdateListener(new C0646a0(mapPage3, i13));
                            valueAnimatorOfFloat.start();
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(MapPage.o(mapPage3).getTranslationY(), c0654e0.f9636c);
                            valueAnimatorOfFloat2.setDuration(150L);
                            valueAnimatorOfFloat2.addUpdateListener(new C0646a0(mapPage3, i12));
                            valueAnimatorOfFloat2.addListener(new C0652d0(c0654e0, mapPage3));
                            valueAnimatorOfFloat2.start();
                            break;
                        }
                        break;
                }
            }
        });
        Object value5 = mapPage2.f32887v.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((ImageView) value5).setOnClickListener(new View.OnClickListener() { // from class: Uc.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0654e0 c0654e0 = c0654e0T;
                int i12 = 1;
                int i13 = 0;
                switch (i11) {
                    case 0:
                        c0654e0.c();
                        break;
                    default:
                        if (c0654e0.f9639f) {
                            MapPage mapPage3 = c0654e0.f9640g;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(MapPage.p(mapPage3).getTranslationY(), 0.0f);
                            valueAnimatorOfFloat.setDuration(150L);
                            valueAnimatorOfFloat.addUpdateListener(new C0646a0(mapPage3, i13));
                            valueAnimatorOfFloat.start();
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(MapPage.o(mapPage3).getTranslationY(), c0654e0.f9636c);
                            valueAnimatorOfFloat2.setDuration(150L);
                            valueAnimatorOfFloat2.addUpdateListener(new C0646a0(mapPage3, i12));
                            valueAnimatorOfFloat2.addListener(new C0652d0(c0654e0, mapPage3));
                            valueAnimatorOfFloat2.start();
                            break;
                        }
                        break;
                }
            }
        });
        t tVar2 = mapPage2.f32881p;
        Object value6 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        SpannableString spannableString = new SpannableString("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n");
        MapPage mapPage3 = c0654e0T.f9640g;
        C0058e c0058e = new C0058e(17, spannableString, mapPage3);
        c0058e.invoke("1. How to find the exact address of the nearby agent?");
        c0058e.invoke("2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?");
        c0058e.invoke("3. How to get cash after finding the nearby agent?");
        c0058e.invoke("4. What are the benefits of withdrawing cash through PalmPay App?");
        c0058e.invoke("5. What should I do if I see an agent on Nearby Agent but I don't find one?");
        Intrinsics.checkNotNullParameter(mapPage3, "<this>");
        IconicsDrawable iconicsDrawableX = G8.a.x(mapPage3, S6.a.pay_InformationOutline, null, Integer.valueOf(L6.b.ppColorPrimary), 12.0f, 114);
        iconicsDrawableX.setBounds(0, 0, iconicsDrawableX.f23593p, iconicsDrawableX.f23594q);
        spannableString.setSpan(new ImageSpan(iconicsDrawableX, 2), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", "xxxxx", 0, false, 6), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", "xxxxx", 0, false, 6) + 5, 33);
        Intrinsics.checkNotNullParameter("If there’s any address problem, click here to feedback", "line");
        spannableString.setSpan(new C0500c(mapPage3, i7), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", "If there’s any address problem, click here to feedback", 0, false, 6), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", "If there’s any address problem, click here to feedback", 0, false, 6) + 54, 33);
        spannableString.setSpan(new StyleSpan(1), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", "If there’s any address problem, click here to feedback", 0, false, 6), 54 + StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", "If there’s any address problem, click here to feedback", 0, false, 6), 33);
        Unit unit = Unit.f38893a;
        ((TextView) value6).setText(spannableString);
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setMovementMethod(LinkMovementMethod.getInstance());
        Object value8 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((TextView) value8).setHighlightColor(0);
        Object value9 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.d((SingleAdView) value9, Boolean.TRUE);
    }

    public final C0654e0 t() {
        return (C0654e0) this.f32882p0.getValue();
    }
}
