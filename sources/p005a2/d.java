package p005a2;

import android.view.View;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p018b2.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SwipeItemMangerInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet f11825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f11826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z1.a f11827e;

    public final void a(int i7, View view) {
        int swipeLayoutResourceId = this.f11827e.getSwipeLayoutResourceId(i7);
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(swipeLayoutResourceId);
        if (swipeLayout == null) {
            throw new IllegalStateException("can not find SwipeLayout in target view");
        }
        if (swipeLayout.getTag(swipeLayoutResourceId) != null) {
            c cVar = (c) swipeLayout.getTag(swipeLayoutResourceId);
            cVar.f11822b.f11819a = i7;
            cVar.f11821a.f11817a = i7;
            return;
        }
        a aVar = new a(this, i7);
        b bVar = new b(this, i7);
        swipeLayout.f21108i.add(bVar);
        if (swipeLayout.f21099M == null) {
            swipeLayout.f21099M = new ArrayList();
        }
        swipeLayout.f21099M.add(aVar);
        c cVar2 = new c();
        cVar2.f11822b = bVar;
        cVar2.f11821a = aVar;
        swipeLayout.setTag(swipeLayoutResourceId, cVar2);
        this.f11826d.add(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void closeAllExcept(SwipeLayout swipeLayout) {
        for (SwipeLayout swipeLayout2 : this.f11826d) {
            if (swipeLayout2 != swipeLayout) {
                swipeLayout2.b(true, true);
            }
        }
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void closeAllItems() {
        if (this.f11823a == a.f18759b) {
            this.f11825c.clear();
        } else {
            this.f11824b = -1;
        }
        Iterator it = this.f11826d.iterator();
        while (it.hasNext()) {
            ((SwipeLayout) it.next()).b(true, true);
        }
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void closeItem(int i7) {
        if (this.f11823a == a.f18759b) {
            this.f11825c.remove(Integer.valueOf(i7));
        } else if (this.f11824b == i7) {
            this.f11824b = -1;
        }
        this.f11827e.notifyDataSetChanged();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final a getMode() {
        return this.f11823a;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final List getOpenItems() {
        return this.f11823a == a.f18759b ? new ArrayList(this.f11825c) : Collections.singletonList(Integer.valueOf(this.f11824b));
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final List getOpenLayouts() {
        return new ArrayList(this.f11826d);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final boolean isOpen(int i7) {
        if (this.f11823a == a.f18759b) {
            return this.f11825c.contains(Integer.valueOf(i7));
        }
        return this.f11824b == i7;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void openItem(int i7) {
        if (this.f11823a == a.f18759b) {
            HashSet hashSet = this.f11825c;
            if (!hashSet.contains(Integer.valueOf(i7))) {
                hashSet.add(Integer.valueOf(i7));
            }
        } else {
            this.f11824b = i7;
        }
        this.f11827e.notifyDataSetChanged();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void removeShownLayouts(SwipeLayout swipeLayout) {
        this.f11826d.remove(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public final void setMode(a aVar) {
        this.f11823a = aVar;
        this.f11825c.clear();
        this.f11826d.clear();
        this.f11824b = -1;
    }
}
