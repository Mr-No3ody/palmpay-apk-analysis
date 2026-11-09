package O4;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6559c;

    public /* synthetic */ a(String str, Object obj, int i7) {
        this.f6557a = i7;
        this.f6558b = str;
        this.f6559c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f6557a) {
            case 0:
                return ComponentMonitor.lambda$processRegistrar$0(this.f6558b, (Component) this.f6559c, componentContainer);
            default:
                return LibraryVersionComponent.lambda$fromContext$0(this.f6558b, (LibraryVersionComponent.VersionExtractor) this.f6559c, componentContainer);
        }
    }
}
