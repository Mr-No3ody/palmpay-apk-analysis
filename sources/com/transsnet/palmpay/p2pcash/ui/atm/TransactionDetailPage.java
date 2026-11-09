package com.transsnet.palmpay.p2pcash.ui.atm;

import Pa.i0;
import Sc.c;
import Uc.E0;
import Uc.F0;
import Uc.H0;
import Uc.I0;
import Uc.L0;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/p2p/exchange_cash_transaction_detail")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/TransactionDetailPage;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "Uc/L0", "Uc/H0", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionDetailPage extends BaseActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f32922v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32929g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32931j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32933p;
    public final t t;

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

    public TransactionDetailPage() {
        final int i7 = 0;
        this.f32923a = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i7) {
                    case 0:
                        int i10 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i11 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i12 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i13 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i14 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i15 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i16 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i17 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i18 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i19 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i10 = 5;
        this.f32924b = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i10) {
                    case 0:
                        int i11 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i12 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i13 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i14 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i15 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i16 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i17 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i18 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i19 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i110 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i11 = 6;
        this.f32925c = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i11) {
                    case 0:
                        int i12 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i13 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i14 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i15 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i16 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i17 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i18 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i19 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i110 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i111 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i12 = 7;
        this.f32926d = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i12) {
                    case 0:
                        int i13 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i14 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i15 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i16 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i17 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i18 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i19 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i110 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i111 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i112 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i13 = 8;
        this.f32927e = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i13) {
                    case 0:
                        int i14 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i15 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i16 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i17 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i18 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i19 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i110 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i111 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i112 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i113 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i14 = 9;
        this.f32928f = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i14) {
                    case 0:
                        int i15 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i16 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i17 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i18 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i19 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i110 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i111 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i112 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i113 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i114 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i15 = 10;
        this.f32929g = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i15) {
                    case 0:
                        int i16 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i17 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i18 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i19 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i110 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i111 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i112 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i113 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i114 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i115 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i16 = 11;
        this.f32930i = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i16) {
                    case 0:
                        int i17 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i18 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i19 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i110 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i111 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i112 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i113 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i114 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i115 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i116 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i17 = 1;
        this.f32931j = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i17) {
                    case 0:
                        int i18 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i19 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i110 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i111 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i112 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i113 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i114 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i115 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i116 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i117 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i18 = 2;
        this.f32932o = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i18) {
                    case 0:
                        int i19 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i110 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i111 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i112 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i113 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i114 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i115 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i116 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i117 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i118 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i19 = 3;
        this.f32933p = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i19) {
                    case 0:
                        int i110 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i111 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i113 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i114 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i115 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i116 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i117 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i118 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i119 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i20 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i21 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
        final int i20 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailPage f9538b;

            {
                this.f9538b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailPage transactionDetailPage = this.f9538b;
                switch (i20) {
                    case 0:
                        int i110 = TransactionDetailPage.f32922v;
                        return (OrderResultCustomerServiceModel) transactionDetailPage.findViewById(Sc.b.p2p_service);
                    case 1:
                        int i111 = TransactionDetailPage.f32922v;
                        String stringExtra = transactionDetailPage.getIntent().getStringExtra("transType");
                        return stringExtra == null ? "" : stringExtra;
                    case 2:
                        int i112 = TransactionDetailPage.f32922v;
                        return Boolean.valueOf(transactionDetailPage.getIntent().getBooleanExtra("from_page", false));
                    case 3:
                        int i113 = TransactionDetailPage.f32922v;
                        return new L0(transactionDetailPage);
                    case 4:
                        int i114 = TransactionDetailPage.f32922v;
                        return new H0(transactionDetailPage);
                    case 5:
                        int i115 = TransactionDetailPage.f32922v;
                        return (LinearLayout) transactionDetailPage.findViewById(Sc.b.p2p_data_container);
                    case 6:
                        int i116 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_status_tx);
                    case 7:
                        int i117 = TransactionDetailPage.f32922v;
                        return (ImageView) transactionDetailPage.findViewById(Sc.b.p2p_status_logo);
                    case 8:
                        int i118 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_amount);
                    case 9:
                        int i119 = TransactionDetailPage.f32922v;
                        return (TextView) transactionDetailPage.findViewById(Sc.b.p2p_transaction_name);
                    case 10:
                        int i21 = TransactionDetailPage.f32922v;
                        return (PpTitleBar) transactionDetailPage.findViewById(Sc.b.p2p_title);
                    default:
                        int i22 = TransactionDetailPage.f32922v;
                        String stringExtra2 = transactionDetailPage.getIntent().getStringExtra("orderNo");
                        return stringExtra2 == null ? "" : stringExtra2;
                }
            }
        });
    }

    public static final LinearLayout l(TransactionDetailPage transactionDetailPage) {
        Object value = transactionDetailPage.f32924b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public static final ImageView m(TransactionDetailPage transactionDetailPage) {
        Object value = transactionDetailPage.f32926d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public static final TextView n(TransactionDetailPage transactionDetailPage) {
        Object value = transactionDetailPage.f32925c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_transaction_detail_page_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final H0 o() {
        return (H0) this.t.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (((Boolean) this.f32932o.getValue()).booleanValue()) {
            i0.H(null);
        } else {
            super.onBackPressed();
        }
    }

    public final L0 p() {
        return (L0) this.f32933p.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String strQ = q();
        if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT)) {
            H0 h0O = o();
            h0O.getClass();
            IApiP2PCashService iApiP2PCashService = (IApiP2PCashService) Tc.a.f9070a.f41176b;
            TransactionDetailPage transactionDetailPage = h0O.f9556c;
            iApiP2PCashService.queryAppointmentDetail((String) transactionDetailPage.f32930i.getValue()).k(f.f42629b).i(b.a()).subscribe(new E0(transactionDetailPage, h0O));
            return;
        }
        if (Intrinsics.c(strQ, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT)) {
            H0 h0O2 = o();
            h0O2.getClass();
            IApiP2PCashService iApiP2PCashService2 = (IApiP2PCashService) Tc.a.f9070a.f41176b;
            TransactionDetailPage transactionDetailPage2 = h0O2.f9556c;
            iApiP2PCashService2.queryBalancePaymentDetail((String) transactionDetailPage2.f32930i.getValue()).k(f.f42629b).i(b.a()).subscribe(new F0(transactionDetailPage2, h0O2));
        }
    }

    public final String q() {
        return (String) this.f32931j.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        L0 l0P = p();
        int i7 = L6.b.ppColorBackgroundDark;
        TransactionDetailPage transactionDetailPage = l0P.f9577a;
        transactionDetailPage.initStatusBar(transactionDetailPage.getColor(i7));
        Intrinsics.checkNotNullParameter(transactionDetailPage, "<this>");
        BarUtils.setStatusBarLightMode((Activity) transactionDetailPage, true);
        Object value = transactionDetailPage.f32929g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setBackButtonClickListener(new I0(transactionDetailPage, 0));
    }
}
