package Kg;

import com.transsnet.analysis.contants.EventsConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final n get() {
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            method = cls.getMethod("get", new Class[0]);
            method3 = cls.getMethod(EventsConstants.CLICK_OPEN, String.class);
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        return new n(method, method3, method2);
    }

    private m() {
    }
}
