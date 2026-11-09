package p051d9;

import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1614k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1623u f35627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35628c;

    public /* synthetic */ C1614k(C1623u c1623u, int i7, int i10) {
        this.f35626a = i10;
        this.f35627b = c1623u;
        this.f35628c = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CommonBeanResult<CheckPinRsp> it = (CommonBeanResult) obj;
        switch (this.f35626a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                LoginContract.View view = (LoginContract.View) this.f35627b.f27351a;
                if (view != null) {
                    view.handleCheckPinResult(it, this.f35628c);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                LoginContract.View view2 = (LoginContract.View) this.f35627b.f27351a;
                if (view2 != null) {
                    view2.handleCheckPasswordResult(it, this.f35628c);
                }
                break;
        }
        return Unit.f38893a;
    }
}
