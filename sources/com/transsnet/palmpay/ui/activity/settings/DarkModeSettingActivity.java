package com.transsnet.palmpay.ui.activity.settings;

import Ac.e;
import Ac.f;
import Bc.g;
import L6.b;
import O6.d;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.settings.DarkModeSettingActivity;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.viewmodule.DarkModeSettingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "暗黑模式设置/Dark Mode", path = "/main/dark_mode_setting")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/DarkModeSettingActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/viewmodule/DarkModeSettingViewModel;", "LBc/g;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DarkModeSettingActivity extends BaseMvvmVBActivity<DarkModeSettingViewModel, g> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34948g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34949d = r0.V0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34950e = r0.Z0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f34951f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_dark_mode_setting, (ViewGroup) null, false);
        int i7 = e.clAutomaticDarkMode;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, viewInflate);
        if (constraintLayout != null) {
            i7 = e.itvDarkMode;
            IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewInflate);
            if (iconicsTextView != null) {
                i7 = e.itvNormalMode;
                IconicsTextView iconicsTextView2 = (IconicsTextView) a.m(i7, viewInflate);
                if (iconicsTextView2 != null) {
                    i7 = e.ivAutomaticCheck;
                    IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
                    if (iconicsImageView != null) {
                        i7 = e.llSelectManually;
                        if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                            i7 = e.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = e.tvAutoDescribe;
                                TextView textView = (TextView) a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = e.tvAutoTitle;
                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = e.tvSelectManually;
                                        TextView textView3 = (TextView) a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            g gVar = new g((LinearLayout) viewInflate, constraintLayout, iconicsTextView, iconicsTextView2, iconicsImageView, ppTitleBar, textView, textView2, textView3);
                                            Intrinsics.checkNotNullExpressionValue(gVar, "inflate(...)");
                                            return gVar;
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

    public final void n() {
        g gVar = (g) this.f27334c;
        if (gVar != null) {
            IconicsImageView iconicsImageView = gVar.f708e;
            IconicsDrawable iconicsDrawable = new IconicsDrawable(this, this.f34949d ? S6.a.pay_CircleFill : S6.a.pay_CircleOutline);
            final int i7 = 0;
            iconicsDrawable.a(new Function1(this) { // from class: se.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DarkModeSettingActivity f42242b;

                {
                    this.f42242b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DarkModeSettingActivity darkModeSettingActivity = this.f42242b;
                    IconicsDrawable apply = (IconicsDrawable) obj;
                    switch (i7) {
                        case 0:
                            int i10 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                        case 1:
                            int i11 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                        default:
                            int i12 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            iconicsImageView.setImageDrawable(iconicsDrawable);
        }
        g gVar2 = (g) this.f27334c;
        if (gVar2 != null) {
            IconicsTextView iconicsTextView = gVar2.f707d;
            IconicsDrawable iconicsDrawable2 = new IconicsDrawable(this, (this.f34950e || this.f34949d) ? S6.a.pay_CircleOutline : S6.a.pay_CircleFill);
            final int i10 = 1;
            iconicsDrawable2.a(new Function1(this) { // from class: se.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DarkModeSettingActivity f42242b;

                {
                    this.f42242b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DarkModeSettingActivity darkModeSettingActivity = this.f42242b;
                    IconicsDrawable apply = (IconicsDrawable) obj;
                    switch (i10) {
                        case 0:
                            int i11 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                        case 1:
                            int i12 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                        default:
                            int i13 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            iconicsTextView.setCompoundDrawables(null, null, iconicsDrawable2, null);
        }
        g gVar3 = (g) this.f27334c;
        if (gVar3 != null) {
            IconicsTextView iconicsTextView2 = gVar3.f706c;
            IconicsDrawable iconicsDrawable3 = new IconicsDrawable(this, (!this.f34950e || this.f34949d) ? S6.a.pay_CircleOutline : S6.a.pay_CircleFill);
            final int i11 = 2;
            iconicsDrawable3.a(new Function1(this) { // from class: se.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DarkModeSettingActivity f42242b;

                {
                    this.f42242b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DarkModeSettingActivity darkModeSettingActivity = this.f42242b;
                    IconicsDrawable apply = (IconicsDrawable) obj;
                    switch (i11) {
                        case 0:
                            int i12 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                        case 1:
                            int i13 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                        default:
                            int i14 = DarkModeSettingActivity.f34948g;
                            Intrinsics.checkNotNullParameter(apply, "$this$apply");
                            p118hf.a.I(apply, 20);
                            D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, darkModeSettingActivity));
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            iconicsTextView2.setCompoundDrawables(null, null, iconicsDrawable3, null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
        g gVar = (g) this.f27334c;
        if (gVar != null) {
            gVar.f709f.setRightText(new SpanUtils().append(CommonViewExtKt.string(k.core_save, this)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, this)).create());
        }
        g gVar2 = (g) this.f27334c;
        if (gVar2 != null) {
            gVar2.f709f.setRightTextViewClickListener(new p287se.b(this, 0));
        }
        g gVar3 = (g) this.f27334c;
        if (gVar3 != null) {
            gVar3.f705b.setOnClickListener(new p287se.b(this, 1));
        }
        g gVar4 = (g) this.f27334c;
        if (gVar4 != null) {
            gVar4.f707d.setOnClickListener(new p287se.b(this, 2));
        }
        g gVar5 = (g) this.f27334c;
        if (gVar5 != null) {
            gVar5.f706c.setOnClickListener(new p287se.b(this, 3));
        }
    }
}
