package com.transsnet.palmpay.p2pcash.ui.atm.dialog;

import N8.q0;
import Sc.c;
import Uc.I0;
import W8.o;
import Wc.p;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.p2pcash.ui.atm.view.FlowLine;
import com.transsnet.palmpay.p2pcash.ui.atm.view.StatusItemView;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
public class StatusDialog extends b {
    private ImageView mCloseBtn;
    private LinearLayout mContentV;
    private Context mContext;
    private final List<p> mData;
    private FlowLine mFlowLine;
    private static final int DARK_STATUS_TEXT_COLOR = Color.parseColor("#202046");
    private static final int LIGHT_STATUS_TEXT_COLOR = Color.parseColor("#4D202046");
    private static final int DARK_SUB_INFO_TEXT_COLOR = Color.parseColor("#666666");
    private static final int LIGHT_SUB_INFO_TEXT_COLOR = Color.parseColor("#6F7B85");

    public StatusDialog(Context context) {
        super(context);
        this.mData = new ArrayList();
        this.mContext = context;
    }

    private void dataChangeNotify() {
        if (this.mContentV == null) {
            return;
        }
        updateUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$updateUI$1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < this.mData.size(); i7++) {
            StatusItemView statusItemView = (StatusItemView) this.mContentV.getChildAt(i7);
            if (this.mData.get(i7).f10701c) {
                arrayList.add(Float.valueOf(statusItemView.getLocationY()));
            } else {
                arrayList2.add(Float.valueOf(statusItemView.getLocationY()));
            }
        }
        FlowLine flowLine = this.mFlowLine;
        flowLine.f32984a = arrayList;
        flowLine.f32985b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        if (arrayList3.size() > 0) {
            flowLine.f32986c = ((Float) arrayList3.get(0)).floatValue();
            flowLine.f32987d = ((Float) q0.i(1, arrayList3)).floatValue();
        }
        flowLine.invalidate();
    }

    private void renderWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
        window.setDimAmount(0.4f);
    }

    private void updateUI() {
        this.mContentV.removeAllViews();
        for (int i7 = 0; i7 < this.mData.size(); i7++) {
            p pVar = this.mData.get(i7);
            StatusItemView statusItemView = new StatusItemView(this.mContext);
            String str = pVar.f10699a;
            int i10 = pVar.f10701c ? DARK_STATUS_TEXT_COLOR : LIGHT_STATUS_TEXT_COLOR;
            statusItemView.f33049a.setText(str);
            statusItemView.f33049a.setTextColor(i10);
            String str2 = pVar.f10700b;
            int i11 = pVar.f10701c ? DARK_SUB_INFO_TEXT_COLOR : LIGHT_SUB_INFO_TEXT_COLOR;
            statusItemView.f33050b.setText(str2);
            statusItemView.f33050b.setTextColor(i11);
            if (pVar.f10702d) {
                statusItemView.f33050b.setTextColor(Color.parseColor("#FE5455"));
            }
            this.mContentV.addView(statusItemView, new LinearLayout.LayoutParams(-1, -2));
        }
        this.mContentV.post(new o(this, 1));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.p2p_status_dialog_layout);
        renderWindow();
        this.mCloseBtn = (ImageView) findViewById(Sc.b.p2p_close);
        this.mContentV = (LinearLayout) findViewById(Sc.b.p2p_content);
        this.mFlowLine = (FlowLine) findViewById(Sc.b.p2p_flow_line);
        this.mCloseBtn.setOnClickListener(new I0(this, 15));
        updateUI();
    }

    public void setData(List<p> list) {
        this.mData.clear();
        this.mData.addAll(list);
        dataChangeNotify();
    }

    public StatusDialog(Context context, int i7) {
        super(context, i7);
        this.mData = new ArrayList();
        this.mContext = context;
    }

    public StatusDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mData = new ArrayList();
        this.mContext = context;
    }
}
