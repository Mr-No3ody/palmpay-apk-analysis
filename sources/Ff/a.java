package Ff;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Continuation, CoroutineStackFrame, Serializable {

    @Nullable
    private final Continuation<Object> completion;

    public a(Continuation continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Nullable
    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        DebugMetadata debugMetadata = (DebugMetadata) getClass().getAnnotation(DebugMetadata.class);
        String str = null;
        if (debugMetadata == null) {
            return null;
        }
        int iV = debugMetadata.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i7 = iIntValue >= 0 ? debugMetadata.l()[iIntValue] : -1;
        e.f2831a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        d dVar = e.f2833c;
        d dVar2 = e.f2832b;
        if (dVar == null) {
            try {
                d dVar3 = new d(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                e.f2833c = dVar3;
                dVar = dVar3;
            } catch (Exception unused2) {
                e.f2833c = dVar2;
                dVar = dVar2;
            }
        }
        if (dVar != dVar2 && (method = dVar.f2828a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = dVar.f2829b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = dVar.f2830c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = debugMetadata.c();
        } else {
            strC = str + '/' + debugMetadata.c();
        }
        return new StackTraceElement(strC, debugMetadata.m(), debugMetadata.f(), i7);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Continuation<Object> frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            Continuation<Object> continuation = aVar.completion;
            Intrinsics.e(continuation);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == Ef.a.f2423a) {
                    return;
                } else {
                    o oVar = q.f43977a;
                }
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                obj = androidx.camera.core.impl.utils.executor.g.f(th);
            }
            aVar.releaseIntercepted();
            if (!(continuation instanceof a)) {
                continuation.resumeWith(obj);
                return;
            }
            frame = continuation;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
