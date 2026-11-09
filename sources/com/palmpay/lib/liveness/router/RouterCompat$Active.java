package com.palmpay.lib.liveness.router;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
interface RouterCompat$Active {
    void attach(Activity activity, Intent intent, int i7);

    b getCompat();

    void remove();

    void startActivity();
}
