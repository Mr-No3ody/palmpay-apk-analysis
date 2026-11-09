package com.transsnet.palmpay.ui.activity.settings;

import Ac.f;
import Bc.p;
import L6.b;
import Pe.o0;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.viewmodule.PayMethodViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p270rd.C1976t;
import p284sb.C2023v;
import p287se.d;
import p287se.e;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/set_payment_method")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/SetPaymentMethodActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/PayMethodViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSetPaymentMethodActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPaymentMethodActivity.kt\ncom/transsnet/palmpay/ui/activity/settings/SetPaymentMethodActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n260#2,10:121\n296#2:131\n260#2,10:132\n296#2:142\n1878#3,3:143\n*S KotlinDebug\n*F\n+ 1 SetPaymentMethodActivity.kt\ncom/transsnet/palmpay/ui/activity/settings/SetPaymentMethodActivity\n*L\n80#1:121,10\n80#1:131\n96#1:132,10\n96#1:142\n53#1:143,3\n*E\n"})
public final class SetPaymentMethodActivity extends BaseMvvmActivity<PayMethodViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34967f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f34968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f34969d = C2131j.b(new C1976t(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f34970e = C2131j.b(new C1976t(10));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PayMethodViewModel) l()).f35403f;
        if (lVar != null) {
            lVar.e(this, new C2023v(new e(this, this, 0), 1));
        }
        l lVar2 = ((PayMethodViewModel) l()).f35402e;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new e(this, this, 1), 1));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_payment_method, (ViewGroup) null, false);
        int i7 = Ac.e.recycler_view;
        RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
        if (recyclerView != null) {
            i7 = Ac.e.titleBar;
            if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                i7 = Ac.e.tv_top_remark;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    p pVar = new p((LinearLayout) viewInflate, recyclerView, textView, 1);
                    this.f34968c = pVar;
                    return pVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final List m() {
        return (List) this.f34969d.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PayMethodViewModel payMethodViewModel = (PayMethodViewModel) l();
        if (payMethodViewModel != null) {
            p140j8.f.s(payMethodViewModel, new o0(1, null), payMethodViewModel.f35403f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        p pVar = this.f34968c;
        if (pVar != null) {
            ((RecyclerView) pVar.f812c).setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        p pVar2 = this.f34968c;
        t tVar = this.f34970e;
        if (pVar2 != null) {
            ((RecyclerView) pVar2.f812c).setAdapter((p328ve.t) tVar.getValue());
        }
        ((p328ve.t) tVar.getValue()).setOnItemClickListener(new d(this, 1));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), getResources().getDimensionPixelOffset(q.dp1), 0, 0);
        p pVar3 = this.f34968c;
        if (pVar3 != null) {
            ((RecyclerView) pVar3.f812c).addItemDecoration(c1548f);
        }
    }
}
