package Ua;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ua.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0637s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponItem f9472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f9473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0637s(Continuation continuation, ModelAvailableCouponItem modelAvailableCouponItem, Function0 function0) {
        super(2, continuation);
        this.f9472b = modelAvailableCouponItem;
        this.f9473c = function0;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0637s c0637s = new C0637s(continuation, this.f9472b, this.f9473c);
        c0637s.f9471a = obj;
        return c0637s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0637s) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        QueryUserCouponsRsp.DataBean data;
        List<CouponItem> list;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        QueryUserCouponsRsp queryUserCouponsRsp = (QueryUserCouponsRsp) ((CommonResult) this.f9471a);
        ModelAvailableCouponItem modelAvailableCouponItem = this.f9472b;
        modelAvailableCouponItem.getMCouponAvailable().c(false);
        if (queryUserCouponsRsp != null && (data = queryUserCouponsRsp.getData()) != null && (list = data.getList()) != null) {
            modelAvailableCouponItem.f28252f.clear();
            modelAvailableCouponItem.f28252f.addAll(list);
            modelAvailableCouponItem.getMCouponAvailable().d(modelAvailableCouponItem.f28252f);
            this.f9473c.invoke();
            ArrayList arrayList = modelAvailableCouponItem.f28252f;
            if (arrayList != null && !arrayList.isEmpty()) {
                modelAvailableCouponItem.f();
            }
        }
        return Unit.f38893a;
    }
}
