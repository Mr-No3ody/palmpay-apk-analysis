package com.transsnet.palmpay.ui.activity.settings;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.p;
import F6.d;
import L6.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.ui.fragment.settings.LoginSettingsFragment;
import com.transsnet.palmpay.ui.fragment.settings.PaymentSettingsFragment;
import com.transsnet.palmpay.ui.fragment.settings.PinSettingsFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "子设置页面", path = "/main/sub_settings")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/SubSettingsActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubSettingsActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34974b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f34975a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @NotNull String pageId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Intent intent = new Intent(context, (Class<?>) SubSettingsActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("pageId", pageId);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_sub_settings, (ViewGroup) null, false);
        int i7 = e.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = e.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                p pVar = new p((LinearLayout) viewInflate, frameLayout, ppTitleBar, 3);
                this.f34975a = pVar;
                return pVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("pageId");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = getQueryParameter("pageId");
        }
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode == 48) {
                if (stringExtra.equals("0")) {
                    try {
                        setTitle(h.main_pin);
                        p220oa.h.i(this, e.fragmentContainer, new PinSettingsFragment());
                        return;
                    } catch (Exception e10) {
                        d.c(this.TAG, "launchSettingsPinPage: ", e10);
                        return;
                    }
                }
                return;
            }
            if (iHashCode == 49) {
                if (stringExtra.equals("1")) {
                    try {
                        setTitle(h.main_payment_setting);
                        p220oa.h.i(this, e.fragmentContainer, new PaymentSettingsFragment());
                        return;
                    } catch (Exception e11) {
                        d.c(this.TAG, "launchSettingsPayPage: ", e11);
                        return;
                    }
                }
                return;
            }
            if (iHashCode == 52 && stringExtra.equals("4")) {
                try {
                    setTitle(h.main_login_settings);
                    p220oa.h.i(this, e.fragmentContainer, new LoginSettingsFragment());
                } catch (Exception e12) {
                    d.c(this.TAG, "launchLoginSettingsPinPage: ", e12);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        PpTitleBar ppTitleBar;
        p pVar = this.f34975a;
        if (pVar == null || (ppTitleBar = (PpTitleBar) pVar.f813d) == null) {
            return;
        }
        ppTitleBar.setTitle(charSequence);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
