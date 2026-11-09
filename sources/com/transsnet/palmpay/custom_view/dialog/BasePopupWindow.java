package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePopupWindow extends PopupWindow {
    protected View mContentView;
    protected Context mContext;
    protected onSubmitClickListener mOnSubmitClickListener;

    public interface onSubmitClickListener {
        void onClick();
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public View findViewById(int i7) {
        return this.mContentView.findViewById(i7);
    }

    public abstract void init();

    public abstract void initViews();

    public void setOnSubmitClickListener(onSubmitClickListener onsubmitclicklistener) {
        this.mOnSubmitClickListener = onsubmitclicklistener;
    }

    public void showViewCenter(View view) {
        showAtLocation(view, 17, 0, 0);
    }

    public void showViewTopCenter(View view) {
        showAtLocation(view, 49, 0, 0);
    }

    public void showViewTopCenterWhitXY(View view, int i7, int i10) {
        showAtLocation(view, 49, i7, i10);
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BasePopupWindow(Context context) {
        super(context);
        this.mContext = context;
    }

    public BasePopupWindow(View view, int i7, int i10, boolean z3) {
        super(view, i7, i10, z3);
        this.mContentView = view;
        this.mContext = view.getContext();
        init();
        initViews();
    }
}
