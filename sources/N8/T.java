package N8;

import com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.MemberLabelReq;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SetSafeLockPinActivity f6177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(String str, SetSafeLockPinActivity setSafeLockPinActivity, Continuation continuation) {
        super(2, continuation);
        this.f6176b = str;
        this.f6177c = setSafeLockPinActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.f6176b, this.f6177c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f6175a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
                MemberLabelReq memberLabelReq = new MemberLabelReq(3, this.f6176b);
                this.f6175a = 1;
                obj = memberApiService.markMemberLabel(memberLabelReq, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonResult commonResult = (CommonResult) obj;
            if (!commonResult.isSuccess()) {
                ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
            }
        } catch (Exception unused) {
            ToastUtils.showLong(this.f6177c.getString(F8.h.ac_operation_fail), new Object[0]);
        }
        return Unit.f38893a;
    }
}
