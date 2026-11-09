package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends A implements KProperty1 {
    @Override // kotlin.jvm.internal.AbstractC1855e
    public KCallable computeReflected() {
        G.f38952a.getClass();
        return this;
    }

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1.Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }
}
