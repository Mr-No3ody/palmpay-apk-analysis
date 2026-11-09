package M1;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.listener.GridSpanSizeLookup;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemChildLongClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.module.UpFetchModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.didiglobal.booster.instrument.ShadowExecutors;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.sufficientlysecure.htmltextview.o;
import p310ub.C2085k0;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends RecyclerView.Adapter {

    @NotNull
    public static final h Companion = new h(null);
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;

    @Nullable
    private BaseAnimation adapterAnimation;
    private boolean animationEnable;

    @NotNull
    private final LinkedHashSet<Integer> childClickViewIds;

    @NotNull
    private final LinkedHashSet<Integer> childLongClickViewIds;

    @NotNull
    private List<Object> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;

    @Nullable
    private O1.c mDiffHelper;

    @Nullable
    private S1.a mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;

    @Nullable
    private S1.c mLoadMoreModule;

    @Nullable
    private OnItemChildClickListener mOnItemChildClickListener;

    @Nullable
    private OnItemChildLongClickListener mOnItemChildLongClickListener;

    @Nullable
    private OnItemClickListener mOnItemClickListener;

    @Nullable
    private OnItemLongClickListener mOnItemLongClickListener;

    @Nullable
    private GridSpanSizeLookup mSpanSizeLookup;

    @Nullable
    private S1.d mUpFetchModule;

    @Nullable
    private RecyclerView recyclerViewOrNull;

    /* JADX WARN: Multi-variable type inference failed */
    public j(int i7, List list) {
        this.layoutResId = i7;
        this.data = list == null ? new ArrayList() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        if (this instanceof LoadMoreModule) {
            this.mLoadMoreModule = ((LoadMoreModule) this).addLoadMoreModule(this);
        }
        if (this instanceof UpFetchModule) {
            ((UpFetchModule) this).addUpFetchModule(this);
        }
        if (this instanceof DraggableModule) {
            ((DraggableModule) this).addDraggableModule(this);
        }
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    public static /* synthetic */ int addFooterView$default(j jVar, View view, int i7, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i11 & 2) != 0) {
            i7 = -1;
        }
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        return jVar.addFooterView(view, i7, i10);
    }

    public static /* synthetic */ int addHeaderView$default(j jVar, View view, int i7, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i11 & 2) != 0) {
            i7 = -1;
        }
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        return jVar.addHeaderView(view, i7, i10);
    }

    public static /* synthetic */ void setDiffNewData$default(j jVar, List list, Runnable runnable, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDiffNewData");
        }
        if ((i7 & 2) != 0) {
            runnable = null;
        }
        jVar.setDiffNewData((List<Object>) list, runnable);
    }

    public static /* synthetic */ int setFooterView$default(j jVar, View view, int i7, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        return jVar.setFooterView(view, i7, i10);
    }

    public static /* synthetic */ int setHeaderView$default(j jVar, View view, int i7, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        return jVar.setHeaderView(view, i7, i10);
    }

    public final void addChildClickViewIds(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        int length = viewIds.length;
        int i7 = 0;
        while (i7 < length) {
            int i10 = viewIds[i7];
            i7++;
            this.childClickViewIds.add(Integer.valueOf(i10));
        }
    }

    public final void addChildLongClickViewIds(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        int length = viewIds.length;
        int i7 = 0;
        while (i7 < length) {
            int i10 = viewIds[i7];
            i7++;
            this.childLongClickViewIds.add(Integer.valueOf(i10));
        }
    }

    public void addData(@IntRange(from = 0) int i7, Object obj) {
        this.data.add(i7, obj);
        notifyItemInserted(getHeaderLayoutCount() + i7);
        compatibilityDataSizeChanged(1);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    public void bindViewClickListener(@NotNull final BaseViewHolder viewHolder, int i7) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            final int i10 = 0;
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: M1.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View v3) {
                    switch (i10) {
                        case 0:
                            BaseViewHolder viewHolder2 = viewHolder;
                            Intrinsics.checkNotNullParameter(viewHolder2, "$viewHolder");
                            j this$0 = this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int bindingAdapterPosition = viewHolder2.getBindingAdapterPosition();
                            if (bindingAdapterPosition != -1) {
                                int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
                                Intrinsics.checkNotNullExpressionValue(v3, "v");
                                this$0.setOnItemClick(v3, headerLayoutCount);
                                break;
                            }
                            break;
                        default:
                            BaseViewHolder viewHolder3 = viewHolder;
                            Intrinsics.checkNotNullParameter(viewHolder3, "$viewHolder");
                            j this$1 = this;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            int bindingAdapterPosition2 = viewHolder3.getBindingAdapterPosition();
                            if (bindingAdapterPosition2 != -1) {
                                int headerLayoutCount2 = bindingAdapterPosition2 - this$1.getHeaderLayoutCount();
                                Intrinsics.checkNotNullExpressionValue(v3, "v");
                                this$1.setOnItemChildClick(v3, headerLayoutCount2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            viewHolder.itemView.setOnLongClickListener(new f(viewHolder, this, 0));
        }
        if (this.mOnItemChildClickListener != null) {
            for (Integer id2 : getChildClickViewIds()) {
                View view = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                View viewFindViewById = view.findViewById(id2.intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    final int i11 = 1;
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: M1.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View v3) {
                            switch (i11) {
                                case 0:
                                    BaseViewHolder viewHolder2 = viewHolder;
                                    Intrinsics.checkNotNullParameter(viewHolder2, "$viewHolder");
                                    j this$0 = this;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    int bindingAdapterPosition = viewHolder2.getBindingAdapterPosition();
                                    if (bindingAdapterPosition != -1) {
                                        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
                                        Intrinsics.checkNotNullExpressionValue(v3, "v");
                                        this$0.setOnItemClick(v3, headerLayoutCount);
                                        break;
                                    }
                                    break;
                                default:
                                    BaseViewHolder viewHolder3 = viewHolder;
                                    Intrinsics.checkNotNullParameter(viewHolder3, "$viewHolder");
                                    j this$1 = this;
                                    Intrinsics.checkNotNullParameter(this$1, "this$0");
                                    int bindingAdapterPosition2 = viewHolder3.getBindingAdapterPosition();
                                    if (bindingAdapterPosition2 != -1) {
                                        int headerLayoutCount2 = bindingAdapterPosition2 - this$1.getHeaderLayoutCount();
                                        Intrinsics.checkNotNullExpressionValue(v3, "v");
                                        this$1.setOnItemChildClick(v3, headerLayoutCount2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        }
        if (this.mOnItemChildLongClickListener == null) {
            return;
        }
        for (Integer id3 : getChildLongClickViewIds()) {
            View view2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(id3, "id");
            View viewFindViewById2 = view2.findViewById(id3.intValue());
            if (viewFindViewById2 != null) {
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new f(viewHolder, this, 1));
            }
        }
    }

    public final void compatibilityDataSizeChanged(int i7) {
        if (this.data.size() == i7) {
            notifyDataSetChanged();
        }
    }

    public abstract void convert(BaseViewHolder baseViewHolder, Object obj);

    public void convert(@NotNull BaseViewHolder holder, Object obj, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @NotNull
    public BaseViewHolder createBaseViewHolder(@NotNull ViewGroup parent, @LayoutRes int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return createBaseViewHolder(G8.a.y(parent, i7));
    }

    @Nullable
    public final BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    @NotNull
    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
        return context;
    }

    @NotNull
    public final List<Object> getData() {
        return this.data;
    }

    public int getDefItemCount() {
        return this.data.size();
    }

    public int getDefItemViewType(int i7) {
        return super.getItemViewType(i7);
    }

    @Deprecated(message = "User getDiffer()", replaceWith = @ReplaceWith(expression = "getDiffer()", imports = {}))
    @NotNull
    public final O1.c getDiffHelper() {
        return getDiffer();
    }

    @NotNull
    public final O1.c getDiffer() {
        O1.c cVar = this.mDiffHelper;
        if (cVar == null) {
            throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!");
        }
        Intrinsics.e(cVar);
        return cVar;
    }

    @NotNull
    public final S1.a getDraggableModule() {
        throw new IllegalStateException("Please first implements DraggableModule");
    }

    @Nullable
    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.n("mEmptyLayout");
        throw null;
    }

    @Nullable
    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.n("mFooterLayout");
        throw null;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return this.data.size() + getHeaderLayoutCount();
        }
        int i7 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i7;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    @Nullable
    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.n("mHeaderLayout");
        throw null;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public Object getItem(@IntRange(from = 0) int i7) {
        return this.data.get(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (hasEmptyView()) {
            int i7 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
            return (this.footerWithEmptyEnable && hasFooterLayout()) ? i7 + 1 : i7;
        }
        S1.c cVar = this.mLoadMoreModule;
        return getFooterLayoutCount() + getDefItemCount() + getHeaderLayoutCount() + ((cVar == null || !cVar.d()) ? 0 : 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Nullable
    public Object getItemOrNull(@IntRange(from = 0) int i7) {
        return CollectionsKt.G(i7, this.data);
    }

    public int getItemPosition(@Nullable Object obj) {
        if (obj == null || this.data.isEmpty()) {
            return -1;
        }
        return this.data.indexOf(obj);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i7) {
        if (hasEmptyView()) {
            boolean z3 = this.headerWithEmptyEnable && hasHeaderLayout();
            if (i7 == 0) {
                return z3 ? HEADER_VIEW : EMPTY_VIEW;
            }
            if (i7 != 1) {
                return i7 != 2 ? EMPTY_VIEW : FOOTER_VIEW;
            }
            return z3 ? EMPTY_VIEW : FOOTER_VIEW;
        }
        boolean zHasHeaderLayout = hasHeaderLayout();
        if (zHasHeaderLayout && i7 == 0) {
            return HEADER_VIEW;
        }
        if (zHasHeaderLayout) {
            i7--;
        }
        int size = this.data.size();
        if (i7 < size) {
            return getDefItemViewType(i7);
        }
        return i7 - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    @NotNull
    public final S1.c getLoadMoreModule() {
        S1.c cVar = this.mLoadMoreModule;
        if (cVar == null) {
            throw new IllegalStateException("Please first implements LoadMoreModule");
        }
        Intrinsics.e(cVar);
        return cVar;
    }

    @Nullable
    public final S1.c getMLoadMoreModule$com_github_CymChad_brvah() {
        return this.mLoadMoreModule;
    }

    @Nullable
    public final OnItemChildClickListener getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    @Nullable
    public final OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    @Nullable
    public final OnItemClickListener getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Nullable
    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()");
        }
        Intrinsics.e(recyclerView);
        return recyclerView;
    }

    @Nullable
    public final RecyclerView getRecyclerViewOrNull() {
        return this.recyclerViewOrNull;
    }

    @NotNull
    public final S1.d getUpFetchModule() {
        throw new IllegalStateException("Please first implements UpFetchModule");
    }

    @Nullable
    public final View getViewByPosition(int i7, @IdRes int i10) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i7)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(i10);
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.n("mEmptyLayout");
                throw null;
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout != null) {
            return linearLayout.getChildCount() > 0;
        }
        Intrinsics.n("mFooterLayout");
        throw null;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout != null) {
            return linearLayout.getChildCount() > 0;
        }
        Intrinsics.n("mHeaderLayout");
        throw null;
    }

    public final boolean isAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public boolean isFixedViewType(int i7) {
        return i7 == 268436821 || i7 == 268435729 || i7 == 268436275 || i7 == 268436002;
    }

    public final boolean isUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerViewOrNull = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new i(this, (GridLayoutManager) layoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @NotNull
    public BaseViewHolder onCreateDefViewHolder(@NotNull ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return createBaseViewHolder(parent, this.layoutResId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerViewOrNull = null;
    }

    public void onItemViewHolderCreated(@NotNull BaseViewHolder viewHolder, int i7) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    @Deprecated(message = "Please use removeAt()", replaceWith = @ReplaceWith(expression = "removeAt(position)", imports = {}))
    public void remove(@IntRange(from = 0) int i7) {
        removeAt(i7);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@IntRange(from = 0) int i7) {
        if (i7 >= this.data.size()) {
            return;
        }
        this.data.remove(i7);
        int headerLayoutCount = getHeaderLayoutCount() + i7;
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            } else {
                Intrinsics.n("mEmptyLayout");
                throw null;
            }
        }
    }

    public final void removeFooterView(@NotNull View footer) {
        int footerViewPosition;
        Intrinsics.checkNotNullParameter(footer, "footer");
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(@NotNull View header) {
        int headerViewPosition;
        Intrinsics.checkNotNullParameter(header, "header");
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @Deprecated(message = "Please use setData()", replaceWith = @ReplaceWith(expression = "setList(newData)", imports = {}))
    public void replaceData(@NotNull Collection<Object> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        setList(newData);
    }

    public final void setAdapterAnimation(@Nullable BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final void setAnimationEnable(boolean z3) {
        this.animationEnable = z3;
    }

    public final void setAnimationFirstOnly(boolean z3) {
        this.isAnimationFirstOnly = z3;
    }

    public final void setAnimationWithDefault(@NotNull g animationType) {
        BaseAnimation bVar;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int iOrdinal = animationType.ordinal();
        if (iOrdinal == 0) {
            bVar = new N1.b();
        } else if (iOrdinal == 1) {
            bVar = new N1.d();
        } else if (iOrdinal == 2) {
            bVar = new o(1);
        } else if (iOrdinal == 3) {
            bVar = new p262r2.c(1);
        } else {
            if (iOrdinal != 4) {
                throw new l();
            }
            bVar = new retrofit2.adapter.rxjava2.d(1);
        }
        setAdapterAnimation(bVar);
    }

    public void setData(@IntRange(from = 0) int i7, Object obj) {
        if (i7 >= this.data.size()) {
            return;
        }
        this.data.set(i7, obj);
        notifyItemChanged(getHeaderLayoutCount() + i7);
    }

    public final void setData$com_github_CymChad_brvah(@NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setDiffCallback(@NotNull DiffUtil.ItemCallback<Object> mDiffCallback) {
        Intrinsics.checkNotNullParameter(mDiffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mDiffCallback, "mDiffCallback");
        O1.e eVar = new O1.e();
        if (eVar.f6550a == null) {
            synchronized (O1.e.f6548b) {
                try {
                    if (O1.e.f6549c == null) {
                        O1.e.f6549c = ShadowExecutors.newOptimizedFixedThreadPool(2, "\u200bcom.chad.library.adapter.base.diff.BrvahAsyncDifferConfig$Builder");
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar.f6550a = O1.e.f6549c;
        }
        ExecutorService executorService = eVar.f6550a;
        Intrinsics.e(executorService);
        setDiffConfig(new O1.f(executorService, mDiffCallback));
    }

    public final void setDiffConfig(@NotNull O1.f config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.mDiffHelper = new O1.c(this, config);
    }

    @JvmOverloads
    public final void setDiffNewData(@Nullable List<Object> list) {
        setDiffNewData$default(this, list, null, 2, null);
    }

    public final void setEmptyView(@NotNull View emptyView) {
        boolean z3;
        Intrinsics.checkNotNullParameter(emptyView, "emptyView");
        int itemCount = getItemCount();
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = layoutParams == null ? null : new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height);
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
            }
            frameLayout.setLayoutParams(layoutParams2);
            z3 = true;
        } else {
            ViewGroup.LayoutParams layoutParams3 = emptyView.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout frameLayout2 = this.mEmptyLayout;
                if (frameLayout2 == null) {
                    Intrinsics.n("mEmptyLayout");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                layoutParams4.width = layoutParams3.width;
                layoutParams4.height = layoutParams3.height;
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.n("mEmptyLayout");
                    throw null;
                }
                frameLayout3.setLayoutParams(layoutParams4);
            }
            z3 = false;
        }
        FrameLayout frameLayout4 = this.mEmptyLayout;
        if (frameLayout4 == null) {
            Intrinsics.n("mEmptyLayout");
            throw null;
        }
        frameLayout4.removeAllViews();
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            Intrinsics.n("mEmptyLayout");
            throw null;
        }
        frameLayout5.addView(emptyView);
        this.isUseEmpty = true;
        if (z3 && hasEmptyView()) {
            int i7 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i7);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z3) {
        this.footerViewAsFlow = z3;
    }

    public final void setFooterWithEmptyEnable(boolean z3) {
        this.footerWithEmptyEnable = z3;
    }

    public void setFullSpan(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public final void setGridSpanSizeLookup(@Nullable GridSpanSizeLookup gridSpanSizeLookup) {
        this.mSpanSizeLookup = gridSpanSizeLookup;
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z3) {
        this.headerViewAsFlow = z3;
    }

    public final void setHeaderWithEmptyEnable(boolean z3) {
        this.headerWithEmptyEnable = z3;
    }

    public void setList(@Nullable Collection<Object> collection) {
        List<Object> list = this.data;
        if (collection != list) {
            list.clear();
            if (collection != null && !collection.isEmpty()) {
                this.data.addAll(collection);
            }
        } else if (collection == null || collection.isEmpty()) {
            this.data.clear();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            this.data.clear();
            this.data.addAll(arrayList);
        }
        S1.c cVar = this.mLoadMoreModule;
        if (cVar != null && cVar.f8643b != null) {
            cVar.j(true);
            cVar.f8645d = R1.a.f7907a;
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        S1.c cVar2 = this.mLoadMoreModule;
        if (cVar2 == null) {
            return;
        }
        cVar2.b();
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(@Nullable S1.c cVar) {
        this.mLoadMoreModule = cVar;
    }

    @Deprecated(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @ReplaceWith(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(@Nullable List<Object> list) {
        setNewInstance(list);
    }

    public void setNewInstance(@Nullable List<Object> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        S1.c cVar = this.mLoadMoreModule;
        if (cVar != null && cVar.f8643b != null) {
            cVar.j(true);
            cVar.f8645d = R1.a.f7907a;
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        S1.c cVar2 = this.mLoadMoreModule;
        if (cVar2 == null) {
            return;
        }
        cVar2.b();
    }

    public void setOnItemChildClick(@NotNull View v3, int i7) {
        Intrinsics.checkNotNullParameter(v3, "v");
        OnItemChildClickListener onItemChildClickListener = this.mOnItemChildClickListener;
        if (onItemChildClickListener == null) {
            return;
        }
        onItemChildClickListener.onItemChildClick(this, v3, i7);
    }

    public final void setOnItemChildClickListener(@Nullable OnItemChildClickListener onItemChildClickListener) {
        this.mOnItemChildClickListener = onItemChildClickListener;
    }

    public boolean setOnItemChildLongClick(@NotNull View v3, int i7) {
        Intrinsics.checkNotNullParameter(v3, "v");
        OnItemChildLongClickListener onItemChildLongClickListener = this.mOnItemChildLongClickListener;
        if (onItemChildLongClickListener == null) {
            return false;
        }
        return onItemChildLongClickListener.onItemChildLongClick(this, v3, i7);
    }

    public final void setOnItemChildLongClickListener(@Nullable OnItemChildLongClickListener onItemChildLongClickListener) {
        this.mOnItemChildLongClickListener = onItemChildLongClickListener;
    }

    public void setOnItemClick(@NotNull View v3, int i7) {
        Intrinsics.checkNotNullParameter(v3, "v");
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.onItemClick(this, v3, i7);
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public boolean setOnItemLongClick(@NotNull View v3, int i7) {
        Intrinsics.checkNotNullParameter(v3, "v");
        OnItemLongClickListener onItemLongClickListener = this.mOnItemLongClickListener;
        if (onItemLongClickListener == null) {
            return false;
        }
        return onItemLongClickListener.onItemLongClick(this, v3, i7);
    }

    public final void setOnItemLongClickListener(@Nullable OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public final void setUseEmpty(boolean z3) {
        this.isUseEmpty = z3;
    }

    public void startAnim(@NotNull Animator anim, int i7) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        anim.start();
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, i7, 0, 4, null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, i7, 0, 4, null);
    }

    @NotNull
    public BaseViewHolder createBaseViewHolder(@NotNull View view) {
        BaseViewHolder baseViewHolder;
        BaseViewHolder baseViewHolder2;
        Class cls;
        Intrinsics.checkNotNullParameter(view, "view");
        BaseViewHolder baseViewHolder3 = null;
        Class cls2 = null;
        for (Class<?> superclass = getClass(); cls2 == null && superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Type genericSuperclass = superclass.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    Intrinsics.checkNotNullExpressionValue(types, "types");
                    int length = types.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            Type type = types[i7];
                            i7++;
                            if (type instanceof Class) {
                                if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                                    cls = (Class) type;
                                    cls2 = cls;
                                }
                            } else if (type instanceof ParameterizedType) {
                                Type rawType = ((ParameterizedType) type).getRawType();
                                if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                                    cls = (Class) rawType;
                                    cls2 = cls;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            cls2 = null;
                        }
                    }
                } else {
                    cls2 = null;
                }
            } catch (TypeNotPresentException e10) {
                e10.printStackTrace();
            } catch (GenericSignatureFormatError e11) {
                e11.printStackTrace();
            } catch (MalformedParameterizedTypeException e12) {
                e12.printStackTrace();
            }
        }
        if (cls2 == null) {
            baseViewHolder = new BaseViewHolder(view);
        } else {
            try {
                if (!cls2.isMemberClass() || Modifier.isStatic(cls2.getModifiers())) {
                    Constructor declaredConstructor = cls2.getDeclaredConstructor(View.class);
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(view);
                    if (objNewInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
                    }
                    baseViewHolder2 = (BaseViewHolder) objNewInstance;
                } else {
                    Constructor declaredConstructor2 = cls2.getDeclaredConstructor(getClass(), View.class);
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
                    declaredConstructor2.setAccessible(true);
                    Object objNewInstance2 = declaredConstructor2.newInstance(this, view);
                    if (objNewInstance2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
                    }
                    baseViewHolder2 = (BaseViewHolder) objNewInstance2;
                }
                baseViewHolder3 = baseViewHolder2;
            } catch (IllegalAccessException e13) {
                e13.printStackTrace();
            } catch (InstantiationException e14) {
                e14.printStackTrace();
            } catch (NoSuchMethodException e15) {
                e15.printStackTrace();
            } catch (InvocationTargetException e16) {
                e16.printStackTrace();
            }
            baseViewHolder = baseViewHolder3;
        }
        return baseViewHolder == null ? new BaseViewHolder(view) : baseViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
        onBindViewHolder((BaseViewHolder) viewHolder, i7, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BaseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i7) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    Intrinsics.n("mHeaderLayout");
                    throw null;
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        Intrinsics.n("mHeaderLayout");
                        throw null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 != null) {
                    return createBaseViewHolder(linearLayout3);
                }
                Intrinsics.n("mHeaderLayout");
                throw null;
            case LOAD_MORE_VIEW /* 268436002 */:
                S1.c cVar = this.mLoadMoreModule;
                Intrinsics.e(cVar);
                BaseViewHolder viewHolder = createBaseViewHolder(cVar.f8646e.D(parent));
                S1.c cVar2 = this.mLoadMoreModule;
                Intrinsics.e(cVar2);
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                viewHolder.itemView.setOnClickListener(new R8.d(cVar2, 2));
                return viewHolder;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    Intrinsics.n("mFooterLayout");
                    throw null;
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        Intrinsics.n("mFooterLayout");
                        throw null;
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 != null) {
                    return createBaseViewHolder(linearLayout6);
                }
                Intrinsics.n("mFooterLayout");
                throw null;
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    Intrinsics.n("mEmptyLayout");
                    throw null;
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        Intrinsics.n("mEmptyLayout");
                        throw null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 != null) {
                    return createBaseViewHolder(frameLayout3);
                }
                Intrinsics.n("mEmptyLayout");
                throw null;
            default:
                BaseViewHolder baseViewHolderOnCreateDefViewHolder = onCreateDefViewHolder(parent, i7);
                bindViewClickListener(baseViewHolderOnCreateDefViewHolder, i7);
                onItemViewHolderCreated(baseViewHolderOnCreateDefViewHolder, i7);
                return baseViewHolderOnCreateDefViewHolder;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
            return;
        }
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation bVar = this.adapterAnimation;
                if (bVar == null) {
                    bVar = new N1.b();
                }
                View view = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                for (Animator animator : bVar.animators(view)) {
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    public void remove(Object obj) {
        int iIndexOf = this.data.indexOf(obj);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    @JvmOverloads
    public void setDiffNewData(@Nullable List<Object> list, @Nullable Runnable runnable) {
        if (hasEmptyView()) {
            setNewInstance(list);
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        O1.c cVar = this.mDiffHelper;
        if (cVar == null) {
            return;
        }
        int i7 = cVar.f6547f + 1;
        cVar.f6547f = i7;
        j jVar = cVar.f6542a;
        if (list == jVar.getData()) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        List<Object> data = jVar.getData();
        C2085k0 c2085k0 = cVar.f6544c;
        if (list == null) {
            int size = jVar.getData().size();
            jVar.setData$com_github_CymChad_brvah(new ArrayList());
            c2085k0.onRemoved(0, size);
            cVar.a(data, runnable);
            return;
        }
        if (!jVar.getData().isEmpty()) {
            cVar.f6543b.f6551a.execute(new Lb.b(cVar, data, list, i7, runnable, 2));
            return;
        }
        jVar.setData$com_github_CymChad_brvah(list);
        c2085k0.onInserted(0, list.size());
        cVar.a(data, runnable);
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, i7, 0, 4, null);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, i7, 0, 4, null);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int i7, int i10) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            linearLayout.setOrientation(i10);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            if (i10 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.mFooterLayout;
        if (linearLayout3 != null) {
            int childCount = linearLayout3.getChildCount();
            if (i7 < 0 || i7 > childCount) {
                i7 = childCount;
            }
            LinearLayout linearLayout4 = this.mFooterLayout;
            if (linearLayout4 != null) {
                linearLayout4.addView(view, i7);
                LinearLayout linearLayout5 = this.mFooterLayout;
                if (linearLayout5 == null) {
                    Intrinsics.n("mFooterLayout");
                    throw null;
                }
                if (linearLayout5.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
                    notifyItemInserted(footerViewPosition);
                }
                return i7;
            }
            Intrinsics.n("mFooterLayout");
            throw null;
        }
        Intrinsics.n("mFooterLayout");
        throw null;
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int i7, int i10) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            linearLayout.setOrientation(i10);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            if (i10 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.mHeaderLayout;
        if (linearLayout3 != null) {
            int childCount = linearLayout3.getChildCount();
            if (i7 < 0 || i7 > childCount) {
                i7 = childCount;
            }
            LinearLayout linearLayout4 = this.mHeaderLayout;
            if (linearLayout4 != null) {
                linearLayout4.addView(view, i7);
                LinearLayout linearLayout5 = this.mHeaderLayout;
                if (linearLayout5 == null) {
                    Intrinsics.n("mHeaderLayout");
                    throw null;
                }
                if (linearLayout5.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
                    notifyItemInserted(headerViewPosition);
                }
                return i7;
            }
            Intrinsics.n("mHeaderLayout");
            throw null;
        }
        Intrinsics.n("mHeaderLayout");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        S1.c cVar = this.mLoadMoreModule;
        if (cVar != null) {
            cVar.a(i7);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                S1.c cVar2 = this.mLoadMoreModule;
                if (cVar2 != null) {
                    cVar2.f8646e.l(holder, cVar2.f8645d);
                    break;
                }
                break;
            default:
                convert(holder, getItem(i7 - getHeaderLayoutCount()));
                break;
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int i7, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            if (linearLayout.getChildCount() > i7) {
                LinearLayout linearLayout2 = this.mFooterLayout;
                if (linearLayout2 != null) {
                    linearLayout2.removeViewAt(i7);
                    LinearLayout linearLayout3 = this.mFooterLayout;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(view, i7);
                        return i7;
                    }
                    Intrinsics.n("mFooterLayout");
                    throw null;
                }
                Intrinsics.n("mFooterLayout");
                throw null;
            }
        }
        return addFooterView(view, i7, i10);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int i7, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            if (linearLayout.getChildCount() > i7) {
                LinearLayout linearLayout2 = this.mHeaderLayout;
                if (linearLayout2 != null) {
                    linearLayout2.removeViewAt(i7);
                    LinearLayout linearLayout3 = this.mHeaderLayout;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(view, i7);
                        return i7;
                    }
                    Intrinsics.n("mHeaderLayout");
                    throw null;
                }
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
        }
        return addHeaderView(view, i7, i10);
    }

    public void addData(@NonNull Object obj) {
        this.data.add(obj);
        notifyItemInserted(getHeaderLayoutCount() + this.data.size());
        compatibilityDataSizeChanged(1);
    }

    public void addData(@IntRange(from = 0) int i7, @NotNull Collection<Object> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.addAll(i7, newData);
        notifyItemRangeInserted(getHeaderLayoutCount() + i7, newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void addData(@NonNull @NotNull Collection<Object> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.addAll(newData);
        notifyItemRangeInserted(getHeaderLayoutCount() + (this.data.size() - newData.size()), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void onBindViewHolder(@NotNull BaseViewHolder holder, int i7, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i7);
        }
        S1.c cVar = this.mLoadMoreModule;
        if (cVar != null) {
            cVar.a(i7);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                S1.c cVar2 = this.mLoadMoreModule;
                if (cVar2 != null) {
                    cVar2.f8646e.l(holder, cVar2.f8645d);
                    break;
                }
                break;
            default:
                convert(holder, getItem(i7 - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public void setDiffNewData(@NonNull @NotNull DiffUtil.DiffResult diffResult, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.dispatchUpdatesTo(new C2085k0(this));
            this.data = list;
        }
    }

    public final void setEmptyView(int i7) {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null) {
            return;
        }
        View view = LayoutInflater.from(recyclerView.getContext()).inflate(i7, (ViewGroup) recyclerView, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        setEmptyView(view);
    }
}
