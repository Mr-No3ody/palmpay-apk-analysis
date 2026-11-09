package com.didiglobal.booster.instrument;

import android.os.Build;
import android.os.Handler;
import android.widget.Toast;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ShadowToast {
    public static void show(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            workaround(toast).show();
        } else {
            toast.show();
        }
    }

    private static Toast workaround(Toast toast) {
        Object fieldValue = Reflection.getFieldValue(toast, "mTN");
        if (fieldValue == null) {
            Objects.toString(toast);
            return toast;
        }
        Object fieldValue2 = Reflection.getFieldValue(fieldValue, "mHandler");
        if (!(fieldValue2 instanceof Handler) || !Reflection.setFieldValue(fieldValue2, "mCallback", new CaughtCallback((Handler) fieldValue2))) {
            Object fieldValue3 = Reflection.getFieldValue(fieldValue, "mShow");
            if (!(fieldValue3 instanceof Runnable) || !Reflection.setFieldValue(fieldValue, "mShow", new CaughtRunnable((Runnable) fieldValue3))) {
                Objects.toString(fieldValue);
                return toast;
            }
        }
        return toast;
    }
}
