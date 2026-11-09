package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Pa.r0;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLUpGradeInstallmentAccountActivity;
import df.d;
import df.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p285sc.x;
import p294tb.x0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit大额分期账户升级页", path = "/credit_score/ol_upgrade_installment_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLUpGradeInstallmentAccountActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/cashloan/a;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLUpGradeInstallmentAccountActivity extends a {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f29173v0 = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29174M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29175Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f29176X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29177Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29178Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29179k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29180p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29181q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29182r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29183s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29184t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CLMainData f29185u0;

    public CLUpGradeInstallmentAccountActivity() {
        final int i7 = 2;
        this.f29174M = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i7) {
                    case 0:
                        int i10 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i11 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i12 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i13 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i14 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i15 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i10 = 4;
        this.f29175Q = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i10) {
                    case 0:
                        int i11 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i12 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i13 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i14 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i15 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i11 = 5;
        this.f29176X = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i11) {
                    case 0:
                        int i12 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i13 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i14 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i15 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i12 = 6;
        this.f29177Y = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i12) {
                    case 0:
                        int i13 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i14 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i15 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i13 = 7;
        this.f29178Z = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i13) {
                    case 0:
                        int i14 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i15 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i14 = 8;
        this.f29179k0 = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i14) {
                    case 0:
                        int i15 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i114 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i15 = 9;
        this.f29180p0 = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i15) {
                    case 0:
                        int i16 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i114 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i115 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i16 = 10;
        this.f29181q0 = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i16) {
                    case 0:
                        int i17 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i114 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i115 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i116 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i17 = 0;
        this.f29182r0 = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i17) {
                    case 0:
                        int i18 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i114 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i115 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i116 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i117 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i18 = 1;
        this.f29183s0 = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i18) {
                    case 0:
                        int i19 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i114 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i115 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i116 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i117 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i118 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
        final int i19 = 3;
        this.f29184t0 = C2131j.b(new Function0(this) { // from class: tb.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42524b;

            {
                this.f42524b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42524b;
                switch (i19) {
                    case 0:
                        int i110 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips2);
                    case 1:
                        int i111 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_tips1);
                    case 2:
                        int i112 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (LinearLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_learn_more);
                    case 3:
                        int i113 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.ivBg);
                    case 4:
                        int i114 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (ImageView) cLUpGradeInstallmentAccountActivity.findViewById(e.clbiad_hand);
                    case 5:
                        int i115 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply);
                    case 6:
                        int i116 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_apply_after);
                    case 7:
                        int i117 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (RelativeLayout) cLUpGradeInstallmentAccountActivity.findViewById(e.layoutApply);
                    case 8:
                        int i118 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term_due);
                    case 9:
                        int i119 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_term);
                    default:
                        int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                        return (TextView) cLUpGradeInstallmentAccountActivity.findViewById(e.ccuial_amount);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_upgrade_install_account_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        p221ob.a aVar = c.f40268a;
        aVar.getInstance().getClass();
        d<CLMainResp> cashLoanNew = c.a().getCashLoanNew();
        i iVar = p298tf.f.f42629b;
        cashLoanNew.k(iVar).i(b.a()).subscribe(new x0(this, 0));
        aVar.getInstance().getClass();
        c.a().getInstallmentLoanMainPage().k(iVar).i(b.a()).subscribe(new x0(this, 1));
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.cashloan.a
    public final void r() {
        super.r();
        com.palmpay.lib.apm.launchcounter.util.d.H("/main/home", "tab", "finance");
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.cashloan.a, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        x xVar = new x(this, 13);
        TextView textViewV = v();
        Object value = this.f29174M.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.q(xVar, textViewV, (LinearLayout) value);
        r0.l1(r0.y0("cs_upgrade_install_account_bg.webp"), (ImageView) this.f29184t0.getValue());
    }

    public final TextView v() {
        Object value = this.f29176X.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }
}
