package Y;

import B6.RunnableC0085g;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    @NonNull
    @RestrictTo({p192n.c.f39800a})
    public static Handler getHandler(@Nullable Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    @RestrictTo({p192n.c.f39802c})
    public final void callbackFailAsync(int i7, @Nullable Handler handler) {
        getHandler(handler).post(new B3.a(this, i7, 4));
    }

    @RestrictTo({p192n.c.f39802c})
    public final void callbackSuccessAsync(@NonNull Typeface typeface, @Nullable Handler handler) {
        getHandler(handler).post(new RunnableC0085g(26, this, typeface));
    }

    public abstract void onFontRetrievalFailed(int i7);

    public abstract void onFontRetrieved(Typeface typeface);
}
