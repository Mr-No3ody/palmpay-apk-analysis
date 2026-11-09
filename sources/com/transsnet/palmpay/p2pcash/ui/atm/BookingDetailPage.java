package com.transsnet.palmpay.p2pcash.ui.atm;

import He.a;
import Sc.c;
import Uc.C0651d;
import Uc.C0655f;
import Uc.C0659h;
import Uc.ViewOnClickListenerC0653e;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AgentItemView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointDetailView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.BookingDetailView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.p2pcash.ui.atm.view.TimeCountView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/p2p/exchange_cash_booking_detail")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/BookingDetailPage;", "Lcom/transsnet/palmpay/core/base/h;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Uc/h", "Uc/d", "Uc/i", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BookingDetailPage extends h {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f32801H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f32802A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f32803B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f32804C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32811g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32813j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32815p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f32816v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f32817w;

    public BookingDetailPage() {
        final int i7 = 0;
        this.f32805a = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i7) {
                    case 0:
                        int i10 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i11 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i12 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i13 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i14 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i15 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i16 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i17 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i18 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i19 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i10 = 11;
        this.f32806b = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i10) {
                    case 0:
                        int i11 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i12 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i13 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i14 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i15 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i16 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i17 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i18 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i19 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i110 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i11 = 12;
        this.f32807c = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i11) {
                    case 0:
                        int i12 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i13 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i14 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i15 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i16 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i17 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i18 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i19 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i110 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i111 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i12 = 13;
        this.f32808d = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i12) {
                    case 0:
                        int i13 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i14 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i15 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i16 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i17 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i18 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i19 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i110 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i111 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i112 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i13 = 14;
        this.f32809e = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i13) {
                    case 0:
                        int i14 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i15 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i16 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i17 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i18 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i19 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i110 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i111 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i112 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i113 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i14 = 1;
        this.f32810f = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i14) {
                    case 0:
                        int i15 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i16 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i17 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i18 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i19 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i110 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i111 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i112 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i113 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i114 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i15 = 2;
        this.f32811g = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i15) {
                    case 0:
                        int i16 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i17 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i18 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i19 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i110 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i111 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i112 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i113 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i114 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i115 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i16 = 3;
        this.f32812i = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i16) {
                    case 0:
                        int i17 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i18 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i19 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i110 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i111 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i112 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i113 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i114 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i115 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i116 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i17 = 4;
        this.f32813j = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i17) {
                    case 0:
                        int i18 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i19 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i110 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i111 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i112 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i113 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i114 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i115 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i116 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i117 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i18 = 5;
        this.f32814o = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i18) {
                    case 0:
                        int i19 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i110 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i111 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i112 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i113 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i114 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i115 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i116 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i117 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i118 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i19 = 6;
        this.f32815p = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i19) {
                    case 0:
                        int i110 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i111 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i112 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i113 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i114 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i115 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i116 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i117 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i118 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i119 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i20 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i21 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i22 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i23 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i24 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i20 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i20) {
                    case 0:
                        int i110 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i111 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i112 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i113 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i114 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i115 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i116 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i117 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i118 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i119 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i21 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i22 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i23 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i24 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i25 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i21 = 8;
        this.f32802A = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i21) {
                    case 0:
                        int i110 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i111 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i112 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i113 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i114 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i115 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i116 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i117 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i118 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i119 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i22 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i23 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i24 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i25 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i26 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i22 = 9;
        this.f32803B = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i22) {
                    case 0:
                        int i110 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i111 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i112 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i113 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i114 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i115 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i116 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i117 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i118 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i119 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i23 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i24 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i25 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i26 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i27 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
        final int i23 = 10;
        this.f32804C = C2131j.b(new Function0(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingDetailPage f9613b;

            {
                this.f9613b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingDetailPage bookingDetailPage = this.f9613b;
                switch (i23) {
                    case 0:
                        int i110 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_pay);
                    case 1:
                        int i111 = BookingDetailPage.f32801H;
                        return (AppointDetailView) bookingDetailPage.findViewById(Sc.b.p2p_appointment);
                    case 2:
                        int i112 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_info);
                    case 3:
                        int i113 = BookingDetailPage.f32801H;
                        return (ImageView) bookingDetailPage.findViewById(Sc.b.p2p_arrow);
                    case 4:
                        int i114 = BookingDetailPage.f32801H;
                        return (TextView) bookingDetailPage.findViewById(Sc.b.p2p_status);
                    case 5:
                        int i115 = BookingDetailPage.f32801H;
                        return (TimeCountView) bookingDetailPage.findViewById(Sc.b.p2p_time_count);
                    case 6:
                        int i116 = BookingDetailPage.f32801H;
                        return (PpTitleBar) bookingDetailPage.findViewById(Sc.b.p2p_title);
                    case 7:
                        int i117 = BookingDetailPage.f32801H;
                        return (VerticalSwipeRefreshLayout) bookingDetailPage.findViewById(Sc.b.p2p_refreshLayout);
                    case 8:
                        int i118 = BookingDetailPage.f32801H;
                        return new C0659h(bookingDetailPage);
                    case 9:
                        int i119 = BookingDetailPage.f32801H;
                        return new C0651d(bookingDetailPage);
                    case 10:
                        int i24 = BookingDetailPage.f32801H;
                        return new C0661i(bookingDetailPage);
                    case 11:
                        int i25 = BookingDetailPage.f32801H;
                        return (P2PButton) bookingDetailPage.findViewById(Sc.b.p2p_cancel);
                    case 12:
                        int i26 = BookingDetailPage.f32801H;
                        return (ConstraintLayout) bookingDetailPage.findViewById(Sc.b.p2p_bottom);
                    case 13:
                        int i27 = BookingDetailPage.f32801H;
                        return (BookingDetailView) bookingDetailPage.findViewById(Sc.b.p2p_detail);
                    default:
                        int i28 = BookingDetailPage.f32801H;
                        return (AgentItemView) bookingDetailPage.findViewById(Sc.b.p2p_agent);
                }
            }
        });
    }

    public static final ConstraintLayout m(BookingDetailPage bookingDetailPage) {
        Object value = bookingDetailPage.f32807c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    public static final P2PButton n(BookingDetailPage bookingDetailPage) {
        Object value = bookingDetailPage.f32806b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (P2PButton) value;
    }

    public static final TextView o(BookingDetailPage bookingDetailPage) {
        Object value = bookingDetailPage.f32811g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public static final P2PButton p(BookingDetailPage bookingDetailPage) {
        Object value = bookingDetailPage.f32805a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (P2PButton) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_booking_detail_page;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra = getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f32816v = stringExtra;
        this.f32817w = getIntent().getBooleanExtra("from_page", false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (!this.f32817w) {
            super.onBackPressed();
            return;
        }
        if (ActivityUtils.isActivityExistsInStack((Class<?>) BookingHistoryPage.class)) {
            ActivityUtils.finishToActivity((Class<?>) BookingHistoryPage.class, false);
        } else if (ActivityUtils.isActivityExistsInStack((Class<?>) NearbyAgent2Page.class)) {
            ActivityUtils.finishToActivity((Class<?>) NearbyAgent2Page.class, false);
        } else {
            goBackToHome();
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        startActivity(new Intent(this, (Class<?>) BookingHistoryPage.class));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = s().f33060j;
        ((Handler) aVar.f3865c).removeCallbacksAndMessages(null);
        aVar.f3864b = false;
        org.greenrobot.eventbus.c cVarB = org.greenrobot.eventbus.c.b();
        Intrinsics.checkNotNullParameter(this, "<this>");
        cVarB.l(this);
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("APPOINTMENT_ORDER_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f32816v = stringExtra;
        this.f32817w = intent.getBooleanExtra("from_page", false);
        q().d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_EXCHANGE_CASH_PAY_BALANCE.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_EXCHANGE_CASH_ORDER_RECEIVING.equals(pushMessage.content.messageType)) {
            q().d();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        q().d();
    }

    public final C0651d q() {
        return (C0651d) this.f32803B.getValue();
    }

    public final C0659h r() {
        return (C0659h) this.f32802A.getValue();
    }

    public final TimeCountView s() {
        Object value = this.f32814o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TimeCountView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c cVarB = org.greenrobot.eventbus.c.b();
        Intrinsics.checkNotNullParameter(this, "<this>");
        cVarB.j(this);
        BarUtils.setStatusBarLightMode((Activity) this, true);
        BookingDetailPage bookingDetailPage = r().f9648a;
        Object value = bookingDetailPage.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((VerticalSwipeRefreshLayout) value).setOnRefreshListener(new C0655f(bookingDetailPage, 0));
        BookingDetailPage bookingDetailPage2 = r().f9648a;
        Object value2 = bookingDetailPage2.f32815p.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setBackButtonClickListener(new ViewOnClickListenerC0653e(bookingDetailPage2, 0));
        BookingDetailPage bookingDetailPage3 = r().f9648a;
        Object value3 = bookingDetailPage3.f32812i.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        p220oa.h.d((ImageView) value3);
        Object value4 = bookingDetailPage3.f32810f.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        AppointDetailView appointDetailView = (AppointDetailView) value4;
        appointDetailView.f32948c.setVisibility(4);
        appointDetailView.f32953i.setVisibility(4);
        Object value5 = bookingDetailPage3.f32809e.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        AgentItemView agentItemView = (AgentItemView) value5;
        agentItemView.f32938d.setVisibility(4);
        agentItemView.f32939e.setVisibility(4);
    }
}
