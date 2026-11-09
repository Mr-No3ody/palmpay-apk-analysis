package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends A implements KProperty0 {
    @Override // kotlin.jvm.internal.AbstractC1855e
    public final KCallable computeReflected() {
        G.f38952a.getClass();
        return this;
    }

    @Override // kotlin.reflect.KProperty0
    public final Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
