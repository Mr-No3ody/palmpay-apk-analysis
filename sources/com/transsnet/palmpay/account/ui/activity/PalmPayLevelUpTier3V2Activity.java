package com.transsnet.palmpay.account.ui.activity;

import Bc.n;
import C0.P;
import C0.U;
import F8.d;
import F8.e;
import L6.b;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.custom_view.m;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294tb.I;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/upgrade_tier3")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PalmPayLevelUpTier3V2Activity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/manager/FileUploadManager$UploadListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayLevelUpTier3V2Activity extends BaseActivity implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f25915o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f25916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f25920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public QueryAddressFromBillRsp f25921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25922g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Tier3ApplyStatusRsp f25923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f25924j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ U buildSlideNavOptions$default(a aVar, Integer num, boolean z3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = null;
            }
            if ((i7 & 2) != 0) {
                z3 = false;
            }
            return aVar.buildSlideNavOptions(num, z3);
        }

        @NotNull
        public final U buildSlideNavOptions(@IdRes @Nullable Integer num, boolean z3) {
            int iIntValue;
            boolean z8;
            int i7 = m.cv_anim_slide_alpha_in_right;
            int i10 = m.cv_anim_slide_alpha_out_left;
            int i11 = m.cv_anim_slide_alpha_in_left;
            int i12 = m.cv_anim_slide_alpha_out_right;
            if (num != null) {
                iIntValue = num.intValue();
                z8 = z3;
            } else {
                iIntValue = -1;
                z8 = false;
            }
            return new U(false, false, iIntValue, z8, false, i7, i10, i11, i12);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    public final PpTitleBar getTitleBar() {
        n nVar = this.f25924j;
        if (nVar != null) {
            return nVar.f781c;
        }
        return null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_palmpay_level_up_tier3_v2, (ViewGroup) null, false);
        int i7 = d.nav_host_fragment;
        if (((FragmentContainerView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = d.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                n nVar = new n((LinearLayout) viewInflate, ppTitleBar, 1);
                this.f25924j = nVar;
                return nVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        this.f25917b = str;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        Bundle extras = getIntent().getExtras();
        this.f25920e = (extras != null && extras.containsKey("extra_data_2")) ? Long.valueOf(getIntent().getLongExtra("extra_data_2", 0L)) : null;
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().D(d.nav_host_fragment);
        this.f25916a = navHostFragment != null ? navHostFragment.f() : null;
        getOnBackPressedDispatcher().a(this, new I(this, 2));
        if (this.f25919d) {
            U uBuildSlideNavOptions = f25915o.buildSlideNavOptions(Integer.valueOf(d.fragment_tier3_step_face), true);
            if (TextUtils.isEmpty(this.f25918c)) {
                P p3 = this.f25916a;
                if (p3 != null) {
                    p3.h(d.fragment_tier3_step_bill_upload, null, uBuildSlideNavOptions);
                    return;
                }
                return;
            }
            P p10 = this.f25916a;
            if (p10 != null) {
                p10.h(d.fragment_tier3_step_bills, null, uBuildSlideNavOptions);
            }
        }
    }
}
