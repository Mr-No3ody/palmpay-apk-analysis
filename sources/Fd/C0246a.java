package Fd;

import Rd.k0;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0246a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayAddMobileAccountFragment f2661b;

    public /* synthetic */ C0246a(TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment, int i7) {
        this.f2660a = i7;
        this.f2661b = transferToPalmPayAddMobileAccountFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection;
        TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment = this.f2661b;
        switch (this.f2660a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonListResultV2.isSuccess() && (collection = commonListResultV2.data) != null) {
                            TransferToPalmPayAddMobileAccountFragment.a aVar = TransferToPalmPayAddMobileAccountFragment.f33787L;
                            p355xf.t tVar = transferToPalmPayAddMobileAccountFragment.f33789B;
                            ((ArrayList) tVar.getValue()).clear();
                            ((ArrayList) tVar.getValue()).addAll(collection);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryRecipientMemberInfoResp queryRecipientMemberInfoResp = (QueryRecipientMemberInfoResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        TransferToPalmPayAddMobileAccountFragment.a aVar2 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                        transferToPalmPayAddMobileAccountFragment.z(queryRecipientMemberInfoResp, false);
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                        TransferToPalmPayAddMobileAccountFragment.a aVar3 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                        transferToPalmPayAddMobileAccountFragment.y();
                        k0 k0Var = transferToPalmPayAddMobileAccountFragment.f33791H;
                        if (k0Var != null) {
                            p220oa.h.C((LinearLayout) k0Var.f8378p);
                        }
                        transferToPalmPayAddMobileAccountFragment.f33794v = null;
                        transferToPalmPayAddMobileAccountFragment.A(str, true);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryRecipientMemberInfoResp queryRecipientMemberInfoResp2 = (QueryRecipientMemberInfoResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        TransferToPalmPayAddMobileAccountFragment.a aVar4 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                        transferToPalmPayAddMobileAccountFragment.z(queryRecipientMemberInfoResp2, true);
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str2 = ((com.transsnet.palmpay.core.base.n) it3).f27358a;
                        TransferToPalmPayAddMobileAccountFragment.a aVar5 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                        transferToPalmPayAddMobileAccountFragment.y();
                        k0 k0Var2 = transferToPalmPayAddMobileAccountFragment.f33791H;
                        if (k0Var2 != null) {
                            p220oa.h.C((LinearLayout) k0Var2.f8378p);
                        }
                        transferToPalmPayAddMobileAccountFragment.f33794v = null;
                        transferToPalmPayAddMobileAccountFragment.A(str2, true);
                    }
                }
                return Unit.f38893a;
        }
    }
}
