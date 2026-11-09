package Kb;

import androidx.fragment.app.AbstractC1168d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1168d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4989i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Z fm, ArrayList fragments, ArrayList titles) {
        super(fm, 0);
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        this.f4988h = fragments;
        this.f4989i = titles;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f4988h.size();
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence e(int i7) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f4989i;
        return (arrayList2 == null || arrayList2.isEmpty() || (arrayList = this.f4988h) == null || arrayList.isEmpty() || arrayList2.size() != arrayList.size()) ? "" : (CharSequence) arrayList2.get(i7);
    }

    @Override // androidx.fragment.app.AbstractC1168d0
    public final Fragment n(int i7) {
        Object obj = this.f4988h.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Fragment) obj;
    }
}
