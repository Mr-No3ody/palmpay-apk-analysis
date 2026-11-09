package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum B1 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC1123n.class, AbstractC1123n.f16699b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f16441a;

    B1(Class cls, Serializable serializable) {
        this.f16441a = serializable;
    }
}
