package com.transsnet.palmpay.core.ui.activity;

import Wf.AbstractC0780y;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.rsp.CommonRewardRsp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/claim_reward")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CommonClaimRewardActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonClaimRewardActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27481a = 0;

    public static final void l(CommonClaimRewardActivity commonClaimRewardActivity, String str) {
        commonClaimRewardActivity.getClass();
        int i7 = p025ba.k.core_oops;
        int i10 = p025ba.k.core_confirm;
        r rVar = new r(commonClaimRewardActivity, 1);
        int i11 = p025ba.k.core_retry;
        io.fastkv.n.O(commonClaimRewardActivity, 0, Integer.valueOf(i7), null, null, null, null, str, Integer.valueOf(i10), null, rVar, Integer.valueOf(i11), null, new r(commonClaimRewardActivity, 2), new r(commonClaimRewardActivity, 3), false, 0, 8262269);
    }

    public static final void m(CommonClaimRewardActivity commonClaimRewardActivity) {
        commonClaimRewardActivity.getClass();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(commonClaimRewardActivity);
        p042cg.f fVar = Wf.I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p015ag.o.f11960a, null, new C1486u(commonClaimRewardActivity, null), 2);
    }

    public static final void n(CommonClaimRewardActivity commonClaimRewardActivity, CommonRewardRsp commonRewardRsp) {
        CommonClaimRewardActivity commonClaimRewardActivity2;
        IconicsDrawable iconicsDrawableX;
        commonClaimRewardActivity.getClass();
        String str = commonRewardRsp.title;
        Integer num = commonRewardRsp.status;
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 4)) {
            commonClaimRewardActivity2 = commonClaimRewardActivity;
            iconicsDrawableX = G8.a.x(commonClaimRewardActivity2, S6.a.pay_CloseOutline, null, Integer.valueOf(L6.b.ppColorError), 48.0f, 114);
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            commonClaimRewardActivity2 = commonClaimRewardActivity;
            iconicsDrawableX = G8.a.x(commonClaimRewardActivity2, S6.a.pay_SelectedOutline, null, Integer.valueOf(L6.b.ppColorSuccess), 48.0f, 114);
        } else {
            commonClaimRewardActivity2 = commonClaimRewardActivity;
            iconicsDrawableX = G8.a.x(commonClaimRewardActivity2, S6.a.pay_WarningOutline, null, Integer.valueOf(L6.b.ppColorWarning), 48.0f, 114);
        }
        IconicsDrawable iconicsDrawable = iconicsDrawableX;
        CommonClaimRewardActivity commonClaimRewardActivity3 = commonClaimRewardActivity2;
        io.fastkv.n.O(commonClaimRewardActivity3, 0, null, str, null, iconicsDrawable, null, commonRewardRsp.content, null, TextUtils.isEmpty(commonRewardRsp.buttonText) ? "Go" : commonRewardRsp.buttonText, new p010a9.b(13, commonRewardRsp, commonClaimRewardActivity2), null, null, null, new r(commonClaimRewardActivity2, 0), false, 0, 8288603).setOnDismissListener(new Dd.b(commonClaimRewardActivity3, 19));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar(true);
    }

    public final void o() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_data");
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(this);
            p042cg.f fVar = Wf.I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, p015ag.o.f11960a, null, new C1485t(this, stringExtra, null), 2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        requestLayoutFullScreen();
    }
}
