package kotlin.coroutines;

import Ab.y;
import androidx.camera.video.u;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f38940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f38941b;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f38940a = left;
        this.f38941b = element;
    }

    public final boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i7 = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f38940a;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f38940a;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i10 == i7) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f38941b;
                    if (!Intrinsics.c(cVar.get(element.getKey()), element)) {
                        zC = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f38940a;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.f(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zC = Intrinsics.c(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f38940a.fold(obj, operation), this.f38941b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f38941b.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f38940a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f38941b.hashCode() + this.f38940a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f38941b;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f38940a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        if (coroutineContextMinusKey == coroutineContext) {
            return this;
        }
        return coroutineContextMinusKey == f.f38943a ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == f.f38943a ? this : (CoroutineContext) context.fold(this, new y(2));
    }

    public final String toString() {
        return u.p(new StringBuilder("["), (String) fold("", new y(1)), ']');
    }
}
