package com.transsnet.palmpay.custom_view.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/OnNumberInputListener;", "", "onNumberEditing", "", "number", "", "onNumberEditComplete", "onSelectNumber", "item", "Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OnNumberInputListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSelectNumber(@NotNull OnNumberInputListener onNumberInputListener, @NotNull InputMobileImpl item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    void onNumberEditComplete(@Nullable String number);

    void onNumberEditing(@Nullable String number);

    void onSelectNumber(@NotNull InputMobileImpl item);
}
