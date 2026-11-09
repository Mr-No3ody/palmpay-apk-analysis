package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public class r extends q {
    public r(String str, String str2, Class cls) {
        super(AbstractC1855e.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
