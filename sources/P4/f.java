package P4;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Throwable f6933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f6934b;

    static {
        try {
            f6934b = new f();
        } catch (Throwable th) {
            f6933a = th;
        }
    }

    public static f a() {
        String string;
        f fVar = f6934b;
        if (fVar != null) {
            return fVar;
        }
        Throwable th = f6933a;
        if (th == null) {
            string = "com.googlecode.mp4parser.RequiresParseDetailAspect";
        } else {
            StringBuffer stringBuffer = new StringBuffer("Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: ");
            stringBuffer.append(th);
            string = stringBuffer.toString();
        }
        Rg.a aVar = new Rg.a(string);
        aVar.f8625a = th;
        throw aVar;
    }

    public static void b(org.aspectj.runtime.reflect.c cVar) {
        Object obj = cVar.f41002b;
        if (obj instanceof a) {
            if (((a) obj).f6911c) {
                return;
            }
            ((a) obj).f();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
