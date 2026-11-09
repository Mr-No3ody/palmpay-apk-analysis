package p377z5;

import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f44456b;

    @Override // android.widget.Toast, com.hjq.toast.config.IToast
    public void show() {
        if (!f44456b) {
            f44456b = true;
            try {
                Method declaredMethod = Toast.class.getDeclaredMethod("getService", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (objInvoke != null && (!Proxy.isProxyClass(objInvoke.getClass()) || !(Proxy.getInvocationHandler(objInvoke) instanceof c))) {
                    Object objNewProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Class.forName("android.app.INotificationManager")}, new c(objInvoke));
                    Field declaredField = Toast.class.getDeclaredField("sService");
                    declaredField.setAccessible(true);
                    declaredField.set(null, objNewProxyInstance);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        super.show();
    }
}
