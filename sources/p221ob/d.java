package p221ob;

import android.os.Build;
import androidx.camera.camera2.internal.F;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import io.reactivex.internal.operators.observable.C1760l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p059e1.a;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements InvocationHandler {
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String strValue;
        boolean zC;
        IApiCreditService service;
        int i7 = 2;
        boolean zC2 = true;
        if (Intrinsics.c(method.getDeclaringClass(), Object.class)) {
            Intrinsics.e(obj);
            String name = method.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != -1295482945) {
                        if (iHashCode == 147696667 && name.equals("hashCode")) {
                            return Integer.valueOf(System.identityHashCode(obj));
                        }
                    } else if (name.equals("equals")) {
                        return Boolean.valueOf(obj == (objArr != null ? C1847n.s(0, objArr) : null));
                    }
                } else if (name.equals("toString")) {
                    return "CreditNetworkRouterProxy";
                }
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
        GET get = (GET) method.getAnnotation(GET.class);
        if (get == null || (strValue = get.value()) == null) {
            POST post = (POST) method.getAnnotation(POST.class);
            if (post != null) {
                strValue = post.value();
            } else {
                PUT put = (PUT) method.getAnnotation(PUT.class);
                strValue = put != null ? put.value() : null;
                if (strValue == null) {
                    DELETE delete = (DELETE) method.getAnnotation(DELETE.class);
                    strValue = delete != null ? delete.value() : null;
                    if (strValue == null) {
                        PATCH patch = (PATCH) method.getAnnotation(PATCH.class);
                        strValue = patch != null ? patch.value() : null;
                        if (strValue == null) {
                            HTTP http = (HTTP) method.getAnnotation(HTTP.class);
                            strValue = http != null ? http.path() : null;
                        }
                    }
                }
            }
        }
        if (strValue == null || !e.f40269a.contains(strValue)) {
            zC2 = false;
            break;
        }
        if (strValue.equals("/api/flexi-service/mainLoan/v1/queryDataInfo") || strValue.equals("/api/loan/api/v1/flexi2023/queryPopUpsV2")) {
            if (objArr == null || objArr.length == 0) {
                zC2 = false;
                break;
            }
            if (Build.VERSION.SDK_INT < 26) {
                int length = objArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        zC2 = false;
                        break;
                    }
                    if (Intrinsics.c(objArr[i10], "HIRE_PURCHASE")) {
                        break;
                    }
                    i10++;
                }
            } else {
                Parameter[] parameters = method.getParameters();
                int length2 = parameters.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        int length3 = objArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length3) {
                                zC2 = false;
                                break;
                            }
                            if (Intrinsics.c(objArr[i12], "HIRE_PURCHASE")) {
                                break;
                            }
                            i12++;
                        }
                    } else {
                        Query query = (Query) parameters[i11].getAnnotation(Query.class);
                        if (query != null && Intrinsics.c(query.value(), "productScene")) {
                            zC2 = Intrinsics.c(C1847n.s(i11, objArr), "HIRE_PURCHASE");
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        if (Intrinsics.c(strValue, "/api/flexi-service/mainLoan/querySignedProtocol") || Intrinsics.c(strValue, "/api/flexi-service/mfb/member-mapping/initialize")) {
            zC = false;
        } else {
            zC = zC2 ? a.C("_loan_use_new_domain", false) : b.y();
        }
        if (zC) {
            service = (IApiCreditService) e.f40271c.getValue();
        } else {
            Object value = e.f40270b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            service = (IApiCreditService) value;
        }
        String name2 = method.getName();
        String str = zC ? "Bank" : "PP";
        StringBuilder sbF = F.f("path=", strValue, " method=", name2, " hirePurchase=");
        sbF.append(zC2);
        sbF.append(" domain=");
        sbF.append(str);
        F6.d.h("CreditNetworkRouter", 3, sbF.toString());
        Intrinsics.checkNotNullParameter(service, "service");
        Object objInvoke = (objArr == null || objArr.length == 0) ? method.invoke(service, new Object[0]) : method.invoke(service, Arrays.copyOf(objArr, objArr.length));
        if (zC && objInvoke != null) {
            if (objInvoke instanceof CommonResult) {
                Set set = p252qa.a.f41468a;
                String respCode = ((CommonResult) objInvoke).getRespCode();
                if (respCode == null || StringsKt.F(respCode) || !p252qa.a.f41468a.contains(respCode)) {
                    return objInvoke;
                }
                p252qa.a.a(null);
                throw new p203na.b();
            }
            if (objInvoke instanceof df.d) {
                return new C1760l((df.d) objInvoke, new p184m8.b(i7), i7);
            }
        }
        return objInvoke;
    }
}
