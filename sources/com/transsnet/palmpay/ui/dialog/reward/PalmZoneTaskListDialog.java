package com.transsnet.palmpay.ui.dialog.reward;

import Aa.a;
import Ac.e;
import Ac.f;
import M1.j;
import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p370ye.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R#\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneTaskListDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "adjustListHeight", "()V", "initViews", "Landroid/view/View;", "view", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "", "Lcom/transsnet/palmpay/main/export/bean/PalmZoneTaskBean;", "list", "fillDatas", "(Ljava/util/List;)V", "", ReactTextInputShadowNode.PROP_TEXT, "setTitleText", "(Ljava/lang/String;)V", "Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneTaskListDialog$Callback;", "callback", "setCallback", "(Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneTaskListDialog$Callback;)V", "show", "Landroid/widget/ImageView;", "mCloseIv", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "mTitleTv", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "mList", "Landroidx/recyclerview/widget/RecyclerView;", "mTaskList$delegate", "Lkotlin/Lazy;", "getMTaskList", "()Ljava/util/List;", "mTaskList", "Lye/c;", "mAdapter", "Lye/c;", "mTitleText", "Ljava/lang/String;", "mCallback", "Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneTaskListDialog$Callback;", "Callback", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmZoneTaskListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmZoneTaskListDialog.kt\ncom/transsnet/palmpay/ui/dialog/reward/PalmZoneTaskListDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1#2:144\n*E\n"})
public final class PalmZoneTaskListDialog extends b implements View.OnClickListener {

    @Nullable
    private c mAdapter;

    @Nullable
    private Callback mCallback;

    @Nullable
    private ImageView mCloseIv;

    @Nullable
    private RecyclerView mList;

    /* JADX INFO: renamed from: mTaskList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTaskList;

    @Nullable
    private String mTitleText;

    @Nullable
    private TextView mTitleTv;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneTaskListDialog$Callback;", "", "onItemViewOnClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/main/export/bean/PalmZoneTaskBean;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onItemViewOnClick(@Nullable View view, @Nullable PalmZoneTaskBean data, @Nullable RecyclerView.ViewHolder viewHolder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmZoneTaskListDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTaskList = C2131j.b(new a(3));
    }

    private final void adjustListHeight() {
        RecyclerView recyclerView = this.mList;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(false);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = -2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(recyclerView, 0));
    }

    private final List<PalmZoneTaskBean> getMTaskList() {
        return (List) this.mTaskList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(PalmZoneTaskListDialog palmZoneTaskListDialog, j adapter, View view, int i7) {
        Callback callback;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        if (item != null) {
            if (!(item instanceof PalmZoneTaskBean)) {
                item = null;
            }
            if (item == null || (callback = palmZoneTaskListDialog.mCallback) == null) {
                return;
            }
            callback.onItemViewOnClick(view, (PalmZoneTaskBean) item, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(PalmZoneTaskListDialog palmZoneTaskListDialog, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        if (item != null) {
            if (!(item instanceof PalmZoneTaskBean)) {
                item = null;
            }
            if (item != null) {
                n0.g().l("new_reward_task_morerewards_click");
                Callback callback = palmZoneTaskListDialog.mCallback;
                if (callback != null) {
                    callback.onItemViewOnClick(view, (PalmZoneTaskBean) item, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mTaskList_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void fillDatas(@NotNull List<PalmZoneTaskBean> list) {
        List<Object> data;
        Intrinsics.checkNotNullParameter(list, "list");
        c cVar = this.mAdapter;
        int size = (cVar == null || (data = cVar.getData()) == null) ? 0 : data.size();
        c cVar2 = this.mAdapter;
        if (cVar2 != null) {
            cVar2.setList(K.b(list));
        }
        if (size != list.size()) {
            adjustListHeight();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView textView;
        setContentView(f.main_palm_zone_task_list_dialog);
        showAtBottom(getWindow());
        this.mCloseIv = (ImageView) findViewById(e.ivClose);
        this.mList = (RecyclerView) findViewById(e.taskList);
        this.mTitleTv = (TextView) findViewById(e.tvTitle);
        c cVar = new c();
        this.mAdapter = cVar;
        cVar.setList(getMTaskList());
        RecyclerView recyclerView = this.mList;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        RecyclerView recyclerView2 = this.mList;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.mAdapter);
        }
        C1548f c1548f = new C1548f(this.mContext.getColor(L6.b.ppColorDividerLineDark), CommonViewExtKt.getDp(1.0f), CommonViewExtKt.getDp(12.0f), CommonViewExtKt.getDp(12.0f));
        c1548f.f31336e = false;
        RecyclerView recyclerView3 = this.mList;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(c1548f);
        }
        if (!TextUtils.isEmpty(this.mTitleText) && (textView = this.mTitleTv) != null) {
            textView.setText(this.mTitleText);
        }
        ImageView imageView = this.mCloseIv;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        c cVar2 = this.mAdapter;
        if (cVar2 != null) {
            cVar2.setOnItemClickListener(new Be.b(this));
        }
        c cVar3 = this.mAdapter;
        if (cVar3 != null) {
            cVar3.addChildClickViewIds(e.btnRight);
        }
        c cVar4 = this.mAdapter;
        if (cVar4 != null) {
            cVar4.setOnItemChildClickListener(new Be.b(this));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = e.ivClose;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            n0.g().l("new_reward_task_morerewards_close_click");
            dismiss();
        }
    }

    public final void setCallback(@Nullable Callback callback) {
        this.mCallback = callback;
    }

    public final void setTitleText(@Nullable String text) {
        this.mTitleText = text;
        TextView textView = this.mTitleTv;
        if (textView != null) {
            textView.setText(text);
        }
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        n0.g().v("new_reward_task_morerewards_show");
        super.show();
    }
}
