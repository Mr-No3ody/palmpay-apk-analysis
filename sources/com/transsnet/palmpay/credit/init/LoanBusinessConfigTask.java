package com.transsnet.palmpay.credit.init;

import C0.G;
import F6.d;
import Pa.C0525w;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.app.Application;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.credit.bean.req.QueryBusinessConfigReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import io.fastkv.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p042cg.e;
import p042cg.f;
import p157kb.a;
import p157kb.b;
import p221ob.c;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_REACT_NATIVE_INIT, BaseInitTaskKt.TASK_FIREBASE_INIT}, name = BaseInitTaskKt.TASK_LOAN_CONFIG)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/init/LoanBusinessConfigTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "", "", "getBusinessConfigFromAssets", "()Ljava/util/Map;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "getBusinessConfigFromNet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Application;", "application", "Lcom/alibaba/android/alpha/Task;", "getTask", "(Landroid/app/Application;)Lcom/alibaba/android/alpha/Task;", "getTaskName", "()Ljava/lang/String;", "key", "", "cacheTimeInSecond", "", "keyUseByMemberID", "", "queryBusinessConfig", "(Ljava/lang/String;IZ)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanBusinessConfigTask extends BaseInitTask {

    @NotNull
    public static final String THEME_FILE_NAME = "Theme.json";

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getBusinessConfigFromAssets() {
        try {
            o oVar = q.f43977a;
            BaseApplication baseApplication = BaseApplication.get();
            Intrinsics.checkNotNullExpressionValue(baseApplication, "get(...)");
            return (Map) C0525w.f().e(n.C(baseApplication), Map.class);
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getBusinessConfigFromNet(Continuation<? super CommonBeanResult<Map<String, String>>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i7 = aVar.f38723c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f38723c = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object objQueryBusinessConfigForMVVM = aVar.f38721a;
        Ef.a aVar2 = Ef.a.f2423a;
        int i10 = aVar.f38723c;
        if (i10 == 0) {
            g.M(objQueryBusinessConfigForMVVM);
            IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
            QueryBusinessConfigReq queryBusinessConfigReq = new QueryBusinessConfigReq(C1850q.h("MAIN_LOAN_STYLE_CONFIG_GT690", "MAIN_LOAN_ACTIVITY_CONFIG", "APP_MAIN_CONFIG_250715", "MAIN_LOAN_STYLE_CONFIG_HIRE_PURCHASE_0610", "MAIN_LOAN_STYLE_CONFIG_HIRE_PURCHASE_0520"));
            aVar.f38723c = 1;
            objQueryBusinessConfigForMVVM = iApiCreditServiceH.queryBusinessConfigForMVVM(queryBusinessConfigReq, aVar);
            if (objQueryBusinessConfigForMVVM == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(objQueryBusinessConfigForMVVM);
        }
        return (CommonBeanResult) objQueryBusinessConfigForMVVM;
    }

    public static /* synthetic */ void queryBusinessConfig$default(LoanBusinessConfigTask loanBusinessConfigTask, String str, int i7, boolean z3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z3 = false;
        }
        loanBusinessConfigTask.queryBusinessConfig(str, i7, z3);
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        d.h(BaseInitTask.TAG, 3, "getTask >>>");
        return new b(this, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_LOAN_CONFIG;
    }

    public final void queryBusinessConfig(@NotNull String key, int cacheTimeInSecond, boolean keyUseByMemberID) {
        String strP;
        Intrinsics.checkNotNullParameter(key, "key");
        if (keyUseByMemberID) {
            String strI = p367ya.a.d().i();
            String countryLocale = BaseApplication.getCountryLocale();
            StringBuilder sbF = F.f("Pref_", strI, "_", key, "_");
            sbF.append(countryLocale);
            strP = sbF.toString();
        } else {
            strP = G.p("Pref_", key, "_", BaseApplication.getCountryLocale());
        }
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, e.f19009c, null, new p157kb.c(strP, this, cacheTimeInSecond, null), 2);
    }
}
