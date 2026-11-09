package Gd;

import Bc.D;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.send_money.bean.resp.SearchPalmPayAccountResp;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayAccountView f3383b;

    public /* synthetic */ z(TransferToPalmPayAccountView transferToPalmPayAccountView, int i7) {
        this.f3382a = i7;
        this.f3383b = transferToPalmPayAccountView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        ModelErrorDivider modelErrorDivider;
        TransferToPalmPayAccountView transferToPalmPayAccountView = this.f3383b;
        switch (this.f3382a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        TransferToPalmPayAccountView.e(transferToPalmPayAccountView, (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a);
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        int i7 = TransferToPalmPayAccountView.t;
                        transferToPalmPayAccountView.i();
                        D d2 = transferToPalmPayAccountView.f33930c;
                        if (d2 != null && (modelErrorDivider = (ModelErrorDivider) d2.f614A) != null) {
                            modelErrorDivider.setErrorMessage("");
                        }
                        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
                            D d10 = transferToPalmPayAccountView.f33930c;
                            if (d10 != null && (textView2 = d10.f620f) != null) {
                                textView2.setEnabled(false);
                            }
                            transferToPalmPayAccountView.j(commonBeanResult != null ? commonBeanResult.getRespMsg() : null, true);
                        } else {
                            SearchPalmPayAccountResp searchPalmPayAccountResp = (SearchPalmPayAccountResp) commonBeanResult.data;
                            if (searchPalmPayAccountResp != null) {
                                transferToPalmPayAccountView.f33933f = searchPalmPayAccountResp;
                                D d11 = transferToPalmPayAccountView.f33930c;
                                if (d11 != null && (textView3 = d11.f620f) != null) {
                                    textView3.setEnabled(true);
                                }
                                transferToPalmPayAccountView.j(searchPalmPayAccountResp.getAccountName(), false);
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                        int i10 = TransferToPalmPayAccountView.t;
                        transferToPalmPayAccountView.i();
                        D d12 = transferToPalmPayAccountView.f33930c;
                        if (d12 != null && (textView = d12.f620f) != null) {
                            textView.setEnabled(false);
                        }
                        transferToPalmPayAccountView.j(str, true);
                    }
                }
                return Unit.f38893a;
        }
    }
}
