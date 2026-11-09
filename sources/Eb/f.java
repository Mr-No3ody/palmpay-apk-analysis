package Eb;

import androidx.lifecycle.B;
import androidx.lifecycle.F;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends F {
    @Override // androidx.lifecycle.B
    public final void e(LifecycleOwner lifecycleOwner, Observer observer) {
        super.e(lifecycleOwner, observer);
        try {
            Field declaredField = B.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Method declaredMethod = obj.getClass().getDeclaredMethod("get", Object.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(obj, observer);
            Object value = (objInvoke == null || !(objInvoke instanceof Map.Entry)) ? null : ((Map.Entry) objInvoke).getValue();
            if (value == null) {
                throw new NullPointerException("observerWraper is null");
            }
            Field declaredField2 = value.getClass().getSuperclass().getDeclaredField("mLastVersion");
            declaredField2.setAccessible(true);
            Field declaredField3 = B.class.getDeclaredField("g");
            declaredField3.setAccessible(true);
            declaredField2.set(value, declaredField3.get(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
