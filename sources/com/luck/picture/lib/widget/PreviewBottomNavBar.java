package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.utils.StyleUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewBottomNavBar extends BottomNavBar {
    public PreviewBottomNavBar(Context context) {
        super(context);
    }

    public TextView getEditor() {
        return this.tvImageEditor;
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    public void handleLayoutUI() {
        this.tvPreview.setVisibility(8);
        this.tvImageEditor.setOnClickListener(this);
        this.tvImageEditor.setVisibility(this.config.onEditMediaEventListener != null ? 0 : 8);
    }

    public void isDisplayEditor(boolean z3) {
        this.tvImageEditor.setVisibility((this.config.onEditMediaEventListener == null || z3) ? 8 : 0);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar, android.view.View.OnClickListener
    public void onClick(View view) {
        BottomNavBar.OnBottomNavBarListener onBottomNavBarListener;
        super.onClick(view);
        if (view.getId() != R.id.ps_tv_editor || (onBottomNavBarListener = this.bottomNavBarListener) == null) {
            return;
        }
        onBottomNavBarListener.onEditImage();
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    public void setBottomNavBarStyle() {
        super.setBottomNavBarStyle();
        BottomNavBarStyle bottomBarStyle = this.config.selectorStyle.getBottomBarStyle();
        if (StyleUtils.checkStyleValidity(bottomBarStyle.getBottomPreviewNarBarBackgroundColor())) {
            setBackgroundColor(bottomBarStyle.getBottomPreviewNarBarBackgroundColor());
        } else if (StyleUtils.checkSizeValidity(bottomBarStyle.getBottomNarBarBackgroundColor())) {
            setBackgroundColor(bottomBarStyle.getBottomNarBarBackgroundColor());
        }
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
