package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum I2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC1123n.f16699b),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f16508a;

    I2(Serializable serializable) {
        this.f16508a = serializable;
    }
}
