package com.transsnet.palmpay.credit.ui.activity;

import Db.E;
import Db.G;
import Db.L;
import L6.i;
import O6.c;
import O6.d;
import Wf.AbstractC0780y;
import Ya.e;
import Ya.f;
import Ya.g;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.resp.UnfreezePopupDataResp;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.FlexiCashUnfreezeItem;
import com.transsnet.palmpay.credit.ui.viewmodel.UnfreezeViewModel;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p054dd.q;
import p173ld.o;
import p220oa.h;
import p284sb.C2006d;
import p284sb.C2007e;
import p284sb.ViewOnClickListenerC2004b;
import p339wb.b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC账户解冻页", path = "/credit_score/unfreeze_activity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/HowToUnfreezeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/UnfreezeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHowToUnfreezeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HowToUnfreezeActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/HowToUnfreezeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,334:1\n260#2,10:335\n296#2:345\n171#2,12:346\n215#2:358\n115#2,8:359\n145#2:367\n115#2,8:368\n145#2:376\n*S KotlinDebug\n*F\n+ 1 HowToUnfreezeActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/HowToUnfreezeActivity\n*L\n125#1:335,10\n125#1:345\n145#1:346,12\n145#1:358\n156#1:359,8\n156#1:367\n186#1:368,8\n186#1:376\n*E\n"})
public final class HowToUnfreezeActivity extends BaseMvvmActivity<UnfreezeViewModel> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f28656H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28657A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28658B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d f28659C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28664g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28666j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28668p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28669v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28670w;

    public HowToUnfreezeActivity() {
        final int i7 = 13;
        this.f28660c = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i7) {
                    case 0:
                        int i10 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i11 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i12 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i13 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i14 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i15 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i10 = 4;
        this.f28661d = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i10) {
                    case 0:
                        int i11 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i12 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i13 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i14 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i15 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i11 = 5;
        this.f28662e = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i11) {
                    case 0:
                        int i12 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i13 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i14 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i15 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i12 = 6;
        this.f28663f = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i12) {
                    case 0:
                        int i13 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i14 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i15 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i13 = 7;
        this.f28664g = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i13) {
                    case 0:
                        int i14 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i15 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i14 = 8;
        this.f28665i = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i14) {
                    case 0:
                        int i15 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i15 = 9;
        this.f28666j = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i15) {
                    case 0:
                        int i16 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i16 = 10;
        this.f28667o = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i16) {
                    case 0:
                        int i17 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i17 = 11;
        this.f28668p = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i17) {
                    case 0:
                        int i18 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i117 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i18 = 12;
        this.t = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i18) {
                    case 0:
                        int i19 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i117 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i118 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i19 = 0;
        this.f28669v = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i19) {
                    case 0:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i117 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i118 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i119 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i20 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i20 = 1;
        this.f28670w = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i20) {
                    case 0:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i117 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i118 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i119 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i21 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i24 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i21 = 2;
        this.f28657A = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i21) {
                    case 0:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i117 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i118 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i119 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i22 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i24 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i25 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
        final int i22 = 3;
        this.f28658B = C2131j.b(new Function0(this) { // from class: sb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowToUnfreezeActivity f42150b;

            {
                this.f42150b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HowToUnfreezeActivity howToUnfreezeActivity = this.f42150b;
                switch (i22) {
                    case 0:
                        int i110 = HowToUnfreezeActivity.f28656H;
                        return (NestedScrollView) howToUnfreezeActivity.findViewById(e.nsv);
                    case 1:
                        int i111 = HowToUnfreezeActivity.f28656H;
                        return howToUnfreezeActivity.findViewById(e.rtvOk);
                    case 2:
                        int i112 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 3:
                        int i113 = HowToUnfreezeActivity.f28656H;
                        return new b(howToUnfreezeActivity);
                    case 4:
                        int i114 = HowToUnfreezeActivity.f28656H;
                        return (ViewStub) howToUnfreezeActivity.findViewById(e.viewStub);
                    case 5:
                        int i115 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvCompletedTaskList);
                    case 6:
                        int i116 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTaskListDesc);
                    case 7:
                        int i117 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvCompletedTasksTitle);
                    case 8:
                        int i118 = HowToUnfreezeActivity.f28656H;
                        return (RecyclerView) howToUnfreezeActivity.findViewById(e.rvTaskList);
                    case 9:
                        int i119 = HowToUnfreezeActivity.f28656H;
                        return (TextView) howToUnfreezeActivity.findViewById(e.tvTaskListDesc);
                    case 10:
                        int i23 = HowToUnfreezeActivity.f28656H;
                        return (LinearLayout) howToUnfreezeActivity.findViewById(e.layoutTaskList);
                    case 11:
                        int i24 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.cashUnfreezeItem);
                    case 12:
                        int i25 = HowToUnfreezeActivity.f28656H;
                        return (FlexiCashUnfreezeItem) howToUnfreezeActivity.findViewById(e.flexiUnfreezeItem);
                    default:
                        int i26 = HowToUnfreezeActivity.f28656H;
                        return (CardView) howToUnfreezeActivity.findViewById(e.loadingView);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_how_to_unfreeze;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((UnfreezeViewModel) l()).f30707f;
        if (lVar != null) {
            lVar.e(this, new q(new C2007e(this, this, 1), 26));
        }
        l lVar2 = ((UnfreezeViewModel) l()).f30706e;
        if (lVar2 != null) {
            lVar2.e(this, new q(new C2007e(this, this, 0), 26));
        }
        l lVar3 = ((UnfreezeViewModel) l()).f30708g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new C2006d(this, 0), 26));
        }
        l lVar4 = ((UnfreezeViewModel) l()).f30709i;
        if (lVar4 != null) {
            lVar4.e(this, new q(new C2006d(this, 1), 26));
        }
    }

    public final void m(boolean z3) {
        ViewStub viewStub = (ViewStub) this.f28661d.getValue();
        if (viewStub != null) {
            viewStub.setVisibility(z3 ? 8 : 0);
        }
        View view = (View) this.f28670w.getValue();
        if (view != null) {
            h.l(new ViewOnClickListenerC2004b(this, 3), view);
        }
    }

    public final void n(String str, UnfreezePopupDataResp.Data data) {
        if (this.f28659C != null) {
            return;
        }
        if (TextUtils.equals(str, TransType.TRANS_TYPE_OK_CARD)) {
            c cVar = new c(this);
            cVar.e(k.core_congratulations);
            cVar.f6607m = Ya.d.cs_success_icon;
            cVar.f6598d = getString(g.cs_oc_unfreeze_success_tips);
            cVar.f6615v = i.ppFlexiDialogTheme;
            cVar.d(g.cs_oc_pay_with_flexi_now, new o(data, 24));
            cVar.f6604j = new ViewOnClickListenerC2004b(this, 4);
            this.f28659C = cVar.g();
            return;
        }
        c cVar2 = new c(this);
        cVar2.e(k.core_congratulations);
        cVar2.f6607m = Ya.d.cs_success_icon;
        cVar2.f6598d = getString(g.cs_cl_unfreeze_success_tips);
        cVar2.f6615v = i.ppFlexiCashDialogTheme;
        cVar2.d(g.cs_cl_borrow_now, new p054dd.d(28));
        cVar2.f6604j = new ViewOnClickListenerC2004b(this, 5);
        this.f28659C = cVar2.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_FLEXI_UNFREEZE.equals(pushMessage.content.messageType)) {
            if (this.f28659C == null) {
                UnfreezeViewModel unfreezeViewModel = (UnfreezeViewModel) l();
                unfreezeViewModel.getClass();
                p140j8.f.s(unfreezeViewModel, new G(1, null), unfreezeViewModel.f30709i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        if (PushMessage.MESSAGE_TYPE_CASH_UNFREEZE.equals(pushMessage.content.messageType)) {
            n(TransType.TRANS_TYPE_CL_REPAY, null);
        } else if (PushMessage.MESSAGE_TYPE_OC_UNFREEZE_TASK_DONE.equals(pushMessage.content.messageType)) {
            ((UnfreezeViewModel) l()).d();
            UnfreezeViewModel unfreezeViewModel2 = (UnfreezeViewModel) l();
            unfreezeViewModel2.getClass();
            p140j8.f.s(unfreezeViewModel2, new E(1, null), unfreezeViewModel2.f30708g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((UnfreezeViewModel) l()).d();
        UnfreezeViewModel unfreezeViewModel = (UnfreezeViewModel) l();
        unfreezeViewModel.getClass();
        p140j8.f.s(unfreezeViewModel, new E(1, null), unfreezeViewModel.f30708g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        org.greenrobot.eventbus.c.b().j(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), true);
        t tVar = this.f28665i;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            C1548f c1548f = new C1548f(getColor(p.transparent), DensityUtil.dp2px(12.0f));
            c1548f.f31336e = false;
            recyclerView2.addItemDecoration(c1548f);
        }
        t tVar2 = this.f28662e;
        RecyclerView recyclerView3 = (RecyclerView) tVar2.getValue();
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        RecyclerView recyclerView4 = (RecyclerView) tVar2.getValue();
        if (recyclerView4 != null) {
            C1548f c1548f2 = new C1548f(getColor(p.transparent), DensityUtil.dp2px(12.0f));
            c1548f2.f31336e = false;
            recyclerView4.addItemDecoration(c1548f2);
        }
        RecyclerView recyclerView5 = (RecyclerView) tVar.getValue();
        if (recyclerView5 != null) {
            recyclerView5.setAdapter((b) this.f28657A.getValue());
        }
        RecyclerView recyclerView6 = (RecyclerView) tVar2.getValue();
        if (recyclerView6 != null) {
            recyclerView6.setAdapter((b) this.f28658B.getValue());
        }
        FlexiCashUnfreezeItem flexiCashUnfreezeItem = (FlexiCashUnfreezeItem) this.t.getValue();
        if (flexiCashUnfreezeItem != null) {
            final int i7 = 0;
            flexiCashUnfreezeItem.setOnApplyUnfreezingBtnClickListener(new Function1(this) { // from class: sb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HowToUnfreezeActivity f42154b;

                {
                    this.f42154b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
                    HowToUnfreezeActivity howToUnfreezeActivity = this.f42154b;
                    switch (i7) {
                        case 0:
                            String str = (String) obj;
                            int i10 = HowToUnfreezeActivity.f28656H;
                            UnfreezeViewModel unfreezeViewModel = (UnfreezeViewModel) howToUnfreezeActivity.l();
                            unfreezeViewModel.f30706e.k(oVar);
                            AbstractC0780y.m(V.h(unfreezeViewModel), null, null, new L("OK_CARD", str, TransType.TRANS_TYPE_OK_CARD, unfreezeViewModel, null), 3);
                            break;
                        default:
                            String str2 = (String) obj;
                            int i11 = HowToUnfreezeActivity.f28656H;
                            UnfreezeViewModel unfreezeViewModel2 = (UnfreezeViewModel) howToUnfreezeActivity.l();
                            unfreezeViewModel2.f30706e.k(oVar);
                            AbstractC0780y.m(V.h(unfreezeViewModel2), null, null, new L("CASH_LOAN", str2, TransType.TRANS_TYPE_CL_REPAY, unfreezeViewModel2, null), 3);
                            break;
                    }
                    return Unit.f38893a;
                }
            });
        }
        FlexiCashUnfreezeItem flexiCashUnfreezeItem2 = (FlexiCashUnfreezeItem) this.f28668p.getValue();
        if (flexiCashUnfreezeItem2 != null) {
            final int i10 = 1;
            flexiCashUnfreezeItem2.setOnApplyUnfreezingBtnClickListener(new Function1(this) { // from class: sb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HowToUnfreezeActivity f42154b;

                {
                    this.f42154b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
                    HowToUnfreezeActivity howToUnfreezeActivity = this.f42154b;
                    switch (i10) {
                        case 0:
                            String str = (String) obj;
                            int i11 = HowToUnfreezeActivity.f28656H;
                            UnfreezeViewModel unfreezeViewModel = (UnfreezeViewModel) howToUnfreezeActivity.l();
                            unfreezeViewModel.f30706e.k(oVar);
                            AbstractC0780y.m(V.h(unfreezeViewModel), null, null, new L("OK_CARD", str, TransType.TRANS_TYPE_OK_CARD, unfreezeViewModel, null), 3);
                            break;
                        default:
                            String str2 = (String) obj;
                            int i12 = HowToUnfreezeActivity.f28656H;
                            UnfreezeViewModel unfreezeViewModel2 = (UnfreezeViewModel) howToUnfreezeActivity.l();
                            unfreezeViewModel2.f30706e.k(oVar);
                            AbstractC0780y.m(V.h(unfreezeViewModel2), null, null, new L("CASH_LOAN", str2, TransType.TRANS_TYPE_CL_REPAY, unfreezeViewModel2, null), 3);
                            break;
                    }
                    return Unit.f38893a;
                }
            });
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        CardView cardView = (CardView) this.f28660c.getValue();
        if (cardView != null) {
            cardView.setVisibility(z3 ? 0 : 8);
        }
    }
}
