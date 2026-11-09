package Fa;

import Ff.h;
import Pa.C0525w;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.update.AppUpdate;
import com.transsnet.palmpay.core.bean.update.QueryAppUpdate;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2635b;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(2, continuation);
        dVar.f2635b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:16:0x0041, B:18:0x0045, B:20:0x004b, B:22:0x004f, B:24:0x0055, B:29:0x0060, B:31:0x0071, B:33:0x008e, B:37:0x009c, B:36:0x0095, B:38:0x00a6, B:41:0x00b6, B:13:0x0026), top: B:46:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:16:0x0041, B:18:0x0045, B:20:0x004b, B:22:0x004f, B:24:0x0055, B:29:0x0060, B:31:0x0071, B:33:0x008e, B:37:0x009c, B:36:0x0095, B:38:0x00a6, B:41:0x00b6, B:13:0x0026), top: B:46:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        T t;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2634a;
        try {
            if (i7 == 0) {
                g.M(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f2635b;
                MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
                ArrayList arrayListE = C1850q.e("app_upgrade_button");
                this.f2635b = coroutineScope;
                this.f2634a = 1;
                obj = memberApiService.queryAppConfig(arrayListE, this);
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
            if (commonBeanResult == null || !commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                F6.d.h("UpdateUtils", 3, "handleActionCheckUpdate: result fail");
                if (BaseApplication.get() != null) {
                    p367ya.b.a().clearAll();
                }
            } else {
                String str = ((QueryAppUpdate) t).app_upgrade_button;
                if (str != null) {
                    Unit unit = null;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    }
                    if (str != null) {
                        C0525w.f().getClass();
                        AppUpdate.VersionBean versionBean = (AppUpdate.VersionBean) C0525w.d(str, AppUpdate.VersionBean.class);
                        if (versionBean != null) {
                            MMKV mmkvA = p367ya.b.a();
                            mmkvA.putInt("version_code", versionBean.versionCode);
                            mmkvA.putString("version_name", versionBean.version);
                            mmkvA.putString("apk_url", versionBean.apkLink);
                            unit = Unit.f38893a;
                        }
                        if (unit == null) {
                            if (BaseApplication.get() != null) {
                                p367ya.b.a().clearAll();
                            }
                            F6.d.h("UpdateUtils", 3, "handleActionCheckUpdate: No versionBean found");
                        }
                    } else {
                        if (BaseApplication.get() != null) {
                            p367ya.b.a().clearAll();
                        }
                        F6.d.h("UpdateUtils", 3, "handleActionCheckUpdate: No versionBean found");
                    }
                } else {
                    if (BaseApplication.get() != null) {
                        p367ya.b.a().clearAll();
                    }
                    F6.d.h("UpdateUtils", 3, "handleActionCheckUpdate: No versionBean found");
                }
            }
        } catch (Exception e10) {
            F6.d.h("UpdateUtils", 3, "handleActionCheckUpdate" + e10);
        }
        return Unit.f38893a;
    }
}
