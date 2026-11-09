package p051d9;

import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f35574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35575c;

    public /* synthetic */ S(d0 d0Var, boolean z3, int i7) {
        this.f35573a = i7;
        this.f35574b = d0Var;
        this.f35575c = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35573a) {
            case 0:
                CommonBeanResult<MemberInfo> commonBeanResult = (CommonBeanResult) obj;
                SignUpContract.View view = (SignUpContract.View) this.f35574b.f27351a;
                if (view != null) {
                    view.handleUserInfo(commonBeanResult, this.f35575c);
                }
                break;
            default:
                RegularRuleRsp it = (RegularRuleRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SignUpContract.View view2 = (SignUpContract.View) this.f35574b.f27351a;
                if (view2 != null) {
                    view2.handleRegularRule(it, this.f35575c);
                }
                break;
        }
        return Unit.f38893a;
    }
}
