package com.transsnet.palmpay.account.ui.activity;

import Bc.k;
import C0.G;
import F8.d;
import F8.e;
import Je.l;
import L6.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/AskEnableTouchIdActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AskEnableTouchIdActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25828b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f25829a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(a aVar, Context context, String str, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str = null;
            }
            aVar.launch(context, str);
        }

        public final void launch(@NotNull Context context, @Nullable String str) {
            Intent intentE = G.e(context, "context", context, AskEnableTouchIdActivity.class);
            intentE.putExtra("extra_data", str);
            ActivityUtils.startActivity(intentE);
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
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_ask_enable_touch_id, (ViewGroup) null, false);
        int i7 = d.titleBar;
        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
        if (ppTitleBar != null) {
            i7 = d.tv1;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.tv2;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = d.tvConfirm;
                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                    if (ppButton != null) {
                        k kVar = new k((ConstraintLayout) viewInflate, ppTitleBar, textView, textView2, (ViewGroup) ppButton, 6);
                        this.f25829a = kVar;
                        return kVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        k kVar = this.f25829a;
        if (kVar != null) {
            ((PpTitleBar) kVar.f750d).setBackButton(S6.a.pay_Close);
        }
        k kVar2 = this.f25829a;
        if (kVar2 != null) {
            ((PpButton) kVar2.f752f).setOnClickListener(new l(this, 16));
        }
    }
}
