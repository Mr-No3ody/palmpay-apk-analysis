package com.transsnet.palmpay.account.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckApplyTier3Rsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3EntryActivity;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "Tier3升级页", path = "/account/upgrade_tier3_export")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PalmPayLevelUpTier3EntryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PalmPayLevelViewModel;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayLevelUpTier3EntryActivity extends BaseMvvmActivity<PalmPayLevelViewModel> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25913d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PreCheckApplyTier3Rsp f25914c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PalmPayLevelViewModel palmPayLevelViewModel = (PalmPayLevelViewModel) l();
        if (palmPayLevelViewModel != null) {
            palmPayLevelViewModel.e(false);
        }
        final int i7 = 0;
        n.B(this, ((PalmPayLevelViewModel) l()).f26430e, this, new Function2(this) { // from class: N8.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelUpTier3EntryActivity f6258b;

            {
                this.f6258b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        CommonBeanResult response = (CommonBeanResult) obj2;
                        int i10 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity = this.f6258b;
                        if (zIsSuccess) {
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = (PreCheckApplyTier3Rsp) response.data;
                            if ((preCheckApplyTier3Rsp != null ? preCheckApplyTier3Rsp.lastApplyOrder : null) != null && preCheckApplyTier3Rsp != null && !preCheckApplyTier3Rsp.isApplyFailed()) {
                                io.fastkv.n.O(palmPayLevelUpTier3EntryActivity, 0, null, "Upgrade under review", null, null, null, "Your upgrade application is currently under review. Please be patient and wait for review.", Integer.valueOf(p025ba.k.core_got_it), null, new Gb.T(17, palmPayLevelUpTier3EntryActivity, preCheckApplyTier3Rsp), null, null, null, null, true, 0, 8305275);
                            } else if (preCheckApplyTier3Rsp != null && !preCheckApplyTier3Rsp.canApply && !TextUtils.isEmpty(preCheckApplyTier3Rsp.errorMsg)) {
                                io.fastkv.n.O(palmPayLevelUpTier3EntryActivity, 0, null, null, null, null, null, preCheckApplyTier3Rsp.errorMsg, Integer.valueOf(p025ba.k.core_got_it), null, new Je.l(palmPayLevelUpTier3EntryActivity, 20), null, null, null, null, true, 0, 8305279);
                            } else if (preCheckApplyTier3Rsp == null) {
                                palmPayLevelUpTier3EntryActivity.finish();
                            } else {
                                palmPayLevelUpTier3EntryActivity.f25914c = preCheckApplyTier3Rsp;
                                PalmPayLevelViewModel palmPayLevelViewModel2 = (PalmPayLevelViewModel) palmPayLevelUpTier3EntryActivity.l();
                                if (palmPayLevelViewModel2 != null) {
                                    palmPayLevelViewModel2.d(true);
                                }
                            }
                        } else {
                            p220oa.h.x(palmPayLevelUpTier3EntryActivity, response.getRespMsg());
                            palmPayLevelUpTier3EntryActivity.finish();
                        }
                        break;
                    default:
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        int i11 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (Intrinsics.c((Boolean) obj, Boolean.TRUE)) {
                            PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity2 = this.f6258b;
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = palmPayLevelUpTier3EntryActivity2.f25914c;
                            if (preCheckApplyTier3Rsp2 != null) {
                                palmPayLevelUpTier3EntryActivity2.f25914c = null;
                                if (rsp.isSuccess()) {
                                    preCheckApplyTier3Rsp2.applyTier3((RealNameAuthInfoRsp) rsp.data);
                                } else {
                                    p220oa.h.x(palmPayLevelUpTier3EntryActivity2, rsp.getRespMsg());
                                }
                                palmPayLevelUpTier3EntryActivity2.finish();
                            } else {
                                palmPayLevelUpTier3EntryActivity2.finish();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: N8.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelUpTier3EntryActivity f6260b;

            {
                this.f6260b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity = this.f6260b;
                String it = (String) obj;
                switch (i7) {
                    case 0:
                        int i10 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.x(palmPayLevelUpTier3EntryActivity, it);
                        palmPayLevelUpTier3EntryActivity.finish();
                        break;
                    default:
                        int i11 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.x(palmPayLevelUpTier3EntryActivity, it);
                        palmPayLevelUpTier3EntryActivity.finish();
                        break;
                }
                return Unit.f38893a;
            }
        }, true, null, 224);
        final int i10 = 1;
        n.B(this, ((PalmPayLevelViewModel) l()).f26431f, this, new Function2(this) { // from class: N8.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelUpTier3EntryActivity f6258b;

            {
                this.f6258b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        CommonBeanResult response = (CommonBeanResult) obj2;
                        int i11 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity = this.f6258b;
                        if (zIsSuccess) {
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = (PreCheckApplyTier3Rsp) response.data;
                            if ((preCheckApplyTier3Rsp != null ? preCheckApplyTier3Rsp.lastApplyOrder : null) != null && preCheckApplyTier3Rsp != null && !preCheckApplyTier3Rsp.isApplyFailed()) {
                                io.fastkv.n.O(palmPayLevelUpTier3EntryActivity, 0, null, "Upgrade under review", null, null, null, "Your upgrade application is currently under review. Please be patient and wait for review.", Integer.valueOf(p025ba.k.core_got_it), null, new Gb.T(17, palmPayLevelUpTier3EntryActivity, preCheckApplyTier3Rsp), null, null, null, null, true, 0, 8305275);
                            } else if (preCheckApplyTier3Rsp != null && !preCheckApplyTier3Rsp.canApply && !TextUtils.isEmpty(preCheckApplyTier3Rsp.errorMsg)) {
                                io.fastkv.n.O(palmPayLevelUpTier3EntryActivity, 0, null, null, null, null, null, preCheckApplyTier3Rsp.errorMsg, Integer.valueOf(p025ba.k.core_got_it), null, new Je.l(palmPayLevelUpTier3EntryActivity, 20), null, null, null, null, true, 0, 8305279);
                            } else if (preCheckApplyTier3Rsp == null) {
                                palmPayLevelUpTier3EntryActivity.finish();
                            } else {
                                palmPayLevelUpTier3EntryActivity.f25914c = preCheckApplyTier3Rsp;
                                PalmPayLevelViewModel palmPayLevelViewModel2 = (PalmPayLevelViewModel) palmPayLevelUpTier3EntryActivity.l();
                                if (palmPayLevelViewModel2 != null) {
                                    palmPayLevelViewModel2.d(true);
                                }
                            }
                        } else {
                            p220oa.h.x(palmPayLevelUpTier3EntryActivity, response.getRespMsg());
                            palmPayLevelUpTier3EntryActivity.finish();
                        }
                        break;
                    default:
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        int i12 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (Intrinsics.c((Boolean) obj, Boolean.TRUE)) {
                            PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity2 = this.f6258b;
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = palmPayLevelUpTier3EntryActivity2.f25914c;
                            if (preCheckApplyTier3Rsp2 != null) {
                                palmPayLevelUpTier3EntryActivity2.f25914c = null;
                                if (rsp.isSuccess()) {
                                    preCheckApplyTier3Rsp2.applyTier3((RealNameAuthInfoRsp) rsp.data);
                                } else {
                                    p220oa.h.x(palmPayLevelUpTier3EntryActivity2, rsp.getRespMsg());
                                }
                                palmPayLevelUpTier3EntryActivity2.finish();
                            } else {
                                palmPayLevelUpTier3EntryActivity2.finish();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: N8.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelUpTier3EntryActivity f6260b;

            {
                this.f6260b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity = this.f6260b;
                String it = (String) obj;
                switch (i10) {
                    case 0:
                        int i11 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.x(palmPayLevelUpTier3EntryActivity, it);
                        palmPayLevelUpTier3EntryActivity.finish();
                        break;
                    default:
                        int i12 = PalmPayLevelUpTier3EntryActivity.f25913d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.x(palmPayLevelUpTier3EntryActivity, it);
                        palmPayLevelUpTier3EntryActivity.finish();
                        break;
                }
                return Unit.f38893a;
            }
        }, true, null, 224);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(i7);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        getWindow().setBackgroundDrawable(new ColorDrawable(CommonViewExtKt.colorInt(p.transparent_60, this)));
    }
}
