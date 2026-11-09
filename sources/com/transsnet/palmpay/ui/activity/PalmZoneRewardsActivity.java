package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import L6.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.ui.fragment.PalmZoneTaskRewardsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/PalmZoneRewardsActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneRewardsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34524a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) PalmZoneRewardsActivity.class));
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_palm_zone_rewards_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
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
        h.i(this, e.fragmentContainer, PalmZoneTaskRewardsFragment.f35232v.newInstance());
    }
}
