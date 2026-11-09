package com.transsnet.palmpay.core.dialog;

import C9.ViewOnClickListenerC0146m;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import p025ba.k;
import p052da.I;

/* JADX INFO: loaded from: classes3.dex */
public class CouponListDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private ImageView mCloseIv;
    private List<CouponItem> mCouponItems;
    private I mCouponListAdapter;
    private BaseRecyclerViewAdapter$ItemViewOnClickListener<CouponItem> mItemClickListener;
    private boolean mJustView;
    private View.OnClickListener mOnClickListener;
    private SwipeRecyclerView mRecyclerView;
    private String mTitle;
    private TextView mTitleTv;

    public CouponListDialog(Context context) {
        super(context);
        this.mJustView = true;
        this.mOnClickListener = new ViewOnClickListenerC0146m(this, 29);
    }

    private void setEmptyView() {
        if (this.mRecyclerView.getEmptyView() != null) {
            return;
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(this.mContext);
        modelEmptyView.f31511b.setImageResource(r.cv_no_coupon_icon);
        modelEmptyView.f31512c.setText(k.core_no_coupon_available);
        modelEmptyView.setBackgroundColor(this.mContext.getResources().getColor(L6.b.ppColorBackgroundLight));
        this.mRecyclerView.setEmptyView(modelEmptyView);
    }

    public I getCouponListAdapter() {
        return this.mCouponListAdapter;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_coupon_list);
        this.mTitleTv = (TextView) findViewById(p025ba.e.coupons_title_tv);
        if (!TextUtils.isEmpty(this.mTitle)) {
            this.mTitleTv.setText(this.mTitle);
        }
        I i7 = new I(getContext());
        this.mCouponListAdapter = i7;
        i7.f35700e = this.mJustView;
        i7.notifyDataSetChanged();
        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) findViewById(p025ba.e.cdcl_rcv);
        this.mRecyclerView = swipeRecyclerView;
        swipeRecyclerView.getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.mRecyclerView.getRecyclerView().addItemDecoration(new Qb.c(15, 0, 15, 15));
        this.mRecyclerView.setAdapter(this.mCouponListAdapter);
        setEmptyView();
        this.mRecyclerView.setRefreshEnable(false);
        this.mRecyclerView.setLoadMoreEnable(false);
        List<CouponItem> list = this.mCouponItems;
        if (list != null) {
            I i10 = this.mCouponListAdapter;
            i10.f4985b = list;
            i10.notifyDataSetChanged();
        }
        this.mCloseIv = (ImageView) findViewById(p025ba.e.cdcl_close_iv);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(w.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.mCloseIv.setOnClickListener(this.mOnClickListener);
        this.mCouponListAdapter.f4986c = this.mItemClickListener;
    }

    public void refresh() {
        I i7 = this.mCouponListAdapter;
        if (i7 != null) {
            i7.notifyDataSetChanged();
        }
    }

    public void setCouponItems(List<CouponItem> couponItems) {
        this.mCouponItems = couponItems;
        I i7 = this.mCouponListAdapter;
        if (i7 != null) {
            i7.f4985b = couponItems;
            i7.notifyDataSetChanged();
        }
    }

    public void setCouponTitle(String title) {
        this.mTitle = title;
    }

    public void setItemClickListener(BaseRecyclerViewAdapter$ItemViewOnClickListener itemClickListener) {
        this.mItemClickListener = itemClickListener;
    }

    public CouponListDialog(Context context, boolean justView) {
        super(context);
        this.mOnClickListener = new ViewOnClickListenerC0146m(this, 29);
        this.mJustView = justView;
    }

    public CouponListDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.mJustView = true;
        this.mOnClickListener = new ViewOnClickListenerC0146m(this, 29);
    }

    public CouponListDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.mJustView = true;
        this.mOnClickListener = new ViewOnClickListenerC0146m(this, 29);
    }
}
