package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1077a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1077a2 f16579c = new C1077a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16581b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1149w f16580a = new C1149w();

    public final Schema a(Class cls) {
        AbstractC1154x1.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f16581b;
        Schema schemaCreateSchema = (Schema) concurrentHashMap.get(cls);
        if (schemaCreateSchema == null) {
            schemaCreateSchema = this.f16580a.createSchema(cls);
            Schema schema = (Schema) concurrentHashMap.putIfAbsent(cls, schemaCreateSchema);
            if (schema != null) {
                return schema;
            }
        }
        return schemaCreateSchema;
    }
}
