package M7;

import androidx.appcompat.widget.SearchView;
import com.swmansion.rnscreens.SearchBarView;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBarView f5802a;

    public O(SearchBarView searchBarView) {
        this.f5802a = searchBarView;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        int i7 = SearchBarView.f25379w;
        SearchBarView searchBarView = this.f5802a;
        searchBarView.j(new O7.C(searchBarView.f25391v, searchBarView.getId(), str));
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        int i7 = SearchBarView.f25379w;
        SearchBarView searchBarView = this.f5802a;
        searchBarView.j(new O7.K(searchBarView.f25391v, searchBarView.getId(), str));
        return true;
    }
}
