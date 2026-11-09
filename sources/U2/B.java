package U2;

/* JADX INFO: loaded from: classes.dex */
public final class B extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9107a;

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f9107a) {
            case 12:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(String str, int i7) {
        super(str);
        this.f9107a = i7;
    }
}
