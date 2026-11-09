package com.transsnet.palmpay.send_money.ui.activity.pay_me;

import Kd.C0411s;
import Kd.C0414t;
import L6.b;
import O6.c;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsTextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.send_money.bean.resp.VoiceNotifyResp;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.send_money.viewmodel.PayMeViewModel;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p159kd.d;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p270rd.C1976t;
import p284sb.A;
import p284sb.C2023v;
import p284sb.C2025x;
import p285sc.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Pay Me 首页", path = "/send/pay_me")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/pay_me/PayMeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/PayMeViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayMeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayMeActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/pay_me/PayMeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,315:1\n171#2,12:316\n215#2:328\n115#2,8:329\n145#2:337\n115#2,8:338\n145#2:346\n171#2,12:347\n215#2:359\n171#2,12:360\n215#2:372\n*S KotlinDebug\n*F\n+ 1 PayMeActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/pay_me/PayMeActivity\n*L\n132#1:316,12\n132#1:328\n163#1:329,8\n163#1:337\n172#1:338,8\n172#1:346\n182#1:347,12\n182#1:359\n194#1:360,12\n194#1:372\n*E\n"})
public final class PayMeActivity extends BaseMvvmActivity<PayMeViewModel> implements View.OnClickListener {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33310g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33312j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public VoiceNotifyResp f33313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33314p = C2131j.b(new C1976t(17));

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

    public PayMeActivity() {
        final int i7 = 0;
        this.f33306c = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i7) {
                    case 0:
                        int i10 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i11 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i12 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i13 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i14 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i15 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i16 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
        final int i10 = 1;
        this.f33307d = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i10) {
                    case 0:
                        int i11 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i12 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i13 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i14 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i15 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i16 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i17 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
        final int i11 = 2;
        this.f33308e = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i11) {
                    case 0:
                        int i12 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i13 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i14 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i15 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i16 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i17 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i18 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
        final int i12 = 3;
        this.f33309f = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i12) {
                    case 0:
                        int i13 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i14 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i15 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i16 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i17 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i18 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i19 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
        final int i13 = 4;
        this.f33310g = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i13) {
                    case 0:
                        int i14 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i15 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i16 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i17 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i18 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i19 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i110 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
        final int i14 = 5;
        this.f33311i = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i14) {
                    case 0:
                        int i15 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i16 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i17 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i18 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i19 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i110 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i111 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
        final int i15 = 6;
        this.f33312j = C2131j.b(new Function0(this) { // from class: td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeActivity f42591b;

            {
                this.f42591b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeActivity payMeActivity = this.f42591b;
                switch (i15) {
                    case 0:
                        int i16 = PayMeActivity.t;
                        return (SingleAdView) payMeActivity.findViewById(e.ad_merchant);
                    case 1:
                        int i17 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_check);
                    case 2:
                        int i18 = PayMeActivity.t;
                        return (LinearLayout) payMeActivity.findViewById(e.ll_voice_notify);
                    case 3:
                        int i19 = PayMeActivity.t;
                        return (ImageView) payMeActivity.findViewById(e.iv_cash_back);
                    case 4:
                        int i110 = PayMeActivity.t;
                        return (ConstraintLayout) payMeActivity.findViewById(e.cl_merchant_service);
                    case 5:
                        int i111 = PayMeActivity.t;
                        return (IconicsTextView) payMeActivity.findViewById(e.tv_transaction_history);
                    default:
                        int i112 = PayMeActivity.t;
                        return (RecyclerView) payMeActivity.findViewById(e.rv_account);
                }
            }
        });
    }

    public static final void m(PayMeActivity payMeActivity) {
        VoiceNotifyResp voiceNotifyResp = payMeActivity.f33313o;
        if (voiceNotifyResp != null) {
            Object value = payMeActivity.f33308e.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            h.s((LinearLayout) value, true);
            Object value2 = payMeActivity.f33307d.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ImageView imageView = (ImageView) value2;
            Integer status = voiceNotifyResp.getStatus();
            imageView.setImageResource((status != null && status.intValue() == 1) ? d.sm_checkbox_selected : d.sm_checkbox_unselect);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_pay_me;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final SingleAdView n() {
        Object value = this.f33306c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SingleAdView) value;
    }

    public final p173ld.e o() {
        return (p173ld.e) this.f33314p.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        if (id2 == e.tv_transaction_history) {
            ARouter.getInstance().build("/sm/money_transfer_history_activity").withInt("core_bill_in_out", 1).withInt("core_bill_status", 2).withString("core_bill_type", "03,60,s7").navigation();
            return;
        }
        if (id2 == e.ll_voice_notify) {
            if (!SPUtils.getInstance().getBoolean("voice_notification_dialog_show", true)) {
                p();
                return;
            }
            SPUtils.getInstance().put("voice_notification_dialog_show", false);
            c cVar = new c(this);
            cVar.f6596b = O6.d.f("Voice Notification");
            cVar.f6598d = "Every time you receive a payment, a voice notification will be sent to both you and the sender.";
            A a3 = new A(14);
            cVar.f6601g = "Don‘t ask again";
            cVar.f6603i = a3;
            x xVar = new x(this, 15);
            cVar.f6600f = "confirm";
            cVar.f6602h = xVar;
            cVar.g();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((PayMeViewModel) l()).d();
    }

    public final void p() {
        VoiceNotifyResp voiceNotifyResp = this.f33313o;
        if (voiceNotifyResp != null) {
            PayMeViewModel payMeViewModel = (PayMeViewModel) l();
            Integer status = voiceNotifyResp.getStatus();
            int i7 = 1;
            if (status != null && status.intValue() == 1) {
                i7 = 0;
            }
            Integer numValueOf = Integer.valueOf(i7);
            payMeViewModel.getClass();
            p140j8.f.s(payMeViewModel, new C0414t(numValueOf, null), payMeViewModel.f33984i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PayMeViewModel) l()).f33981e;
        if (lVar != null) {
            lVar.e(this, new C2023v(new p296td.d(this, this, 0), 3));
        }
        l lVar2 = ((PayMeViewModel) l()).f33985j;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new p296td.c(this, 0), 3));
        }
        l lVar3 = ((PayMeViewModel) l()).f33983g;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new p296td.c(this, 1), 3));
        }
        l lVar4 = ((PayMeViewModel) l()).f33982f;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new p296td.d(this, this, 1), 3));
        }
        l lVar5 = ((PayMeViewModel) l()).f33984i;
        if (lVar5 != null) {
            lVar5.e(this, new C2023v(new p296td.d(this, this, 2), 3));
        }
        PayMeViewModel payMeViewModel = (PayMeViewModel) l();
        payMeViewModel.getClass();
        p140j8.f.s(payMeViewModel, new C0411s(1, null), payMeViewModel.f33983g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        Object value = this.f33311i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((IconicsTextView) value).setOnClickListener(this);
        Object value2 = this.f33308e.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LinearLayout) value2).setOnClickListener(this);
        n().setAdListener(new C2025x(8));
        t tVar = this.f33312j;
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setLayoutManager(new LinearLayoutManager(this, 0, false));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((RecyclerView) value4).setAdapter(o());
        Object value5 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        C1548f c1548f = new C1548f(getColor(p.transparent), DensityUtil.dp2px(16.0f), 0, 0);
        c1548f.f31338g = true;
        ((RecyclerView) value5).addItemDecoration(c1548f);
        o().setOnItemChildClickListener(new p287se.d(this, 11));
    }
}
