package p323v9;

import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p118hf.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43130a;

    public /* synthetic */ d(int i7) {
        this.f43130a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43130a) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f38893a;
            case 1:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Unit.f38893a;
            case 2:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                a.I(apply, 16);
                D3.a.F(apply, -1);
                return Unit.f38893a;
            case 3:
                List data = (List) obj;
                int i7 = InputMobileActivity.f33535Z;
                Intrinsics.checkNotNullParameter(data, "data");
                Iterator it3 = data.iterator();
                while (it3.hasNext()) {
                    ((QueryMemberDetailResp.Data) it3.next()).isBeneficiary = true;
                }
                return df.d.h(data);
            case 4:
                String it4 = (String) obj;
                int i10 = TransferToPalmPayInputAmountActivity.f33602Y;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Unit.f38893a;
            case 5:
                LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                Intrinsics.checkNotNullParameter((IconicsDrawable) obj, "$this$apply");
                CommonViewExtKt.getDp(28.0f);
                return Unit.f38893a;
            case 6:
                LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                Intrinsics.checkNotNullParameter((IconicsDrawable) obj, "$this$apply");
                CommonViewExtKt.getDp(28.0f);
                return Unit.f38893a;
            case 7:
                ToastUtils.showShort((String) obj, new Object[0]);
                return Unit.f38893a;
            case 8:
                return Unit.f38893a;
            case 9:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 10:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 11:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            default:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
        }
    }
}
