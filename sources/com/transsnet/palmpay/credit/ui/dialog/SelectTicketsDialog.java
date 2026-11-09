package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SelectTicketsDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private boolean isHideSelect;
    private l1 mAdapter;
    private ImageView mCloseImg;
    private Button mConfirm;
    private Context mContext;
    private Listener mListener;
    private RecyclerView mTicketsList;
    private TextView mTitleTx;

    public interface Listener {
        void onSelect(CouponItem couponItem);
    }

    public SelectTicketsDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        if (Pa.r0.U0()) {
            return;
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initViews$1(View view) {
        if (Pa.r0.U0()) {
            return;
        }
        dismiss();
        Listener listener = this.mListener;
        if (listener != null) {
            l1 l1Var = this.mAdapter;
            int i7 = l1Var.f30155c;
            listener.onSelect(i7 < 0 ? null : (CouponItem) l1Var.f30153a.get(i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(View view, Window window) {
        int height = view.getHeight();
        int screenHeight = (int) (((double) ScreenUtils.getScreenHeight()) * 0.7d);
        if (height > screenHeight) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = screenHeight;
            window.setAttributes(attributes);
            this.mTicketsList.getLayoutParams().height = 0;
        }
        dismiss();
        view.setVisibility(0);
        super.show();
    }

    private void renderWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
    }

    public void hideConfirm() {
        this.mConfirm.setVisibility(8);
    }

    public void hideSelect() {
        this.isHideSelect = true;
        this.mAdapter.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(Ya.f.cs_tickets_layout);
        renderWindow();
        this.mTitleTx = (TextView) findViewById(Ya.e.cs_title);
        this.mCloseImg = (ImageView) findViewById(Ya.e.cs_close);
        this.mTicketsList = (RecyclerView) findViewById(Ya.e.cs_tickets_list);
        this.mConfirm = (Button) findViewById(Ya.e.cs_confirm);
        this.mAdapter = new l1(this);
        final int i7 = 0;
        this.mCloseImg.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTicketsDialog f30130b;

            {
                this.f30130b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f30130b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f30130b.lambda$initViews$1(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.mConfirm.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTicketsDialog f30130b;

            {
                this.f30130b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f30130b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f30130b.lambda$initViews$1(view);
                        break;
                }
            }
        });
    }

    public void select(Long l5) {
        long jLongValue = l5 == null ? -1L : l5.longValue();
        l1.a(this.mAdapter, jLongValue);
        l1 l1Var = this.mAdapter;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = l1Var.f30153a;
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (jLongValue == ((CouponItem) arrayList.get(i7)).couponId) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            this.mTicketsList.scrollToPosition(i7);
        }
    }

    public void setData(List<CouponItem> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CouponItem couponItem : list) {
            long j6 = couponItem.systemTime;
            boolean z3 = j6 >= couponItem.startTime && j6 <= couponItem.endTime;
            couponItem.isUsable = z3;
            if (z3) {
                arrayList.add(couponItem);
            } else {
                arrayList2.add(couponItem);
            }
        }
        list.clear();
        list.addAll(arrayList);
        list.addAll(arrayList2);
        l1 l1Var = this.mAdapter;
        ArrayList arrayList3 = l1Var.f30153a;
        arrayList3.clear();
        arrayList3.addAll(list);
        l1Var.notifyDataSetChanged();
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setTitle(String str) {
        this.mTitleTx.setText(str);
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        View decorView = window.getDecorView();
        decorView.setVisibility(4);
        decorView.post(new androidx.emoji2.text.j(this, 20, decorView, window));
    }

    public SelectTicketsDialog(Context context, int i7) {
        super(context, i7);
        this.mContext = context;
    }

    public SelectTicketsDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mContext = context;
    }
}
