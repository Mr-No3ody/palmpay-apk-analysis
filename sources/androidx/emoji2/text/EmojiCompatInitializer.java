package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {
    @Override // androidx.startup.Initializer
    public final Boolean create(Context context) {
        s sVar = new s(new n(context));
        sVar.f16930b = 1;
        i.c(sVar);
        final AbstractC1205o lifecycle = ((LifecycleOwner) P0.a.c(context).d(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner lifecycleOwner) {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new L7.a(2), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
