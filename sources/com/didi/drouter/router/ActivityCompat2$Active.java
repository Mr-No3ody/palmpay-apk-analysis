package com.didi.drouter.router;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
interface ActivityCompat2$Active {
    void attach(Activity activity, Intent intent, int requestCode);

    a getCompat();

    void remove();

    void startActivity();
}
