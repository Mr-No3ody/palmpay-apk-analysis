package com.transsnet.palmpay.credit.ui.activity;

import S3.c;
import Ya.e;
import Ya.f;
import Za.b;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.req.GetRecentMerchantsReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import p141j9.B;
import p220oa.h;
import p270rd.C1976t;
import p284sb.Q;
import p284sb.T;
import p284sb.U;
import p284sb.W;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/SearchMIDActivity;", "LZa/b;", "<init>", "()V", "a", "sb/W", "sb/T", "sb/X", "sb/P", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSearchMIDActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchMIDActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/SearchMIDActivity\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,410:1\n51#2,3:411\n*S KotlinDebug\n*F\n+ 1 SearchMIDActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/SearchMIDActivity\n*L\n68#1:411,3\n*E\n"})
public final class SearchMIDActivity extends b {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28782Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28783A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28785C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f28787L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28792g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28794j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28796p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28798w;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28784B = C2131j.b(new C1976t(6));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28786H = C2131j.b(new C1976t(7));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final c f28788M = new c(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r rVar = new r("inputStr", "getInputStr()Ljava/lang/String;", SearchMIDActivity.class);
        G.f38952a.getClass();
        f28782Q = new KProperty[]{rVar};
        new a(null);
    }

    public SearchMIDActivity() {
        final int i7 = 0;
        this.f28789d = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i7) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i10 = 9;
        this.f28790e = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i10) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i11 = 10;
        this.f28791f = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i11) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i12 = 11;
        this.f28792g = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i12) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i13 = 12;
        this.f28793i = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i13) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i14 = 1;
        this.f28794j = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i14) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i15 = 2;
        this.f28795o = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i15) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i16 = 3;
        this.f28796p = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i16) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i17 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i17) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i18 = 5;
        this.f28797v = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i18) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i19 = 6;
        this.f28798w = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i19) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i20 = 7;
        this.f28783A = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i20) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
        final int i21 = 8;
        this.f28785C = C2131j.b(new Function0(this) { // from class: sb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchMIDActivity f42133b;

            {
                this.f42133b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchMIDActivity searchMIDActivity = this.f42133b;
                switch (i21) {
                    case 0:
                        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                        return (DigitalKeyboardView) searchMIDActivity.findViewById(e.cai_keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = SearchMIDActivity.f28782Q;
                        return (ImageView) searchMIDActivity.findViewById(e.cs_clear_input);
                    case 2:
                        KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cursor);
                    case 3:
                        KProperty[] kPropertyArr4 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_input_tx);
                    case 4:
                        KProperty[] kPropertyArr5 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_hint_tx);
                    case 5:
                        KProperty[] kPropertyArr6 = SearchMIDActivity.f28782Q;
                        return new W(searchMIDActivity);
                    case 6:
                        KProperty[] kPropertyArr7 = SearchMIDActivity.f28782Q;
                        return new T(searchMIDActivity);
                    case 7:
                        KProperty[] kPropertyArr8 = SearchMIDActivity.f28782Q;
                        return new X(searchMIDActivity);
                    case 8:
                        KProperty[] kPropertyArr9 = SearchMIDActivity.f28782Q;
                        return new P(searchMIDActivity);
                    case 9:
                        KProperty[] kPropertyArr10 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_scan_merchant_qr_code);
                    case 10:
                        KProperty[] kPropertyArr11 = SearchMIDActivity.f28782Q;
                        return (RecyclerView) searchMIDActivity.findViewById(e.cab_recent_shop_list);
                    case 11:
                        KProperty[] kPropertyArr12 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cab_recent_tx);
                    default:
                        KProperty[] kPropertyArr13 = SearchMIDActivity.f28782Q;
                        return (TextView) searchMIDActivity.findViewById(e.cs_cancel_btn);
                }
            }
        });
    }

    public static final TextView m(SearchMIDActivity searchMIDActivity) {
        Object value = searchMIDActivity.f28795o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_search_mid_activity_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final String n() {
        return (String) this.f28788M.getValue(this, f28782Q[0]);
    }

    public final T o() {
        return (T) this.f28798w.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        SearchMIDActivity searchMIDActivity = p().f42144a;
        ((Handler) searchMIDActivity.f28784B.getValue()).postDelayed(new B(searchMIDActivity, 15), 500L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onStop() {
        super.onStop();
        SearchMIDActivity searchMIDActivity = p().f42144a;
        h.c(m(searchMIDActivity));
        ((Handler) searchMIDActivity.f28784B.getValue()).removeCallbacksAndMessages(null);
    }

    public final W p() {
        return (W) this.f28797v.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        T tO = o();
        tO.getClass();
        ((PayApiService) p324va.c.f43141a.f14621b).getRecentMerchants(new GetRecentMerchantsReq()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Q(tO.f42140a));
    }

    public final void q(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f28788M.setValue(this, f28782Q[0], str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        W wP = p();
        wP.getClass();
        wP.f42144a.initStatusBar(-1, true);
        SearchMIDActivity searchMIDActivity = p().f42144a;
        Object value = searchMIDActivity.f28793i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.l(new U(searchMIDActivity, 0), (TextView) value);
        SearchMIDActivity searchMIDActivity2 = p().f42144a;
        Object value2 = searchMIDActivity2.f28790e.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.l(new U(searchMIDActivity2, 1), (TextView) value2);
        p().a("");
    }
}
