package com.transsnet.palmpay.p2pcash.ui.atm;

import A8.g;
import Pa.C0525w;
import Pa.H;
import Pa.a0;
import Pa.r0;
import Sc.c;
import Tc.a;
import Uc.C;
import Uc.C0679x;
import Uc.C0681z;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.p2pcash.bean.rsp.CommonMoneyListResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;
import df.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p220oa.h;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/BookingNotesPage;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Uc/C", "Uc/z", "Uc/D", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BookingNotesPage extends BaseActivity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f32830A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32837g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32839j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32841p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f32842v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f32843w;

    public BookingNotesPage() {
        final int i7 = 0;
        this.f32831a = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i7) {
                    case 0:
                        int i10 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i11 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i12 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i13 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i14 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i15 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i16 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i17 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i18 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i19 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i10 = 9;
        this.f32832b = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i10) {
                    case 0:
                        int i11 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i12 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i13 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i14 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i15 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i16 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i17 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i18 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i19 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i110 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i11 = 10;
        this.f32833c = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i11) {
                    case 0:
                        int i12 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i13 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i14 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i15 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i16 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i17 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i18 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i19 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i110 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i111 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i12 = 11;
        this.f32834d = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i12) {
                    case 0:
                        int i13 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i14 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i15 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i16 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i17 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i18 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i19 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i110 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i111 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i112 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i13 = 12;
        this.f32835e = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i13) {
                    case 0:
                        int i14 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i15 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i16 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i17 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i18 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i19 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i110 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i111 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i112 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i113 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i14 = 13;
        this.f32836f = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i14) {
                    case 0:
                        int i15 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i16 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i17 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i18 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i19 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i110 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i111 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i112 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i113 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i114 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i15 = 1;
        this.f32837g = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i15) {
                    case 0:
                        int i16 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i17 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i18 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i19 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i110 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i111 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i112 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i113 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i114 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i115 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i16 = 2;
        this.f32838i = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i16) {
                    case 0:
                        int i17 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i18 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i19 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i110 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i112 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i113 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i114 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i115 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i116 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i17 = 3;
        this.f32839j = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i17) {
                    case 0:
                        int i18 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i19 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i110 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i112 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i113 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i114 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i115 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i116 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i117 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i18 = 4;
        this.f32840o = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i18) {
                    case 0:
                        int i19 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i110 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i112 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i113 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i114 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i115 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i116 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i117 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i118 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i19 = 5;
        this.f32841p = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i19) {
                    case 0:
                        int i110 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i112 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i113 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i114 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i115 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i116 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i117 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i118 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i119 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i20 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i21 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i22 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i23 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i20 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i20) {
                    case 0:
                        int i110 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i112 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i113 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i114 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i115 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i116 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i117 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i118 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i119 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i21 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i22 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i23 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i24 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i21 = 7;
        this.f32842v = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i21) {
                    case 0:
                        int i110 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i112 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i113 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i114 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i115 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i116 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i117 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i118 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i119 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i22 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i23 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i24 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i25 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
        final int i22 = 8;
        this.f32843w = C2131j.b(new Function0(this) { // from class: Uc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingNotesPage f9729b;

            {
                this.f9729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingNotesPage bookingNotesPage = this.f9729b;
                switch (i22) {
                    case 0:
                        int i110 = BookingNotesPage.f32830A;
                        return (LinearLayout) bookingNotesPage.findViewById(Sc.b.p2p_about_m);
                    case 1:
                        int i111 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_distance);
                    case 2:
                        int i112 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_address);
                    case 3:
                        int i113 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_change);
                    case 4:
                        int i114 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_agent_name);
                    case 5:
                        int i115 = BookingNotesPage.f32830A;
                        String stringExtra = bookingNotesPage.getIntent().getStringExtra("MAP_DATA");
                        return stringExtra == null ? "{}" : stringExtra;
                    case 6:
                        int i116 = BookingNotesPage.f32830A;
                        return new C(bookingNotesPage);
                    case 7:
                        int i117 = BookingNotesPage.f32830A;
                        return new C0681z(bookingNotesPage);
                    case 8:
                        int i118 = BookingNotesPage.f32830A;
                        return new D(bookingNotesPage);
                    case 9:
                        int i119 = BookingNotesPage.f32830A;
                        return (P2PButton) bookingNotesPage.findViewById(Sc.b.p2p_next);
                    case 10:
                        int i23 = BookingNotesPage.f32830A;
                        return (TextView) bookingNotesPage.findViewById(Sc.b.p2p_switch_info);
                    case 11:
                        int i24 = BookingNotesPage.f32830A;
                        return (SwitchCompat) bookingNotesPage.findViewById(Sc.b.p2p_switch);
                    case 12:
                        int i25 = BookingNotesPage.f32830A;
                        return (ConstraintLayout) bookingNotesPage.findViewById(Sc.b.p2p_note_switch_module);
                    default:
                        int i26 = BookingNotesPage.f32830A;
                        return (P2PInputAmountView) bookingNotesPage.findViewById(Sc.b.p2p_input);
                }
            }
        });
    }

    public static final TextView l(BookingNotesPage bookingNotesPage) {
        Object value = bookingNotesPage.f32837g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public static final P2PInputAmountView m(BookingNotesPage bookingNotesPage) {
        Object value = bookingNotesPage.f32836f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (P2PInputAmountView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_booking_notes_page_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final C0681z n() {
        return (C0681z) this.f32842v.getValue();
    }

    public final C o() {
        return (C) this.t.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        C0681z c0681zN = n();
        c0681zN.getClass();
        String strB = H.b("commonMoneyList");
        d.d(r0.H1(CommonMoneyListResp.class, strB), ((IApiP2PCashService) a.f9070a.f41176b).commonMoneyList().c(new a0(strB, 0))).k(f.f42629b).i(b.a()).subscribe(new C0679x(c0681zN.f9747e, c0681zN));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        C0681z c0681zN = n();
        C0525w c0525wF = C0525w.f();
        String str = (String) this.f32841p.getValue();
        c0525wF.getClass();
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = (ShopHomeByMemberIdResp.NearbyShopListBean) C0525w.d(str, ShopHomeByMemberIdResp.NearbyShopListBean.class);
        c0681zN.getClass();
        Intrinsics.checkNotNullParameter(nearbyShopListBean, "<set-?>");
        c0681zN.f9743a = nearbyShopListBean;
        C cO = o();
        int i7 = L6.b.ppColorBackgroundLight;
        BookingNotesPage bookingNotesPage = cO.f9534a;
        bookingNotesPage.initStatusBar(bookingNotesPage.getColor(i7));
        BookingNotesPage bookingNotesPage2 = o().f9534a;
        Object value = bookingNotesPage2.f32840o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(bookingNotesPage2.n().a().networkName);
        Object value2 = bookingNotesPage2.f32838i.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(bookingNotesPage2.n().a().networkAddress);
        if (bookingNotesPage2.n().a().distance == 0.0d) {
            h.c(l(bookingNotesPage2));
        } else {
            h.C(l(bookingNotesPage2));
            if (bookingNotesPage2.n().a().distance >= 1.0d) {
                TextView textViewL = l(bookingNotesPage2);
                String str2 = String.format("%.2fkm", Arrays.copyOf(new Object[]{Double.valueOf(bookingNotesPage2.n().a().distance)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textViewL.setText(str2);
            } else {
                TextView textViewL2 = l(bookingNotesPage2);
                String str3 = String.format("%dm", Arrays.copyOf(new Object[]{Integer.valueOf((int) (bookingNotesPage2.n().a().distance * ((double) 1000)))}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                textViewL2.setText(str3);
            }
        }
        Object value3 = bookingNotesPage2.f32839j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setOnClickListener(new R8.d(bookingNotesPage2, 27));
        C cO2 = o();
        cO2.getClass();
        BookingNotesPage bookingNotesPage3 = cO2.f9534a;
        boolean z3 = bookingNotesPage3.n().a().newNotes;
        t tVar = bookingNotesPage3.f32835e;
        if (z3) {
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            h.C((ConstraintLayout) value4);
            Object value5 = bookingNotesPage3.f32834d.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((SwitchCompat) value5).setOnCheckedChangeListener(new g(bookingNotesPage3, 4));
        } else {
            Object value6 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            h.c((ConstraintLayout) value6);
        }
        C cO3 = o();
        Object value7 = cO3.f9534a.f32831a.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((LinearLayout) value7).setOnClickListener(new R8.d(cO3, 26));
    }
}
