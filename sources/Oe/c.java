package Oe;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.app.B;
import androidx.core.app.M;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends H1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f6837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f6838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B b7, M m7, int i7) {
        super(0);
        this.f6837a = b7;
        this.f6838b = m7;
        this.f6839c = i7;
    }

    @Override // H1.c, com.bumptech.glide.request.target.Target
    public final void onLoadFailed(Drawable drawable) {
        B b7 = this.f6837a;
        if (b7 != null) {
            Notification notificationA = b7.a();
            M m7 = this.f6838b;
            if (m7 != null) {
                m7.b(this.f6839c, notificationA);
            }
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        B b7 = this.f6837a;
        b7.e((Bitmap) obj);
        this.f6838b.b(this.f6839c, b7.a());
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
    }
}
