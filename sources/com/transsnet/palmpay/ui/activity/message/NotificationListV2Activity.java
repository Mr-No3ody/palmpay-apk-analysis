package com.transsnet.palmpay.ui.activity.message;

import Ac.e;
import Ac.f;
import Bc.C0105b;
import Fe.q0;
import L6.b;
import O2.a;
import Wf.AbstractC0780y;
import Wf.I;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.M;
import androidx.core.provider.m;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.mvp.contract.SettingsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p171lb.d;
import p173ld.o;
import p189me.c;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "消息列表页/Notifications", path = "/main/messages_and_notifications")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/message/NotificationListV2Activity;", "Lcom/transsnet/palmpay/core/base/i;", "LFe/q0;", "Lcom/transsnet/palmpay/ui/mvp/contract/SettingsContract$View;", "<init>", "()V", "O2/a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationListV2Activity.kt\ncom/transsnet/palmpay/ui/activity/message/NotificationListV2Activity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,250:1\n562#2,10:251\n*S KotlinDebug\n*F\n+ 1 NotificationListV2Activity.kt\ncom/transsnet/palmpay/ui/activity/message/NotificationListV2Activity\n*L\n86#1:251,10\n*E\n"})
public final class NotificationListV2Activity extends i implements SettingsContract.View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34749i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0105b f34750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f34752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NotificationSettings f34754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f34755g = C2131j.b(new d(22));

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleNotificationSettings(CommonBeanResult commonBeanResult) {
        C0105b c0105b;
        Group group;
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            return;
        }
        NotificationSettings notificationSettings = (NotificationSettings) commonBeanResult.data;
        this.f34754f = notificationSettings;
        if (notificationSettings == null || (c0105b = this.f34750b) == null || (group = (Group) c0105b.f665e) == null) {
            return;
        }
        h.s(group, !notificationSettings.isNotificationAllEnabled());
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleUpdateNotificationSettingsResult(CommonResult commonResult) {
        if (commonResult == null || !commonResult.isSuccess()) {
            return;
        }
        if (this.f34754f == null) {
            this.f34754f = new NotificationSettings();
        }
        NotificationSettings notificationSettings = this.f34754f;
        if (notificationSettings != null) {
            notificationSettings.payments_alert = 1;
        }
        if (notificationSettings != null) {
            notificationSettings.message_alert = 1;
        }
        C0105b c0105b = this.f34750b;
        if (c0105b != null) {
            h.s((Group) c0105b.f665e, false);
        }
        h.z(this, "Turn on successfully", S6.a.pay_SelectedOutline, new p189me.a(true), 5);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        a aVar = new a(findViewById(e.item1), 10);
        this.f34751c = aVar;
        aVar.g(Ac.d.main_message_payments, Ac.h.main_payments, 1);
        a aVar2 = new a(findViewById(e.item2), 10);
        this.f34752d = aVar2;
        aVar2.g(Ac.d.main_message_common, Ac.h.main_messages, 2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewM2;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_notification_list_v2, (ViewGroup) null, false);
        int i7 = e.btnTurnOn;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = e.fragmentContainer;
            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
            if (frameLayout != null) {
                i7 = e.groupNotificationEnable;
                Group group = (Group) p059e1.a.m(i7, viewInflate);
                if (group != null && (viewM = p059e1.a.m((i7 = e.item1), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = e.item2), viewInflate)) != null) {
                    i7 = e.itvNotificationEnable;
                    if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.titleBar;
                        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                            C0105b c0105b = new C0105b((ConstraintLayout) viewInflate, ppButton, frameLayout, group, viewM, viewM2, 2);
                            this.f34750b = c0105b;
                            return c0105b;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new q0();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        ((Handler) this.f34755g.getValue()).removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (new M(this).f15943b.areNotificationsEnabled()) {
            NotificationSettings notificationSettings = this.f34754f;
            if (notificationSettings == null || !notificationSettings.isNotificationAllEnabled()) {
                q0 q0Var = (q0) this.f27350a;
                if (q0Var != null) {
                    q0Var.queryNotificationSetting();
                }
            } else {
                C0105b c0105b = this.f34750b;
                if (c0105b != null) {
                    h.s((Group) c0105b.f665e, false);
                }
                if (this.f34753e) {
                    h.z(this, "Turn on successfully", S6.a.pay_SelectedOutline, new p189me.a(false), 5);
                }
            }
        } else {
            C0105b c0105b2 = this.f34750b;
            if (c0105b2 != null) {
                h.s((Group) c0105b2.f665e, true);
            }
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new c(this, null), 2);
        this.f34753e = false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        C0105b c0105b = this.f34750b;
        if (c0105b != null) {
            ((PpButton) c0105b.f663c).setOnClickListener(new o(this, 6));
        }
        getWindow().getDecorView().post(new m(27, (Handler) this.f34755g.getValue(), this));
    }
}
