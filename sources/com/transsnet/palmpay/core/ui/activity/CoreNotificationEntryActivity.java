package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import Pa.n0;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import com.transsnet.palmpay.core.provider.IPushModule;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreNotificationEntryActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/callback/SafeLockCheck;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreNotificationEntryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreNotificationEntryActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreNotificationEntryActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class CoreNotificationEntryActivity extends BaseActivity implements SafeLockCheck {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        requestLayoutFullScreen();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.callback.SafeLockCheck
    public final boolean ignoreLock() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        IPushModule iPushModule;
        if (!getIntent().getBooleanExtra("KEY_LAUNCH_BY_NOTIFICATION", false) || (iPushModule = (IPushModule) ARouter.getInstance().navigation(IPushModule.class)) == null) {
            return;
        }
        iPushModule.stopForegroundNotification();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Intent intent;
        if ("com.transsnet.palmpay.action.notification.click".equals(getIntent().getAction())) {
            int intExtra = getIntent().getIntExtra("extra_id", -1);
            Intent intent2 = (Intent) getIntent().getParcelableExtra("extra_data");
            String stringExtra = getIntent().getStringExtra("extra_link");
            if (intent2 != null) {
                ActivityUtils.startActivity(intent2);
                n0.g().n("click_notification_message", n0.A(intent2));
            }
            if (stringExtra != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    Intent intentA = Pa.F.a(this, stringExtra);
                    if (i0.g0(this, intentA)) {
                        if (intentA != null && (intent = getIntent()) != null) {
                            Serializable serializableExtra = intent.getSerializableExtra("contact");
                            if (serializableExtra != null) {
                                intentA.putExtra("contact", serializableExtra);
                            }
                            int intExtra2 = intent.getIntExtra("extra_id", -1);
                            if (intExtra2 > 0) {
                                intentA.putExtra("extra_id", intExtra2);
                            }
                            String stringExtra2 = intent.getStringExtra("business_data");
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                intentA.putExtra("business_data", stringExtra2);
                            }
                            String stringExtra3 = intent.getStringExtra("KEY_CATEGORY_ID");
                            if (!TextUtils.isEmpty(stringExtra3)) {
                                intentA.putExtra("KEY_CATEGORY_ID", stringExtra3);
                            }
                            Uri data = intent.getData();
                            if (data != null) {
                                intentA.setData(data);
                            }
                            String stringExtra4 = intent.getStringExtra("extra_msg_type");
                            if (!TextUtils.isEmpty(stringExtra4)) {
                                intentA.putExtra("extra_msg_type", stringExtra4);
                            }
                            String stringExtra5 = intent.getStringExtra("extra_push_msg_id");
                            if (!TextUtils.isEmpty(stringExtra5)) {
                                intentA.putExtra("extra_push_msg_id", stringExtra5);
                            }
                            String stringExtra6 = intent.getStringExtra("extra_push_batch_no");
                            if (!TextUtils.isEmpty(stringExtra6)) {
                                intentA.putExtra("extra_push_batch_no", stringExtra6);
                            }
                            intentA.putExtra(LogConstants.Autotrack.INTENT_NAME, "com.transsnet.palmpay.action.notification");
                        }
                        n0.g().n("click_notification_message", n0.A(intentA));
                    } else {
                        intentA = new Intent("com.transsnet.palmpay.action.notification");
                    }
                    ActivityUtils.startActivity(intentA);
                }
            }
            if (intExtra > 0) {
                androidx.core.app.M m7 = new androidx.core.app.M(getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
                m7.a(intExtra);
            }
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(com.transsnet.palmpay.custom_view.p.transparent_30)));
    }
}
