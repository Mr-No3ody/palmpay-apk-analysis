package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ListFieldSchema f16468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1 f16469b;

    static {
        ListFieldSchema listFieldSchema;
        C1077a2 c1077a2 = C1077a2.f16579c;
        try {
            listFieldSchema = (ListFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            listFieldSchema = null;
        }
        f16468a = listFieldSchema;
        f16469b = new C1();
    }
}
