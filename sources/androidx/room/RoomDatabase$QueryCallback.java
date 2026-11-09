package androidx.room;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"androidx/room/RoomDatabase$QueryCallback", "", "", "sqlQuery", "", "bindArgs", "", "onQuery", "(Ljava/lang/String;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RoomDatabase$QueryCallback {
    void onQuery(@NotNull String sqlQuery, @NotNull List<? extends Object> bindArgs);
}
