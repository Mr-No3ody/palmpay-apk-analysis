package com.timehop.stickyheadersrecyclerview.caching;

import M.j;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

/* JADX INFO: loaded from: classes3.dex */
public class HeaderViewCache implements HeaderProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StickyRecyclerHeadersAdapter f25558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f25559b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrientationProvider f25560c;

    public HeaderViewCache(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, OrientationProvider orientationProvider) {
        this.f25558a = stickyRecyclerHeadersAdapter;
        this.f25560c = orientationProvider;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.timehop.stickyheadersrecyclerview.caching.HeaderProvider
    public View getHeader(RecyclerView recyclerView, int i7) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter = this.f25558a;
        long headerId = stickyRecyclerHeadersAdapter.getHeaderId(i7);
        j jVar = this.f25559b;
        View view = (View) jVar.b(headerId);
        if (view != null) {
            return view;
        }
        RecyclerView.ViewHolder viewHolderOnCreateHeaderViewHolder = stickyRecyclerHeadersAdapter.onCreateHeaderViewHolder(recyclerView);
        stickyRecyclerHeadersAdapter.onBindHeaderViewHolder(viewHolderOnCreateHeaderViewHolder, i7);
        View view2 = viewHolderOnCreateHeaderViewHolder.itemView;
        if (view2.getLayoutParams() == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        if (this.f25560c.getOrientation(recyclerView) == 1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
        }
        view2.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view2.getLayoutParams().height));
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        jVar.e(headerId, view2);
        return view2;
    }

    @Override // com.timehop.stickyheadersrecyclerview.caching.HeaderProvider
    public void invalidate() {
        this.f25559b.a();
    }
}
