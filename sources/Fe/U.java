package Fe;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class U implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f2753b;

    public /* synthetic */ U(Y y8, int i7) {
        this.f2752a = i7;
        this.f2753b = y8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberInfo memberInfo;
        switch (this.f2752a) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                if (commonBeanResult != null && (memberInfo = (MemberInfo) commonBeanResult.data) != null) {
                    Y y8 = this.f2753b;
                    PersonalActivityContract.View view = (PersonalActivityContract.View) y8.f27351a;
                    if (view != null) {
                        view.handleMemberInfo(memberInfo);
                    }
                    p156ka.a userDataSource = BaseApplication.get().getUserDataSource();
                    if (userDataSource != null) {
                        userDataSource.d(memberInfo, false);
                    }
                    PersonalActivityContract.View view2 = (PersonalActivityContract.View) y8.f27351a;
                    if (view2 != null) {
                        User user = BaseApplication.get().getUser();
                        Intrinsics.checkNotNullExpressionValue(user, "getUser(...)");
                        view2.handlePersonalInfo(user);
                    }
                }
                break;
            default:
                CommonResult it = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                PersonalActivityContract.View view3 = (PersonalActivityContract.View) this.f2753b.f27351a;
                if (view3 != null) {
                    view3.handleCheckUpdateNameLimit(it);
                }
                break;
        }
        return Unit.f38893a;
    }
}
