package com.transsnet.palmpay.p2pcash.ui.atm;

import N8.r;
import R3.e;
import Sc.c;
import Tc.a;
import Uc.A0;
import Uc.C0;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/ReasonForCancellationPage;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Uc/C0", "Uc/A0", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReasonForCancellationPage extends BaseActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f32913j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32920g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32921i;

    public ReasonForCancellationPage() {
        final int i7 = 0;
        this.f32914a = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i7) {
                    case 0:
                        int i10 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i11 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i12 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i13 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i14 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i15 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i16 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i10 = 1;
        this.f32915b = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i10) {
                    case 0:
                        int i11 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i12 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i13 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i14 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i15 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i16 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i18 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i11 = 2;
        this.f32916c = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i11) {
                    case 0:
                        int i12 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i13 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i14 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i15 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i16 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i17 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i18 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i19 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i12 = 3;
        this.f32917d = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i12) {
                    case 0:
                        int i13 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i14 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i15 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i16 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i18 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i19 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i110 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i13 = 4;
        this.f32918e = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i13) {
                    case 0:
                        int i14 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i15 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i16 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i18 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i19 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i110 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i111 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i14 = 5;
        this.f32919f = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i14) {
                    case 0:
                        int i15 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i16 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i18 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i19 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i110 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i111 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i112 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i15 = 6;
        this.f32920g = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i15) {
                    case 0:
                        int i16 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i18 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i19 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i110 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i111 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i112 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i113 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
        final int i16 = 7;
        this.f32921i = C2131j.b(new Function0(this) { // from class: Uc.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForCancellationPage f9741b;

            {
                this.f9741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReasonForCancellationPage reasonForCancellationPage = this.f9741b;
                switch (i16) {
                    case 0:
                        int i17 = ReasonForCancellationPage.f32913j;
                        return (P2PButton) reasonForCancellationPage.findViewById(Sc.b.p2p_confirm);
                    case 1:
                        int i18 = ReasonForCancellationPage.f32913j;
                        return (TextView) reasonForCancellationPage.findViewById(Sc.b.p2p_count);
                    case 2:
                        int i19 = ReasonForCancellationPage.f32913j;
                        return (AppCompatEditText) reasonForCancellationPage.findViewById(Sc.b.p2p_edit);
                    case 3:
                        int i110 = ReasonForCancellationPage.f32913j;
                        return (CardView) reasonForCancellationPage.findViewById(Sc.b.p2p_other_reason_edit);
                    case 4:
                        int i111 = ReasonForCancellationPage.f32913j;
                        return (LinearLayout) reasonForCancellationPage.findViewById(Sc.b.p2p_reasons);
                    case 5:
                        int i112 = ReasonForCancellationPage.f32913j;
                        String stringExtra = reasonForCancellationPage.getIntent().getStringExtra("APPOINTMENT_ORDER_ID");
                        return stringExtra == null ? "" : stringExtra;
                    case 6:
                        int i113 = ReasonForCancellationPage.f32913j;
                        return new C0(reasonForCancellationPage);
                    default:
                        int i114 = ReasonForCancellationPage.f32913j;
                        return new A0(reasonForCancellationPage);
                }
            }
        });
    }

    public static final P2PButton l(ReasonForCancellationPage reasonForCancellationPage) {
        Object value = reasonForCancellationPage.f32914a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (P2PButton) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_reason_for_cancellation_page_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final A0 m() {
        return (A0) this.f32921i.getValue();
    }

    public final C0 n() {
        return (C0) this.f32920g.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        A0 a0M = m();
        a0M.getClass();
        ((IApiP2PCashService) a.f9070a.f41176b).queryCancelOrderReason().k(f.f42629b).i(b.a()).subscribe(new r(5, a0M.f9529d, a0M));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        n().b();
        ReasonForCancellationPage reasonForCancellationPage = n().f9535a;
        t tVar = reasonForCancellationPage.f32916c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((AppCompatEditText) value).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(200)});
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((AppCompatEditText) value2).addTextChangedListener(new e(reasonForCancellationPage, 7));
        Object value3 = reasonForCancellationPage.f32915b.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText("0/200");
    }
}
