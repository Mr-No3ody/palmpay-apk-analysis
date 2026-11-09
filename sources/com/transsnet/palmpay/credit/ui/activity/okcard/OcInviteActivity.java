package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ya.e;
import android.os.Bundle;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInviteActivity;
import com.transsnet.palmpay.custom_view.PinEntryView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p285sc.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC邀请码页", path = "/credit_score/oc_invite_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcInviteActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcInviteActivity extends Za.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29551f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29553e;

    public OcInviteActivity() {
        final int i7 = 0;
        this.f29552d = C2131j.b(new Function0(this) { // from class: ub.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInviteActivity f42843b;

            {
                this.f42843b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInviteActivity ocInviteActivity = this.f42843b;
                switch (i7) {
                    case 0:
                        int i10 = OcInviteActivity.f29551f;
                        return (Button) ocInviteActivity.findViewById(e.invite_bt);
                    default:
                        int i11 = OcInviteActivity.f29551f;
                        return (PinEntryView) ocInviteActivity.findViewById(e.invite_code_pev);
                }
            }
        });
        final int i10 = 1;
        this.f29553e = C2131j.b(new Function0(this) { // from class: ub.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInviteActivity f42843b;

            {
                this.f42843b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInviteActivity ocInviteActivity = this.f42843b;
                switch (i10) {
                    case 0:
                        int i11 = OcInviteActivity.f29551f;
                        return (Button) ocInviteActivity.findViewById(e.invite_bt);
                    default:
                        int i12 = OcInviteActivity.f29551f;
                        return (PinEntryView) ocInviteActivity.findViewById(e.invite_code_pev);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_invite_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        Object value = this.f29553e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PinEntryView) value).setOnPinEnteredListener(new p287se.d(this, 13));
        Object value2 = this.f29552d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        p220oa.h.l(new x(this, 21), (Button) value2);
    }
}
