package com.transsnet.palmpay.p2pcash.ui.atm;

import L6.b;
import Sc.c;
import Uc.C0664j0;
import Uc.C0666k0;
import Uc.o0;
import Uc.p0;
import Uc.q0;
import Uc.u0;
import Uc.v0;
import Uc.w0;
import Uc.x0;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PEmptyView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PPositionSelectorView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/p2p/nearby_agent_real")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/NearbyAgent2Page;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "Uc/w0", "Uc/o0", "Uc/p0", "Uc/x0", "Uc/j0", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NearbyAgent2Page extends BaseActivity {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f32889k0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f32890A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f32891B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f32892C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f32893H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f32894L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f32895M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f32896Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f32897X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f32898Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f32899Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32906g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32908j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32910p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f32911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f32912w;

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

    public NearbyAgent2Page() {
        final int i7 = 0;
        this.f32900a = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i7) {
                    case 0:
                        int i10 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i11 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i12 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i13 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i14 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i15 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i10 = 2;
        this.f32901b = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i10) {
                    case 0:
                        int i11 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i12 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i13 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i14 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i15 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i11 = 7;
        this.f32902c = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i11) {
                    case 0:
                        int i12 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i13 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i14 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i15 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i12 = 8;
        this.f32903d = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i12) {
                    case 0:
                        int i13 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i14 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i15 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i13 = 9;
        this.f32904e = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i13) {
                    case 0:
                        int i14 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i15 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i14 = 10;
        this.f32905f = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i14) {
                    case 0:
                        int i15 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i15 = 12;
        this.f32906g = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i15) {
                    case 0:
                        int i16 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i16 = 13;
        this.f32907i = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i16) {
                    case 0:
                        int i17 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i17 = 14;
        this.f32908j = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i17) {
                    case 0:
                        int i18 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i18 = 15;
        this.f32909o = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i18) {
                    case 0:
                        int i19 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i19 = 11;
        this.f32910p = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i19) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i20 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i20 = 16;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i20) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i21 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i21 = 17;
        this.f32911v = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i21) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i22 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i22 = 18;
        this.f32912w = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i22) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i23 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i23 = 19;
        this.f32890A = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i23) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i24 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i24 = 20;
        this.f32891B = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i24) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i25 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i25 = 21;
        this.f32892C = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i25) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i26 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i26 = 22;
        this.f32893H = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i26) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i27 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i27 = 23;
        this.f32894L = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i27) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i28 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i217 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i28 = 1;
        this.f32895M = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i28) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i29 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i217 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i218 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i29 = 3;
        this.f32896Q = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i29) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i217 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i218 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i219 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i30 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i30 = 4;
        this.f32897X = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i30) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i217 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i218 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i219 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i31 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i34 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i31 = 5;
        this.f32898Y = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i31) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i217 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i218 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i219 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i32 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i34 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i35 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
        final int i32 = 6;
        this.f32899Z = C2131j.b(new Function0(this) { // from class: Uc.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NearbyAgent2Page f9647b;

            {
                this.f9647b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NearbyAgent2Page nearbyAgent2Page = this.f9647b;
                switch (i32) {
                    case 0:
                        int i110 = NearbyAgent2Page.f32889k0;
                        return (SingleAdView) nearbyAgent2Page.findViewById(Sc.b.p2p_ad_test);
                    case 1:
                        int i111 = NearbyAgent2Page.f32889k0;
                        return new o0(nearbyAgent2Page);
                    case 2:
                        int i112 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_change_label);
                    case 3:
                        int i113 = NearbyAgent2Page.f32889k0;
                        return new x0(nearbyAgent2Page);
                    case 4:
                        int i114 = NearbyAgent2Page.f32889k0;
                        return new p0(nearbyAgent2Page);
                    case 5:
                        int i115 = NearbyAgent2Page.f32889k0;
                        return nearbyAgent2Page.registerForActivityResult(new V3.a(4), new G9.i(nearbyAgent2Page, 1));
                    case 6:
                        int i116 = NearbyAgent2Page.f32889k0;
                        return new C0664j0(nearbyAgent2Page);
                    case 7:
                        int i117 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close2);
                    case 8:
                        int i118 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_btn);
                    case 9:
                        int i119 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_payment_amount);
                    case 10:
                        int i210 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_pay_info);
                    case 11:
                        int i211 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_missed_symbol);
                    case 12:
                        int i212 = NearbyAgent2Page.f32889k0;
                        return (ImageView) nearbyAgent2Page.findViewById(Sc.b.p2p_l_close);
                    case 13:
                        int i213 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_view);
                    case 14:
                        int i214 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_code);
                    case 15:
                        int i215 = NearbyAgent2Page.f32889k0;
                        return (TextView) nearbyAgent2Page.findViewById(Sc.b.p2p_time);
                    case 16:
                        int i216 = NearbyAgent2Page.f32889k0;
                        return (CardView) nearbyAgent2Page.findViewById(Sc.b.p2p_booking_info);
                    case 17:
                        int i217 = NearbyAgent2Page.f32889k0;
                        return (P2PEmptyView) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view2);
                    case 18:
                        int i218 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_empty_view);
                    case 19:
                        int i219 = NearbyAgent2Page.f32889k0;
                        return (SwipeRecyclerView) nearbyAgent2Page.findViewById(Sc.b.p2p_list);
                    case 20:
                        int i33 = NearbyAgent2Page.f32889k0;
                        return (P2PPositionSelectorView) nearbyAgent2Page.findViewById(Sc.b.p2p_selector);
                    case 21:
                        int i34 = NearbyAgent2Page.f32889k0;
                        return (FrameLayout) nearbyAgent2Page.findViewById(Sc.b.p2p_location);
                    case 22:
                        int i35 = NearbyAgent2Page.f32889k0;
                        return (PpTitleBar) nearbyAgent2Page.findViewById(Sc.b.p2p_title);
                    default:
                        int i36 = NearbyAgent2Page.f32889k0;
                        return new w0(nearbyAgent2Page);
                }
            }
        });
    }

    public static final SwipeRecyclerView l(NearbyAgent2Page nearbyAgent2Page) {
        Object value = nearbyAgent2Page.f32890A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SwipeRecyclerView) value;
    }

    public static final PpTitleBar m(NearbyAgent2Page nearbyAgent2Page) {
        Object value = nearbyAgent2Page.f32893H.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_nearby_agent2_page_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final o0 n() {
        return (o0) this.f32895M.getValue();
    }

    public final p0 o() {
        return (p0) this.f32897X.getValue();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 16705 && o().a()) {
            Object value = p().f9734b.f32892C.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            h.c((FrameLayout) value);
            n().b();
            n().d(1);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 407) {
            n().c();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_EXCHANGE_CASH_PAY_BALANCE.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_EXCHANGE_CASH_ORDER_RECEIVING.equals(pushMessage.content.messageType)) {
            n().c();
        }
    }

    public final w0 p() {
        return (w0) this.f32894L.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n().d(1);
        n().c();
    }

    public final x0 q() {
        return (x0) this.f32896Q.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        ((androidx.activity.result.a) this.f32898Y.getValue()).toString();
        w0 w0VarP = p();
        Object value = w0VarP.f9734b.f32900a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((SingleAdView) value).setAdListener(new v0(w0VarP));
        w0 w0VarP2 = p();
        int i7 = b.ppColorBackgroundLight;
        NearbyAgent2Page nearbyAgent2Page = w0VarP2.f9734b;
        nearbyAgent2Page.initStatusBar(nearbyAgent2Page.getColor(i7));
        m(nearbyAgent2Page).setBackButtonClickListener(new q0(nearbyAgent2Page, 1));
        m(nearbyAgent2Page).setRightImageView1ClickListener(new q0(nearbyAgent2Page, 2));
        m(nearbyAgent2Page).setRightImageView1Icon(S6.a.pay_TransactionHistory);
        m(nearbyAgent2Page).setRightImageView2ClickListener(new q0(nearbyAgent2Page, 3));
        m(nearbyAgent2Page).setRightImageView2Icon(S6.a.pay_Map);
        w0 w0VarP3 = p();
        w0VarP3.getClass();
        NearbyAgent2Page nearbyAgent2Page2 = w0VarP3.f9734b;
        if (nearbyAgent2Page2.o().a()) {
            nearbyAgent2Page2.n().b();
        } else {
            Object value2 = nearbyAgent2Page2.f32892C.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            h.C((FrameLayout) value2);
            androidx.activity.result.a aVar = (androidx.activity.result.a) nearbyAgent2Page2.f32898Y.getValue();
            String strJ = d.j();
            Intrinsics.checkNotNullExpressionValue(strJ, "getLocationPermission(...)");
            aVar.a(strJ);
        }
        Object value3 = nearbyAgent2Page2.f32892C.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((FrameLayout) value3).setOnClickListener(new q0(w0VarP3, nearbyAgent2Page2));
        NearbyAgent2Page nearbyAgent2Page3 = p().f9734b;
        Object value4 = nearbyAgent2Page3.f32891B.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((P2PPositionSelectorView) value4).setOnAreaChangedListener(new C0666k0(nearbyAgent2Page3));
        NearbyAgent2Page nearbyAgent2Page4 = p().f9734b;
        RecyclerView recyclerView = l(nearbyAgent2Page4).getRecyclerView();
        Intrinsics.checkNotNullParameter(nearbyAgent2Page4, "<this>");
        recyclerView.setLayoutManager(new LinearLayoutManager(nearbyAgent2Page4));
        l(nearbyAgent2Page4).setRefreshEnable(true);
        l(nearbyAgent2Page4).setLoadMoreEnable(true);
        l(nearbyAgent2Page4).setOnLoadListener(new u0(nearbyAgent2Page4));
        SwipeRecyclerView swipeRecyclerViewL = l(nearbyAgent2Page4);
        Object value5 = nearbyAgent2Page4.f32912w.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        swipeRecyclerViewL.setEmptyView((FrameLayout) value5);
        l(nearbyAgent2Page4).setAdapter((C0664j0) nearbyAgent2Page4.f32899Z.getValue());
        Object value6 = p().f9734b.f32911v.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        P2PEmptyView p2PEmptyView = (P2PEmptyView) value6;
        p2PEmptyView.setImg(r.cv_empty_no_agent);
        p2PEmptyView.setTx1("No Available Agent Nearby");
        p2PEmptyView.setTx2("Agents are currently not available. Please check back later.");
    }
}
