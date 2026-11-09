package p013ae;

import android.widget.SectionIndexer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import java.util.ArrayList;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f11905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SideBarView f11906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SectionIndexer f11907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f11908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f11909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11910f;

    public e(RecyclerView recyclerView, SideBarView sideBar, SectionIndexer indexer, Function0 isEnabled) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(sideBar, "sideBar");
        Intrinsics.checkNotNullParameter(indexer, "indexer");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        this.f11905a = recyclerView;
        this.f11906b = sideBar;
        this.f11907c = indexer;
        this.f11908d = isEnabled;
        this.f11909e = new String[0];
        sideBar.setOnLetterChangeListener(new b(this));
        recyclerView.addOnScrollListener(new c(this));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new d(this));
        }
        a();
    }

    public final void a() {
        Object[] sections = this.f11907c.getSections();
        Intrinsics.checkNotNullExpressionValue(sections, "getSections(...)");
        ArrayList arrayList = new ArrayList(sections.length);
        for (Object obj : sections) {
            arrayList.add(obj.toString());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f11909e = strArr;
        this.f11910f = false;
        SideBarView sideBarView = this.f11906b;
        sideBarView.setLetters(strArr);
        if (sideBarView.f34351B != -1) {
            sideBarView.f34351B = -1;
            sideBarView.postInvalidate();
        }
        sideBarView.setVisibility((!((Boolean) this.f11908d.invoke()).booleanValue() || this.f11909e.length == 0) ? 8 : 0);
        this.f11905a.post(new a(this, 0));
    }

    public final void b() {
        if (this.f11910f) {
            return;
        }
        SideBarView sideBarView = this.f11906b;
        if (sideBarView.getVisibility() != 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.f11905a.getLayoutManager();
        String str = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : -1;
        if (iFindFirstVisibleItemPosition != -1) {
            str = (String) C1847n.s(this.f11907c.getSectionForPosition(iFindFirstVisibleItemPosition), this.f11909e);
        }
        if (str != null) {
            sideBarView.setCurrentLetter(str);
        } else if (sideBarView.f34351B != -1) {
            sideBarView.f34351B = -1;
            sideBarView.postInvalidate();
        }
    }
}
