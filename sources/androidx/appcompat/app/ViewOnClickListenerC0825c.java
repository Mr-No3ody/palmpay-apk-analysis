package androidx.appcompat.app;

import android.os.Message;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0825c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0832j f12212a;

    public ViewOnClickListenerC0825c(C0832j c0832j) {
        this.f12212a = c0832j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        C0832j c0832j = this.f12212a;
        if (view == c0832j.f12294o && (message3 = c0832j.f12296q) != null) {
            messageObtain = Message.obtain(message3);
        } else if (view != c0832j.f12298s || (message2 = c0832j.f12299u) == null) {
            messageObtain = (view != c0832j.f12301w || (message = c0832j.f12303y) == null) ? null : Message.obtain(message);
        } else {
            messageObtain = Message.obtain(message2);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        c0832j.f12278P.obtainMessage(1, c0832j.f12281b).sendToTarget();
    }
}
