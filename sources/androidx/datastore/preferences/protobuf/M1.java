package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f16515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L1 f16516b;

    static {
        MapFieldSchema mapFieldSchema;
        C1077a2 c1077a2 = C1077a2.f16579c;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mapFieldSchema = null;
        }
        f16515a = mapFieldSchema;
        f16516b = new L1();
    }
}
