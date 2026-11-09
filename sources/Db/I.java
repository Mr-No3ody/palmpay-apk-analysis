package Db;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.UnfreezeResp;
import com.transsnet.palmpay.credit.bean.resp.UnfreezePopupDataResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f1785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, Continuation continuation) {
        super(2, continuation);
        this.f1788d = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        I i7 = new I(this.f1788d, continuation);
        i7.f1787c = obj;
        return i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((UnfreezeResp) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        UnfreezePopupDataResp.Data data;
        Integer num;
        String str;
        UnfreezeResp.Data data2;
        Integer num2;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1786b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            UnfreezeResp unfreezeResp = (UnfreezeResp) this.f1787c;
            UnfreezeResp.Data data3 = unfreezeResp.getData();
            data = null;
            num = data3 != null ? new Integer(data3.getUnfreezeStatus()) : null;
            str = this.f1788d;
            if (!TextUtils.equals(str, TransType.TRANS_TYPE_CL_REPAY) && (data2 = unfreezeResp.getData()) != null && data2.getUnfreezeStatus() == 1) {
                IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
                this.f1787c = str;
                this.f1785a = num;
                this.f1786b = 1;
                obj = iApiCreditServiceH.queryUnfreezePopupData(this);
                if (obj == aVar) {
                    return aVar;
                }
                num2 = num;
            }
            return new X0.j(new p355xf.u(str, num, data), 4);
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        num2 = this.f1785a;
        str = (String) this.f1787c;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        data = ((UnfreezePopupDataResp) obj).getData();
        num = num2;
        return new X0.j(new p355xf.u(str, num, data), 4);
    }
}
