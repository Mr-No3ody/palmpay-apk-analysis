package U4;

import Ce.ViewOnAttachStateChangeListenerC0160b;
import N8.q0;
import android.view.View;
import androidx.camera.core.impl.utils.n;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import java.io.IOException;
import java.util.ArrayList;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9242b;

    public /* synthetic */ f(i iVar, int i7) {
        this.f9241a = i7;
        this.f9242b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9241a) {
            case 0:
                i iVar = this.f9242b;
                if (((ArrayList) iVar.f1592b).size() != 0) {
                    p305u5.f.f42708a.getClass();
                    ArrayList arrayListB = C2085k0.b();
                    if (!arrayListB.isEmpty()) {
                        for (int size = arrayListB.size() - 1; size >= 0; size--) {
                            if (((p305u5.a) arrayListB.get(size)).f42700a instanceof TipView) {
                                arrayListB.remove(size);
                                View view = ((p305u5.a) q0.i(1, arrayListB)).f42700a;
                                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(iVar, 4));
                                view.post(new f(iVar, 1));
                            }
                            break;
                        }
                        View view2 = ((p305u5.a) q0.i(1, arrayListB)).f42700a;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(iVar, 4));
                        view2.post(new f(iVar, 1));
                        break;
                    }
                }
                break;
            default:
                i iVar2 = this.f9242b;
                float f10 = iVar2.f9248e;
                try {
                    iVar2.y(n.p(f10), f10);
                } catch (IOException e10) {
                    p198n5.h.b("ScreenshotProvider", e10);
                }
                break;
        }
    }
}
