package Yb;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11324b;

    public a(List list, List list2) {
        this.f11323a = list;
        this.f11324b = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        List list = this.f11324b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        List list = this.f11323a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
