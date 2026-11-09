package Z1;

import androidx.recyclerview.widget.RecyclerView;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.interfaces.SwipeAdapterInterface;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;
import java.util.HashSet;
import java.util.List;
import p005a2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends RecyclerView.Adapter implements SwipeItemMangerInterface, SwipeAdapterInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11489a;

    public a() {
        d dVar = new d();
        dVar.f11823a = p018b2.a.f18758a;
        dVar.f11824b = -1;
        dVar.f11825c = new HashSet();
        dVar.f11826d = new HashSet();
        dVar.f11827e = this;
        this.f11489a = dVar;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void closeAllExcept(SwipeLayout swipeLayout) {
        this.f11489a.closeAllExcept(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void closeAllItems() {
        this.f11489a.closeAllItems();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void closeItem(int i7) {
        this.f11489a.closeItem(i7);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final p018b2.a getMode() {
        return this.f11489a.f11823a;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final List getOpenItems() {
        return this.f11489a.getOpenItems();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final List getOpenLayouts() {
        return this.f11489a.getOpenLayouts();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final boolean isOpen(int i7) {
        return this.f11489a.isOpen(i7);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void openItem(int i7) {
        this.f11489a.openItem(i7);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void removeShownLayouts(SwipeLayout swipeLayout) {
        this.f11489a.removeShownLayouts(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void setMode(p018b2.a aVar) {
        this.f11489a.setMode(aVar);
    }
}
