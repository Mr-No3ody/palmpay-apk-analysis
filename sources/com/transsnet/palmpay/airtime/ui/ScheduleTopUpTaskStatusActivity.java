package com.transsnet.palmpay.airtime.ui;

import L6.b;
import Pa.i0;
import Pa.n0;
import Pd.c;
import Pd.d;
import Rd.A;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskStatusActivity;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.g0;
import p059e1.a;
import p140j8.f;
import p141j9.s;
import p141j9.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/Schedule Topup Task Status", path = "/airtime/airtime_schedule_topup_task_status")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/ScheduleTopUpTaskStatusActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/A;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpTaskStatusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpTaskStatusActivity.kt\ncom/transsnet/palmpay/airtime/ui/ScheduleTopUpTaskStatusActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n260#2,10:262\n296#2:272\n1#3:273\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpTaskStatusActivity.kt\ncom/transsnet/palmpay/airtime/ui/ScheduleTopUpTaskStatusActivity\n*L\n75#1:262,10\n75#1:272\n*E\n"})
public final class ScheduleTopUpTaskStatusActivity extends BaseMvvmVBActivity<ScheduleTopUpViewModel, A> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26483f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26485e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this), !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_schedule_top_up_task_status, (ViewGroup) null, false);
        int i7 = c.ivAutoRenewBenefits;
        ImageView imageView = (ImageView) a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = c.ivTopHeader;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = c.layoutBottom;
                if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                    i7 = c.layoutResultBillerList;
                    LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                    if (linearLayout != null) {
                        i7 = c.layoutResultItemList;
                        LinearLayout linearLayout2 = (LinearLayout) a.m(i7, viewInflate);
                        if (linearLayout2 != null) {
                            i7 = c.llRenewBenefits;
                            LinearLayout linearLayout3 = (LinearLayout) a.m(i7, viewInflate);
                            if (linearLayout3 != null) {
                                i7 = c.llTop;
                                if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                                    i7 = c.scrollView;
                                    if (((NestedScrollView) a.m(i7, viewInflate)) != null) {
                                        i7 = c.titleBar;
                                        if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                                            i7 = c.tvChangeFreq;
                                            TextView textView = (TextView) a.m(i7, viewInflate);
                                            if (textView != null) {
                                                i7 = c.tvComplete;
                                                PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                                                if (ppButton != null) {
                                                    i7 = c.tvConfirm;
                                                    IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewInflate);
                                                    if (iconicsTextView != null) {
                                                        i7 = c.tvEnableNotify;
                                                        PpButton ppButton2 = (PpButton) a.m(i7, viewInflate);
                                                        if (ppButton2 != null) {
                                                            i7 = c.tvState;
                                                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                                                            if (textView2 != null) {
                                                                A a3 = new A((ConstraintLayout) viewInflate, imageView, appCompatImageView, linearLayout, linearLayout2, linearLayout3, textView, ppButton, iconicsTextView, ppButton2, textView2);
                                                                Intrinsics.checkNotNullExpressionValue(a3, "inflate(...)");
                                                                return a3;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ScheduleTopUpViewModel scheduleTopUpViewModel;
        ARouter.getInstance().inject(this);
        String taskId = this.f26485e;
        if (taskId != null && (scheduleTopUpViewModel = (ScheduleTopUpViewModel) l()) != null) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            f.s(scheduleTopUpViewModel, new g0(taskId, null), scheduleTopUpViewModel.f26636H, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        n0.g().v("AirtimeAutoRenewResultPage");
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) l();
        l lVar = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26636H : null;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 0)));
        }
        A a3 = (A) this.f27334c;
        if (a3 != null) {
            a3.f7975j.setOnClickListener(new p054dd.d(17));
        }
        A a10 = (A) this.f27334c;
        if (a10 != null) {
            final int i7 = 0;
            a10.f7974i.setOnClickListener(new View.OnClickListener(this) { // from class: j9.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpTaskStatusActivity f38426b;

                {
                    this.f38426b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScheduleTopUpTaskStatusActivity scheduleTopUpTaskStatusActivity = this.f38426b;
                    switch (i7) {
                        case 0:
                            int i10 = ScheduleTopUpTaskStatusActivity.f26483f;
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                        case 1:
                            int i11 = ScheduleTopUpTaskStatusActivity.f26483f;
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                            n0.g().l("AirtimeAutoRenewResultPage_PushButton");
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                        default:
                            int i12 = ScheduleTopUpTaskStatusActivity.f26483f;
                            i0.b0("/single-page/auto-renew-airtime/home");
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                    }
                }
            });
        }
        A a11 = (A) this.f27334c;
        if (a11 != null) {
            final int i10 = 1;
            a11.f7976o.setOnClickListener(new View.OnClickListener(this) { // from class: j9.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpTaskStatusActivity f38426b;

                {
                    this.f38426b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScheduleTopUpTaskStatusActivity scheduleTopUpTaskStatusActivity = this.f38426b;
                    switch (i10) {
                        case 0:
                            int i11 = ScheduleTopUpTaskStatusActivity.f26483f;
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                        case 1:
                            int i12 = ScheduleTopUpTaskStatusActivity.f26483f;
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                            n0.g().l("AirtimeAutoRenewResultPage_PushButton");
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                        default:
                            int i13 = ScheduleTopUpTaskStatusActivity.f26483f;
                            i0.b0("/single-page/auto-renew-airtime/home");
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                    }
                }
            });
        }
        A a12 = (A) this.f27334c;
        if (a12 != null) {
            final int i11 = 2;
            a12.f7973g.setOnClickListener(new View.OnClickListener(this) { // from class: j9.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpTaskStatusActivity f38426b;

                {
                    this.f38426b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScheduleTopUpTaskStatusActivity scheduleTopUpTaskStatusActivity = this.f38426b;
                    switch (i11) {
                        case 0:
                            int i12 = ScheduleTopUpTaskStatusActivity.f26483f;
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                        case 1:
                            int i13 = ScheduleTopUpTaskStatusActivity.f26483f;
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                            n0.g().l("AirtimeAutoRenewResultPage_PushButton");
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                        default:
                            int i14 = ScheduleTopUpTaskStatusActivity.f26483f;
                            i0.b0("/single-page/auto-renew-airtime/home");
                            scheduleTopUpTaskStatusActivity.finish();
                            break;
                    }
                }
            });
        }
    }
}
