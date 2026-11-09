package com.transsnet.palmpay.account.ui.activity;

import C0.G;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResultCaller;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.fragment.changemobile.ChangeMobileStep2Fragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "修改手机号", path = "/account/changeMobile")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/ChangeMobileActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeMobileActivity extends BaseActivity implements EasyPermissions$PermissionCallbacks {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25839e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25842c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GetSecurityFlowRsp f25843d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(a aVar, Activity activity, String str, String str2, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str = null;
            }
            if ((i7 & 4) != 0) {
                str2 = null;
            }
            aVar.start(activity, str, str2);
        }

        public final void start(@Nullable Activity activity, @Nullable String str, @Nullable String str2) {
            Intent intent = new Intent(activity, (Class<?>) ChangeMobileActivity.class);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("oldNumber", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("_token", str);
            }
            ActivityUtils.startActivity(activity, intent);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_change_mobile;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List perms) {
        Intrinsics.checkNotNullParameter(perms, "perms");
        ActivityResultCaller activityResultCallerD = getSupportFragmentManager().D(d.fragmentContainer);
        if (activityResultCallerD instanceof EasyPermissions$PermissionCallbacks) {
            ((EasyPermissions$PermissionCallbacks) activityResultCallerD).onPermissionsDenied(i7, perms);
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List perms) {
        Intrinsics.checkNotNullParameter(perms, "perms");
        ActivityResultCaller activityResultCallerD = getSupportFragmentManager().D(d.fragmentContainer);
        if (activityResultCallerD instanceof EasyPermissions$PermissionCallbacks) {
            ((EasyPermissions$PermissionCallbacks) activityResultCallerD).onPermissionsGranted(i7, perms);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        if (TextUtils.isEmpty(this.f25840a)) {
            this.f25840a = G.A();
        }
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25843d;
        if (!TextUtils.isEmpty(getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null)) {
            GetSecurityFlowRsp getSecurityFlowRsp2 = this.f25843d;
            this.f25840a = getSecurityFlowRsp2 != null ? getSecurityFlowRsp2.mobile : null;
        }
        setTitle(h.ac_mobile_number);
        if (getSupportFragmentManager().D(d.fragmentContainer) instanceof ChangeMobileStep2Fragment) {
            return;
        }
        p220oa.h.i(this, d.fragmentContainer, ChangeMobileStep2Fragment.f26124o.newInstance());
    }
}
