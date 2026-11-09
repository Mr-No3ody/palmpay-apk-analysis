package com.transsnet.palmpay.credit.ui.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import kotlin.Metadata;
import p071ef.b;
import p221ob.c;
import p298tf.f;
import p382zb.C2168k;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/cl_open_contain")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/CLOpenContainFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/CLOpenFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLOpenContainFragment extends CLOpenFragment {
    @Override // com.transsnet.palmpay.credit.ui.fragment.CLOpenFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        c.f40268a.getInstance().getClass();
        c.a().getCashLoanNew().k(f.f42629b).i(b.a()).subscribe(new C2168k(this, 0));
        super.o();
        return 0;
    }
}
