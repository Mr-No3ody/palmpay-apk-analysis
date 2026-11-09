package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends A implements KProperty2 {
    @Override // kotlin.jvm.internal.AbstractC1855e
    public final KCallable computeReflected() {
        G.f38952a.getClass();
        return this;
    }

    @Override // kotlin.reflect.KProperty2
    public final Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
