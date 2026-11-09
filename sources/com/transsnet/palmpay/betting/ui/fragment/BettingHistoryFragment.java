package com.transsnet.palmpay.betting.ui.fragment;

import Xd.j;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment;
import com.transsnet.palmpay.teller.viewmodel.BillerHistoryViewModel;
import kotlin.Metadata;
import p068ec.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/fragment/BettingHistoryFragment;", "Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerHistoryFragment;", "Lcom/transsnet/palmpay/teller/viewmodel/BillerHistoryViewModel;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingHistoryFragment extends BaseBillerHistoryFragment<BillerHistoryViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f26727A = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f26728w = C2131j.b(new d(this, 29));

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        x();
        return 0;
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        t tVar = this.f26728w;
        ((j) tVar.getValue()).f11150b = v();
        ((j) tVar.getValue()).setOnItemClickListener(new p287se.d(this, 18));
        return 0;
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment
    public final M1.d u() {
        return (j) this.f26728w.getValue();
    }
}
