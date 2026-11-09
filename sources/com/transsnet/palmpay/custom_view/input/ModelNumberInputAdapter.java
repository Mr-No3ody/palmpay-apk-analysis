package com.transsnet.palmpay.custom_view.input;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.input.InputSelectImpl;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001 B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputAdapter;", "T", "Lcom/transsnet/palmpay/custom_view/input/InputSelectImpl;", "Landroid/widget/ArrayAdapter;", "context", "Landroid/content/Context;", "list", "", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "mAllData", "getMAllData", "()Ljava/util/List;", "setMAllData", "(Ljava/util/List;)V", "mData", "getMData", "setMData", "getCount", "", "getItem", ViewProps.POSITION, "(I)Lcom/transsnet/palmpay/custom_view/input/InputSelectImpl;", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "getFilter", "Landroid/widget/Filter;", "ViewHolder", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelNumberInputAdapter<T extends InputSelectImpl> extends ArrayAdapter<T> {

    @NotNull
    private List<T> mAllData;

    @NotNull
    private List<T> mData;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\n¢\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputAdapter$ViewHolder;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "update", "", "T", "Lcom/transsnet/palmpay/custom_view/input/InputSelectImpl;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/transsnet/palmpay/custom_view/input/InputSelectImpl;)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        public final <T extends InputSelectImpl> void update(@NotNull T data) {
            Intrinsics.checkNotNullParameter(data, "data");
            TextView textView = (TextView) this.itemView.findViewById(s.tv_item_name);
            if (textView != null) {
                String itemName = data.getItemName();
                if (itemName == null) {
                    itemName = "";
                }
                textView.setText(itemName);
            }
            TextView textView2 = (TextView) this.itemView.findViewById(s.tv_item_hint);
            TextView textView3 = (TextView) this.itemView.findViewById(s.tv_item_tag);
            if (!TextUtils.isEmpty(data.getItemHint())) {
                if (textView2 != null) {
                    String itemHint = data.getItemHint();
                    if (itemHint == null) {
                        itemHint = "";
                    }
                    textView2.setText(itemHint);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (TextUtils.isEmpty(data.getTag())) {
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                if (textView3 != null) {
                    String tag = data.getTag();
                    textView3.setText(tag != null ? tag : "");
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelNumberInputAdapter(@NotNull Context context, @NotNull List<T> list) {
        super(context, t.cv_layout_customer_input_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        List<T> list2 = list;
        arrayList.addAll(list2);
        this.mAllData = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list2);
        this.mData = arrayList2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.mData.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new Filter(this) { // from class: com.transsnet.palmpay.custom_view.input.ModelNumberInputAdapter.getFilter.1
            final /* synthetic */ ModelNumberInputAdapter<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence constraint) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                List<T> mAllData = this.this$0.getMAllData();
                ArrayList arrayList = new ArrayList();
                for (Object obj : mAllData) {
                    String itemName = ((InputSelectImpl) obj).getItemName();
                    if (itemName != null && StringsKt.A(itemName, String.valueOf(constraint), false)) {
                        arrayList.add(obj);
                    }
                }
                List listU = CollectionsKt.U(arrayList, 2);
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
                ModelNumberInputAdapter<T> modelNumberInputAdapter = this.this$0;
                List list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    modelNumberInputAdapter.getMData().clear();
                    modelNumberInputAdapter.getMData().addAll(list);
                    modelNumberInputAdapter.notifyDataSetChanged();
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
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (convertView != null) {
            Object tag = convertView.getTag();
            Intrinsics.f(tag, "null cannot be cast to non-null type com.transsnet.palmpay.custom_view.input.ModelNumberInputAdapter.ViewHolder");
            ((ViewHolder) tag).update(getItem(position));
            return convertView;
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(t.cv_layout_customer_input_item, parent, false);
        Intrinsics.e(viewInflate);
        ViewHolder viewHolder = new ViewHolder(viewInflate);
        viewInflate.setTag(viewHolder);
        viewHolder.update(getItem(position));
        return viewInflate;
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
