package com.transsnet.palmpay.credit.ui.activity.okcard;

import Pa.r0;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.resp.OcGoldCardLevelData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGoldCardUpgradeBreakActivity;
import com.transsnet.palmpay.credit.viewmodel.OcEmptyViewModel;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC金卡升级中断页", path = "/credit_score/oc_gold_card_upgard_break_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcGoldCardUpgradeBreakActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcEmptyViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcGoldCardUpgradeBreakActivity extends CreditBaseMvvmActivity<OcEmptyViewModel> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f29491H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29492A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29493B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public OcGoldCardLevelData f29494C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29496g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29498j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29500p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29502w;

    public OcGoldCardUpgradeBreakActivity() {
        final int i7 = 3;
        this.f29495f = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i7) {
                    case 0:
                        int i10 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i11 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i12 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i13 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i14 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i15 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i10 = 5;
        this.f29496g = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i10) {
                    case 0:
                        int i11 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i12 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i13 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i14 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i15 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i11 = 6;
        this.f29497i = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i11) {
                    case 0:
                        int i12 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i13 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i14 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i15 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i12 = 7;
        this.f29498j = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i12) {
                    case 0:
                        int i13 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i14 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i15 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i13 = 8;
        this.f29499o = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i13) {
                    case 0:
                        int i14 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i15 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i14 = 9;
        this.f29500p = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i14) {
                    case 0:
                        int i15 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i114 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i15 = 10;
        this.t = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i15) {
                    case 0:
                        int i16 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i114 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i115 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i16 = 0;
        this.f29501v = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i16) {
                    case 0:
                        int i17 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i114 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i115 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i116 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i17 = 1;
        this.f29502w = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i17) {
                    case 0:
                        int i18 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i114 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i115 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i116 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i117 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i18 = 2;
        this.f29492A = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i18) {
                    case 0:
                        int i19 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i114 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i115 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i116 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i117 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i118 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
        final int i19 = 4;
        this.f29493B = C2131j.b(new Function0(this) { // from class: ub.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42820b;

            {
                this.f42820b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42820b;
                switch (i19) {
                    case 0:
                        int i110 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (Button) ocGoldCardUpgradeBreakActivity.findViewById(e.break_got_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_content_tv);
                    case 2:
                        int i112 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_title_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.reactive_use_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ImageView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_top_img);
                    case 5:
                        int i115 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.repay_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.outstanding_amount_tv);
                    case 7:
                        int i117 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.disable_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.amount_title_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (ConstraintLayout) ocGoldCardUpgradeBreakActivity.findViewById(e.break_account_cl);
                    default:
                        int i20 = OcGoldCardUpgradeBreakActivity.f29491H;
                        return (TextView) ocGoldCardUpgradeBreakActivity.findViewById(e.break_disable_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_gold_card_upgrade_break_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Long outstandingAmount;
        Long availableBalance;
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String stringExtra = getIntent().getStringExtra("oc_gold_level_data");
        if (stringExtra != null) {
            this.f29494C = (OcGoldCardLevelData) d0.l(OcGoldCardLevelData.class, stringExtra);
        }
        OcGoldCardLevelData ocGoldCardLevelData = this.f29494C;
        Integer accountStatus = ocGoldCardLevelData != null ? ocGoldCardLevelData.getAccountStatus() : null;
        t tVar = this.f29501v;
        t tVar2 = this.f29496g;
        t tVar3 = this.f29502w;
        t tVar4 = this.f29492A;
        t tVar5 = this.f29493B;
        if (accountStatus != null && accountStatus.intValue() == 4) {
            Object value = tVar5.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ImageView) value).setImageResource(Ya.d.cs_oc_gold_frozen);
            Object value2 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(Ya.g.cs_oc_gold_frozen_title));
            Object value3 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setText(getString(Ya.g.cs_oc_gold_frozen_content));
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((Button) value4).setVisibility(0);
        } else {
            t tVar6 = this.f29500p;
            t tVar7 = this.t;
            t tVar8 = this.f29497i;
            t tVar9 = this.f29499o;
            if (accountStatus != null && accountStatus.intValue() == 5) {
                Object value5 = tVar5.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((ImageView) value5).setImageResource(Ya.d.cs_oc_gold_disable);
                Object value6 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setText(getString(Ya.g.cs_oc_gold_disable_title));
                Object value7 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((TextView) value7).setText(getString(Ya.g.cs_oc_gold_disable_content));
                Object value8 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((TextView) value8).setText(getString(Ya.g.cs_oc_reactivate));
                Object value9 = tVar9.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((TextView) value9).setText(getString(Ya.g.cs_oc_flexi_credit_limit));
                Object value10 = tVar8.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                TextView textView = (TextView) value10;
                OcGoldCardLevelData ocGoldCardLevelData2 = this.f29494C;
                textView.setText(r0.B((ocGoldCardLevelData2 == null || (availableBalance = ocGoldCardLevelData2.getAvailableBalance()) == null) ? 0L : availableBalance.longValue(), true));
                Object value11 = tVar7.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((TextView) value11).setVisibility(0);
                Object value12 = tVar6.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                ((ConstraintLayout) value12).setVisibility(0);
                Object value13 = this.f29498j.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                ((TextView) value13).setVisibility(0);
                Object value14 = this.f29495f.getValue();
                Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                ((TextView) value14).setVisibility(0);
            } else {
                Object value15 = tVar5.getValue();
                Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                ((ImageView) value15).setImageResource(Ya.d.cs_oc_gold_disable);
                Object value16 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                ((TextView) value16).setText(getString(Ya.g.cs_oc_gold_disable_title));
                Object value17 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                ((TextView) value17).setText(getString(Ya.g.cs_oc_gold_disable_content));
                Object value18 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                ((TextView) value18).setText(getString(Ya.g.cs_oc_repay));
                Object value19 = tVar9.getValue();
                Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                ((TextView) value19).setText(getString(Ya.g.cs_oc_flexi_outstanding));
                Object value20 = tVar8.getValue();
                Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
                TextView textView2 = (TextView) value20;
                OcGoldCardLevelData ocGoldCardLevelData3 = this.f29494C;
                textView2.setText(r0.B((ocGoldCardLevelData3 == null || (outstandingAmount = ocGoldCardLevelData3.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue(), true));
                Object value21 = tVar7.getValue();
                Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
                ((TextView) value21).setVisibility(0);
                Object value22 = tVar6.getValue();
                Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
                ((ConstraintLayout) value22).setVisibility(0);
            }
        }
        Object value23 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42814b;

            {
                this.f42814b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long outstandingAmount2;
                Integer accountStatus2;
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42814b;
                switch (i7) {
                    case 0:
                        int i10 = OcGoldCardUpgradeBreakActivity.f29491H;
                        ocGoldCardUpgradeBreakActivity.finish();
                        break;
                    default:
                        OcGoldCardLevelData ocGoldCardLevelData4 = ocGoldCardUpgradeBreakActivity.f29494C;
                        if (ocGoldCardLevelData4 == null || (accountStatus2 = ocGoldCardLevelData4.getAccountStatus()) == null || accountStatus2.intValue() != 5) {
                            OcGoldCardLevelData ocGoldCardLevelData5 = ocGoldCardUpgradeBreakActivity.f29494C;
                            if (((ocGoldCardLevelData5 == null || (outstandingAmount2 = ocGoldCardLevelData5.getOutstandingAmount()) == null) ? 0L : outstandingAmount2.longValue()) > 0) {
                                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                OcGoldCardLevelData ocGoldCardLevelData6 = ocGoldCardUpgradeBreakActivity.f29494C;
                                postcardBuild.withString("oc_card_no", ocGoldCardLevelData6 != null ? ocGoldCardLevelData6.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                                ocGoldCardUpgradeBreakActivity.finish();
                            }
                        } else {
                            ARouter.getInstance().build("/credit_score/oc_protocol_activity").navigation();
                            ocGoldCardUpgradeBreakActivity.finish();
                        }
                        break;
                }
            }
        }, (Button) value23);
        Object value24 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value24, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeBreakActivity f42814b;

            {
                this.f42814b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long outstandingAmount2;
                Integer accountStatus2;
                OcGoldCardUpgradeBreakActivity ocGoldCardUpgradeBreakActivity = this.f42814b;
                switch (i10) {
                    case 0:
                        int i11 = OcGoldCardUpgradeBreakActivity.f29491H;
                        ocGoldCardUpgradeBreakActivity.finish();
                        break;
                    default:
                        OcGoldCardLevelData ocGoldCardLevelData4 = ocGoldCardUpgradeBreakActivity.f29494C;
                        if (ocGoldCardLevelData4 == null || (accountStatus2 = ocGoldCardLevelData4.getAccountStatus()) == null || accountStatus2.intValue() != 5) {
                            OcGoldCardLevelData ocGoldCardLevelData5 = ocGoldCardUpgradeBreakActivity.f29494C;
                            if (((ocGoldCardLevelData5 == null || (outstandingAmount2 = ocGoldCardLevelData5.getOutstandingAmount()) == null) ? 0L : outstandingAmount2.longValue()) > 0) {
                                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                OcGoldCardLevelData ocGoldCardLevelData6 = ocGoldCardUpgradeBreakActivity.f29494C;
                                postcardBuild.withString("oc_card_no", ocGoldCardLevelData6 != null ? ocGoldCardLevelData6.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                                ocGoldCardUpgradeBreakActivity.finish();
                            }
                        } else {
                            ARouter.getInstance().build("/credit_score/oc_protocol_activity").navigation();
                            ocGoldCardUpgradeBreakActivity.finish();
                        }
                        break;
                }
            }
        }, (TextView) value24);
    }
}
