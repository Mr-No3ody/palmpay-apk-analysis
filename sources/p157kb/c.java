package p157kb;

import Ef.a;
import Ff.h;
import Pa.C0525w;
import Pa.H;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.google.gson.Gson;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.credit.init.LoanBusinessConfigTask;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p186mb.d;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LoanBusinessConfigTask f38728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, LoanBusinessConfigTask loanBusinessConfigTask, int i7, Continuation continuation) {
        super(2, continuation);
        this.f38727c = str;
        this.f38728d = loanBusinessConfigTask;
        this.f38729e = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f38727c, this.f38728d, this.f38729e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d8 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x001f, B:75:0x01b5, B:77:0x01b9, B:79:0x01c0, B:81:0x01c6, B:84:0x01cd, B:86:0x01d3, B:87:0x0201, B:15:0x0031, B:58:0x0153, B:60:0x0157, B:62:0x015e, B:64:0x0164, B:67:0x016b, B:69:0x0171, B:70:0x0199, B:18:0x003a, B:41:0x00d4, B:43:0x00d8, B:45:0x00df, B:47:0x00e5, B:50:0x00ec, B:52:0x00f2, B:53:0x0121, B:21:0x0043, B:31:0x008e, B:33:0x00bb, B:35:0x00c1, B:37:0x00c7, B:54:0x0130, B:55:0x0147, B:71:0x01a8, B:24:0x004c, B:26:0x0054, B:28:0x0057), top: B:92:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0121 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x001f, B:75:0x01b5, B:77:0x01b9, B:79:0x01c0, B:81:0x01c6, B:84:0x01cd, B:86:0x01d3, B:87:0x0201, B:15:0x0031, B:58:0x0153, B:60:0x0157, B:62:0x015e, B:64:0x0164, B:67:0x016b, B:69:0x0171, B:70:0x0199, B:18:0x003a, B:41:0x00d4, B:43:0x00d8, B:45:0x00df, B:47:0x00e5, B:50:0x00ec, B:52:0x00f2, B:53:0x0121, B:21:0x0043, B:31:0x008e, B:33:0x00bb, B:35:0x00c1, B:37:0x00c7, B:54:0x0130, B:55:0x0147, B:71:0x01a8, B:24:0x004c, B:26:0x0054, B:28:0x0057), top: B:92:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0157 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x001f, B:75:0x01b5, B:77:0x01b9, B:79:0x01c0, B:81:0x01c6, B:84:0x01cd, B:86:0x01d3, B:87:0x0201, B:15:0x0031, B:58:0x0153, B:60:0x0157, B:62:0x015e, B:64:0x0164, B:67:0x016b, B:69:0x0171, B:70:0x0199, B:18:0x003a, B:41:0x00d4, B:43:0x00d8, B:45:0x00df, B:47:0x00e5, B:50:0x00ec, B:52:0x00f2, B:53:0x0121, B:21:0x0043, B:31:0x008e, B:33:0x00bb, B:35:0x00c1, B:37:0x00c7, B:54:0x0130, B:55:0x0147, B:71:0x01a8, B:24:0x004c, B:26:0x0054, B:28:0x0057), top: B:92:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0199 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x001f, B:75:0x01b5, B:77:0x01b9, B:79:0x01c0, B:81:0x01c6, B:84:0x01cd, B:86:0x01d3, B:87:0x0201, B:15:0x0031, B:58:0x0153, B:60:0x0157, B:62:0x015e, B:64:0x0164, B:67:0x016b, B:69:0x0171, B:70:0x0199, B:18:0x003a, B:41:0x00d4, B:43:0x00d8, B:45:0x00df, B:47:0x00e5, B:50:0x00ec, B:52:0x00f2, B:53:0x0121, B:21:0x0043, B:31:0x008e, B:33:0x00bb, B:35:0x00c1, B:37:0x00c7, B:54:0x0130, B:55:0x0147, B:71:0x01a8, B:24:0x004c, B:26:0x0054, B:28:0x0057), top: B:92:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x001f, B:75:0x01b5, B:77:0x01b9, B:79:0x01c0, B:81:0x01c6, B:84:0x01cd, B:86:0x01d3, B:87:0x0201, B:15:0x0031, B:58:0x0153, B:60:0x0157, B:62:0x015e, B:64:0x0164, B:67:0x016b, B:69:0x0171, B:70:0x0199, B:18:0x003a, B:41:0x00d4, B:43:0x00d8, B:45:0x00df, B:47:0x00e5, B:50:0x00ec, B:52:0x00f2, B:53:0x0121, B:21:0x0043, B:31:0x008e, B:33:0x00bb, B:35:0x00c1, B:37:0x00c7, B:54:0x0130, B:55:0x0147, B:71:0x01a8, B:24:0x004c, B:26:0x0054, B:28:0x0057), top: B:92:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0201 A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x001f, B:75:0x01b5, B:77:0x01b9, B:79:0x01c0, B:81:0x01c6, B:84:0x01cd, B:86:0x01d3, B:87:0x0201, B:15:0x0031, B:58:0x0153, B:60:0x0157, B:62:0x015e, B:64:0x0164, B:67:0x016b, B:69:0x0171, B:70:0x0199, B:18:0x003a, B:41:0x00d4, B:43:0x00d8, B:45:0x00df, B:47:0x00e5, B:50:0x00ec, B:52:0x00f2, B:53:0x0121, B:21:0x0043, B:31:0x008e, B:33:0x00bb, B:35:0x00c1, B:37:0x00c7, B:54:0x0130, B:55:0x0147, B:71:0x01a8, B:24:0x004c, B:26:0x0054, B:28:0x0057), top: B:92:0x0013 }] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String strD;
        Object objQueryStyleConfigVersion;
        Object businessConfigFromNet;
        String str;
        Object businessConfigFromNet2;
        Object businessConfigFromNet3;
        String str2;
        CommonBeanResult commonBeanResult;
        Map map;
        CommonBeanResult commonBeanResult2;
        Map map2;
        CommonBeanResult commonBeanResult3;
        Map map3;
        a aVar = a.f2423a;
        int i7 = this.f38726b;
        LoanBusinessConfigTask loanBusinessConfigTask = this.f38728d;
        int i10 = this.f38729e;
        String str3 = this.f38727c;
        try {
            if (i7 == 0) {
                g.M(obj);
                if (NQEManager.INSTANCE.isNetworkOffline()) {
                    return Unit.f38893a;
                }
                strD = H.c(BaseApplication.get()).d(str3);
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                String appVersionName = AppUtils.getAppVersionName();
                String phoneNumber = BaseApplication.get().getUser().getPhoneNumber();
                this.f38725a = strD;
                this.f38726b = 1;
                objQueryStyleConfigVersion = iApiCreditServiceA.queryStyleConfigVersion("MAIN_LOAN_STYLE_CONFIG", appVersionName, phoneNumber, this);
                if (objQueryStyleConfigVersion == aVar) {
                }
                return aVar;
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    str2 = this.f38725a;
                    g.M(obj);
                    businessConfigFromNet3 = obj;
                    commonBeanResult = (CommonBeanResult) businessConfigFromNet3;
                    if ((commonBeanResult != null ? (Map) commonBeanResult.data : null) != null || ((map = (Map) commonBeanResult.data) != null && map.isEmpty())) {
                        d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                    } else if (commonBeanResult.isSuccess()) {
                        H.c(BaseApplication.get()).f(i10, str3, ((Gson) C0525w.f().f7166b).toJson(commonBeanResult.data));
                        SPUtils.get().put("style_config_version", str2);
                        d.f39634e.getInstance().a((Map) commonBeanResult.data);
                    }
                    return Unit.f38893a;
                }
                if (i7 == 3) {
                    g.M(obj);
                    businessConfigFromNet2 = obj;
                    commonBeanResult2 = (CommonBeanResult) businessConfigFromNet2;
                    if ((commonBeanResult2 != null ? (Map) commonBeanResult2.data : null) != null || ((map2 = (Map) commonBeanResult2.data) != null && map2.isEmpty())) {
                        d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                    } else if (commonBeanResult2.isSuccess()) {
                        H.c(BaseApplication.get()).f(i10, str3, ((Gson) C0525w.f().f7166b).toJson(commonBeanResult2.data));
                        d.f39634e.getInstance().a((Map) commonBeanResult2.data);
                    }
                    return Unit.f38893a;
                }
                if (i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f38725a;
                g.M(obj);
                businessConfigFromNet = obj;
                commonBeanResult3 = (CommonBeanResult) businessConfigFromNet;
                if ((commonBeanResult3 != null ? (Map) commonBeanResult3.data : null) != null || ((map3 = (Map) commonBeanResult3.data) != null && map3.isEmpty())) {
                    d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                } else if (commonBeanResult3.isSuccess()) {
                    H.c(BaseApplication.get()).f(i10, str3, ((Gson) C0525w.f().f7166b).toJson(commonBeanResult3.data));
                    SPUtils.get().put("style_config_version", str);
                    d.f39634e.getInstance().a((Map) commonBeanResult3.data);
                }
                return Unit.f38893a;
            }
            strD = this.f38725a;
            g.M(obj);
            objQueryStyleConfigVersion = obj;
            CommonLongResult commonLongResult = (CommonLongResult) objQueryStyleConfigVersion;
            String strJoin = TextUtils.join("-", C1850q.h(AppUtils.getAppVersionName(), new Long(commonLongResult.getData())));
            String string = SPUtils.get().getString("style_config_version");
            if (!TextUtils.isEmpty(strD)) {
                if (!commonLongResult.isSuccess()) {
                    this.f38725a = null;
                    this.f38726b = 3;
                    businessConfigFromNet2 = loanBusinessConfigTask.getBusinessConfigFromNet(this);
                    if (businessConfigFromNet2 == aVar) {
                    }
                    commonBeanResult2 = (CommonBeanResult) businessConfigFromNet2;
                    if ((commonBeanResult2 != null ? (Map) commonBeanResult2.data : null) != null) {
                        d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                    } else {
                        d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                    }
                    return Unit.f38893a;
                }
                if (TextUtils.equals(strJoin, string)) {
                    d.f39634e.getInstance().a((Map) C0525w.f().e(strD, Map.class));
                } else {
                    this.f38725a = strJoin;
                    this.f38726b = 2;
                    businessConfigFromNet3 = loanBusinessConfigTask.getBusinessConfigFromNet(this);
                    if (businessConfigFromNet3 != aVar) {
                        str2 = strJoin;
                        commonBeanResult = (CommonBeanResult) businessConfigFromNet3;
                        if ((commonBeanResult != null ? (Map) commonBeanResult.data : null) != null) {
                            d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                        } else {
                            d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                        }
                    }
                }
                return Unit.f38893a;
            }
            this.f38725a = strJoin;
            this.f38726b = 4;
            businessConfigFromNet = loanBusinessConfigTask.getBusinessConfigFromNet(this);
            if (businessConfigFromNet != aVar) {
                str = strJoin;
                commonBeanResult3 = (CommonBeanResult) businessConfigFromNet;
                if ((commonBeanResult3 != null ? (Map) commonBeanResult3.data : null) != null) {
                    d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                } else {
                    d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
                }
                return Unit.f38893a;
            }
            return aVar;
        } catch (Exception e10) {
            F6.d.c(BaseInitTask.TAG, "queryBusinessConfig: ", e10);
            d.f39634e.getInstance().a(loanBusinessConfigTask.getBusinessConfigFromAssets());
        }
    }
}
