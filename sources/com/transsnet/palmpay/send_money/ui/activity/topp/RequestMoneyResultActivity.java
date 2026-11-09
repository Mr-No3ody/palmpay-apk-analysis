package com.transsnet.palmpay.send_money.ui.activity.topp;

import C0.G;
import L6.b;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.resp.TransferOrderCreateResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.RequestMoneyResultActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/RequestMoneyResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRequestMoneyResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestMoneyResultActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/RequestMoneyResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class RequestMoneyResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f33579f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TransferOrderCreateResp.Data f33584e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Context context, @Nullable TransferOrderCreateResp.Data data) {
            context.startActivity(G.e(context, "context", context, RequestMoneyResultActivity.class).putExtra("request_result", data));
        }

        private a() {
        }
    }

    public RequestMoneyResultActivity() {
        final int i7 = 0;
        this.f33580a = C2131j.b(new Function0(this) { // from class: yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyResultActivity f44290b;

            {
                this.f44290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestMoneyResultActivity requestMoneyResultActivity = this.f44290b;
                switch (i7) {
                    case 0:
                        RequestMoneyResultActivity.a aVar = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        RequestMoneyResultActivity.a aVar2 = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        RequestMoneyResultActivity.a aVar3 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_waiting);
                    default:
                        RequestMoneyResultActivity.a aVar4 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i10 = 1;
        this.f33581b = C2131j.b(new Function0(this) { // from class: yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyResultActivity f44290b;

            {
                this.f44290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestMoneyResultActivity requestMoneyResultActivity = this.f44290b;
                switch (i10) {
                    case 0:
                        RequestMoneyResultActivity.a aVar = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        RequestMoneyResultActivity.a aVar2 = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        RequestMoneyResultActivity.a aVar3 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_waiting);
                    default:
                        RequestMoneyResultActivity.a aVar4 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i11 = 2;
        this.f33582c = C2131j.b(new Function0(this) { // from class: yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyResultActivity f44290b;

            {
                this.f44290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestMoneyResultActivity requestMoneyResultActivity = this.f44290b;
                switch (i11) {
                    case 0:
                        RequestMoneyResultActivity.a aVar = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        RequestMoneyResultActivity.a aVar2 = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        RequestMoneyResultActivity.a aVar3 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_waiting);
                    default:
                        RequestMoneyResultActivity.a aVar4 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
        final int i12 = 3;
        this.f33583d = C2131j.b(new Function0(this) { // from class: yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyResultActivity f44290b;

            {
                this.f44290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestMoneyResultActivity requestMoneyResultActivity = this.f44290b;
                switch (i12) {
                    case 0:
                        RequestMoneyResultActivity.a aVar = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        RequestMoneyResultActivity.a aVar2 = RequestMoneyResultActivity.f33579f;
                        return (Button) requestMoneyResultActivity.findViewById(e.result_left_btn);
                    case 2:
                        RequestMoneyResultActivity.a aVar3 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_waiting);
                    default:
                        RequestMoneyResultActivity.a aVar4 = RequestMoneyResultActivity.f33579f;
                        return (TextView) requestMoneyResultActivity.findViewById(e.tv_create_time);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_request_money_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        TransferOrderCreateResp.Data data = (TransferOrderCreateResp.Data) getIntent().getSerializableExtra("request_result");
        this.f33584e = data;
        if (data == null || TextUtils.isEmpty(data.orderNo)) {
            return;
        }
        i0.k0();
        TransferOrderCreateResp.Data data2 = this.f33584e;
        if (data2 != null) {
            Object value = this.f33583d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(r0.R(data2.createTime));
            Object value2 = this.f33582c.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(G.q("You have requested ", r0.B(data2.amount, false), " from ", data2.cashierExtendFiled.getSenderFullName(), ". You may choose to notify the recipient and they can decide to approve or reject your request. This request will be valid for 24 hours."));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        if (!ActivityUtils.isActivityExistsInStack((Class<?>) TransferToPalmPayInputAmountActivity.class)) {
            i0.H(null);
            return;
        }
        c cVarB = c.b();
        TransactionEvent transactionEvent = new TransactionEvent();
        transactionEvent.setSendAgain(false);
        cVarB.f(transactionEvent);
        ActivityUtils.finishToActivity((Class<?>) TransferToPalmPayInputAmountActivity.class, false);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        Object value = this.f33581b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        ((Button) value).setOnClickListener(new View.OnClickListener(this) { // from class: yd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyResultActivity f44292b;

            {
                this.f44292b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestMoneyResultActivity requestMoneyResultActivity = this.f44292b;
                switch (i7) {
                    case 0:
                        RequestMoneyResultActivity.a aVar = RequestMoneyResultActivity.f33579f;
                        requestMoneyResultActivity.l();
                        break;
                    default:
                        TransferOrderCreateResp.Data data = requestMoneyResultActivity.f33584e;
                        if (data != null) {
                            ShareDialog shareDialog = new ShareDialog(requestMoneyResultActivity);
                            shareDialog.setShareBusinessType(26);
                            shareDialog.setSendMoneyOrderNo(data.orderNo);
                            shareDialog.show();
                        }
                        break;
                }
            }
        });
        Object value2 = this.f33580a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((Button) value2).setOnClickListener(new View.OnClickListener(this) { // from class: yd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyResultActivity f44292b;

            {
                this.f44292b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestMoneyResultActivity requestMoneyResultActivity = this.f44292b;
                switch (i10) {
                    case 0:
                        RequestMoneyResultActivity.a aVar = RequestMoneyResultActivity.f33579f;
                        requestMoneyResultActivity.l();
                        break;
                    default:
                        TransferOrderCreateResp.Data data = requestMoneyResultActivity.f33584e;
                        if (data != null) {
                            ShareDialog shareDialog = new ShareDialog(requestMoneyResultActivity);
                            shareDialog.setShareBusinessType(26);
                            shareDialog.setSendMoneyOrderNo(data.orderNo);
                            shareDialog.show();
                        }
                        break;
                }
            }
        });
    }
}
