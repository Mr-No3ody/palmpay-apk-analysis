package com.transsnet.palmpay.custom_view.input;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;", "", "getIcon", "", "getItemName", "getItemId", "isSuspend", "", "()Ljava/lang/Boolean;", "addExtraInfo", "Lcom/transsnet/palmpay/custom_view/input/OperatorItemExtraInfo;", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OperatorSelectImpl {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static OperatorItemExtraInfo addExtraInfo(@NotNull OperatorSelectImpl operatorSelectImpl) {
            return null;
        }

        @Nullable
        public static Boolean isSuspend(@NotNull OperatorSelectImpl operatorSelectImpl) {
            return Boolean.TRUE;
        }
    }

    @Nullable
    OperatorItemExtraInfo addExtraInfo();

    @Nullable
    /* JADX INFO: renamed from: getIcon */
    String getIconUrl();

    @Nullable
    /* JADX INFO: renamed from: getItemId */
    String getName();

    @Nullable
    String getItemName();

    @Nullable
    Boolean isSuspend();
}
