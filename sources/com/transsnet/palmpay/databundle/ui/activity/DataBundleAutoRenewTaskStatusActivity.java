package com.transsnet.palmpay.databundle.ui.activity;

import L6.b;
import Pa.n0;
import Pd.c;
import Pd.d;
import Rd.C0588d;
import T8.o;
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
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoRenewTaskStatusActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.S;
import p059e1.a;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "流量/Auto Renew Task Status", path = "/databundle/auto_renew_task_status", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/databundle/ui/activity/DataBundleAutoRenewTaskStatusActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/d;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleAutoRenewTaskStatusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleAutoRenewTaskStatusActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/DataBundleAutoRenewTaskStatusActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n260#2,10:262\n296#2:272\n1#3:273\n*S KotlinDebug\n*F\n+ 1 DataBundleAutoRenewTaskStatusActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/DataBundleAutoRenewTaskStatusActivity\n*L\n69#1:262,10\n69#1:272\n*E\n"})
public final class DataBundleAutoRenewTaskStatusActivity extends BaseMvvmVBActivity<ScheduleTopUpViewModel, C0588d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31766e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31767d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_auto_renew_task_status, (ViewGroup) null, false);
        int i7 = c.ivAutoRenewBenefits;
        ImageView imageView = (ImageView) a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = c.ivIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = c.layoutAmountItemList;
                LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                if (linearLayout != null) {
                    i7 = c.layoutBottom;
                    if (((LinearLayout) a.m(i7, viewInflate)) != null) {
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
                                                            i7 = c.tvStatusTips;
                                                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                                                            if (textView2 != null) {
                                                                i7 = c.tvTitle;
                                                                TextView textView3 = (TextView) a.m(i7, viewInflate);
                                                                if (textView3 != null) {
                                                                    C0588d c0588d = new C0588d((ConstraintLayout) viewInflate, imageView, appCompatImageView, linearLayout, linearLayout2, linearLayout3, textView, ppButton, iconicsTextView, ppButton2, textView2, textView3);
                                                                    Intrinsics.checkNotNullExpressionValue(c0588d, "inflate(...)");
                                                                    return c0588d;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Unit unit;
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this), !isDarkMode());
        ARouter.getInstance().inject(this);
        String taskId = this.f31767d;
        if (taskId == null) {
            finish();
        } else {
            ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) l();
            if (scheduleTopUpViewModel != null) {
                Intrinsics.checkNotNullParameter(taskId, "taskId");
                f.s(scheduleTopUpViewModel, new S(taskId, null), scheduleTopUpViewModel.f26639Q, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                finish();
            }
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) l();
        l lVar = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26639Q : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new o(24, this, this), (char) 0, (byte) 0));
        }
        C0588d c0588d = (C0588d) this.f27334c;
        if (c0588d != null) {
            c0588d.f8247j.setOnClickListener(new p054dd.d(4));
        }
        C0588d c0588d2 = (C0588d) this.f27334c;
        if (c0588d2 != null) {
            final int i7 = 0;
            c0588d2.f8246i.setOnClickListener(new View.OnClickListener(this) { // from class: ec.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DataBundleAutoRenewTaskStatusActivity f36278b;

                {
                    this.f36278b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataBundleAutoRenewTaskStatusActivity dataBundleAutoRenewTaskStatusActivity = this.f36278b;
                    switch (i7) {
                        case 0:
                            int i10 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                            dataBundleAutoRenewTaskStatusActivity.finish();
                            break;
                        default:
                            int i11 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                            n0.g().l("DataAutoRenewResultPage_PushButton");
                            dataBundleAutoRenewTaskStatusActivity.finish();
                            break;
                    }
                }
            });
        }
        C0588d c0588d3 = (C0588d) this.f27334c;
        if (c0588d3 != null) {
            final int i10 = 1;
            c0588d3.f8248o.setOnClickListener(new View.OnClickListener(this) { // from class: ec.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DataBundleAutoRenewTaskStatusActivity f36278b;

                {
                    this.f36278b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataBundleAutoRenewTaskStatusActivity dataBundleAutoRenewTaskStatusActivity = this.f36278b;
                    switch (i10) {
                        case 0:
                            int i11 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                            dataBundleAutoRenewTaskStatusActivity.finish();
                            break;
                        default:
                            int i12 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                            n0.g().l("DataAutoRenewResultPage_PushButton");
                            dataBundleAutoRenewTaskStatusActivity.finish();
                            break;
                    }
                }
            });
        }
        C0588d c0588d4 = (C0588d) this.f27334c;
        if (c0588d4 != null) {
            c0588d4.f8245g.setOnClickListener(new p054dd.d(5));
        }
        n0.g().v("DataAutoRenewResultPage");
    }
}
