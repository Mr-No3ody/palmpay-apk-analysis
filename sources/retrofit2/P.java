package retrofit2;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements SkipCallbackExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f41888b = new P();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + SkipCallbackExecutor.class.getName() + "()";
    }
}
