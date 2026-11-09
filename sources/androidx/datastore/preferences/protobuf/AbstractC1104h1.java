package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1104h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1100g1 f16646a = new C1100g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1096f1 f16647b;

    static {
        AbstractC1096f1 abstractC1096f1;
        C1077a2 c1077a2 = C1077a2.f16579c;
        try {
            abstractC1096f1 = (AbstractC1096f1) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC1096f1 = null;
        }
        f16647b = abstractC1096f1;
    }
}
