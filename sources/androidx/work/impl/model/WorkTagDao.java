package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000b\u001a\u00020\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "Landroidx/work/impl/model/o;", "workTag", "", "insert", "(Landroidx/work/impl/model/o;)V", "", "id", "deleteByWorkSpecId", "(Ljava/lang/String;)V", "tag", "", "getWorkSpecIdsWithTag", "(Ljava/lang/String;)Ljava/util/List;", "getTagsForWorkSpecId", "", "tags", "insertTags", "(Ljava/lang/String;Ljava/util/Set;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkTagDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1855#2,2:64\n*S KotlinDebug\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n*L\n60#1:64,2\n*E\n"})
public interface WorkTagDao {
    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(@NotNull String id2);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List<String> getTagsForWorkSpecId(@NotNull String id2);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List<String> getWorkSpecIdsWithTag(@NotNull String tag);

    @Insert(onConflict = 5)
    void insert(@NotNull o workTag);

    default void insertTags(@NotNull String id2, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            insert(new o((String) it.next(), id2));
        }
    }
}
