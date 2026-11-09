package com.transsnet.palmpay.send_money.ui.activity.topp;

import C0.G;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.RecipientDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.RequestPermissionDetailsActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p188md.b;
import p220oa.h;
import p327vd.c;
import p355xf.C2131j;
import p355xf.t;
import p369yd.i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/RequestPermissionDetailsActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestPermissionDetailsActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33585f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecipientDetailResp f33589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f33590e = new c(this, 14);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Context context, @Nullable String str) {
            Intent intentE = G.e(context, "context", context, RequestPermissionDetailsActivity.class);
            if (str == null) {
                str = "";
            }
            intentE.putExtra("RECIPIENT_ID", str);
            context.startActivity(intentE);
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public RequestPermissionDetailsActivity() {
        final int i7 = 0;
        this.f33586a = C2131j.b(new Function0(this) { // from class: yd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestPermissionDetailsActivity f44294b;

            {
                this.f44294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestPermissionDetailsActivity requestPermissionDetailsActivity = this.f44294b;
                switch (i7) {
                    case 0:
                        int i10 = RequestPermissionDetailsActivity.f33585f;
                        return (LinearLayout) requestPermissionDetailsActivity.findViewById(e.saveLocalContact);
                    default:
                        int i11 = RequestPermissionDetailsActivity.f33585f;
                        return (CheckBox) requestPermissionDetailsActivity.findViewById(e.f38747cb);
                }
            }
        });
        final int i10 = 1;
        this.f33587b = C2131j.b(new Function0(this) { // from class: yd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestPermissionDetailsActivity f44294b;

            {
                this.f44294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestPermissionDetailsActivity requestPermissionDetailsActivity = this.f44294b;
                switch (i10) {
                    case 0:
                        int i11 = RequestPermissionDetailsActivity.f33585f;
                        return (LinearLayout) requestPermissionDetailsActivity.findViewById(e.saveLocalContact);
                    default:
                        int i12 = RequestPermissionDetailsActivity.f33585f;
                        return (CheckBox) requestPermissionDetailsActivity.findViewById(e.f38747cb);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_request_permission_details;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra = getIntent().getStringExtra("RECIPIENT_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Intrinsics.checkNotNullParameter(stringExtra, "<set-?>");
        this.f33588c = stringExtra;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        String str = this.f33588c;
        if (str == null) {
            Intrinsics.n("mRecipientMemberId");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) b.f39648a.f6830b;
        String str2 = this.f33588c;
        if (str2 != null) {
            sendMoneyApiService.queryRecipients(str2).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new i(this, 1));
        } else {
            Intrinsics.n("mRecipientMemberId");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
        Object value = this.f33586a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Object value2 = this.f33587b.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.q(this.f33590e, (LinearLayout) value, (CheckBox) value2);
    }
}
