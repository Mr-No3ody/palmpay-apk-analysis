package com.transsnet.palmpay.custom_view.input;

import Hb.L;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.m;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001,B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0015\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\u001fH\u0016J\"\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016R4\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R:\u0010\u0012\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006-"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelMobileInputAdapter;", "T", "Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;", "Landroid/widget/ArrayAdapter;", "context", "Landroid/content/Context;", "list", "", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "deleteRecordListener", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "getDeleteRecordListener", "()Lkotlin/jvm/functions/Function2;", "setDeleteRecordListener", "(Lkotlin/jvm/functions/Function2;)V", "deleteAllRecordsListener", "", "getDeleteAllRecordsListener", "setDeleteAllRecordsListener", "mAllData", "getMAllData", "()Ljava/util/List;", "setMAllData", "(Ljava/util/List;)V", "mData", "getMData", "setMData", "getCount", "", "getItem", ViewProps.POSITION, "(I)Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "getFilter", "Landroid/widget/Filter;", "ViewHolder", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelMobileInputAdapter<T extends InputMobileImpl> extends ArrayAdapter<T> {

    @Nullable
    private Function2<? super List<? extends T>, ? super Function0<Unit>, Unit> deleteAllRecordsListener;

    @Nullable
    private Function2<? super T, ? super Function0<Unit>, Unit> deleteRecordListener;

    @NotNull
    private List<T> mAllData;

    @NotNull
    private List<T> mData;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\b\u001a\u00020\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelMobileInputAdapter$ViewHolder;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "update", "", "T", "Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, ViewProps.POSITION, "", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "(Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;II)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewHolder {

        @NotNull
        private final View itemView;

        public ViewHolder(@NotNull View itemView) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.itemView = itemView;
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }

        public final <T extends InputMobileImpl> void update(@NotNull T data, int position, int count) {
            Intrinsics.checkNotNullParameter(data, "data");
            View viewFindViewById = this.itemView.findViewById(s.view_bg);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(L6.b.ppColorBackgroundLight);
            }
            View viewFindViewById2 = this.itemView.findViewById(s.view_top_bg);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(position == 0 ? 0 : 8);
            }
            View viewFindViewById3 = this.itemView.findViewById(s.view_top_b2);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(position == 0 ? 0 : 8);
            }
            View viewFindViewById4 = this.itemView.findViewById(s.viewDivider);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setVisibility(position == count + (-1) ? 0 : 8);
            }
            View viewFindViewById5 = this.itemView.findViewById(s.dividerView);
            if (viewFindViewById5 != null) {
                viewFindViewById5.setVisibility(position == count + (-1) ? 8 : 0);
            }
            ImageView imageView = (ImageView) this.itemView.findViewById(s.iv_item_logo);
            if (TextUtils.isEmpty(data.getBillerIcon())) {
                imageView.setImageResource(r.cv_bill_default_icon);
            } else {
                ((m) com.bumptech.glide.b.e(this.itemView.getContext()).load(data.getBillerIcon()).x(r.cv_bill_default_icon)).S(imageView);
            }
            TextView textView = (TextView) this.itemView.findViewById(s.tv_item_name);
            if (textView != null) {
                textView.setText(PhoneBaseNumberUtils.INSTANCE.formatMobileNumber(data.getShortCustomerId(), false));
            }
            TextView textView2 = (TextView) this.itemView.findViewById(s.tv_item_hint);
            TextView textView3 = (TextView) this.itemView.findViewById(s.tv_item_tag);
            if (!TextUtils.isEmpty(data.getTime())) {
                if (textView2 != null) {
                    String time = data.getTime();
                    if (time == null) {
                        time = "";
                    }
                    textView2.setText(time);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (TextUtils.isEmpty(data.getRemark())) {
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                if (textView3 != null) {
                    String tag = data.getRemark();
                    textView3.setText(tag != null ? tag : "");
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelMobileInputAdapter(@NotNull Context context, @NotNull List<T> list) {
        super(context, t.cv_layout_phone_number_input_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.mAllData = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(CollectionsKt.U(list, ModelMobileWithIconInputLayout.INSTANCE.getMaxItemSize()));
        this.mData = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getView$lambda$5$lambda$4(ModelMobileInputAdapter modelMobileInputAdapter, InputMobileImpl inputMobileImpl, View view) {
        Function2<? super T, ? super Function0<Unit>, Unit> function2;
        if (r0.U0() || (function2 = modelMobileInputAdapter.deleteRecordListener) == null) {
            return;
        }
        function2.invoke(inputMobileImpl, new L(9, modelMobileInputAdapter, inputMobileImpl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getView$lambda$5$lambda$4$lambda$3(ModelMobileInputAdapter modelMobileInputAdapter, InputMobileImpl inputMobileImpl) {
        modelMobileInputAdapter.mAllData.remove(inputMobileImpl);
        modelMobileInputAdapter.mData.remove(inputMobileImpl);
        modelMobileInputAdapter.notifyDataSetChanged();
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getView$lambda$8$lambda$7(ModelMobileInputAdapter modelMobileInputAdapter, View view) {
        Function2<? super List<? extends T>, ? super Function0<Unit>, Unit> function2;
        if (r0.U0() || (function2 = modelMobileInputAdapter.deleteAllRecordsListener) == null) {
            return;
        }
        function2.invoke(CollectionsKt.Y(modelMobileInputAdapter.mAllData), new X6.c(modelMobileInputAdapter, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getView$lambda$8$lambda$7$lambda$6(ModelMobileInputAdapter modelMobileInputAdapter) {
        modelMobileInputAdapter.mAllData.clear();
        modelMobileInputAdapter.mData.clear();
        modelMobileInputAdapter.notifyDataSetChanged();
        return Unit.f38893a;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.mData.size();
    }

    @Nullable
    public final Function2<List<? extends T>, Function0<Unit>, Unit> getDeleteAllRecordsListener() {
        return this.deleteAllRecordsListener;
    }

    @Nullable
    public final Function2<T, Function0<Unit>, Unit> getDeleteRecordListener() {
        return this.deleteRecordListener;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new Filter(this) { // from class: com.transsnet.palmpay.custom_view.input.ModelMobileInputAdapter.getFilter.1
            final /* synthetic */ ModelMobileInputAdapter<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence constraint) {
                String string;
                String strK;
                Filter.FilterResults filterResults = new Filter.FilterResults();
                List<T> mAllData = this.this$0.getMAllData();
                ArrayList arrayList = new ArrayList();
                for (Object obj : mAllData) {
                    String phoneNumber = ((InputMobileImpl) obj).getShortCustomerId();
                    if (phoneNumber != null) {
                        String str = "";
                        if (constraint != null && (string = constraint.toString()) != null && (strK = y.k(string, " ", "")) != null) {
                            str = strK;
                        }
                        if (StringsKt.A(phoneNumber, str, false)) {
                            arrayList.add(obj);
                        }
                    }
                }
                List listU = CollectionsKt.U(arrayList, ModelMobileWithIconInputLayout.INSTANCE.getMaxItemSize());
                filterResults.values = listU;
                filterResults.count = listU.size();
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(CharSequence constraint, Filter.FilterResults results) {
                Object obj;
                if (results == null || (obj = results.values) == null) {
                    return;
                }
                ModelMobileInputAdapter<T> modelMobileInputAdapter = this.this$0;
                List list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    modelMobileInputAdapter.getMData().clear();
                    modelMobileInputAdapter.getMData().addAll(list);
                    modelMobileInputAdapter.notifyDataSetChanged();
                }
            }
        };
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @NotNull
    public final List<T> getMAllData() {
        return this.mAllData;
    }

    @NotNull
    public final List<T> getMData() {
        return this.mData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v14, types: [com.transsnet.palmpay.custom_view.input.ModelMobileInputAdapter$ViewHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.transsnet.palmpay.custom_view.input.ModelMobileInputAdapter$ViewHolder] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        ?? viewHolder;
        ViewHolder viewHolder2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        ?? Inflate = convertView;
        if (convertView == null) {
            Inflate = LayoutInflater.from(parent.getContext()).inflate(t.cv_layout_phone_number_input_item, parent, false);
        }
        Object tag = Inflate.getTag();
        if (tag instanceof ViewHolder) {
            viewHolder2 = (ViewHolder) tag;
        } else {
            viewHolder = 0;
        }
        if (viewHolder == 0) {
            viewHolder = viewHolder2;
            viewHolder = new ViewHolder(Inflate);
            Inflate.setTag(viewHolder);
        }
        viewHolder = viewHolder2;
        InputMobileImpl item = getItem(position);
        boolean z3 = position == getCount() - 1 && this.deleteAllRecordsListener != null;
        viewHolder.update(item, position, getCount());
        View viewFindViewById = Inflate.findViewById(s.ivDelete);
        viewFindViewById.setVisibility(this.deleteRecordListener != null ? 0 : 8);
        viewFindViewById.setOnClickListener(this.deleteRecordListener == null ? null : new p010a9.b(20, this, item));
        View viewFindViewById2 = Inflate.findViewById(s.layoutDeleteAll);
        viewFindViewById2.setVisibility(z3 ? 0 : 8);
        viewFindViewById2.setOnClickListener(z3 ? new ViewOnClickListenerC1533v(this, 24) : null);
        return Inflate;
    }

    public final void setDeleteAllRecordsListener(@Nullable Function2<? super List<? extends T>, ? super Function0<Unit>, Unit> function2) {
        this.deleteAllRecordsListener = function2;
    }

    public final void setDeleteRecordListener(@Nullable Function2<? super T, ? super Function0<Unit>, Unit> function2) {
        this.deleteRecordListener = function2;
    }

    public final void setMAllData(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mAllData = list;
    }

    public final void setMData(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mData = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public T getItem(int position) {
        return this.mData.get(position);
    }
}
