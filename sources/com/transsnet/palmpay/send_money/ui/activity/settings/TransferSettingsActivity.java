package com.transsnet.palmpay.send_money.ui.activity.settings;

import L6.b;
import Pa.n0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.viewmodel.TransferLimitSettingsViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;
import p159kd.e;
import p159kd.f;
import p223od.h;
import p310ub.h1;
import p327vd.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/transfer_settings")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/settings/TransferSettingsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferLimitSettingsViewModel;", "Lod/h;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferSettingsActivity extends BaseMvvmVBActivity<TransferLimitSettingsViewModel, h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33424d = 0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(f.sm_activity_transfer_settings, (ViewGroup) null, false);
        int i7 = e.divider;
        View viewM = a.m(i7, viewInflate);
        if (viewM != null) {
            i7 = e.limitSettingsArrow;
            if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                i7 = e.limitSettingsRow;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, viewInflate);
                if (constraintLayout != null) {
                    i7 = e.limitSettingsTitle;
                    TextView textView = (TextView) a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = e.notificationSettingsArrow;
                        if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                            i7 = e.notificationSettingsRow;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) a.m(i7, viewInflate);
                            if (constraintLayout2 != null) {
                                i7 = e.notificationSettingsTitle;
                                TextView textView2 = (TextView) a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = e.settingsCard;
                                    if (((ConstraintLayout) a.m(i7, viewInflate)) != null) {
                                        i7 = e.titleBar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            h hVar = new h((ConstraintLayout) viewInflate, viewM, constraintLayout, textView, constraintLayout2, textView2, ppTitleBar);
                                            Intrinsics.checkNotNullExpressionValue(hVar, "inflate(...)");
                                            return hVar;
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
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView backImageView;
        super.setupView();
        n0.g().v("Transfer_TransferSettings_View");
        h hVar = (h) this.f27334c;
        if (hVar != null && (backImageView = hVar.f40363g.getBackImageView()) != null) {
            backImageView.setOnClickListener(new c(this, 0));
        }
        h hVar2 = (h) this.f27334c;
        if (hVar2 != null) {
            hVar2.f40359c.setOnClickListener(new h1(11));
        }
        h hVar3 = (h) this.f27334c;
        if (hVar3 != null) {
            hVar3.f40361e.setOnClickListener(new h1(12));
        }
    }
}
