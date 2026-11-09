package Pa;

import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7064c;

    public /* synthetic */ Z(Object obj, String str, int i7) {
        this.f7062a = i7;
        this.f7063b = obj;
        this.f7064c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7062a) {
            case 0:
                String str = this.f7064c;
                Object obj = this.f7063b;
                if (obj != null) {
                    if (!(obj instanceof CommonResult) || ((CommonResult) obj).isSuccess()) {
                        Class<?> cls = obj.getClass();
                        for (Field field : cls.getFields()) {
                            if (field.getType().getSimpleName().equalsIgnoreCase("List")) {
                                try {
                                    List list = (List) field.get(obj);
                                    if (list != null && !list.isEmpty()) {
                                        H.c(BaseApplication.getInstance()).g(str, ((Gson) C0525w.f().f7166b).toJson(obj, cls));
                                    }
                                } catch (Exception e10) {
                                    F6.d.c("RxUtil", e10.getMessage());
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                Object obj2 = this.f7063b;
                if (obj2 != null) {
                    if (!(obj2 instanceof CommonResult) || ((CommonResult) obj2).isSuccess()) {
                        H.c(BaseApplication.getInstance()).g(this.f7064c, ((Gson) C0525w.f().f7166b).toJson(obj2, obj2.getClass()));
                    }
                }
                break;
            default:
                Object obj3 = this.f7063b;
                if (obj3 != null) {
                    if (!(obj3 instanceof CommonResult) || ((CommonResult) obj3).isSuccess()) {
                        H.c(BaseApplication.getInstance()).f(60, this.f7064c, ((Gson) C0525w.f().f7166b).toJson(obj3, obj3.getClass()));
                    }
                }
                break;
        }
    }
}
