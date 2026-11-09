package p052da;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import androidx.viewpager2.adapter.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f35680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f35681p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Z fragmentManager, AbstractC1205o lifecycle, ArrayList fragments, int i7) {
        super(fragmentManager, lifecycle);
        this.f35680o = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                Intrinsics.checkNotNullParameter(fragments, "fragments");
                super(fragmentManager, lifecycle);
                this.f35681p = fragments;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                Intrinsics.checkNotNullParameter(fragments, "fragments");
                super(fragmentManager, lifecycle);
                this.f35681p = fragments;
                break;
            default:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                Intrinsics.checkNotNullParameter(fragments, "fragments");
                this.f35681p = fragments;
                break;
        }
    }

    @Override // androidx.viewpager2.adapter.f
    public final Fragment c(int i7) {
        switch (this.f35680o) {
            case 0:
                ArrayList arrayList = this.f35681p;
                Intrinsics.e(arrayList);
                return (Fragment) arrayList.get(i7);
            case 1:
                return (Fragment) this.f35681p.get(i7);
            default:
                return (Fragment) this.f35681p.get(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        switch (this.f35680o) {
            case 0:
                ArrayList arrayList = this.f35681p;
                Intrinsics.e(arrayList);
                return arrayList.size();
            case 1:
                return this.f35681p.size();
            default:
                return this.f35681p.size();
        }
    }
}
