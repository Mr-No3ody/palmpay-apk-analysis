package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Ya.e;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.AbstractC1032a;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.resp.OcIncreaseLimitData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalAmountActivity;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p310ub.w1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC总金额页", path = "/credit_score/oc_total_amount_activity")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcTotalAmountActivity;", "LZa/d;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcTotalAmountActivity extends Za.d {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f29879B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f29880A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29884g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29886j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29888p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OcIncreaseLimitData f29890w;

    public OcTotalAmountActivity() {
        final int i7 = 0;
        this.f29881d = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i7) {
                    case 0:
                        int i10 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i11 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i12 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i13 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i14 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i15 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i10 = 9;
        this.f29882e = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i10) {
                    case 0:
                        int i11 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i12 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i13 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i14 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i15 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i11 = 10;
        this.f29883f = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i11) {
                    case 0:
                        int i12 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i13 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i14 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i15 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i12 = 11;
        C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i12) {
                    case 0:
                        int i13 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i14 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i15 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i13 = 12;
        this.f29884g = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i13) {
                    case 0:
                        int i14 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i15 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i14 = 13;
        C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i14) {
                    case 0:
                        int i15 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i15 = 1;
        this.f29885i = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i15) {
                    case 0:
                        int i16 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i16 = 2;
        C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i16) {
                    case 0:
                        int i17 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i17 = 3;
        C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i17) {
                    case 0:
                        int i18 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i117 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i18 = 4;
        this.f29886j = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i18) {
                    case 0:
                        int i19 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i117 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i118 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i19 = 5;
        this.f29887o = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i19) {
                    case 0:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i117 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i118 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i119 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i20 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i20 = 6;
        this.f29888p = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i20) {
                    case 0:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i117 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i118 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i119 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i21 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i24 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i21 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i21) {
                    case 0:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i117 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i118 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i119 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i22 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i24 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i25 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        final int i22 = 8;
        this.f29889v = C2131j.b(new Function0(this) { // from class: ub.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalAmountActivity f42936b;

            {
                this.f42936b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalAmountActivity ocTotalAmountActivity = this.f42936b;
                switch (i22) {
                    case 0:
                        int i110 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.record_increase_amount_tv);
                    case 1:
                        int i111 = OcTotalAmountActivity.f29879B;
                        return (RecyclerView) ocTotalAmountActivity.findViewById(e.increase_rv);
                    case 2:
                        int i112 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.more_task_second_title_tv);
                    case 3:
                        int i113 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.oc_increase_content_ll);
                    case 4:
                        int i114 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_count_tv);
                    case 5:
                        int i115 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_amount_tv);
                    case 6:
                        int i116 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.init_amount_tv);
                    case 7:
                        int i117 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_total_amount_tv);
                    case 8:
                        int i118 = OcTotalAmountActivity.f29879B;
                        return (NestedScrollView) ocTotalAmountActivity.findViewById(e.oc_total_amount_nsv);
                    case 9:
                        int i119 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_date_tv);
                    case 10:
                        int i23 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.increase_name_tv);
                    case 11:
                        int i24 = OcTotalAmountActivity.f29879B;
                        return (TextView) ocTotalAmountActivity.findViewById(e.oc_amount_record_tv);
                    case 12:
                        int i25 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.record_ll);
                    default:
                        int i26 = OcTotalAmountActivity.f29879B;
                        return (LinearLayout) ocTotalAmountActivity.findViewById(e.complete_all_ll);
                }
            }
        });
        this.f29880A = new ArrayList();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_total_amount_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void n() {
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getIncreaseData("OK_CARD").k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new w1(this, 0));
    }

    public final void o() {
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getIncreaseList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new w1(this, 1));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 4 || eventType == 275 || eventType == 376) {
            n();
            o();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1000) {
            for (int i10 : grantResults) {
                if (i10 != 0) {
                    return;
                }
            }
            if (PermissionUtils.isGranted("android.permission.CAMERA")) {
                G.z("/credit_score/ol_take_photo_activity", "oc_business_type", "OK_CARD", "oc_use_type", "oc_use_type_alone");
            } else {
                ToastUtils.showLong(getString(Ya.g.cs_grant_camera_permission), new Object[0]);
                AbstractC1032a.g(this, new String[]{"android.permission.CAMERA"}, 1000);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
        o();
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().queryIncreaseList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new w1(this, 2));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
        finish();
    }
}
