package p377z5;

import android.os.Handler;
import android.widget.Toast;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44458c;

    @Override // p377z5.d, android.widget.Toast, com.hjq.toast.config.IToast
    public final void show() {
        if (!this.f44458c) {
            this.f44458c = true;
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                Handler handler = (Handler) declaredField2.get(obj);
                if (!(handler instanceof e)) {
                    declaredField2.set(obj, new e(handler));
                }
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                e10.printStackTrace();
            }
        }
        super.show();
    }
}
