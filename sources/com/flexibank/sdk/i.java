package com.flexibank.sdk;

import Pa.G;
import android.app.Application;
import android.util.Log;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.util.SPUtils;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f22312b = str;
        this.f22313c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f22312b, this.f22313c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Application application;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f22311a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        String str = j4.l.f38299a;
        try {
            k.q("");
            k.p("");
            j4.o oVar = j4.p.f38303b;
            synchronized (k.class) {
                k.d();
                application = k.f22319c;
                Intrinsics.e(application);
            }
            G g7 = j4.o.get$default(oVar, application, null, 2, null).f38308a;
            if (g7 != null) {
                g7.f7017d.clear();
                g7.f7015b.set(0L);
                File[] fileArrListFiles = g7.f7014a.listFiles();
                if (fileArrListFiles != null) {
                    M.q qVarA = AbstractC1859i.a(fileArrListFiles);
                    while (qVarA.hasNext()) {
                        File file = (File) qVarA.next();
                        Intrinsics.e(file);
                        file.delete();
                    }
                }
            }
            MMKV mmkv = p110h4.b.f37294b.getInstance().f37296a;
            mmkv.remove("member_id");
            k.q("");
            k.p("");
            mmkv.remove("_auth_code");
            k.f22317a.e();
            j4.h.b().clear();
            SPUtils.getInstance("dialog").clear();
        } catch (Exception e10) {
            Log.e(j4.l.f38299a, "doLogoutWork: ", e10);
        }
        k kVar = k.f22317a;
        this.f22311a = 1;
        Object objA = k.a(this.f22312b, this.f22313c, this);
        return objA == aVar ? aVar : objA;
    }
}
