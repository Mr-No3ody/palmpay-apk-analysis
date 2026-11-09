package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    final String mPropertyName;

    public h(String str) {
        this.mPropertyName = str;
    }

    @RequiresApi(24)
    public static <T> h createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new f(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f10);
}
