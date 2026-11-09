package Mc;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.SavingMainBodyResultBean;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5931a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5931a;
        try {
            if (i7 == 0) {
                g.M(obj);
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                this.f5931a = 1;
                obj = manageApiService.getWealthMainbodyInfo("wealth_tab", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (!commonBeanResult.isSuccess() || commonBeanResult.data == 0) {
                obj = null;
            }
            CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
            if (commonBeanResult2 == null) {
                return null;
            }
            String str = ((SavingMainBodyResultBean) commonBeanResult2.data).savingMainbody;
            if (str == null) {
                str = "Flexi MFB";
            }
            p059e1.a.W("cash_box_business_license", str);
            String str2 = ((SavingMainBodyResultBean) commonBeanResult2.data).fundMainbody;
            if (str2 == null) {
                str2 = "";
            }
            p059e1.a.W("cash_box_fund_license", str2);
            return commonBeanResult2;
        } catch (Exception unused) {
            return Unit.f38893a;
        }
    }
}
