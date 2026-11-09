package M1;

import B6.ViewOnClickListenerC0087i;
import Gb.T;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.F;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5727a;

    public d() {
        super(0, null);
        this.f5727a = C2131j.a(EnumC2132k.f43971c, a.f5721c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(T1.b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(this, "adapter");
        provider.f8937b = new WeakReference(this);
        ((SparseArray) this.f5727a.getValue()).put(provider.d(), provider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final T1.b b(int i7) {
        return (T1.b) ((SparseArray) this.f5727a.getValue()).get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // M1.j
    public final void bindViewClickListener(final BaseViewHolder viewHolder, int i7) {
        final T1.b bVarB;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.bindViewClickListener(viewHolder, i7);
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new T(12, viewHolder, this));
        }
        if (getOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new f(viewHolder, this, 2));
        }
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getOnItemChildClickListener() == null) {
            T1.b bVarB2 = b(i7);
            if (bVarB2 == null) {
                return;
            }
            Iterator it = ((ArrayList) bVarB2.f8938c.getValue()).iterator();
            while (it.hasNext()) {
                View viewFindViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC0087i(viewHolder, 13, this, bVarB2));
                }
            }
        }
        if (getOnItemChildLongClickListener() != null || (bVarB = b(i7)) == null) {
            return;
        }
        Iterator it2 = ((ArrayList) bVarB.f8939d.getValue()).iterator();
        while (it2.hasNext()) {
            View viewFindViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
            if (viewFindViewById2 != null) {
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: M1.c
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        BaseViewHolder helper = viewHolder;
                        Intrinsics.checkNotNullParameter(helper, "$viewHolder");
                        d this$0 = this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        T1.b provider = bVarB;
                        Intrinsics.checkNotNullParameter(provider, "$provider");
                        int bindingAdapterPosition = helper.getBindingAdapterPosition();
                        if (bindingAdapterPosition == -1) {
                            return false;
                        }
                        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
                        Intrinsics.checkNotNullExpressionValue(view, "v");
                        this$0.getData().get(headerLayoutCount);
                        provider.getClass();
                        Intrinsics.checkNotNullParameter(helper, "helper");
                        Intrinsics.checkNotNullParameter(view, "view");
                        return false;
                    }
                });
            }
        }
    }

    public abstract int c(int i7, List list);

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        T1.b bVarB = b(holder.getItemViewType());
        Intrinsics.e(bVarB);
        bVarB.b(holder, obj);
    }

    @Override // M1.j
    public final int getDefItemViewType(int i7) {
        return c(i7, getData());
    }

    @Override // M1.j
    public final BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        T1.b bVarB = b(i7);
        if (bVarB == null) {
            throw new IllegalStateException(F.c(i7, "ViewType: ", " no such provider found，please use addItemProvider() first!").toString());
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        bVarB.f8936a = context;
        Intrinsics.checkNotNullParameter(parent, "parent");
        BaseViewHolder baseViewHolder = new BaseViewHolder(G8.a.y(parent, bVarB.e()));
        bVarB.i(baseViewHolder, i7);
        return baseViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder holder = (BaseViewHolder) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        T1.b bVarB = b(holder.getItemViewType());
        if (bVarB == null) {
            return;
        }
        bVarB.h(holder);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder helper, Object obj, List payloads) {
        Intrinsics.checkNotNullParameter(helper, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Intrinsics.e(b(helper.getItemViewType()));
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @Override // M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (b(holder.getItemViewType()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }
}
