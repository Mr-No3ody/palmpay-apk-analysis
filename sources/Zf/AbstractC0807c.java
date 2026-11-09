package Zf;

import Pa.a0;
import Yf.EnumC0789a;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: renamed from: Zf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0807c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Continuation[] f11736a = new Continuation[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f11737b = new a0("NULL", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f11738c = new a0("UNINITIALIZED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f11739d = new a0(PalmZoneTaskBean.BTN_TYPE_DONE, 1);

    public static /* synthetic */ Flow a(FusibleFlow fusibleFlow, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a, int i10) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.f.f38943a;
        }
        if ((i10 & 2) != 0) {
            i7 = -3;
        }
        if ((i10 & 4) != 0) {
            enumC0789a = EnumC0789a.f11390a;
        }
        return fusibleFlow.fuse(coroutineContext, i7, enumC0789a);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation frame) {
        Object objInvoke;
        Object objC = p015ag.v.c(coroutineContext, obj2);
        try {
            C c6 = new C(frame, coroutineContext);
            if (function2 == null) {
                objInvoke = Ef.f.c(function2, obj, c6);
            } else {
                K.d(2, function2);
                objInvoke = function2.invoke(obj, c6);
            }
            p015ag.v.a(coroutineContext, objC);
            if (objInvoke == Ef.a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            p015ag.v.a(coroutineContext, objC);
            throw th;
        }
    }
}
