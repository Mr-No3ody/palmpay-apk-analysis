package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i7) {
        super(str);
        this.f15043a = i7;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i7 = this.f15043a;
        synchronized (this) {
            switch (i7) {
                case 0:
                    break;
                default:
                    break;
            }
            return this;
        }
    }
}
