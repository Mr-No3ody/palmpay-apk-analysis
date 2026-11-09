package com.transsnet.palmpay.ui.activity.message;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.n;
import L6.b;
import N8.q0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.ui.fragment.MessageListFragment;
import kotlin.Metadata;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/notifications")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/message/NotificationsActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f34758c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int i7;
        if (TextUtils.isEmpty(this.f34756a)) {
            this.f34756a = getIntent().getAction();
        }
        if ("com.transsnet.palmpay.action.notification.payment".equalsIgnoreCase(this.f34756a)) {
            l(h.main_payments);
            i7 = 0;
        } else if ("com.transsnet.palmpay.action.notification.common".equalsIgnoreCase(this.f34756a)) {
            l(h.main_messages);
            i7 = 1;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        if (TextUtils.isEmpty(this.f34757b)) {
            l(h.main_notifications);
        } else {
            setTitle(this.f34757b);
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.fragmentContainer, new MessageListFragment(i7), null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundDark), getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_notifications, (ViewGroup) null, false);
        int i7 = e.fragmentContainer;
        if (((LinearLayout) a.m(i7, viewInflate)) != null) {
            i7 = e.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                n nVar = new n((LinearLayout) viewInflate, ppTitleBar, 0);
                this.f34758c = nVar;
                return nVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l(int i7) {
        PpTitleBar ppTitleBar;
        n nVar = this.f34758c;
        if (nVar == null || (ppTitleBar = nVar.f781c) == null) {
            return;
        }
        ppTitleBar.setTitle(getResources().getString(i7));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
