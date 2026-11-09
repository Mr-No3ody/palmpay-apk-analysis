package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ya.g;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillActivity;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC账单详情页", path = "/credit_score/oc_bill_activity")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcBillActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillActivity extends Za.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29339f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29340d = C2131j.b(new p068ec.d(this, 24));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OcBillFragment f29341e;

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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_bill_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final PpTitleBar m() {
        Object value = this.f29340d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (event.getEventType()) {
            case MessageEvent.EVENT_OC_REPAY_SUCCESS /* 327 */:
            case MessageEvent.EVENT_OC_REPAY_PENDING /* 328 */:
            case MessageEvent.EVENT_OC_REPAY_FAILED /* 329 */:
                OcBillFragment ocBillFragment = this.f29341e;
                if (ocBillFragment != null) {
                    ocBillFragment.x();
                    return;
                } else {
                    Intrinsics.n("mBillFg");
                    throw null;
                }
            default:
                return;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        PushMessage.Content content;
        if (pushMessage == null || (content = pushMessage.content) == null) {
            return;
        }
        if ("5025".equalsIgnoreCase(content.messageType) || "5026".equalsIgnoreCase(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType) || "5024".equalsIgnoreCase(pushMessage.content.messageType)) {
            OcBillFragment ocBillFragment = this.f29341e;
            if (ocBillFragment != null) {
                ocBillFragment.x();
            } else {
                Intrinsics.n("mBillFg");
                throw null;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        m().getRightImageView2().setImageResource(Ya.d.cs_oc_feedback_icon_big);
        m().getRightImageView2().setVisibility(8);
        m().getRightTextView().setTextColor(getColor(Ya.b.cs_oc_bill_right_menu_txt_color));
        m().getRightTextView().setText(getString(Ya.g.cs_bill_history));
        this.f29341e = new OcBillFragment();
        Bundle bundle = new Bundle();
        bundle.putString("oc_card_no", getIntent().getStringExtra("oc_card_no"));
        bundle.putLong("oc_bill_id", getIntent().getLongExtra("oc_bill_id", 0L));
        bundle.putLong("oc_future_repayment_date", getIntent().getLongExtra("oc_future_repayment_date", 0L));
        OcBillFragment ocBillFragment = this.f29341e;
        if (ocBillFragment == null) {
            Intrinsics.n("mBillFg");
            throw null;
        }
        ocBillFragment.setArguments(bundle);
        Z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager);
        int i7 = Ya.e.bill_fl;
        OcBillFragment ocBillFragment2 = this.f29341e;
        if (ocBillFragment2 == null) {
            Intrinsics.n("mBillFg");
            throw null;
        }
        c1161a.e(i7, ocBillFragment2, null);
        c1161a.h(true);
        ImageView rightImageView2 = m().getRightImageView2();
        Intrinsics.checkNotNullExpressionValue(rightImageView2, "getRightImageView2(...)");
        final int i10 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillActivity f42933b;

            {
                this.f42933b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcBillActivity ocBillActivity = this.f42933b;
                switch (i10) {
                    case 0:
                        int i11 = OcBillActivity.f29339f;
                        ARouter.getInstance().build("/credit_score/oc_feedback_activity").withString("feedback_default_tag", ocBillActivity.getString(g.cs_feedback_bill_tag)).navigation(ocBillActivity);
                        break;
                    default:
                        int i12 = OcBillActivity.f29339f;
                        ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocBillActivity);
                        break;
                }
            }
        }, rightImageView2);
        TextView rightTextView = m().getRightTextView();
        Intrinsics.checkNotNullExpressionValue(rightTextView, "getRightTextView(...)");
        final int i11 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillActivity f42933b;

            {
                this.f42933b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcBillActivity ocBillActivity = this.f42933b;
                switch (i11) {
                    case 0:
                        int i12 = OcBillActivity.f29339f;
                        ARouter.getInstance().build("/credit_score/oc_feedback_activity").withString("feedback_default_tag", ocBillActivity.getString(g.cs_feedback_bill_tag)).navigation(ocBillActivity);
                        break;
                    default:
                        int i13 = OcBillActivity.f29339f;
                        ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocBillActivity);
                        break;
                }
            }
        }, rightTextView);
        org.greenrobot.eventbus.c.b().j(this);
    }
}
