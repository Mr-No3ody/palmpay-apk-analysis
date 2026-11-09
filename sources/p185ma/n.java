package p185ma;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.dialog.SelectBillTypeDialog;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBillTypeDialog f39614a;

    public n(SelectBillTypeDialog selectBillTypeDialog) {
        this.f39614a = selectBillTypeDialog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        SelectBillTypeDialog selectBillTypeDialog = this.f39614a;
        if (recyclerView.getChildLayoutPosition(view) < selectBillTypeDialog.mBillTypes.size() - (selectBillTypeDialog.mBillTypes.size() % 3)) {
            rect.bottom = SizeUtils.dp2px(7.0f);
        } else {
            rect.bottom = 0;
        }
        if (recyclerView.getChildLayoutPosition(view) % 3 != 2) {
            rect.right = SizeUtils.dp2px(7.0f);
        } else {
            rect.right = 0;
        }
    }
}
