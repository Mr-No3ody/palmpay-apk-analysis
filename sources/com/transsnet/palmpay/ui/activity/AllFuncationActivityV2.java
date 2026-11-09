package com.transsnet.palmpay.ui.activity;

import Ac.f;
import Ac.h;
import Ie.s;
import L6.b;
import Pa.i0;
import Pa.n0;
import Wf.AbstractC0780y;
import Wf.I;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.util.RecentMenuCache;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p102ge.C1728a;
import p102ge.C1734g;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "全部功能页/My Service", path = "/app/all_function_activity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/AllFuncationActivityV2;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceiveEventBusMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAllFuncationActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllFuncationActivityV2.kt\ncom/transsnet/palmpay/ui/activity/AllFuncationActivityV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
public final class AllFuncationActivityV2 extends BaseActivity implements CancelAdapt {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34434e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f34435a = C2131j.b(new c(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f34436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f34437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f34438d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_all_function_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(f.main_layout_menu_model, (ViewGroup) this.f34436b, false);
        s sVar = new s(viewInflate);
        sVar.f4393d = new C1728a(this, 1);
        sVar.a(str, arrayList);
        LinearLayout linearLayout = this.f34436b;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        }
    }

    public final void m(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(f.main_layout_menu_model, (ViewGroup) this.f34436b, false);
        s sVar = new s(viewInflate);
        sVar.f4393d = new C1728a(this, 0);
        sVar.a(getString(h.main_recently_used), arrayList);
        LinearLayout linearLayout = this.f34436b;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate, 0);
        }
        this.f34437c = viewInflate;
        this.f34438d = sVar;
    }

    public final ArrayList n() {
        return (ArrayList) this.f34435a.getValue();
    }

    public final void o(HomePageMenuData homePageMenuData) {
        LinearLayout linearLayout;
        RecentMenuCache recentMenuCache = RecentMenuCache.INSTANCE;
        recentMenuCache.addRecentMenu(homePageMenuData.menuId, homePageMenuData.menuName);
        List<HomePageMenuData> listResolveRecentMenus = recentMenuCache.resolveRecentMenus(recentMenuCache.getRecentMenus(), n());
        if (listResolveRecentMenus.isEmpty()) {
            View view = this.f34437c;
            if (view != null && (linearLayout = this.f34436b) != null) {
                linearLayout.removeView(view);
            }
            this.f34437c = null;
            this.f34438d = null;
            return;
        }
        ArrayList arrayList = new ArrayList(listResolveRecentMenus);
        s sVar = this.f34438d;
        if (sVar != null) {
            sVar.a(getString(h.main_recently_used), arrayList);
        } else {
            m(arrayList);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        i0.H(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceiveEventBusMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        if (messageEvent.getEventType() == 307 || messageEvent.getEventType() == 308) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C1734g(this, null, false), 2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34436b = (LinearLayout) findViewById(Ac.e.content_root);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C1734g(this, null, true), 2);
        n0.g().v("MySerview_View");
    }
}
