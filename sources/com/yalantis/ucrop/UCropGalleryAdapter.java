package com.yalantis.ucrop;

import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.b;
import androidx.core.graphics.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UCropGalleryAdapter extends RecyclerView.Adapter<ViewHolder> {
    private int currentSelectPosition;
    private final List<String> list;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int i7, View view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvPhoto;
        View mViewCurrentSelect;

        public ViewHolder(View view) {
            super(view);
            this.mIvPhoto = (ImageView) view.findViewById(R.id.iv_photo);
            this.mViewCurrentSelect = view.findViewById(R.id.view_current_select);
        }
    }

    public UCropGalleryAdapter(List<String> list) {
        this.list = list;
    }

    public int getCurrentSelectPosition() {
        return this.currentSelectPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void setCurrentSelectPosition(int i7) {
        this.currentSelectPosition = i7;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder viewHolder, int i7) {
        ColorFilter colorFilterE;
        String str = this.list.get(i7);
        UCropImageEngine uCropImageEngine = UCropDevelopConfig.imageEngine;
        if (uCropImageEngine != null) {
            uCropImageEngine.loadImage(viewHolder.itemView.getContext(), str, viewHolder.mIvPhoto);
        }
        if (this.currentSelectPosition == i7) {
            viewHolder.mViewCurrentSelect.setVisibility(0);
            colorFilterE = o.e(viewHolder.itemView.getContext().getColor(R.color.ucrop_color_80), b.SRC_ATOP);
        } else {
            colorFilterE = o.e(viewHolder.itemView.getContext().getColor(R.color.ucrop_color_20), b.SRC_ATOP);
            viewHolder.mViewCurrentSelect.setVisibility(8);
        }
        viewHolder.mIvPhoto.setColorFilter(colorFilterE);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropGalleryAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UCropGalleryAdapter.this.listener != null) {
                    UCropGalleryAdapter.this.listener.onItemClick(viewHolder.getAbsoluteAdapterPosition(), view);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ucrop_gallery_adapter_item, viewGroup, false));
    }
}
