package com.transsnet.palmpay.send_money.ui.activity.settings;

import L6.b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.viewmodel.TransferLimitSettingsViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;
import p223od.f;
import p285sc.x;
import p310ub.h1;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/transfer_notification_settings")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/settings/TransferNotificationSettingsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferLimitSettingsViewModel;", "Lod/f;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferNotificationSettingsActivity extends BaseMvvmVBActivity<TransferLimitSettingsViewModel, f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33423d = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

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
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_activity_transfer_notification_settings, (ViewGroup) null, false);
        int i7 = e.emailNotificationArrow;
        if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.emailNotificationRow;
            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
            if (constraintLayout != null) {
                i7 = e.settingsCard;
                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.smsNotificationArrow;
                    if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.smsNotificationRow;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                        if (constraintLayout2 != null) {
                            i7 = e.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                f fVar = new f((ConstraintLayout) viewInflate, constraintLayout, constraintLayout2, ppTitleBar);
                                Intrinsics.checkNotNullExpressionValue(fVar, "inflate(...)");
                                return fVar;
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
        f fVar = (f) this.f27334c;
        if (fVar != null && (backImageView = fVar.f40341d.getBackImageView()) != null) {
            backImageView.setOnClickListener(new x(this, 29));
        }
        f fVar2 = (f) this.f27334c;
        if (fVar2 != null) {
            fVar2.f40340c.setOnClickListener(new h1(9));
        }
        f fVar3 = (f) this.f27334c;
        if (fVar3 != null) {
            fVar3.f40339b.setOnClickListener(new h1(10));
        }
    }
}
