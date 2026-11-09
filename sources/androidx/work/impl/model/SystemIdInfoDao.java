package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "Landroidx/work/impl/model/d;", "systemIdInfo", "", "insertSystemIdInfo", "(Landroidx/work/impl/model/d;)V", "", "workSpecId", "", "generation", "getSystemIdInfo", "(Ljava/lang/String;I)Landroidx/work/impl/model/d;", "Landroidx/work/impl/model/e;", "id", "(Landroidx/work/impl/model/e;)Landroidx/work/impl/model/d;", "removeSystemIdInfo", "(Ljava/lang/String;I)V", "(Ljava/lang/String;)V", "(Landroidx/work/impl/model/e;)V", "", "getWorkSpecIds", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SystemIdInfoDao {
    @Nullable
    default d getSystemIdInfo(@NotNull e id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return getSystemIdInfo(id2.f18587a, id2.f18588b);
    }

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    @Nullable
    d getSystemIdInfo(@NotNull String workSpecId, int generation);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @NotNull
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(@NotNull d systemIdInfo);

    default void removeSystemIdInfo(@NotNull e id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        removeSystemIdInfo(id2.f18587a, id2.f18588b);
    }

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(@NotNull String workSpecId);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(@NotNull String workSpecId, int generation);
}
