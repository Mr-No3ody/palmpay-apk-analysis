package com.transsnet.palmpay.core.rnbridge;

import Ca.c;
import Ca.e;
import F6.d;
import Pg.k;
import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.util.CloseUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.B;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import kotlin.ranges.b;
import okhttp3.F;
import okhttp3.S;
import okhttp3.U;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_FLEXIBANK_SDK_INIT, BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, name = BaseInitTaskKt.TASK_REACT_NATIVE_INIT)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/ReactNativeInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "", "initOkHttpClientFactory", "Lokhttp3/Y;", "request", "Lokhttp3/e0;", "response", "monitorNetworkError", "(Lokhttp3/Y;Lokhttp3/e0;)V", "", "getRequestHeader", "(Lokhttp3/Y;)Ljava/lang/String;", "getRequestBody", "getTaskName", "()Ljava/lang/String;", "Landroid/app/Application;", "application", "Lcom/alibaba/android/alpha/Task;", "getTask", "(Landroid/app/Application;)Lcom/alibaba/android/alpha/Task;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactNativeInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeInitTask.kt\ncom/transsnet/palmpay/core/rnbridge/ReactNativeInitTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,144:1\n1869#2,2:145\n563#3:147\n578#3:148\n*S KotlinDebug\n*F\n+ 1 ReactNativeInitTask.kt\ncom/transsnet/palmpay/core/rnbridge/ReactNativeInitTask\n*L\n136#1:145,2\n55#1:147\n69#1:148\n*E\n"})
public final class ReactNativeInitTask extends BaseInitTask {
    private final String getRequestBody(Y request) {
        Collection<String> collectionUnmodifiableSet;
        StringBuilder sb2 = new StringBuilder();
        try {
            c0 c0Var = request.f40688d;
            if (c0Var != null && c0Var.contentLength() > 0) {
                k kVar = new k();
                try {
                    c0 c0Var2 = request.f40688d;
                    Intrinsics.e(c0Var2);
                    c0Var2.writeTo(kVar);
                    sb2.append(kVar.readUtf8());
                } catch (Exception unused) {
                    CloseUtils.closeIO(kVar);
                    Unit unit = Unit.f38893a;
                }
            }
        } catch (IOException unused2) {
        }
        ArrayList arrayList = request.f40685a.f40585g;
        if (arrayList == null) {
            collectionUnmodifiableSet = B.f38895a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a aVarE = b.e(b.f(0, arrayList.size()), 2);
            int i7 = aVarE.f38977a;
            int i10 = aVarE.f38978b;
            int i11 = aVarE.f38979c;
            if ((i11 > 0 && i7 <= i10) || (i11 < 0 && i10 <= i7)) {
                while (true) {
                    Object obj = arrayList.get(i7);
                    Intrinsics.e(obj);
                    linkedHashSet.add(obj);
                    if (i7 == i10) {
                        break;
                    }
                    i7 += i11;
                }
            }
            collectionUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(collectionUnmodifiableSet, "unmodifiableSet(result)");
        }
        if (!collectionUnmodifiableSet.isEmpty()) {
            for (String str : collectionUnmodifiableSet) {
                sb2.append("查询参数|" + str + ": " + request.f40685a.h(str));
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String getRequestHeader(Y request) {
        StringBuilder sb2 = new StringBuilder();
        try {
            F f10 = request.f40687c;
            System.out.println((Object) "Request Headers:");
            int size = f10.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb2.append(f10.b(i7) + ": " + f10.f(i7) + ",");
            }
        } catch (IOException unused) {
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initOkHttpClientFactory() {
        try {
            OkHttpClientProvider.setOkHttpClientFactory(new A8.a(this, 19));
        } catch (Exception e10) {
            d.c(BaseInitTask.TAG, "initOkHttpClientFactory: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U initOkHttpClientFactory$lambda$2(ReactNativeInitTask reactNativeInitTask) {
        d.h(BaseInitTask.TAG, 3, "createNewNetworkModuleClient: ");
        BaseApplication baseApplication = BaseApplication.get();
        Intrinsics.checkNotNullExpressionValue(baseApplication, "get(...)");
        S sCreateClientBuilder = OkHttpClientProvider.createClientBuilder(baseApplication, 209715200);
        sCreateClientBuilder.a(new Ca.d());
        e interceptor = new e(reactNativeInitTask);
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        sCreateClientBuilder.f40618d.add(interceptor);
        return new U(sCreateClientBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void monitorNetworkError(Y request, e0 response) {
        d.c(BaseInitTask.TAG, "网络请求失败: " + G.g(new Pair("url", request.f40685a.f40587i), new Pair(FirebaseAnalytics.Param.METHOD, request.f40686b), new Pair("header", getRequestHeader(request)), new Pair("Parameter", getRequestBody(request)), new Pair("code", String.valueOf(response.f40731d)), new Pair("message", response.f40730c), new Pair("timestamp", String.valueOf(System.currentTimeMillis()))));
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new c(this);
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_REACT_NATIVE_INIT;
    }
}
