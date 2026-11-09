package p128ia;

import Ef.a;
import F6.d;
import Pa.C0525w;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import Wf.v0;
import androidx.camera.core.impl.utils.executor.g;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.AppListCollectUpload;
import com.transsnet.palmpay.core.bean.req.AppListCollectUploadBean;
import com.transsnet.palmpay.core.bean.rsp.AppListCollectConfigBean;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p015ag.c;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f37455a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f37456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile t0 f37457c;

    static {
        f fVar = I.f10809a;
        p042cg.e eVar = p042cg.e.f19009c;
        v0 v0VarC = AbstractC0780y.c();
        eVar.getClass();
        f37456b = AbstractC0777v.a(kotlin.coroutines.e.c(eVar, v0VarC));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(Ff.c cVar) {
        b bVar;
        T t;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i7 = bVar.f37440b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f37440b = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar);
            }
        } else {
            bVar = new b(cVar);
        }
        Object objCheckAppListCollectConfig = bVar.f37439a;
        a aVar = a.f2423a;
        int i10 = bVar.f37440b;
        try {
            if (i10 == 0) {
                g.M(objCheckAppListCollectConfig);
                String manufacturer = DeviceUtils.getManufacturer();
                String model = DeviceUtils.getModel();
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                AppListCollectUpload appListCollectUpload = new AppListCollectUpload(manufacturer, model);
                bVar.f37440b = 1;
                objCheckAppListCollectConfig = payApiService.checkAppListCollectConfig(appListCollectUpload, bVar);
                if (objCheckAppListCollectConfig == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objCheckAppListCollectConfig);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) objCheckAppListCollectConfig;
            if (commonBeanResult != null && commonBeanResult.isSuccess() && (t = commonBeanResult.data) != 0) {
                return (AppListCollectConfigBean) t;
            }
            d.h("InstalledAppsCollect", 5, "查询配置失败: " + (commonBeanResult != null ? commonBeanResult.getRespMsg() : null));
            return null;
        } catch (Exception e10) {
            d.c("InstalledAppsCollect", "查询采集配置失败", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0147 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:34:0x0147, B:36:0x014b, B:38:0x0155, B:74:0x027e, B:76:0x02a2, B:77:0x02ad, B:79:0x02b0, B:83:0x02c5, B:19:0x0078, B:22:0x0090, B:24:0x0096, B:28:0x00c5, B:30:0x00cb, B:32:0x0105, B:31:0x00ef), top: B:88:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x014b A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:34:0x0147, B:36:0x014b, B:38:0x0155, B:74:0x027e, B:76:0x02a2, B:77:0x02ad, B:79:0x02b0, B:83:0x02c5, B:19:0x0078, B:22:0x0090, B:24:0x0096, B:28:0x00c5, B:30:0x00cb, B:32:0x0105, B:31:0x00ef), top: B:88:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0155 A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:34:0x0147, B:36:0x014b, B:38:0x0155, B:74:0x027e, B:76:0x02a2, B:77:0x02ad, B:79:0x02b0, B:83:0x02c5, B:19:0x0078, B:22:0x0090, B:24:0x0096, B:28:0x00c5, B:30:0x00cb, B:32:0x0105, B:31:0x00ef), top: B:88:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0165  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01cf -> B:90:0x01db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(java.lang.String r21, java.util.List r22, Ff.c r23) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p128ia.e.b(java.lang.String, java.util.List, Ff.c):java.lang.Object");
    }

    public static void c() {
        try {
            SPUtils.getInstance().remove("installed_apps_collect_last_apply_id");
            SPUtils.getInstance().remove("installed_apps_collect_last_uploaded_batch_index");
            SPUtils.getInstance().remove("installed_apps_collect_last_app_count");
            d.h("InstalledAppsCollect", 3, "清除上传进度");
        } catch (Exception e10) {
            d.c("InstalledAppsCollect", "清除上传进度失败", e10);
        }
    }

    public static Pair d(String str) {
        try {
            String string = SPUtils.getInstance().getString("installed_apps_collect_last_apply_id", "");
            if (!Intrinsics.c(string, str)) {
                d.h("InstalledAppsCollect", 3, "applyId 不同，从头开始上传: last=" + string + ", current=" + str);
                return new Pair(-1, 0);
            }
            int i7 = SPUtils.getInstance().getInt("installed_apps_collect_last_uploaded_batch_index", -1);
            int i10 = SPUtils.getInstance().getInt("installed_apps_collect_last_app_count", 0);
            d.h("InstalledAppsCollect", 3, "读取上传进度: applyId=" + str + ", lastBatchIndex=" + i7 + ", lastAppCount=" + i10);
            return new Pair(Integer.valueOf(i7), Integer.valueOf(i10));
        } catch (Exception e10) {
            d.c("InstalledAppsCollect", "获取上传进度失败", e10);
            return new Pair(-1, 0);
        }
    }

    public static void e(int i7, int i10, String str) {
        try {
            SPUtils.getInstance().put("installed_apps_collect_last_apply_id", str);
            SPUtils.getInstance().put("installed_apps_collect_last_uploaded_batch_index", i7);
            SPUtils.getInstance().put("installed_apps_collect_last_app_count", i10);
            d.h("InstalledAppsCollect", 3, "保存上传进度: applyId=" + str + ", batchIndex=" + i7 + ", appCount=" + i10);
        } catch (Exception e10) {
            d.c("InstalledAppsCollect", "保存上传进度失败", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(String str, List list, boolean z3, Ff.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i7 = dVar.f37454c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f37454c = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objUploadAppListCollect = dVar.f37452a;
        a aVar = a.f2423a;
        int i10 = dVar.f37454c;
        boolean z8 = false;
        try {
            if (i10 == 0) {
                g.M(objUploadAppListCollect);
                String json = ((Gson) C0525w.f().f7166b).toJson(list);
                AppListCollectUploadBean appListCollectUploadBean = new AppListCollectUploadBean();
                appListCollectUploadBean.setApplyId(str);
                appListCollectUploadBean.setInfo(json);
                appListCollectUploadBean.setMemberId(BaseApplication.get().getUser().getMemberId());
                appListCollectUploadBean.setLastPageFlag(Boolean.valueOf(z3));
                d.h("InstalledAppsCollect", 3, "上传批次: isLastBatch=" + z3);
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                dVar.f37454c = 1;
                objUploadAppListCollect = payApiService.uploadAppListCollect(appListCollectUploadBean, dVar);
                if (objUploadAppListCollect == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objUploadAppListCollect);
            }
            CommonResult commonResult = (CommonResult) objUploadAppListCollect;
            if (commonResult == null || !commonResult.isSuccess()) {
                d.h("InstalledAppsCollect", 5, "批次上传失败: " + (commonResult != null ? commonResult.getRespMsg() : null));
            } else {
                z8 = true;
            }
        } catch (Exception e10) {
            d.c("InstalledAppsCollect", "批次上传异常", e10);
        }
        return Boolean.valueOf(z8);
    }
}
