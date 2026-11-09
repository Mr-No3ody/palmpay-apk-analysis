package Wf;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10905a = new ThreadLocal();

    public static S a() {
        ThreadLocal threadLocal = f10905a;
        S s3 = (S) threadLocal.get();
        if (s3 != null) {
            return s3;
        }
        C0763g c0763g = new C0763g(Thread.currentThread());
        threadLocal.set(c0763g);
        return c0763g;
    }
}
