package M1;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.F;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5723a;

    public b() {
        super(0, null);
        this.f5723a = C2131j.a(EnumC2132k.f43971c, a.f5720b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(int i7, int i10) {
        ((SparseIntArray) this.f5723a.getValue()).put(i7, i10);
    }

    @Override // M1.j
    public final int getDefItemViewType(int i7) {
        return ((MultiItemEntity) getData().get(i7)).getItemType();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // M1.j
    public final BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i10 = ((SparseIntArray) this.f5723a.getValue()).get(i7);
        if (i10 != 0) {
            return createBaseViewHolder(parent, i10);
        }
        throw new IllegalArgumentException(F.c(i7, "ViewType: ", " found layoutResId，please use addItemType() first!").toString());
    }
}
