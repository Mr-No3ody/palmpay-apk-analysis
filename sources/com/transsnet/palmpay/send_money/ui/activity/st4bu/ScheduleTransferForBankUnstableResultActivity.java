package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import L6.b;
import N8.q0;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableCreateOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p159kd.d;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferForBankUnstableResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferForBankUnstableResultActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class ScheduleTransferForBankUnstableResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f33485j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33492g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduleTransferForBankUnstableCreateOrderResp f33493i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Context context, @NotNull ScheduleTransferForBankUnstableCreateOrderResp result) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(result, "result");
            context.startActivity(new Intent(context, (Class<?>) ScheduleTransferForBankUnstableResultActivity.class).putExtra("request_result", result));
        }

        private a() {
        }
    }

    public ScheduleTransferForBankUnstableResultActivity() {
        final int i7 = 0;
        this.f33486a = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i7) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i10 = 1;
        this.f33487b = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i10) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i11 = 2;
        this.f33488c = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i11) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i12 = 3;
        this.f33489d = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i12) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i13 = 4;
        this.f33490e = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i13) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i14 = 5;
        this.f33491f = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i14) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i15 = 6;
        this.f33492g = C2131j.b(new Function0(this) { // from class: wd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43439b;

            {
                this.f43439b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43439b;
                switch (i15) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        ScheduleTransferForBankUnstableResultActivity.a aVar2 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (Button) scheduleTransferForBankUnstableResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        ScheduleTransferForBankUnstableResultActivity.a aVar3 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_3);
                    case 3:
                        ScheduleTransferForBankUnstableResultActivity.a aVar4 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return scheduleTransferForBankUnstableResultActivity.findViewById(e.v_dash_line_step_2);
                    case 4:
                        ScheduleTransferForBankUnstableResultActivity.a aVar5 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (ImageView) scheduleTransferForBankUnstableResultActivity.findViewById(e.iv_step_2);
                    case 5:
                        ScheduleTransferForBankUnstableResultActivity.a aVar6 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_waiting);
                    default:
                        ScheduleTransferForBankUnstableResultActivity.a aVar7 = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        return (TextView) scheduleTransferForBankUnstableResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_schedule_transfer_for_bank_unstable_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp = (ScheduleTransferForBankUnstableCreateOrderResp) getIntent().getSerializableExtra("request_result");
        this.f33493i = scheduleTransferForBankUnstableCreateOrderResp;
        if (scheduleTransferForBankUnstableCreateOrderResp != null) {
            Object value = this.f33491f.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(scheduleTransferForBankUnstableCreateOrderResp.getWaitDesc());
            ScheduleTransferForBankUnstableOrderResp bookTransferDetail = scheduleTransferForBankUnstableCreateOrderResp.getBookTransferDetail();
            if (bookTransferDetail != null) {
                Object value2 = this.f33492g.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView = (TextView) value2;
                Long createTime = bookTransferDetail.getCreateTime();
                textView.setText(r0.R(createTime != null ? createTime.longValue() : 0L));
            }
            Integer bookTransferBusinessType = scheduleTransferForBankUnstableCreateOrderResp.getBookTransferBusinessType();
            if (bookTransferBusinessType != null && bookTransferBusinessType.intValue() == 3) {
                Object value3 = this.f33490e.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((ImageView) value3).setImageResource(d.sm_ic_request_step_completed);
                Object value4 = this.f33488c.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((ImageView) value4).setImageResource(d.sm_ic_request_step_completed);
                Object value5 = this.f33489d.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((View) value5).setAlpha(1.0f);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (!ActivityUtils.isActivityExistsInStack((Class<?>) TransferToBankAccountActivity.class)) {
            i0.H(null);
        } else {
            ActivityUtils.finishToActivity((Class<?>) TransferToBankAccountActivity.class, false);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
        Object value = this.f33487b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        ((Button) value).setOnClickListener(new View.OnClickListener(this) { // from class: wd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43441b;

            {
                this.f43441b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScheduleTransferForBankUnstableOrderResp bookTransferDetail;
                String bookNo;
                String str;
                String str2;
                Integer bookTransferBusinessType;
                ScheduleTransferForBankUnstableOrderResp bookTransferDetail2;
                String orderNo;
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43441b;
                switch (i7) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        c.b().f(new TransactionEvent());
                        if (!ActivityUtils.isActivityExistsInStack((Class<?>) TransferToBankAccountActivity.class)) {
                            i0.H(null);
                        } else {
                            ActivityUtils.finishToActivity((Class<?>) TransferToBankAccountActivity.class, false);
                            scheduleTransferForBankUnstableResultActivity.finish();
                        }
                        break;
                    default:
                        ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp = scheduleTransferForBankUnstableResultActivity.f33493i;
                        if (scheduleTransferForBankUnstableCreateOrderResp == null || (bookTransferBusinessType = scheduleTransferForBankUnstableCreateOrderResp.getBookTransferBusinessType()) == null || bookTransferBusinessType.intValue() != 3) {
                            ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp2 = scheduleTransferForBankUnstableResultActivity.f33493i;
                            if (scheduleTransferForBankUnstableCreateOrderResp2 != null && (bookTransferDetail = scheduleTransferForBankUnstableCreateOrderResp2.getBookTransferDetail()) != null && (bookNo = bookTransferDetail.getBookNo()) != null) {
                                str = TextUtils.isEmpty(bookNo) ? null : bookNo;
                                str2 = str != null ? "/sm/schedule_transfer_for_bank_unstable_detail" : "/smorder/detail";
                            }
                        } else {
                            ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp3 = scheduleTransferForBankUnstableResultActivity.f33493i;
                            if (scheduleTransferForBankUnstableCreateOrderResp3 != null && (bookTransferDetail2 = scheduleTransferForBankUnstableCreateOrderResp3.getBookTransferDetail()) != null && (orderNo = bookTransferDetail2.getOrderNo()) != null) {
                                str = TextUtils.isEmpty(orderNo) ? null : orderNo;
                                if (str != null) {
                                }
                            }
                        }
                        q0.v(str2, "orderId", str);
                        break;
                }
            }
        });
        Object value2 = this.f33486a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((Button) value2).setOnClickListener(new View.OnClickListener(this) { // from class: wd.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableResultActivity f43441b;

            {
                this.f43441b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScheduleTransferForBankUnstableOrderResp bookTransferDetail;
                String bookNo;
                String str;
                String str2;
                Integer bookTransferBusinessType;
                ScheduleTransferForBankUnstableOrderResp bookTransferDetail2;
                String orderNo;
                ScheduleTransferForBankUnstableResultActivity scheduleTransferForBankUnstableResultActivity = this.f43441b;
                switch (i10) {
                    case 0:
                        ScheduleTransferForBankUnstableResultActivity.a aVar = ScheduleTransferForBankUnstableResultActivity.f33485j;
                        c.b().f(new TransactionEvent());
                        if (!ActivityUtils.isActivityExistsInStack((Class<?>) TransferToBankAccountActivity.class)) {
                            i0.H(null);
                        } else {
                            ActivityUtils.finishToActivity((Class<?>) TransferToBankAccountActivity.class, false);
                            scheduleTransferForBankUnstableResultActivity.finish();
                        }
                        break;
                    default:
                        ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp = scheduleTransferForBankUnstableResultActivity.f33493i;
                        if (scheduleTransferForBankUnstableCreateOrderResp == null || (bookTransferBusinessType = scheduleTransferForBankUnstableCreateOrderResp.getBookTransferBusinessType()) == null || bookTransferBusinessType.intValue() != 3) {
                            ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp2 = scheduleTransferForBankUnstableResultActivity.f33493i;
                            if (scheduleTransferForBankUnstableCreateOrderResp2 != null && (bookTransferDetail = scheduleTransferForBankUnstableCreateOrderResp2.getBookTransferDetail()) != null && (bookNo = bookTransferDetail.getBookNo()) != null) {
                                str = TextUtils.isEmpty(bookNo) ? null : bookNo;
                                str2 = str != null ? "/sm/schedule_transfer_for_bank_unstable_detail" : "/smorder/detail";
                            }
                        } else {
                            ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp3 = scheduleTransferForBankUnstableResultActivity.f33493i;
                            if (scheduleTransferForBankUnstableCreateOrderResp3 != null && (bookTransferDetail2 = scheduleTransferForBankUnstableCreateOrderResp3.getBookTransferDetail()) != null && (orderNo = bookTransferDetail2.getOrderNo()) != null) {
                                str = TextUtils.isEmpty(orderNo) ? null : orderNo;
                                if (str != null) {
                                }
                            }
                        }
                        q0.v(str2, "orderId", str);
                        break;
                }
            }
        });
    }
}
