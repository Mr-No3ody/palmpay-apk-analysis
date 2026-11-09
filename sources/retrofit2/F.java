package retrofit2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1.a f41819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1983a f41820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1983a f41821c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f41819a = null;
            f41820b = new C1983a(7);
            f41821c = new C1983a(6);
        } else if (property.equals("Dalvik")) {
            f41819a = new O1.a(1);
            f41820b = new G(0);
            f41821c = new C1985c(6);
        } else {
            f41819a = null;
            f41820b = new G(1);
            f41821c = new C1985c(6);
        }
    }
}
