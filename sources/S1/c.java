package S1;

import M1.j;
import M7.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.listener.LoadMoreListenerImp;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LoadMoreListenerImp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnLoadMoreListener f8643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public R1.a f8645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G8.a f8646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8648g;

    public c(j baseQuickAdapter) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.f8642a = baseQuickAdapter;
        this.f8644c = true;
        this.f8645d = R1.a.f7907a;
        this.f8646e = e.f8649a;
        this.f8647f = true;
    }

    public final void a(int i7) {
        R1.a aVar;
        if (d() && i7 >= this.f8642a.getItemCount() - 1 && (aVar = this.f8645d) == R1.a.f7907a && aVar != R1.a.f7908b && this.f8644c) {
            e();
        }
    }

    public final void b() {
        RecyclerView.LayoutManager layoutManager;
        if (this.f8647f) {
            return;
        }
        this.f8644c = false;
        RecyclerView recyclerViewOrNull = this.f8642a.getRecyclerViewOrNull();
        if (recyclerViewOrNull == null || (layoutManager = recyclerViewOrNull.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            recyclerViewOrNull.postDelayed(new b(this, layoutManager), 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            recyclerViewOrNull.postDelayed(new b(layoutManager, this), 50L);
        }
    }

    public final int c() {
        j jVar = this.f8642a;
        if (jVar.hasEmptyView()) {
            return -1;
        }
        return jVar.getFooterLayoutCount() + jVar.getData().size() + jVar.getHeaderLayoutCount();
    }

    public final boolean d() {
        if (this.f8643b == null || !this.f8648g) {
            return false;
        }
        return !this.f8642a.getData().isEmpty();
    }

    public final void e() {
        OnLoadMoreListener onLoadMoreListener;
        this.f8645d = R1.a.f7908b;
        RecyclerView recyclerViewOrNull = this.f8642a.getRecyclerViewOrNull();
        if ((recyclerViewOrNull == null ? null : Boolean.valueOf(recyclerViewOrNull.post(new s(this, 15)))) != null || (onLoadMoreListener = this.f8643b) == null) {
            return;
        }
        onLoadMoreListener.onLoadMore();
    }

    public final void f() {
        if (d()) {
            this.f8645d = R1.a.f7907a;
            this.f8642a.notifyItemChanged(c());
            b();
        }
    }

    public final void g() {
        if (d()) {
            this.f8645d = R1.a.f7910d;
            this.f8642a.notifyItemChanged(c());
        }
    }

    public final void h() {
        if (d()) {
            this.f8645d = R1.a.f7909c;
            this.f8642a.notifyItemChanged(c());
        }
    }

    public final void i() {
        R1.a aVar = this.f8645d;
        R1.a aVar2 = R1.a.f7908b;
        if (aVar == aVar2) {
            return;
        }
        this.f8645d = aVar2;
        this.f8642a.notifyItemChanged(c());
        e();
    }

    public final void j(boolean z3) {
        boolean zD = d();
        this.f8648g = z3;
        boolean zD2 = d();
        j jVar = this.f8642a;
        if (zD) {
            if (zD2) {
                return;
            }
            jVar.notifyItemRemoved(c());
        } else if (zD2) {
            this.f8645d = R1.a.f7907a;
            jVar.notifyItemInserted(c());
        }
    }

    @Override // com.chad.library.adapter.base.listener.LoadMoreListenerImp
    public final void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.f8643b = onLoadMoreListener;
        j(true);
    }
}
