package androidx.work.impl.model;

import androidx.lifecycle.B;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao;", "", "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "", "Landroidx/work/impl/model/j;", "getWorkInfoPojos", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Ljava/util/List;", "Landroidx/lifecycle/B;", "getWorkInfoPojosLiveData", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/lifecycle/B;", "Lkotlinx/coroutines/flow/Flow;", "getWorkInfoPojosFlow", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Lkotlinx/coroutines/flow/Flow;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {k.class})
    @NotNull
    List<j> getWorkInfoPojos(@NotNull SupportSQLiteQuery query);

    @RawQuery(observedEntities = {k.class})
    @NotNull
    Flow<List<j>> getWorkInfoPojosFlow(@NotNull SupportSQLiteQuery query);

    @RawQuery(observedEntities = {k.class})
    @NotNull
    B getWorkInfoPojosLiveData(@NotNull SupportSQLiteQuery query);
}
