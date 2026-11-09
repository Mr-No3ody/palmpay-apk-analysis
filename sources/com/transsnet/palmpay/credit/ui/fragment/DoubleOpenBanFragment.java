package com.transsnet.palmpay.credit.ui.fragment;

import Jb.C0343b;
import Ya.e;
import Ya.f;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.ui.fragment.DoubleOpenBanFragment;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import com.transsnet.palmpay.credit.viewmodel.DoubleOpenBanViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;
import p355xf.t;
import p369yd.p;
import p382zb.C2174q;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_double_ban_fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/DoubleOpenBanFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/DoubleOpenBanViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDoubleOpenBanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleOpenBanFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/DoubleOpenBanFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,49:1\n115#2,8:50\n145#2:58\n*S KotlinDebug\n*F\n+ 1 DoubleOpenBanFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/DoubleOpenBanFragment\n*L\n41#1:50,8\n41#1:58\n*E\n"})
public final class DoubleOpenBanFragment extends BaseMvvmFragment<DoubleOpenBanViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30331j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30332o;

    public DoubleOpenBanFragment() {
        final int i7 = 0;
        this.f30331j = C2131j.b(new Function0(this) { // from class: zb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleOpenBanFragment f44611b;

            {
                this.f44611b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44611b.f27318b;
                        if (view != null) {
                            return (OpenResultTaskView) view.findViewById(e.apply_result_task_view);
                        }
                        return null;
                    default:
                        View view2 = this.f44611b.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.text2);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30332o = C2131j.b(new Function0(this) { // from class: zb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleOpenBanFragment f44611b;

            {
                this.f44611b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44611b.f27318b;
                        if (view != null) {
                            return (OpenResultTaskView) view.findViewById(e.apply_result_task_view);
                        }
                        return null;
                    default:
                        View view2 = this.f44611b.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.text2);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_open_failed_layout_scroll;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        DoubleOpenBanViewModel doubleOpenBanViewModel = (DoubleOpenBanViewModel) this.f27333i;
        l lVar = doubleOpenBanViewModel != null ? doubleOpenBanViewModel.f30892e : null;
        if (lVar != null) {
            lVar.e(this, new p369yd.e(new p(this, 2), (byte) 0));
        }
        DoubleOpenBanViewModel doubleOpenBanViewModel2 = (DoubleOpenBanViewModel) this.f27333i;
        if (doubleOpenBanViewModel2 != null) {
            p140j8.f.s(doubleOpenBanViewModel2, new C0343b(1, null), doubleOpenBanViewModel2.f30892e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        t tVar = this.f30331j;
        OpenResultTaskView openResultTaskView = (OpenResultTaskView) tVar.getValue();
        if (openResultTaskView != null) {
            openResultTaskView.getTaskData();
        }
        OpenResultTaskView openResultTaskView2 = (OpenResultTaskView) tVar.getValue();
        if (openResultTaskView2 != null) {
            openResultTaskView2.setMTaskAllDoneInterface(new C2174q(this));
        }
    }
}
