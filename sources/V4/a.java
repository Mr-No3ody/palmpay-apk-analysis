package V4;

import W4.c;
import W4.g;
import com.growingio.android.hybrid.OnDomChangedListener;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.data.HybridDom$OnDomChangedListener;
import java.util.HashMap;
import okhttp3.U;
import p279s5.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9997b;

    public /* synthetic */ a() {
        this.f9996a = 1;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoader
    public final p247q5.a buildLoadData(Object obj) {
        switch (this.f9996a) {
            case 0:
                return new p247q5.a(new d((He.a) this.f9997b, 14, (p216o5.a) obj, false));
            case 1:
                p264r5.b bVar = (p264r5.b) obj;
                HybridDom$OnDomChangedListener hybridDom$OnDomChangedListener = bVar.f41567b;
                if (hybridDom$OnDomChangedListener != null) {
                    this.f9997b = hybridDom$OnDomChangedListener;
                    c.f10556a.r(new OnDomChangedListener() { // from class: W4.e
                        @Override // com.growingio.android.hybrid.OnDomChangedListener
                        public final void onDomChanged() {
                            ((HybridDom$OnDomChangedListener) this.f10558a.f9997b).onDomChanged();
                        }
                    });
                }
                return new p247q5.a(new g(bVar));
            case 2:
                HashMap map = ((p319v5.a) obj).f43066a;
                com.growingio.android.circler.c cVar = (com.growingio.android.circler.c) this.f9997b;
                cVar.f23140d = map;
                return new p247q5.a(cVar);
            default:
                HashMap map2 = ((p319v5.b) obj).f43067a;
                com.growingio.android.debugger.g gVar = (com.growingio.android.debugger.g) this.f9997b;
                gVar.f23176d = map2;
                return new p247q5.a(gVar);
        }
    }

    public a(He.a aVar) {
        this.f9996a = 0;
        this.f9997b = aVar;
    }

    public a(U u6, int i7) {
        this.f9996a = i7;
        switch (i7) {
            case 3:
                this.f9997b = new com.growingio.android.debugger.g(u6);
                break;
            default:
                this.f9997b = new com.growingio.android.circler.c(u6);
                break;
        }
    }
}
