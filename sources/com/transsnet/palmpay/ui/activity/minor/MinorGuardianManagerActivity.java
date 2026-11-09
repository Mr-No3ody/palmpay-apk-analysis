package com.transsnet.palmpay.ui.activity.minor;

import Ac.e;
import Ac.f;
import Bc.C0106c;
import Bc.l;
import Pe.Q;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p141j9.s;
import p141j9.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/minor_account_guardian")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/minor/MinorGuardianManagerActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/MinorViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMinorGuardianManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorGuardianManagerActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorGuardianManagerActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,83:1\n260#2,10:84\n296#2:94\n*S KotlinDebug\n*F\n+ 1 MinorGuardianManagerActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorGuardianManagerActivity\n*L\n46#1:84,10\n46#1:94\n*E\n"})
public final class MinorGuardianManagerActivity extends BaseMvvmActivity<MinorViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f34775c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((MinorViewModel) l()).f35384p;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 9), (byte) 0, false));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_minor_guardian_manager, (ViewGroup) null, false);
        int i7 = e.cslTop;
        View viewM = a.m(i7, viewInflate);
        if (viewM != null) {
            C0106c c0106cA = C0106c.a(viewM);
            int i10 = e.titleBar;
            if (((PpTitleBar) a.m(i10, viewInflate)) != null) {
                l lVar = new l((LinearLayout) viewInflate, c0106cA, 0);
                this.f34775c = lVar;
                return lVar;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        MinorViewModel minorViewModel = (MinorViewModel) l();
        minorViewModel.getClass();
        p140j8.f.s(minorViewModel, new Q(1, null), minorViewModel.f35384p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
