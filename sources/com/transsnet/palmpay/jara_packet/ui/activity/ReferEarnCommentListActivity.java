package com.transsnet.palmpay.jara_packet.ui.activity;

import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.jara_packet.bean.req.CommentReq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p042cg.f;
import p068ec.d;
import p236pc.e;
import p285sc.C2029c;
import p285sc.C2030d;
import p295tc.b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/refer_earn/comment_list")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnCommentListActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReferEarnCommentListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferEarnCommentListActivity.kt\ncom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnCommentListActivity\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,165:1\n116#2:166\n*S KotlinDebug\n*F\n+ 1 ReferEarnCommentListActivity.kt\ncom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnCommentListActivity\n*L\n122#1:166\n*E\n"})
public final class ReferEarnCommentListActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31856i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f31858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31859c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f31861e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31857a = C2131j.b(new d(this, 17));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31860d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31862f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31863g = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) ReferEarnCommentListActivity.class));
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.jp_activity_comment_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f31861e = new ArrayList();
    }

    public final SwipeRecyclerView l() {
        Object value = this.f31857a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SwipeRecyclerView) value;
    }

    public final void m(int i7) {
        CommentReq commentReq = new CommentReq(this.f31862f, this.f31863g, i7, 10);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new C2029c(null, commentReq, this), 2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m(1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        l().getRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        Intrinsics.checkNotNullParameter(this, "context");
        b bVar = new b(this);
        this.f31858b = bVar;
        bVar.f4986c = new p184m8.b(12);
        l().setAdapter(this.f31858b);
        l().getRecyclerView().setItemViewCacheSize(4);
        l().setRefreshEnable(true);
        l().setLoadMoreEnable(true);
        l().setOnLoadListener(new C2030d(this));
    }
}
