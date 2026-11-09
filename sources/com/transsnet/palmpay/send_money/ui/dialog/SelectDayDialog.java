package com.transsnet.palmpay.send_money.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import p159kd.c;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public class SelectDayDialog extends b {
    private DaySelectCallback callback;
    private RecyclerView mRecyclerView;
    private a mSelectDayAdapter;
    private int selectDay;

    public interface DaySelectCallback {
        void onDaySelect(int i7);
    }

    public SelectDayDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_select_day_dialog);
        this.mSelectDayAdapter = new a(this, getContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(e.recyclerView);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.mRecyclerView.addItemDecoration(new C1548f(getContext().getColor(p159kd.b.sm_list_divider_color), getContext().getResources().getDimensionPixelOffset(c.sm_record_divider_height), getContext().getResources().getDimensionPixelOffset(c.sm_record_divider_padding), getContext().getResources().getDimensionPixelOffset(c.sm_record_divider_padding)));
        this.mRecyclerView.setAdapter(this.mSelectDayAdapter);
        ImageView imageView = (ImageView) findViewById(e.close_iv);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(w.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        imageView.setOnClickListener(new A8.b(this, 6));
    }

    public void setCallback(DaySelectCallback daySelectCallback) {
        this.callback = daySelectCallback;
    }

    public void setSelectDay(int i7) {
        this.selectDay = i7;
    }

    public SelectDayDialog(Context context, int i7) {
        super(context, i7);
    }

    public SelectDayDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
    }
}
