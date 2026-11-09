package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Ya.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcLastProtocolActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "授信Flexi协议教育页", path = "/credit_score/oc_last_protocol_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcLastProtocolActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcLastProtocolActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f29555r0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29556Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29557Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29558k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29559p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29560q0;

    public OcLastProtocolActivity() {
        final int i7 = 0;
        this.f29556Y = C2131j.b(new Function0(this) { // from class: ub.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42849b;

            {
                this.f42849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcLastProtocolActivity ocLastProtocolActivity = this.f42849b;
                switch (i7) {
                    case 0:
                        int i10 = OcLastProtocolActivity.f29555r0;
                        return (Button) ocLastProtocolActivity.findViewById(e.confirm_bt);
                    case 1:
                        int i11 = OcLastProtocolActivity.f29555r0;
                        return (Group) ocLastProtocolActivity.findViewById(e.protocol_group);
                    case 2:
                        int i12 = OcLastProtocolActivity.f29555r0;
                        return (TextView) ocLastProtocolActivity.findViewById(e.proto_tv);
                    case 3:
                        int i13 = OcLastProtocolActivity.f29555r0;
                        return (CheckBox) ocLastProtocolActivity.findViewById(e.proto_cb);
                    default:
                        int i14 = OcLastProtocolActivity.f29555r0;
                        return (PpTitleBar) ocLastProtocolActivity.findViewById(e.titleBar);
                }
            }
        });
        final int i10 = 1;
        this.f29557Z = C2131j.b(new Function0(this) { // from class: ub.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42849b;

            {
                this.f42849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcLastProtocolActivity ocLastProtocolActivity = this.f42849b;
                switch (i10) {
                    case 0:
                        int i11 = OcLastProtocolActivity.f29555r0;
                        return (Button) ocLastProtocolActivity.findViewById(e.confirm_bt);
                    case 1:
                        int i12 = OcLastProtocolActivity.f29555r0;
                        return (Group) ocLastProtocolActivity.findViewById(e.protocol_group);
                    case 2:
                        int i13 = OcLastProtocolActivity.f29555r0;
                        return (TextView) ocLastProtocolActivity.findViewById(e.proto_tv);
                    case 3:
                        int i14 = OcLastProtocolActivity.f29555r0;
                        return (CheckBox) ocLastProtocolActivity.findViewById(e.proto_cb);
                    default:
                        int i15 = OcLastProtocolActivity.f29555r0;
                        return (PpTitleBar) ocLastProtocolActivity.findViewById(e.titleBar);
                }
            }
        });
        final int i11 = 2;
        this.f29558k0 = C2131j.b(new Function0(this) { // from class: ub.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42849b;

            {
                this.f42849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcLastProtocolActivity ocLastProtocolActivity = this.f42849b;
                switch (i11) {
                    case 0:
                        int i12 = OcLastProtocolActivity.f29555r0;
                        return (Button) ocLastProtocolActivity.findViewById(e.confirm_bt);
                    case 1:
                        int i13 = OcLastProtocolActivity.f29555r0;
                        return (Group) ocLastProtocolActivity.findViewById(e.protocol_group);
                    case 2:
                        int i14 = OcLastProtocolActivity.f29555r0;
                        return (TextView) ocLastProtocolActivity.findViewById(e.proto_tv);
                    case 3:
                        int i15 = OcLastProtocolActivity.f29555r0;
                        return (CheckBox) ocLastProtocolActivity.findViewById(e.proto_cb);
                    default:
                        int i16 = OcLastProtocolActivity.f29555r0;
                        return (PpTitleBar) ocLastProtocolActivity.findViewById(e.titleBar);
                }
            }
        });
        final int i12 = 3;
        this.f29559p0 = C2131j.b(new Function0(this) { // from class: ub.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42849b;

            {
                this.f42849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcLastProtocolActivity ocLastProtocolActivity = this.f42849b;
                switch (i12) {
                    case 0:
                        int i13 = OcLastProtocolActivity.f29555r0;
                        return (Button) ocLastProtocolActivity.findViewById(e.confirm_bt);
                    case 1:
                        int i14 = OcLastProtocolActivity.f29555r0;
                        return (Group) ocLastProtocolActivity.findViewById(e.protocol_group);
                    case 2:
                        int i15 = OcLastProtocolActivity.f29555r0;
                        return (TextView) ocLastProtocolActivity.findViewById(e.proto_tv);
                    case 3:
                        int i16 = OcLastProtocolActivity.f29555r0;
                        return (CheckBox) ocLastProtocolActivity.findViewById(e.proto_cb);
                    default:
                        int i17 = OcLastProtocolActivity.f29555r0;
                        return (PpTitleBar) ocLastProtocolActivity.findViewById(e.titleBar);
                }
            }
        });
        final int i13 = 4;
        this.f29560q0 = C2131j.b(new Function0(this) { // from class: ub.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42849b;

            {
                this.f42849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcLastProtocolActivity ocLastProtocolActivity = this.f42849b;
                switch (i13) {
                    case 0:
                        int i14 = OcLastProtocolActivity.f29555r0;
                        return (Button) ocLastProtocolActivity.findViewById(e.confirm_bt);
                    case 1:
                        int i15 = OcLastProtocolActivity.f29555r0;
                        return (Group) ocLastProtocolActivity.findViewById(e.protocol_group);
                    case 2:
                        int i16 = OcLastProtocolActivity.f29555r0;
                        return (TextView) ocLastProtocolActivity.findViewById(e.proto_tv);
                    case 3:
                        int i17 = OcLastProtocolActivity.f29555r0;
                        return (CheckBox) ocLastProtocolActivity.findViewById(e.proto_cb);
                    default:
                        int i18 = OcLastProtocolActivity.f29555r0;
                        return (PpTitleBar) ocLastProtocolActivity.findViewById(e.titleBar);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_last_protocol_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        goBackToHome();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).querySignStatus(new DoubleSignReq("OK_CARD")).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 17));
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        Object value = this.f29556Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42855b;

            {
                this.f42855b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                if (((android.widget.CheckBox) r2).isChecked() != false) goto L14;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r26) {
                /*
                    Method dump skipped, instruction units count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p310ub.ViewOnClickListenerC2077g0.onClick(android.view.View):void");
            }
        }, (Button) value);
        Object value2 = this.f29560q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((PpTitleBar) value2).setBackButtonClickListener(new View.OnClickListener(this) { // from class: ub.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcLastProtocolActivity f42855b;

            {
                this.f42855b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                if (((android.widget.CheckBox) r2).isChecked() != false) goto L14;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r26) {
                /*
                    Method dump skipped, instruction units count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p310ub.ViewOnClickListenerC2077g0.onClick(android.view.View):void");
            }
        });
    }
}
