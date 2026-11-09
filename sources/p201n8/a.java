package p201n8;

import android.app.Presentation;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Presentation {
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setType(2030);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setDimAmount(0.0f);
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (Exception e10) {
            Log.e("RemotePresent", "show: ", e10);
        }
    }
}
