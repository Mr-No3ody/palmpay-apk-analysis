package Fa;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.update.AppUpdate;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2632a;

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
        int i7 = this.f2632a;
        try {
            if (i7 == 0) {
                g.M(obj);
                if (p367ya.c.b().getLong("last_check_time", 0L) + (p367ya.c.c() ? 21600000L : 1200000L) > System.currentTimeMillis()) {
                    F6.d.h("UpdateUtils", 3, "ignore check update");
                    return Unit.f38893a;
                }
                MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
                this.f2632a = 1;
                obj = memberApiService.getAppUpdateInfo(this);
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
            if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
                p367ya.c.b().putLong("last_check_time", 0L);
            } else {
                AppUpdate.VersionBean versionBean = (AppUpdate.VersionBean) commonBeanResult.data;
                if (versionBean == null) {
                    F6.d.h("UpdateUtils", 3, "handleActionCheckUpdate: No versionBean found");
                }
                if (versionBean != null) {
                    p367ya.c.b().putLong("last_check_time", System.currentTimeMillis());
                    p367ya.c.f(versionBean);
                    if (versionBean.versionCode > BaseApplication.get().getVersionCode()) {
                        p367ya.c.e(true);
                        if (versionBean.isForce) {
                            com.palmpay.lib.apm.launchcounter.util.d.F("/main/update");
                            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_SHOW_UPDATE_DIALOG));
                        }
                    }
                }
            }
        } catch (Exception unused) {
            p367ya.c.b().putLong("last_check_time", 0L);
        }
        return Unit.f38893a;
    }
}
