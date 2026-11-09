package com.transsnet.palmpay.ui.activity.points;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseActivity;
import kotlin.Metadata;
import kotlin.Pair;
import p002a.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/point/list")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/points/PointStatementActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointStatementActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34804a = "";

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        if (TextUtils.isEmpty(this.f34804a)) {
            d.x(null, "PointHome");
        } else {
            try {
                d.x(a.e(new Pair("transType", Integer.valueOf(Integer.parseInt(this.f34804a)))), "PointHome");
            } catch (Exception unused) {
            }
        }
        finish();
    }
}
