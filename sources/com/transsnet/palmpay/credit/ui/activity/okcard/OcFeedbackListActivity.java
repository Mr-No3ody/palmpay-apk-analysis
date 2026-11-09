package com.transsnet.palmpay.credit.ui.activity.okcard;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2154w;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit反馈历史列表页", path = "/credit_score/oc_feedback_list_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcFeedbackListActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFeedbackListActivity extends Za.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29454g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29455d = C2131j.b(new p068ec.d(this, 26));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f29456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2154w f29457f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_feedback_list_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().queryFeedbackHistory().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 13));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        this.f29456e = new ArrayList();
        Object value = this.f29455d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 1, false));
    }
}
