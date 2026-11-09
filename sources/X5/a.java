package X5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends p264r5.a {
    @Override // p264r5.a
    public final boolean A(Class cls) {
        return false;
    }

    @Override // p264r5.a
    public final Method l(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // p264r5.a
    public final Constructor n(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // p264r5.a
    public final String[] v(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
}
