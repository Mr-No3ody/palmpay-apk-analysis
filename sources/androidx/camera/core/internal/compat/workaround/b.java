package androidx.camera.core.internal.compat.workaround;

import Ab.y;
import E.N;
import E.b0;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.impl.C0987k;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14324b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f14323a = i7;
        this.f14324b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        switch (this.f14323a) {
            case 0:
                C0987k c0987k = (C0987k) obj2;
                ((N) this.f14324b).getClass();
                Class cls = ((C0987k) obj).f14094a.f14030j;
                int i10 = 1;
                if (cls == MediaCodec.class) {
                    i7 = 2;
                } else {
                    i7 = cls == b0.class ? 0 : 1;
                }
                Class cls2 = c0987k.f14094a.f14030j;
                if (cls2 == MediaCodec.class) {
                    i10 = 2;
                } else if (cls2 == b0.class) {
                    i10 = 0;
                }
                return i7 - i10;
            case 1:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.f14324b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
            case 2:
                return JavaTimerManager.timers$lambda$1((com.facebook.react.modules.core.a) this.f14324b, obj, obj2);
            case 3:
                return ViewGroupDrawingOrderHelper.getChildDrawingOrder$lambda$1((y) this.f14324b, obj, obj2);
            default:
                return ((MaterialButtonGroup) this.f14324b).lambda$new$0((MaterialButton) obj, (MaterialButton) obj2);
        }
    }
}
