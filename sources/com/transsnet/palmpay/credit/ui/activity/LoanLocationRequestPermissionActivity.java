package com.transsnet.palmpay.credit.ui.activity;

import G9.i;
import android.os.Bundle;
import androidx.activity.result.a;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.config.d;
import kotlin.Metadata;
import p177m.j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/location_request_permission_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/LoanLocationRequestPermissionActivity;", "Landroidx/appcompat/app/o;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanLocationRequestPermissionActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28692b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f28693a = registerForActivityResult(new j(), new i(this, 9));

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28693a.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", d.j()});
    }
}
