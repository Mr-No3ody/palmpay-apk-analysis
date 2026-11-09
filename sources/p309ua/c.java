package p309ua;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42731b;

    public c(int i7, String str) {
        this.f42730a = i7;
        this.f42731b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f42731b;
    }
}
