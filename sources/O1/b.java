package O1;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f6541c;

    public b(List list, List list2, c cVar) {
        this.f6539a = list;
        this.f6540b = list2;
        this.f6541c = cVar;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i10) {
        Object obj = this.f6539a.get(i7);
        Object obj2 = this.f6540b.get(i10);
        if (obj != null && obj2 != null) {
            return this.f6541c.f6543b.f6552b.areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i10) {
        Object obj = this.f6539a.get(i7);
        Object obj2 = this.f6540b.get(i10);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return this.f6541c.f6543b.f6552b.areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object getChangePayload(int i7, int i10) {
        Object obj = this.f6539a.get(i7);
        Object obj2 = this.f6540b.get(i10);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return this.f6541c.f6543b.f6552b.getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f6540b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f6539a.size();
    }
}
