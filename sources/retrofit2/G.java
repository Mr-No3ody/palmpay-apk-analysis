package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends C1983a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f41822i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i7) {
        super(7);
        this.f41822i = i7;
    }

    @Override // retrofit2.C1983a
    public String c(Method method, int i7) {
        switch (this.f41822i) {
            case 1:
                Parameter parameter = method.getParameters()[i7];
                if (!parameter.isNamePresent()) {
                    return super.c(method, i7);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.c(method, i7);
        }
    }

    @Override // retrofit2.C1983a
    public final Object d(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f41822i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return U.k(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return U.k(method, cls, obj, objArr);
        }
    }

    @Override // retrofit2.C1983a
    public final boolean e(Method method) {
        switch (this.f41822i) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
