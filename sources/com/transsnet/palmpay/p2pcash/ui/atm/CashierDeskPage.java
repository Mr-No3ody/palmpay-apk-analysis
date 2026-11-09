package com.transsnet.palmpay.p2pcash.ui.atm;

import N8.r;
import Uc.K;
import Uc.M;
import Uc.O;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.p2pcash.bean.req.CreateBizOrderReq;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog;
import com.transsnet.palmpay.util.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/p2p/exchange_cash_cashierdesk")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/CashierDeskPage;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "Uc/O", "Uc/K", "Uc/L", "Uc/P", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierDeskPage extends BaseActivity {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f32844B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f32845A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32852g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32854j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32856p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f32857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f32858w;

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

    public CashierDeskPage() {
        final int i7 = 0;
        this.f32846a = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i7) {
                    case 0:
                        int i10 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i11 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i12 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i13 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i14 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i15 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i16 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i17 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i18 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i19 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i10 = 11;
        this.f32847b = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i10) {
                    case 0:
                        int i11 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i12 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i13 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i14 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i15 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i16 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i17 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i18 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i19 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i110 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i11 = 12;
        this.f32848c = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i11) {
                    case 0:
                        int i12 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i13 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i14 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i15 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i16 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i17 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i18 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i19 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i110 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i111 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i12 = 13;
        this.f32849d = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i12) {
                    case 0:
                        int i13 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i14 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i15 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i16 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i17 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i18 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i19 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i110 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i111 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i112 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i13 = 14;
        this.f32850e = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i13) {
                    case 0:
                        int i14 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i15 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i16 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i17 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i18 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i19 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i110 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i111 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i112 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i113 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i14 = 1;
        this.f32851f = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i14) {
                    case 0:
                        int i15 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i16 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i17 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i18 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i19 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i110 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i111 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i112 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i113 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i114 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i15 = 2;
        this.f32852g = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i15) {
                    case 0:
                        int i16 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i17 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i18 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i19 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i110 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i111 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i112 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i113 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i114 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i115 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i16 = 3;
        this.f32853i = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i16) {
                    case 0:
                        int i17 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i18 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i19 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i110 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i111 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i112 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i113 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i114 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i115 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i116 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i17 = 4;
        this.f32854j = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i17) {
                    case 0:
                        int i18 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i19 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i110 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i111 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i112 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i114 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i115 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i116 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i117 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i18 = 5;
        this.f32855o = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i18) {
                    case 0:
                        int i19 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i110 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i111 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i112 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i114 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i115 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i116 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i117 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i118 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i19 = 6;
        this.f32856p = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i19) {
                    case 0:
                        int i110 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i111 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i114 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i115 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i116 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i117 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i118 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i119 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i20 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i21 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i22 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i23 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i20 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i20) {
                    case 0:
                        int i110 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i111 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i114 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i115 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i116 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i117 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i118 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i119 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i21 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i22 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i23 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i24 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i25 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i21 = 8;
        this.f32857v = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i21) {
                    case 0:
                        int i110 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i111 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i114 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i115 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i116 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i117 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i118 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i119 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i22 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i23 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i24 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i25 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i26 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i22 = 9;
        this.f32858w = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i22) {
                    case 0:
                        int i110 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i111 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i114 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i115 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i116 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i117 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i118 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i119 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i23 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i24 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i25 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i26 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i27 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
        final int i23 = 10;
        this.f32845A = C2131j.b(new Function0(this) { // from class: Uc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierDeskPage f9540b;

            {
                this.f9540b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierDeskPage cashierDeskPage = this.f9540b;
                switch (i23) {
                    case 0:
                        int i110 = CashierDeskPage.f32844B;
                        return Integer.valueOf(cashierDeskPage.getIntent().getIntExtra("TYPE", 1));
                    case 1:
                        int i111 = CashierDeskPage.f32844B;
                        String stringExtra = cashierDeskPage.getIntent().getStringExtra("AGENT_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = CashierDeskPage.f32844B;
                        String stringExtra2 = cashierDeskPage.getIntent().getStringExtra("AGENT_SHOP_ID");
                        return stringExtra2 == null ? "" : stringExtra2;
                    case 3:
                        int i113 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("BOOKING_AMOUNT", 0L));
                    case 4:
                        int i114 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("START_TIME", 0L));
                    case 5:
                        int i115 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("END_TIME", 0L));
                    case 6:
                        int i116 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("NOTES_FLAG", true));
                    case 7:
                        int i117 = CashierDeskPage.f32844B;
                        return new O(cashierDeskPage);
                    case 8:
                        int i118 = CashierDeskPage.f32844B;
                        return new K(cashierDeskPage);
                    case 9:
                        int i119 = CashierDeskPage.f32844B;
                        return new P(cashierDeskPage);
                    case 10:
                        int i24 = CashierDeskPage.f32844B;
                        return new L(cashierDeskPage);
                    case 11:
                        int i25 = CashierDeskPage.f32844B;
                        String stringExtra3 = cashierDeskPage.getIntent().getStringExtra("AGENT_NAME");
                        return stringExtra3 == null ? "" : stringExtra3;
                    case 12:
                        int i26 = CashierDeskPage.f32844B;
                        return Long.valueOf(cashierDeskPage.getIntent().getLongExtra("AMOUNT", 0L));
                    case 13:
                        int i27 = CashierDeskPage.f32844B;
                        return Boolean.valueOf(cashierDeskPage.getIntent().getBooleanExtra("IS_SHOW_CHANGE_LABEL", false));
                    default:
                        int i28 = CashierDeskPage.f32844B;
                        String stringExtra4 = cashierDeskPage.getIntent().getStringExtra("BOOKING_ID");
                        return stringExtra4 == null ? "" : stringExtra4;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final K l() {
        return (K) this.f32857v.getValue();
    }

    public final int m() {
        return ((Number) this.f32846a.getValue()).intValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        int iM = m();
        t tVar = this.f32850e;
        if (iM == 1) {
            O o10 = (O) this.t.getValue();
            String name = (String) this.f32847b.getValue();
            long jLongValue = ((Number) this.f32848c.getValue()).longValue();
            boolean zBooleanValue = ((Boolean) this.f32849d.getValue()).booleanValue();
            String orderId = (String) tVar.getValue();
            o10.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            CashierDeskPage cashierDeskPage = o10.f9582a;
            Intrinsics.checkNotNullParameter(cashierDeskPage, "<this>");
            PayByNoticeDialog payByNoticeDialog = new PayByNoticeDialog(cashierDeskPage);
            payByNoticeDialog.show();
            payByNoticeDialog.setAgentName(name);
            payByNoticeDialog.setAmount(jLongValue);
            payByNoticeDialog.showChangeLabel(zBooleanValue);
            payByNoticeDialog.setOrderId(orderId);
            payByNoticeDialog.setCloseListener(new M(cashierDeskPage, 6));
            payByNoticeDialog.setPay(new M(cashierDeskPage, 0));
            payByNoticeDialog.setDetail(new M(cashierDeskPage, 1));
            return;
        }
        if (iM == 2) {
            l().a((String) tVar.getValue());
            return;
        }
        if (iM != 3) {
            return;
        }
        K kL = l();
        kL.getClass();
        CreateBizOrderReq createBizOrderReq = new CreateBizOrderReq();
        CashierDeskPage cashierDeskPage2 = kL.f9574h;
        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
        createBizOrderReq.agentId = (String) cashierDeskPage2.f32851f.getValue();
        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
        createBizOrderReq.merchantId = (String) cashierDeskPage2.f32852g.getValue();
        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
        createBizOrderReq.bookingMoney = ((Number) cashierDeskPage2.f32853i.getValue()).longValue();
        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
        createBizOrderReq.bookingStartTime = ((Number) cashierDeskPage2.f32854j.getValue()).longValue();
        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
        createBizOrderReq.bookingEndTime = ((Number) cashierDeskPage2.f32855o.getValue()).longValue();
        createBizOrderReq.ipAddress = NetworkUtils.getIPAddress(true);
        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
        createBizOrderReq.flag = ((Boolean) cashierDeskPage2.f32856p.getValue()).booleanValue() ? 1 : 2;
        cashierDeskPage2.showLoadingDialog(true);
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).createBizOrder(createBizOrderReq).k(f.f42629b).i(b.a()).subscribe(new r(4, cashierDeskPage2, kL));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
