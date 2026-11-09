package vh;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f43211a;

    static {
        try {
            for (Method method : Class.forName("android.os.SystemProperties").getMethods()) {
                String name = method.getName();
                if (name.equals("get")) {
                    f43211a = method;
                } else {
                    name.equals("set");
                }
            }
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
        }
    }
}
