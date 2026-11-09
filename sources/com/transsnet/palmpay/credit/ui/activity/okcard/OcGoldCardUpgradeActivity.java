package com.transsnet.palmpay.credit.ui.activity.okcard;

import Jb.C0354m;
import V8.w;
import Ya.e;
import android.os.Bundle;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.resp.OcGoldCardLevelData;
import com.transsnet.palmpay.credit.bean.resp.OcRepaymentDate;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGoldCardUpgradeActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcGoldCardUpgradeConfirmDialog;
import com.transsnet.palmpay.credit.viewmodel.OcGoldCardUpgradeViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p284sb.C2023v;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC金卡升级页", path = "/credit_score/oc_gold_card_upgarde_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcGoldCardUpgradeActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcGoldCardUpgradeViewModel;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcGoldCardUpgradeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcGoldCardUpgradeActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcGoldCardUpgradeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,291:1\n260#2,10:292\n296#2:302\n260#2,10:303\n296#2:313\n*S KotlinDebug\n*F\n+ 1 OcGoldCardUpgradeActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcGoldCardUpgradeActivity\n*L\n93#1:292,10\n93#1:302\n104#1:303,10\n104#1:313\n*E\n"})
public final class OcGoldCardUpgradeActivity extends CreditBaseMvvmActivity<OcGoldCardUpgradeViewModel> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f29468s0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29469A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29470B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29471C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29472H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29473L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29474M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29475Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f29476X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29477Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29478Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29480g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29482j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OcGoldCardLevelData f29483k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29485p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OcGoldCardUpgradeConfirmDialog f29486p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LinearLayout f29487q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OcRepaymentDate f29488r0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29490w;

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

    public OcGoldCardUpgradeActivity() {
        final int i7 = 0;
        this.f29479f = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i7) {
                    case 0:
                        int i10 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i11 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i12 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i13 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i14 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i15 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i10 = 2;
        this.f29480g = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i10) {
                    case 0:
                        int i11 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i12 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i13 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i14 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i15 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i11 = 3;
        this.f29481i = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i11) {
                    case 0:
                        int i12 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i13 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i14 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i15 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i12 = 4;
        this.f29482j = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i12) {
                    case 0:
                        int i13 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i14 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i15 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i13 = 5;
        this.f29484o = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i13) {
                    case 0:
                        int i14 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i15 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i14 = 6;
        this.f29485p = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i14) {
                    case 0:
                        int i15 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i15 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i15) {
                    case 0:
                        int i16 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i16 = 8;
        this.f29489v = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i16) {
                    case 0:
                        int i17 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i17 = 9;
        this.f29490w = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i17) {
                    case 0:
                        int i18 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i18 = 10;
        this.f29469A = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i18) {
                    case 0:
                        int i19 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i19 = 11;
        C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i19) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i20 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i20 = 12;
        this.f29470B = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i20) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i21 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i21 = 13;
        this.f29471C = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i21) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i22 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i22 = 14;
        this.f29472H = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i22) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i23 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i23 = 15;
        this.f29473L = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i23) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i24 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i213 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i24 = 16;
        this.f29474M = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i24) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i25 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i213 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i214 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i25 = 17;
        this.f29475Q = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i25) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i26 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i213 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i214 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i215 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i26 = 18;
        this.f29476X = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i26) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i27 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i213 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i214 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i215 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i216 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i27 = 19;
        this.f29477Y = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i27) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i28 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i213 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i214 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i215 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i216 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i217 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
        final int i28 = 1;
        this.f29478Z = C2131j.b(new Function0(this) { // from class: ub.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGoldCardUpgradeActivity f42806b;

            {
                this.f42806b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = this.f42806b;
                switch (i28) {
                    case 0:
                        int i110 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.change_date_bt);
                    case 1:
                        int i111 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.upgrade_img);
                    case 2:
                        int i112 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.bottom_change_date_tips_tv);
                    case 3:
                        int i113 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_recommend_tv);
                    case 4:
                        int i114 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_month_tv);
                    case 5:
                        int i115 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.second_repayment_date_tv);
                    case 6:
                        int i116 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.second_date_ll);
                    case 7:
                        int i117 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_recommend_tv);
                    case 8:
                        int i118 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_month_tv);
                    case 9:
                        int i119 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.first_repayment_date_tv);
                    case 10:
                        int i29 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.first_date_ll);
                    case 11:
                        int i210 = OcGoldCardUpgradeActivity.f29468s0;
                        return (LinearLayout) ocGoldCardUpgradeActivity.findViewById(e.selected_date_ll);
                    case 12:
                        int i211 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.oc_bill_period_content_tv);
                    case 13:
                        int i212 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.next_change_date_tv);
                    case 14:
                        int i213 = OcGoldCardUpgradeActivity.f29468s0;
                        return (TextView) ocGoldCardUpgradeActivity.findViewById(e.repayment_date_tv);
                    case 15:
                        int i214 = OcGoldCardUpgradeActivity.f29468s0;
                        return (Button) ocGoldCardUpgradeActivity.findViewById(e.use_flexi_bt);
                    case 16:
                        int i215 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_unselected_vs);
                    case 17:
                        int i216 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.gold_card_selected_vs);
                    case 18:
                        int i217 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ViewStub) ocGoldCardUpgradeActivity.findViewById(e.no_gold_card_vs);
                    default:
                        int i218 = OcGoldCardUpgradeActivity.f29468s0;
                        return (ImageView) ocGoldCardUpgradeActivity.findViewById(e.selected_img);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_gold_card_upgarde_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((OcGoldCardUpgradeViewModel) l()).f30906f;
        if (lVar != null) {
            lVar.e(this, new C2023v(new p141j9.t(this, this, 25), 7));
        }
        l lVar2 = ((OcGoldCardUpgradeViewModel) l()).f30905e;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new w(26, this, this), 7));
        }
    }

    public final LinearLayout n() {
        Object value = this.f29469A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final TextView o() {
        Object value = this.f29489v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView p() {
        Object value = this.f29490w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        OcGoldCardUpgradeViewModel ocGoldCardUpgradeViewModel = (OcGoldCardUpgradeViewModel) l();
        ocGoldCardUpgradeViewModel.getClass();
        p140j8.f.s(ocGoldCardUpgradeViewModel, new C0354m(1, null), ocGoldCardUpgradeViewModel.f30906f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final LinearLayout q() {
        Object value = this.f29485p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final TextView r() {
        Object value = this.f29482j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView s() {
        Object value = this.f29484o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
