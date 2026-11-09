package com.transsnet.adsdk.widgets.banner.bannerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseBannerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder<T>> {
    public static final int MAX_VALUE = 1000;
    private boolean isCanLoop;
    protected List<T> mList = new ArrayList();
    private PageClickListener mPageClickListener;

    public interface PageClickListener {
        void onPageClick(View clickedView, int realPosition, int adapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateViewHolder$0(BaseViewHolder baseViewHolder, View view) {
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (this.mPageClickListener == null || adapterPosition == -1) {
            return;
        }
        this.mPageClickListener.onPageClick(view, BannerUtils.getRealPosition(adapterPosition, getListSize()), adapterPosition);
    }

    public abstract void bindData(BaseViewHolder<T> holder, T data, int position, int pageSize);

    public BaseViewHolder<T> createViewHolder(@NonNull ViewGroup parent, View itemView, int viewType) {
        return new BaseViewHolder<>(itemView);
    }

    public List<T> getData() {
        return this.mList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (!this.isCanLoop || getListSize() <= 1) {
            return getListSize();
        }
        return 1000;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        return getViewType(BannerUtils.getRealPosition(position, getListSize()));
    }

    @LayoutRes
    public abstract int getLayoutId(int viewType);

    public int getListSize() {
        return this.mList.size();
    }

    public int getViewType(int position) {
        return 0;
    }

    public boolean isCanLoop() {
        return this.isCanLoop;
    }

    public void setCanLoop(boolean canLoop) {
        this.isCanLoop = canLoop;
    }

    public void setData(List<? extends T> list) {
        if (list != null) {
            this.mList.clear();
            this.mList.addAll(list);
        }
    }

    public void setPageClickListener(PageClickListener pageClickListener) {
        this.mPageClickListener = pageClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull BaseViewHolder<T> holder, final int position) {
        int realPosition = BannerUtils.getRealPosition(position, getListSize());
        bindData(holder, this.mList.get(realPosition), realPosition, getListSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final BaseViewHolder<T> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(getLayoutId(viewType), parent, false);
        BaseViewHolder<T> baseViewHolderCreateViewHolder = createViewHolder(parent, viewInflate, viewType);
        viewInflate.setOnClickListener(new p010a9.b(10, this, baseViewHolderCreateViewHolder));
        return baseViewHolderCreateViewHolder;
    }
}
