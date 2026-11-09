package Wf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CopyableThreadContextElement;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Wf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0773q {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new Ab.y(8))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new Ab.y(8))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        f10.f38951a = coroutineContext2;
        kotlin.coroutines.f fVar = kotlin.coroutines.f.f38943a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(fVar, new Function2() { // from class: Wf.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof CopyableThreadContextElement)) {
                    return coroutineContext4.plus(element);
                }
                kotlin.jvm.internal.F f11 = f10;
                CoroutineContext.Element element2 = ((CoroutineContext) f11.f38951a).get(element.getKey());
                if (element2 != null) {
                    f11.f38951a = ((CoroutineContext) f11.f38951a).minusKey(element.getKey());
                    return coroutineContext4.plus(((CopyableThreadContextElement) element).mergeForChild(element2));
                }
                CopyableThreadContextElement copyableThreadContextElementCopyForChild = (CopyableThreadContextElement) element;
                if (z3) {
                    copyableThreadContextElementCopyForChild = copyableThreadContextElementCopyForChild.copyForChild();
                }
                return coroutineContext4.plus(copyableThreadContextElementCopyForChild);
            }
        });
        if (zBooleanValue2) {
            f10.f38951a = ((CoroutineContext) f10.f38951a).fold(fVar, new Ab.y(9));
        }
        return coroutineContext3.plus((CoroutineContext) f10.f38951a);
    }

    public static final CoroutineContext b(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(coroutineScope.getF17355b(), coroutineContext, true);
        p042cg.f fVar = I.f10809a;
        return (coroutineContextA == fVar || coroutineContextA.get(ContinuationInterceptor.f38936l0) != null) ? coroutineContextA : coroutineContextA.plus(fVar);
    }

    public static final B0 c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        B0 b0 = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(C0.f10803a) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (!(callerFrame instanceof F) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof B0) {
                    b0 = (B0) callerFrame;
                    break;
                }
            }
            if (b0 != null) {
                b0.P(coroutineContext, obj);
            }
        }
        return b0;
    }
}
