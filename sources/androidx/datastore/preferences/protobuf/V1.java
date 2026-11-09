package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f16543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U1 f16544b;

    static {
        NewInstanceSchema newInstanceSchema;
        C1077a2 c1077a2 = C1077a2.f16579c;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            newInstanceSchema = null;
        }
        f16543a = newInstanceSchema;
        f16544b = new U1();
    }
}
