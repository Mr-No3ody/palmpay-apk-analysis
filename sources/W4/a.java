package W4;

import com.growingio.android.sdk.track.modelloader.ModelLoader;
import org.sufficientlysecure.htmltextview.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10553a;

    public /* synthetic */ a(int i7) {
        this.f10553a = i7;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoader
    public final p247q5.a buildLoadData(Object obj) {
        switch (this.f10553a) {
            case 0:
                if (obj == null) {
                    return new p247q5.a(new n(2));
                }
                throw new ClassCastException();
            default:
                return new p247q5.a(new p045d3.k((p231p5.b) obj, 11));
        }
    }
}
