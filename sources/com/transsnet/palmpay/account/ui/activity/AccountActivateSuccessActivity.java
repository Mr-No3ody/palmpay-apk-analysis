package com.transsnet.palmpay.account.ui.activity;

import Ab.C;
import F8.d;
import F8.e;
import L6.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.u;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAccountActivateSuccessFragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/AccountActivateSuccessActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccountActivateSuccessActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25810a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            try {
                Intent intent = new Intent(context, (Class<?>) AccountActivateSuccessActivity.class);
                intent.putExtra("extra_path", str);
                intent.putExtra("_number", str2);
                if (context != null) {
                    context.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_common_fragment_container;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        u.a(getOnBackPressedDispatcher(), this, new C(this, 27));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        IdentityVerificationAccountActivateSuccessFragment identityVerificationAccountActivateSuccessFragment = new IdentityVerificationAccountActivateSuccessFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("extra_path", getQueryParameter("extra_path"));
        bundle2.putString("_number", getQueryParameter("_number"));
        identityVerificationAccountActivateSuccessFragment.setArguments(bundle2);
        h.i(this, d.fragmentContainer, identityVerificationAccountActivateSuccessFragment);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
