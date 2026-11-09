package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import F6.d;
import Ja.q;
import Pa.n0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.InsSingleRepaymentPlanDetail;
import com.transsnet.palmpay.credit.bean.resp.OrderExtendObject;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p220oa.h;
import p221ob.c;
import p284sb.A;
import p284sb.C2025x;
import p285sc.x;
import p294tb.C2048j;
import p294tb.C2051m;
import p351xb.j;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit借款结果页", path = "/credit_score/cl_borrow_result_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLBorrowResultActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowResultActivity extends b {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f28876k0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28877A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28878B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f28879C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f28880H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f28881L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f28882M;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public j f28884X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Long f28885Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28890g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28892j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28894p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28896w;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f28883Q = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Handler f28886Z = new Handler(Looper.getMainLooper());

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

    public CLBorrowResultActivity() {
        final int i7 = 4;
        this.f28887d = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i7) {
                    case 0:
                        int i10 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i11 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i12 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i13 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i14 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i15 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i10 = 8;
        this.f28888e = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i10) {
                    case 0:
                        int i11 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i12 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i13 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i14 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i15 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i11 = 9;
        this.f28889f = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i11) {
                    case 0:
                        int i12 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i13 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i14 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i15 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i12 = 10;
        this.f28890g = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i12) {
                    case 0:
                        int i13 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i14 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i15 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i13 = 11;
        this.f28891i = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i13) {
                    case 0:
                        int i14 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i15 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i14 = 12;
        this.f28892j = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i14) {
                    case 0:
                        int i15 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i15 = 0;
        this.f28893o = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i15) {
                    case 0:
                        int i16 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i16 = 1;
        this.f28894p = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i16) {
                    case 0:
                        int i17 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i116 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i17 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i17) {
                    case 0:
                        int i18 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i116 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i117 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i18 = 3;
        this.f28895v = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i18) {
                    case 0:
                        int i19 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i116 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i117 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i118 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i19 = 5;
        this.f28896w = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i19) {
                    case 0:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i116 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i117 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i118 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i119 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i20 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i20 = 6;
        this.f28877A = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i20) {
                    case 0:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i116 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i117 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i118 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i119 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i21 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i23 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
        final int i21 = 7;
        this.f28878B = C2131j.b(new Function0(this) { // from class: tb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowResultActivity f42476b;

            {
                this.f42476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowResultActivity cLBorrowResultActivity = this.f42476b;
                switch (i21) {
                    case 0:
                        int i110 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_amount_tv);
                    case 1:
                        int i111 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.plan_detail_group);
                    case 2:
                        int i112 = CLBorrowResultActivity.f28876k0;
                        return (RecyclerView) cLBorrowResultActivity.findViewById(e.repayment_plan_rv);
                    case 3:
                        int i113 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_amount_tv);
                    case 4:
                        int i114 = CLBorrowResultActivity.f28876k0;
                        return (SingleAdView) cLBorrowResultActivity.findViewById(e.cl_borrow_result_bottom_sav);
                    case 5:
                        int i115 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_content_tv);
                    case 6:
                        int i116 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.status_title_tv);
                    case 7:
                        int i117 = CLBorrowResultActivity.f28876k0;
                        return (ImageView) cLBorrowResultActivity.findViewById(e.bw_status_img);
                    case 8:
                        int i118 = CLBorrowResultActivity.f28876k0;
                        return (Button) cLBorrowResultActivity.findViewById(e.view_fund_bt);
                    case 9:
                        int i119 = CLBorrowResultActivity.f28876k0;
                        return (Group) cLBorrowResultActivity.findViewById(e.borrow_detail_gp);
                    case 10:
                        int i22 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.repayment_detail_tv);
                    case 11:
                        int i23 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.bw_date_tv);
                    default:
                        int i24 = CLBorrowResultActivity.f28876k0;
                        return (TextView) cLBorrowResultActivity.findViewById(e.receive_account_tv);
                }
            }
        });
    }

    public static final void m(CLBorrowResultActivity cLBorrowResultActivity) {
        d.h(cLBorrowResultActivity.TAG, 3, "cancelGetDataPolling >>>");
        cLBorrowResultActivity.f28886Z.removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_borrow_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n() {
        G.h(c.f40268a).getBorrowRepaymentPlan(this.f28881L).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2048j(this, 0));
    }

    public final TextView o() {
        Object value = this.f28896w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        this.f28886Z.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public final void p(int i7, CLBorrowRepaymentPlanData cLBorrowRepaymentPlanData) {
        List<InsSingleRepaymentPlanDetail> largeRepaymentPlan;
        OrderExtendObject orderExtendObject;
        Integer accountType;
        t tVar = this.f28889f;
        t tVar2 = this.f28877A;
        t tVar3 = this.f28878B;
        if (i7 == 1) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_BORROW_SUCCESS));
            n0.g().u((ViewEvent) G.g("BorrowSuccess", true));
            Object value = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ImageView) value).setImageResource(Ya.d.cs_cl_borrow_success_icon);
            Object value2 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(g.cs_cl_loan_have_been_issued));
            Object value3 = this.f28888e.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((Button) value3).setText(getString(g.cs_view_funds));
            o().setVisibility(8);
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((Group) value4).setVisibility(0);
            if (cLBorrowRepaymentPlanData != null && (accountType = cLBorrowRepaymentPlanData.getAccountType()) != null) {
                int iIntValue = accountType.intValue();
                c.f40268a.getInstance().getClass();
                c.a().queryCanBorrowAgain(iIntValue).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new q(this, iIntValue, 2));
            }
            Object value5 = this.f28893o.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((TextView) value5).setText(r0.B(r0.U1(String.valueOf(cLBorrowRepaymentPlanData != null ? cLBorrowRepaymentPlanData.getTransAmount() : null), String.valueOf((cLBorrowRepaymentPlanData == null || (orderExtendObject = cLBorrowRepaymentPlanData.getOrderExtendObject()) == null) ? null : orderExtendObject.getManagementFee())).longValueExact(), true));
            if ((cLBorrowRepaymentPlanData != null ? cLBorrowRepaymentPlanData.getOrderExtendObject() : null) != null) {
                OrderExtendObject orderExtendObject2 = cLBorrowRepaymentPlanData.getOrderExtendObject();
                List<InsSingleRepaymentPlanDetail> largeRepaymentPlan2 = orderExtendObject2 != null ? orderExtendObject2.getLargeRepaymentPlan() : null;
                if (largeRepaymentPlan2 != null && !largeRepaymentPlan2.isEmpty()) {
                    OrderExtendObject orderExtendObject3 = cLBorrowRepaymentPlanData.getOrderExtendObject();
                    if (((orderExtendObject3 == null || (largeRepaymentPlan = orderExtendObject3.getLargeRepaymentPlan()) == null) ? 0 : largeRepaymentPlan.size()) > 1) {
                        Object value6 = this.f28894p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        ((Group) value6).setVisibility(0);
                        ArrayList arrayList = this.f28883Q;
                        arrayList.clear();
                        OrderExtendObject orderExtendObject4 = cLBorrowRepaymentPlanData.getOrderExtendObject();
                        List<InsSingleRepaymentPlanDetail> largeRepaymentPlan3 = orderExtendObject4 != null ? orderExtendObject4.getLargeRepaymentPlan() : null;
                        Intrinsics.e(largeRepaymentPlan3);
                        arrayList.addAll(largeRepaymentPlan3);
                        j jVar = this.f28884X;
                        if (jVar != null) {
                            jVar.notifyDataSetChanged();
                        }
                    }
                }
            }
            G.h(c.f40268a).getFirstRepaymentDate(this.f28879C).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2048j(this, 1));
            getOnBackPressedDispatcher().a(this, new C2051m(true));
        } else if (i7 == 2) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_BORROW_FAILED));
            n0.g().v("BorrowFail");
            Object value7 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((ImageView) value7).setImageResource(Ya.d.cs_operation_fail_icon);
            Object value8 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            ((TextView) value8).setText(getString(g.cs_cl_copy_writing));
            o().setText(getString(g.cs_cl_borrow_result_failed_txt));
            o().setVisibility(0);
            Object value9 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((Group) value9).setVisibility(8);
        } else {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_BORROW_PENDING));
            Object value10 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            ((ImageView) value10).setImageResource(Ya.d.cs_cl_borrow_pending_icon);
            Object value11 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            ((TextView) value11).setText(getString(g.cs_cl_waiting));
            o().setText(getString(g.cs_cl_borrow_result_pending_txt));
            o().setVisibility(0);
            Object value12 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            ((Group) value12).setVisibility(8);
        }
        if (TextUtils.isEmpty(this.f28880H)) {
            return;
        }
        try {
            String str = this.f28880H;
            Intrinsics.e(str);
            JSONObject jSONObject = new JSONObject(str);
            long jOptLong = jSONObject.optLong("transAmount");
            String strOptString = jSONObject.optString("receiveAccount");
            Object value13 = this.f28895v.getValue();
            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
            ((TextView) value13).setText(r0.B(jOptLong, true));
            Object value14 = this.f28892j.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            ((TextView) value14).setText(strOptString);
            Object value15 = this.f28891i.getValue();
            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
            ((TextView) value15).setText(r0.X1(this.f28885Y, "dd MMM"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().queryLoanUserConfig().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2048j(this, 2));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(Color.parseColor("#f6f6f6"));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        Intent intent = getIntent();
        intent.getStringExtra("payStatus");
        this.f28879C = intent.getStringExtra("payId");
        this.f28881L = intent.getStringExtra("orderNo");
        this.f28880H = intent.getStringExtra("orderDesc");
        try {
            String str = this.f28880H;
            Intrinsics.e(str);
            JSONObject jSONObject = new JSONObject(str);
            this.f28882M = jSONObject.optString("applyId");
            this.f28885Y = Long.valueOf(jSONObject.optLong("repaymentDate"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f28884X = new j(this, this.f28883Q);
        t tVar = this.t;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setAdapter(this.f28884X);
        Object value3 = this.f28887d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) value3);
        Object value4 = this.f28890g.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        h.l(new x(this, 8), (TextView) value4);
        Object value5 = this.f28888e.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        h.l(new A(7), (Button) value5);
        String string = getString(g.cl_borrow_result_ad_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView.show$default(new InterstitialAdView(string, 1, new C2025x(5), new org.sufficientlysecure.htmltextview.h(9)), this, null, 2, null);
    }
}
