package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends y {
    @Override // kotlin.reflect.KProperty2
    public final Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
