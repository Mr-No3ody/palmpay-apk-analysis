package Gd;

import Kd.L0;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.send_money.bean.resp.TransferMatchMemberRsp;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankAccountView f3367b;

    public /* synthetic */ q(TransferToBankAccountView transferToBankAccountView, int i7) {
        this.f3366a = i7;
        this.f3367b = transferToBankAccountView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<BankInfo> list;
        TransferToBankAccountView transferToBankAccountView = this.f3367b;
        switch (this.f3366a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        TransferToBankAccountView.f(transferToBankAccountView, (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a);
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryBankListRsp queryBankListRsp = (QueryBankListRsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        int i7 = TransferToBankAccountView.f33899A;
                        transferToBankAccountView.l();
                        if (queryBankListRsp.isSuccess() && (list = queryBankListRsp.data) != null && !list.isEmpty()) {
                            L0 l5 = transferToBankAccountView.f33903f;
                            if (l5 == null) {
                                Intrinsics.n("sharedViewModel");
                                throw null;
                            }
                            l5.f5077f = list;
                            transferToBankAccountView.setMatchBank(list);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        int i10 = TransferToBankAccountView.f33899A;
                        transferToBankAccountView.l();
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        TransferMatchMemberRsp transferMatchMemberRsp = (TransferMatchMemberRsp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (transferMatchMemberRsp.isSuccess()) {
                            int i11 = TransferToBankAccountView.f33899A;
                            transferToBankAccountView.n(transferMatchMemberRsp, false);
                        } else {
                            String respMsg = transferMatchMemberRsp.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            int i12 = TransferToBankAccountView.f33899A;
                            transferToBankAccountView.j();
                            transferToBankAccountView.l();
                            transferToBankAccountView.p(respMsg, true);
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str = ((com.transsnet.palmpay.core.base.n) it3).f27358a;
                        int i13 = TransferToBankAccountView.f33899A;
                        transferToBankAccountView.j();
                        transferToBankAccountView.l();
                        transferToBankAccountView.p(str, true);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        TransferMatchMemberRsp transferMatchMemberRsp2 = (TransferMatchMemberRsp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        if (transferMatchMemberRsp2.isSuccess()) {
                            int i14 = TransferToBankAccountView.f33899A;
                            transferToBankAccountView.n(transferMatchMemberRsp2, true);
                        } else {
                            String respMsg2 = transferMatchMemberRsp2.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                            int i15 = TransferToBankAccountView.f33899A;
                            transferToBankAccountView.j();
                            transferToBankAccountView.l();
                            transferToBankAccountView.p(respMsg2, true);
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str2 = ((com.transsnet.palmpay.core.base.n) it4).f27358a;
                        int i16 = TransferToBankAccountView.f33899A;
                        transferToBankAccountView.j();
                        transferToBankAccountView.l();
                        transferToBankAccountView.p(str2, true);
                    }
                }
                return Unit.f38893a;
        }
    }
}
