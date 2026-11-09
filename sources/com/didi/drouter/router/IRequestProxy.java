package com.didi.drouter.router;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public interface IRequestProxy {

    public interface RemoteCallback {
        void data(Bundle bundle, Map<String, Object> map);
    }

    void request(d request, p031c2.a strategy, RemoteCallback callback);
}
