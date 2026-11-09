package androidx.work.impl.model;

import V0.C0695n;
import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao;", "", "Landroidx/work/impl/model/g;", ReactProgressBarViewManager.PROP_PROGRESS, "", "insert", "(Landroidx/work/impl/model/g;)V", "", "workSpecId", "delete", "(Ljava/lang/String;)V", "deleteAll", "()V", "LV0/n;", "getProgressForWorkSpecId", "(Ljava/lang/String;)LV0/n;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({p192n.c.f39801b})
public interface WorkProgressDao {
    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void delete(@NotNull String workSpecId);

    @Query("DELETE FROM WorkProgress")
    void deleteAll();

    @Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    @Nullable
    C0695n getProgressForWorkSpecId(@NotNull String workSpecId);

    @Insert(onConflict = 1)
    void insert(@NotNull g progress);
}
