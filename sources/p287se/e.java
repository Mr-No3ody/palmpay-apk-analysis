package p287se;

import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.ui.activity.settings.SetPaymentMethodActivity;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p328ve.t;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetPaymentMethodActivity f42250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SetPaymentMethodActivity f42251c;

    public /* synthetic */ e(SetPaymentMethodActivity setPaymentMethodActivity, SetPaymentMethodActivity setPaymentMethodActivity2, int i7) {
        this.f42249a = i7;
        this.f42250b = setPaymentMethodActivity;
        this.f42251c = setPaymentMethodActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection;
        String respMsg;
        SetPaymentMethodActivity setPaymentMethodActivity = this.f42251c;
        SetPaymentMethodActivity setPaymentMethodActivity2 = this.f42250b;
        switch (this.f42249a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    setPaymentMethodActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    setPaymentMethodActivity2.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((p) it).f27360a;
                    if (!commonListResultV2.isSuccess() || (collection = commonListResultV2.data) == null) {
                        String respMsg2 = commonListResultV2.getRespMsg();
                        if (respMsg2 != null) {
                            h.x(setPaymentMethodActivity, respMsg2);
                        }
                    } else if (!collection.isEmpty()) {
                        int i7 = SetPaymentMethodActivity.f34967f;
                        setPaymentMethodActivity.m().clear();
                        List listM = setPaymentMethodActivity.m();
                        Collection data = commonListResultV2.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        listM.addAll(data);
                        t tVar = (t) setPaymentMethodActivity.f34970e.getValue();
                        if (tVar != null) {
                            tVar.setList(setPaymentMethodActivity.m());
                        }
                    }
                } else if (it instanceof m) {
                    setPaymentMethodActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    setPaymentMethodActivity2.showLoadingDialog(false, true);
                    h.x(setPaymentMethodActivity, ((n) it).f27358a);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    setPaymentMethodActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    setPaymentMethodActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it2).f27360a;
                    if (!commonResult.isSuccess() && (respMsg = commonResult.getRespMsg()) != null) {
                        h.x(setPaymentMethodActivity, respMsg);
                    }
                } else if (it2 instanceof m) {
                    setPaymentMethodActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    setPaymentMethodActivity2.showLoadingDialog(false, true);
                    h.x(setPaymentMethodActivity, ((n) it2).f27358a);
                }
                return Unit.f38893a;
        }
    }
}
