package com.flexibank.sdk.customview.wheelview.widget;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001e\u001a\u00020\u000526\u0010\u001d\u001a2\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\u001aj\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e`\u001cH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelViewContract;", "T", "", "", "clickable", "", "setWheelClickable", "(Z)V", "loop", "setLoop", "", "wheelSize", "setWheelSize", "(I)V", "", "list", "setWheelData", "(Ljava/util/List;)V", "Ls4/a;", "adapter", "setWheelAdapter", "(Ls4/a;)V", "Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;", "wheelView", "join", "(Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;)V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "map", "joinDatas", "(Ljava/util/HashMap;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankWheelViewContract<T> {
    void join(@NotNull FlexiBankWheelView<T> wheelView);

    void joinDatas(@NotNull HashMap<String, List<T>> map);

    void setLoop(boolean loop);

    void setWheelAdapter(@Nullable p278s4.a adapter);

    void setWheelClickable(boolean clickable);

    void setWheelData(@Nullable List<T> list);

    void setWheelSize(int wheelSize);
}
